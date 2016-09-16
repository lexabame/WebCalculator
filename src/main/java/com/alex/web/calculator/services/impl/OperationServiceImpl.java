package com.alex.web.calculator.services.impl;

import com.alex.web.calculator.services.api.OperationService;
import com.alex.web.calculator.services.enums.OperatorServicesEnum;
import com.alex.web.calculator.services.model.OperationServiceModel;
import org.springframework.stereotype.Service;

/**
 * Created by alejandro on 9/3/16.
 */
@Service
public class OperationServiceImpl implements OperationService {

    @Override
    public OperationServiceModel executeOperation(final OperationServiceModel operationServiceModel, OperatorServicesEnum operandsServicesEnum) {

        float firstOperand = operationServiceModel.getFirstOperand();
        float secondOperand = operationServiceModel.getSecondOperand();

        switch(operandsServicesEnum){
            case SUM: operationServiceModel.setResult(performSum(firstOperand,secondOperand));
                break;
            case SUBSTRACTION:  operationServiceModel.setResult(performSubstraction(firstOperand,secondOperand));
                break;
            case MULTIPLICATION:operationServiceModel.setResult(performMultiplicacion(firstOperand,secondOperand));
                break;
            case DIVISION:operationServiceModel.setResult(performDivision(firstOperand,secondOperand));
                break;
            default:break;
        }

        return operationServiceModel;

    }

    private float performSum(float firstOperand, float secondOperand){
        return firstOperand + secondOperand;
    }

    private float performSubstraction(float firstOperand, float secondOperand){
        return firstOperand - secondOperand;
    }

    private float performMultiplicacion(float firstOperand, float secondOperand){
        return firstOperand * secondOperand;
    }

    private float performDivision(float firstOperand, float secondOperand){
        return firstOperand / secondOperand;
    }

}
