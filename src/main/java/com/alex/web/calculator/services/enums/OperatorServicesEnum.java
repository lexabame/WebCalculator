package com.alex.web.calculator.services.enums;


/**
 * Created by alejandro on 9/3/16.
 */

public enum OperatorServicesEnum {

    SUM("+"),  SUBSTRACTION("-"), MULTIPLICATION("*"), DIVISION("/");

    private String operand;

    OperatorServicesEnum(String str){
        operand = str;
    }

    public String getOperand(){
        return operand;
    }

}
