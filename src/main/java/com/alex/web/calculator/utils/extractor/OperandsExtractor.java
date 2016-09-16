package com.alex.web.calculator.utils.extractor;

import com.alex.web.calculator.services.enums.OperatorServicesEnum;
import com.alex.web.calculator.services.model.OperationServiceModel;
import org.springframework.stereotype.Component;

/**
 * Created by alejandro on 9/3/16.
 */
@Component
public class OperandsExtractor {

    public OperationServiceModel extractOperands(String input, OperatorServicesEnum opEnum){

        OperationServiceModel operationServiceModel = null;
        String splitStr = "\\" + opEnum.getOperand();
        String[] operands = input.split(splitStr);

        if(operands.length == 2){
            operationServiceModel = new OperationServiceModel();
            operationServiceModel.setFirstOperand(Float.parseFloat(operands[0]));
            operationServiceModel.setSecondOperand(Float.parseFloat(operands[1]));
        }

        return operationServiceModel;


    }

    public OperatorServicesEnum extractOperator(String input){

        OperatorServicesEnum operatorServicesEnum = null;

        for(OperatorServicesEnum operatorServicesEnumTemp: OperatorServicesEnum.values()){
            operatorServicesEnum = extractOperator(input, operatorServicesEnumTemp);
            if(operatorServicesEnum != null){
                return operatorServicesEnum;
            }
        }

        return operatorServicesEnum;

    }

    public OperatorServicesEnum getOperator(String str){
        for(OperatorServicesEnum operatorServicesEnum: OperatorServicesEnum.values()){
            if(operatorServicesEnum.getOperand().equals(str)){
                return operatorServicesEnum;
            }
        }
        return null;
    }

    public char extractLastDigit(String input){
        return input.charAt(input.length()-1);
    }

    private OperatorServicesEnum extractOperator(String input, OperatorServicesEnum operatorServicesEnum){

        String splitStr = "\\" + operatorServicesEnum.getOperand();
        String[] operands = input.split(splitStr);

        if(operands.length == 2){
            return operatorServicesEnum;
        }

        return null;

    }


}
