package com.alex.web.calculator.utils.validtors;

import com.alex.web.calculator.services.enums.OperatorServicesEnum;
import org.springframework.stereotype.Component;

/**
 * Created by alejandro on 9/3/16.
 */
@Component
public class InputValidator {

    public boolean validarInput(final String input){

        boolean valid = false;

        for(OperatorServicesEnum operatorServicesEnum: OperatorServicesEnum.values()){
            valid = validateOperands(input, operatorServicesEnum);
            if(valid){
                return valid;
            }
        }

        return valid;

    }

    private boolean validateOperands(String input, OperatorServicesEnum opEnum){

        boolean valid = true;
        String splitStr = "\\" + opEnum.getOperand();
        String[] operands = input.split(splitStr);

        if(operands.length != 2){
            valid = false;
        }

        return valid;

    }




}
