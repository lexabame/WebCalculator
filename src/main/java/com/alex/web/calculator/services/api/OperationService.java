package com.alex.web.calculator.services.api;

import com.alex.web.calculator.services.enums.OperatorServicesEnum;
import com.alex.web.calculator.services.model.OperationServiceModel;

/**
 * Created by alejandro on 9/3/16.
 */
public interface OperationService {

    OperationServiceModel executeOperation(OperationServiceModel operationServiceModel, OperatorServicesEnum operandsServicesEnum);

}
