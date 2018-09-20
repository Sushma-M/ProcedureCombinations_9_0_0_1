/*Copyright (c) 2016-2017 wavemaker.com All Rights Reserved.
 This software is the confidential and proprietary information of wavemaker.com You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with wavemaker.com*/
package com.testingprocedurecombinations.classicmodelsdb.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.beans.factory.annotation.Qualifier;
import com.testingprocedurecombinations.classicmodelsdb.service.ClassicModelsDBProcedureExecutorService_V1;
import com.wavemaker.runtime.data.model.CustomProcedure;
import com.wavemaker.runtime.data.exception.QueryParameterMismatchException;
import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiOperation;
import com.wordnik.swagger.annotations.ApiParam;
import com.wavemaker.tools.api.core.annotations.WMAccessVisibility;
import com.wavemaker.tools.api.core.models.AccessSpecifier;

@RestController(value = "ClassicModelsDB.ProcedureExecutionController")
@Api(value = "ProcedureExecutionController", description = "Controller class for procedure execution")
@RequestMapping("/ClassicModelsDB/procedureExecutor")
public class ProcedureExecutionController {

    private static final Logger LOGGER = LoggerFactory.getLogger(ProcedureExecutionController.class);

    @Autowired
    private ClassicModelsDBProcedureExecutorService_V1 procedureService;

    @ApiOperation(value = "Process request to execute Procedure")
    @RequestMapping(value = "/procedure/execute/Procedure_OUT_OUT_IN", method = RequestMethod.GET)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public List<Object> executeProcedure_OUT_OUT_IN(@RequestParam(value = "offCode", required = false) java.lang.String offCode) throws QueryParameterMismatchException {
        LOGGER.debug("Executing named procedure Procedure_OUT_OUT_IN");
        List<Object> resultProcedure_OUT_OUT_IN = procedureService.executeProcedure_OUT_OUT_IN(offCode);
        LOGGER.debug("got the result of named procedure {}", resultProcedure_OUT_OUT_IN);
        return resultProcedure_OUT_OUT_IN;
    }

    @ApiOperation(value = "Process request to execute Procedure")
    @RequestMapping(value = "/procedure/execute/Procedure_OUT_OUT_INOUT", method = RequestMethod.GET)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public List<Object> executeProcedure_OUT_OUT_INOUT(@RequestParam(value = "empNumber", required = false) java.lang.Integer empNumber) throws QueryParameterMismatchException {
        LOGGER.debug("Executing named procedure Procedure_OUT_OUT_INOUT");
        List<Object> resultProcedure_OUT_OUT_INOUT = procedureService.executeProcedure_OUT_OUT_INOUT(empNumber);
        LOGGER.debug("got the result of named procedure {}", resultProcedure_OUT_OUT_INOUT);
        return resultProcedure_OUT_OUT_INOUT;
    }

    @ApiOperation(value = "Process request to execute custom Procedure")
    @RequestMapping(value = "/procedure/execute/wm_custom", method = RequestMethod.POST)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public List<Object> executeWMCustomProcedure(@RequestBody CustomProcedure procedure) {
        List<Object> result = procedureService.executeWMCustomProcedure(procedure);
        LOGGER.debug("got the result {}" + result);
        return result;
    }
}
