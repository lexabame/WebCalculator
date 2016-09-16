package com.alex.web.calculator.mvc.controller;

import com.alex.web.calculator.services.model.OperationServiceModel;
import com.alex.web.calculator.utils.extractor.OperandsExtractor;
import com.alex.web.calculator.mvc.model.OperationModel;
import com.alex.web.calculator.services.api.OperationService;
import com.alex.web.calculator.services.enums.OperatorServicesEnum;
import com.alex.web.calculator.utils.validtors.InputValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


/**
 * Created by alejandro on 9/2/16.
 */

@Controller
@RequestMapping("/operation")
public class OperationController {

    @Autowired
    private InputValidator inputValidator;

    @Autowired
    private OperationService operationService;

    @Autowired
    private OperandsExtractor operandsExtractor;


   @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView init(OperationModel operationModel){

        ModelAndView modelAndView = new ModelAndView("calculator");

        return modelAndView;

    }

    @RequestMapping(value = "/execute", method = RequestMethod.POST)
    public ModelAndView onSubmit(OperationModel operationModel){

        String input = operationModel.getData();

        boolean valid = inputValidator.validarInput(input);

        if(valid){

            char lastDigit = operandsExtractor.extractLastDigit(input);

            OperatorServicesEnum nextOperator = operandsExtractor.getOperator(String.valueOf(lastDigit));

            if(nextOperator != null){
                input = input.substring(0, input.length()-1);
            }

            OperatorServicesEnum operatorServicesEnum = operandsExtractor.extractOperator(input);

            if(operatorServicesEnum != null){
                OperationServiceModel operationServiceModel = operandsExtractor.extractOperands(input, operatorServicesEnum);

                operationServiceModel = operationService.executeOperation(operationServiceModel,operatorServicesEnum);

                if(nextOperator != null){
                    operationModel.setData(String.valueOf(operationServiceModel.getResult()) + nextOperator.getOperand());
                }else {
                    operationModel.setData(String.valueOf(operationServiceModel.getResult()));
                }
            }

        }

        ModelAndView modelAndView = new ModelAndView("calculator");

        modelAndView.addObject("operationModel", operationModel);

        System.out.println(operationModel.getData());

        return modelAndView;

    }

}
