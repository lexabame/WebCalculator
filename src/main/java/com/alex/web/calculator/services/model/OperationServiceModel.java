package com.alex.web.calculator.services.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by alejandro on 9/3/16.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class OperationServiceModel {

    private float firstOperand;
    private float secondOperand;
    private float result;
}
