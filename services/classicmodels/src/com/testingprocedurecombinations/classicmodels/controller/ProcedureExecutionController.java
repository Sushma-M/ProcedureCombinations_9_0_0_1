/*Copyright (c) 2016-2017 wavemaker.com All Rights Reserved.
 This software is the confidential and proprietary information of wavemaker.com You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with wavemaker.com*/
package com.testingprocedurecombinations.classicmodels.controller;

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
import com.testingprocedurecombinations.classicmodels.service.ClassicmodelsProcedureExecutorService_V1;
import com.wavemaker.runtime.data.model.CustomProcedure;
import com.wavemaker.runtime.data.exception.QueryParameterMismatchException;
import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiOperation;
import com.wordnik.swagger.annotations.ApiParam;
import com.wavemaker.tools.api.core.annotations.WMAccessVisibility;
import com.wavemaker.tools.api.core.models.AccessSpecifier;

@RestController(value = "Classicmodels.ProcedureExecutionController")
@Api(value = "ProcedureExecutionController", description = "Controller class for procedure execution")
@RequestMapping("/classicmodels/procedureExecutor")
public class ProcedureExecutionController {

    private static final Logger LOGGER = LoggerFactory.getLogger(ProcedureExecutionController.class);

    @Autowired
    private ClassicmodelsProcedureExecutorService_V1 procedureService;

    @ApiOperation(value = "Process request to execute Procedure")
    @RequestMapping(value = "/procedure/execute/Procedure_getProductDetails", method = RequestMethod.GET)
    @WMAccessVisibility(value = AccessSpecifier.UNAVAILABLE)
    public List<Object> executeProcedure_getProductDetails(@RequestParam(value = "prodLine", required = false) java.lang.String prodLine) throws QueryParameterMismatchException {
        LOGGER.debug("Executing named procedure Procedure_getProductDetails");
        List<Object> resultProcedure_getProductDetails = procedureService.executeProcedure_getProductDetails(prodLine);
        LOGGER.debug("got the result of named procedure {}", resultProcedure_getProductDetails);
        return resultProcedure_getProductDetails;
    }

    @ApiOperation(value = "Process request to execute Procedure")
    @RequestMapping(value = "/procedure/execute/Procedure_IN", method = RequestMethod.GET)
    @WMAccessVisibility(value = AccessSpecifier.UNAVAILABLE)
    public List<Object> executeProcedure_IN(@RequestParam(value = "empNumber", required = false) java.lang.Integer empNumber) throws QueryParameterMismatchException {
        LOGGER.debug("Executing named procedure Procedure_IN");
        List<Object> resultProcedure_IN = procedureService.executeProcedure_IN(empNumber);
        LOGGER.debug("got the result of named procedure {}", resultProcedure_IN);
        return resultProcedure_IN;
    }

    @ApiOperation(value = "Process request to execute Procedure")
    @RequestMapping(value = "/procedure/execute/Procedure_IN_IN", method = RequestMethod.GET)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public List<Object> executeProcedure_IN_IN(@RequestParam(value = "empFName", required = false) java.lang.String empFName, @RequestParam(value = "empNumber", required = false) java.lang.Integer empNumber) throws QueryParameterMismatchException {
        LOGGER.debug("Executing named procedure Procedure_IN_IN");
        List<Object> resultProcedure_IN_IN = procedureService.executeProcedure_IN_IN(empFName, empNumber);
        LOGGER.debug("got the result of named procedure {}", resultProcedure_IN_IN);
        return resultProcedure_IN_IN;
    }

    @ApiOperation(value = "Process request to execute Procedure")
    @RequestMapping(value = "/procedure/execute/Procedure_IN_IN_IN", method = RequestMethod.GET)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public List<Object> executeProcedure_IN_IN_IN(@RequestParam(value = "art_id", required = false) java.lang.Integer art_id, @RequestParam(value = "tag_id", required = false) java.lang.Integer tag_id, @RequestParam(value = "blnak", required = false) java.lang.String blnak) throws QueryParameterMismatchException {
        LOGGER.debug("Executing named procedure Procedure_IN_IN_IN");
        List<Object> resultProcedure_IN_IN_IN = procedureService.executeProcedure_IN_IN_IN(art_id, tag_id, blnak);
        LOGGER.debug("got the result of named procedure {}", resultProcedure_IN_IN_IN);
        return resultProcedure_IN_IN_IN;
    }

    @ApiOperation(value = "Process request to execute Procedure")
    @RequestMapping(value = "/procedure/execute/Procedure_IN_IN_INOUT", method = RequestMethod.GET)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public List<Object> executeProcedure_IN_IN_INOUT(@RequestParam(value = "reqDate", required = false) java.sql.Date reqDate, @RequestParam(value = "ordNumber", required = false) java.lang.Integer ordNumber, @RequestParam(value = "shipDate", required = false) java.sql.Date shipDate) throws QueryParameterMismatchException {
        LOGGER.debug("Executing named procedure Procedure_IN_IN_INOUT");
        List<Object> resultProcedure_IN_IN_INOUT = procedureService.executeProcedure_IN_IN_INOUT(reqDate, ordNumber, shipDate);
        LOGGER.debug("got the result of named procedure {}", resultProcedure_IN_IN_INOUT);
        return resultProcedure_IN_IN_INOUT;
    }

    @ApiOperation(value = "Process request to execute Procedure")
    @RequestMapping(value = "/procedure/execute/Procedure_IN_IN_OUT", method = RequestMethod.GET)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public List<Object> executeProcedure_IN_IN_OUT(@RequestParam(value = "RequiredDate", required = false) java.sql.Date RequiredDate, @RequestParam(value = "OrderNumber", required = false) java.lang.Integer OrderNumber) throws QueryParameterMismatchException {
        LOGGER.debug("Executing named procedure Procedure_IN_IN_OUT");
        List<Object> resultProcedure_IN_IN_OUT = procedureService.executeProcedure_IN_IN_OUT(RequiredDate, OrderNumber);
        LOGGER.debug("got the result of named procedure {}", resultProcedure_IN_IN_OUT);
        return resultProcedure_IN_IN_OUT;
    }

    @ApiOperation(value = "Process request to execute Procedure")
    @RequestMapping(value = "/procedure/execute/Procedure_IN_INOUT", method = RequestMethod.GET)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public List<Object> executeProcedure_IN_INOUT(@RequestParam(value = "custnum", required = false) java.lang.Integer custnum, @RequestParam(value = "customerLevel", required = false) java.lang.String customerLevel) throws QueryParameterMismatchException {
        LOGGER.debug("Executing named procedure Procedure_IN_INOUT");
        List<Object> resultProcedure_IN_INOUT = procedureService.executeProcedure_IN_INOUT(custnum, customerLevel);
        LOGGER.debug("got the result of named procedure {}", resultProcedure_IN_INOUT);
        return resultProcedure_IN_INOUT;
    }

    @ApiOperation(value = "Process request to execute Procedure")
    @RequestMapping(value = "/procedure/execute/Procedure_IN_INOUT_IN", method = RequestMethod.GET)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public List<Object> executeProcedure_IN_INOUT_IN(@RequestParam(value = "numerator", required = false) java.lang.Integer numerator, @RequestParam(value = "res", required = false) java.lang.Integer res, @RequestParam(value = "denominator", required = false) java.lang.Integer denominator) throws QueryParameterMismatchException {
        LOGGER.debug("Executing named procedure Procedure_IN_INOUT_IN");
        List<Object> resultProcedure_IN_INOUT_IN = procedureService.executeProcedure_IN_INOUT_IN(numerator, res, denominator);
        LOGGER.debug("got the result of named procedure {}", resultProcedure_IN_INOUT_IN);
        return resultProcedure_IN_INOUT_IN;
    }

    @ApiOperation(value = "Process request to execute Procedure")
    @RequestMapping(value = "/procedure/execute/Procedure_IN_INOUT_INOUT", method = RequestMethod.GET)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public List<Object> executeProcedure_IN_INOUT_INOUT(@RequestParam(value = "reqDate", required = false) java.sql.Date reqDate, @RequestParam(value = "ordNumber", required = false) java.lang.Integer ordNumber, @RequestParam(value = "shipDate", required = false) java.sql.Date shipDate) throws QueryParameterMismatchException {
        LOGGER.debug("Executing named procedure Procedure_IN_INOUT_INOUT");
        List<Object> resultProcedure_IN_INOUT_INOUT = procedureService.executeProcedure_IN_INOUT_INOUT(reqDate, ordNumber, shipDate);
        LOGGER.debug("got the result of named procedure {}", resultProcedure_IN_INOUT_INOUT);
        return resultProcedure_IN_INOUT_INOUT;
    }

    @ApiOperation(value = "Process request to execute Procedure")
    @RequestMapping(value = "/procedure/execute/Procedure_IN_INOUT_OUT", method = RequestMethod.GET)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public List<Object> executeProcedure_IN_INOUT_OUT(@RequestParam(value = "reqDate", required = false) java.sql.Date reqDate, @RequestParam(value = "ordNumber", required = false) java.lang.Integer ordNumber) throws QueryParameterMismatchException {
        LOGGER.debug("Executing named procedure Procedure_IN_INOUT_OUT");
        List<Object> resultProcedure_IN_INOUT_OUT = procedureService.executeProcedure_IN_INOUT_OUT(reqDate, ordNumber);
        LOGGER.debug("got the result of named procedure {}", resultProcedure_IN_INOUT_OUT);
        return resultProcedure_IN_INOUT_OUT;
    }

    @ApiOperation(value = "Process request to execute Procedure")
    @RequestMapping(value = "/procedure/execute/Procedure_IN_IsList", method = RequestMethod.GET)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public List<Object> executeProcedure_IN_IsList(@RequestParam(value = "custNumber", required = false) java.lang.String custNumber) throws QueryParameterMismatchException {
        LOGGER.debug("Executing named procedure Procedure_IN_IsList");
        List<Object> resultProcedure_IN_IsList = procedureService.executeProcedure_IN_IsList(custNumber);
        LOGGER.debug("got the result of named procedure {}", resultProcedure_IN_IsList);
        return resultProcedure_IN_IsList;
    }

    @ApiOperation(value = "Process request to execute Procedure")
    @RequestMapping(value = "/procedure/execute/Procedure_IN_OUT", method = RequestMethod.GET)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public List<Object> executeProcedure_IN_OUT(@RequestParam(value = "CustomerNumber", required = false) java.lang.Integer CustomerNumber) throws QueryParameterMismatchException {
        LOGGER.debug("Executing named procedure Procedure_IN_OUT");
        List<Object> resultProcedure_IN_OUT = procedureService.executeProcedure_IN_OUT(CustomerNumber);
        LOGGER.debug("got the result of named procedure {}", resultProcedure_IN_OUT);
        return resultProcedure_IN_OUT;
    }

    @ApiOperation(value = "Process request to execute Procedure")
    @RequestMapping(value = "/procedure/execute/PROCEDURE_IN_OUT_IN", method = RequestMethod.GET)
    @WMAccessVisibility(value = AccessSpecifier.UNAVAILABLE)
    public List<Object> executePROCEDURE_IN_OUT_IN(@RequestParam(value = "Numerator", required = false) java.lang.Integer Numerator, @RequestParam(value = "Denominator", required = false) java.lang.Integer Denominator) throws QueryParameterMismatchException {
        LOGGER.debug("Executing named procedure PROCEDURE_IN_OUT_IN");
        List<Object> resultPROCEDURE_IN_OUT_IN = procedureService.executePROCEDURE_IN_OUT_IN(Numerator, Denominator);
        LOGGER.debug("got the result of named procedure {}", resultPROCEDURE_IN_OUT_IN);
        return resultPROCEDURE_IN_OUT_IN;
    }

    @ApiOperation(value = "Process request to execute Procedure")
    @RequestMapping(value = "/procedure/execute/Procedure_IN_OUT_INOUT", method = RequestMethod.GET)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public List<Object> executeProcedure_IN_OUT_INOUT(@RequestParam(value = "numerator", required = false) java.lang.Integer numerator, @RequestParam(value = "denominator", required = false) java.lang.Integer denominator) throws QueryParameterMismatchException {
        LOGGER.debug("Executing named procedure Procedure_IN_OUT_INOUT");
        List<Object> resultProcedure_IN_OUT_INOUT = procedureService.executeProcedure_IN_OUT_INOUT(numerator, denominator);
        LOGGER.debug("got the result of named procedure {}", resultProcedure_IN_OUT_INOUT);
        return resultProcedure_IN_OUT_INOUT;
    }

    @ApiOperation(value = "Process request to execute Procedure")
    @RequestMapping(value = "/procedure/execute/Procedure_IN_OUT_OUT", method = RequestMethod.GET)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public List<Object> executeProcedure_IN_OUT_OUT(@RequestParam(value = "cutomerNumber", required = false) java.lang.Integer cutomerNumber) throws QueryParameterMismatchException {
        LOGGER.debug("Executing named procedure Procedure_IN_OUT_OUT");
        List<Object> resultProcedure_IN_OUT_OUT = procedureService.executeProcedure_IN_OUT_OUT(cutomerNumber);
        LOGGER.debug("got the result of named procedure {}", resultProcedure_IN_OUT_OUT);
        return resultProcedure_IN_OUT_OUT;
    }

    @ApiOperation(value = "Process request to execute Procedure")
    @RequestMapping(value = "/procedure/execute/Procedure_IN_STRING", method = RequestMethod.GET)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public List<Object> executeProcedure_IN_STRING(@RequestParam(value = "countryname", required = false) java.lang.String countryname) throws QueryParameterMismatchException {
        LOGGER.debug("Executing named procedure Procedure_IN_STRING");
        List<Object> resultProcedure_IN_STRING = procedureService.executeProcedure_IN_STRING(countryname);
        LOGGER.debug("got the result of named procedure {}", resultProcedure_IN_STRING);
        return resultProcedure_IN_STRING;
    }

    @ApiOperation(value = "Process request to execute Procedure")
    @RequestMapping(value = "/procedure/execute/Procedure_INOUT", method = RequestMethod.GET)
    @WMAccessVisibility(value = AccessSpecifier.UNAVAILABLE)
    public List<Object> executeProcedure_INOUT(@RequestParam(value = "empNumber", required = false) java.lang.Integer empNumber) throws QueryParameterMismatchException {
        LOGGER.debug("Executing named procedure Procedure_INOUT");
        List<Object> resultProcedure_INOUT = procedureService.executeProcedure_INOUT(empNumber);
        LOGGER.debug("got the result of named procedure {}", resultProcedure_INOUT);
        return resultProcedure_INOUT;
    }

    @ApiOperation(value = "Process request to execute Procedure")
    @RequestMapping(value = "/procedure/execute/Procedure_INOUT_IN", method = RequestMethod.GET)
    @WMAccessVisibility(value = AccessSpecifier.UNAVAILABLE)
    public List<Object> executeProcedure_INOUT_IN(@RequestParam(value = "GiveRequiredDateGetShippedDate", required = false) java.sql.Date GiveRequiredDateGetShippedDate, @RequestParam(value = "orderNumber", required = false) java.lang.Integer orderNumber) throws QueryParameterMismatchException {
        LOGGER.debug("Executing named procedure Procedure_INOUT_IN");
        List<Object> resultProcedure_INOUT_IN = procedureService.executeProcedure_INOUT_IN(GiveRequiredDateGetShippedDate, orderNumber);
        LOGGER.debug("got the result of named procedure {}", resultProcedure_INOUT_IN);
        return resultProcedure_INOUT_IN;
    }

    @ApiOperation(value = "Process request to execute Procedure")
    @RequestMapping(value = "/procedure/execute/Procedure_INOUT_IN_IN", method = RequestMethod.GET)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public List<Object> executeProcedure_INOUT_IN_IN(@RequestParam(value = "result1", required = false) java.lang.Integer result1, @RequestParam(value = "numerator", required = false) java.lang.Integer numerator, @RequestParam(value = "denominator", required = false) java.lang.Integer denominator) throws QueryParameterMismatchException {
        LOGGER.debug("Executing named procedure Procedure_INOUT_IN_IN");
        List<Object> resultProcedure_INOUT_IN_IN = procedureService.executeProcedure_INOUT_IN_IN(result1, numerator, denominator);
        LOGGER.debug("got the result of named procedure {}", resultProcedure_INOUT_IN_IN);
        return resultProcedure_INOUT_IN_IN;
    }

    @ApiOperation(value = "Process request to execute Procedure")
    @RequestMapping(value = "/procedure/execute/Procedure_INOUT_IN_INOUT", method = RequestMethod.GET)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public List<Object> executeProcedure_INOUT_IN_INOUT(@RequestParam(value = "result1", required = false) java.lang.Double result1, @RequestParam(value = "numerator", required = false) java.lang.Integer numerator, @RequestParam(value = "denominator", required = false) java.lang.Integer denominator) throws QueryParameterMismatchException {
        LOGGER.debug("Executing named procedure Procedure_INOUT_IN_INOUT");
        List<Object> resultProcedure_INOUT_IN_INOUT = procedureService.executeProcedure_INOUT_IN_INOUT(result1, numerator, denominator);
        LOGGER.debug("got the result of named procedure {}", resultProcedure_INOUT_IN_INOUT);
        return resultProcedure_INOUT_IN_INOUT;
    }

    @ApiOperation(value = "Process request to execute Procedure")
    @RequestMapping(value = "/procedure/execute/Procedure_INOUT_IN_OUT", method = RequestMethod.GET)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public List<Object> executeProcedure_INOUT_IN_OUT(@RequestParam(value = "numerator", required = false) java.lang.Integer numerator, @RequestParam(value = "denominator", required = false) java.lang.Integer denominator) throws QueryParameterMismatchException {
        LOGGER.debug("Executing named procedure Procedure_INOUT_IN_OUT");
        List<Object> resultProcedure_INOUT_IN_OUT = procedureService.executeProcedure_INOUT_IN_OUT(numerator, denominator);
        LOGGER.debug("got the result of named procedure {}", resultProcedure_INOUT_IN_OUT);
        return resultProcedure_INOUT_IN_OUT;
    }

    @ApiOperation(value = "Process request to execute Procedure")
    @RequestMapping(value = "/procedure/execute/Procedure_INOUT_INOUT", method = RequestMethod.GET)
    @WMAccessVisibility(value = AccessSpecifier.UNAVAILABLE)
    public List<Object> executeProcedure_INOUT_INOUT(@RequestParam(value = "custnum", required = false) java.lang.Integer custnum, @RequestParam(value = "customerLevel", required = false) java.lang.String customerLevel) throws QueryParameterMismatchException {
        LOGGER.debug("Executing named procedure Procedure_INOUT_INOUT");
        List<Object> resultProcedure_INOUT_INOUT = procedureService.executeProcedure_INOUT_INOUT(custnum, customerLevel);
        LOGGER.debug("got the result of named procedure {}", resultProcedure_INOUT_INOUT);
        return resultProcedure_INOUT_INOUT;
    }

    @ApiOperation(value = "Process request to execute Procedure")
    @RequestMapping(value = "/procedure/execute/Procedure_INOUT_INOUT_IN", method = RequestMethod.GET)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public List<Object> executeProcedure_INOUT_INOUT_IN(@RequestParam(value = "count1", required = false) java.lang.Integer count1, @RequestParam(value = "count2", required = false) java.lang.Integer count2, @RequestParam(value = "count3", required = false) java.lang.Integer count3, @RequestParam(value = "inc", required = false) java.lang.Integer inc) throws QueryParameterMismatchException {
        LOGGER.debug("Executing named procedure Procedure_INOUT_INOUT_IN");
        List<Object> resultProcedure_INOUT_INOUT_IN = procedureService.executeProcedure_INOUT_INOUT_IN(count1, count2, count3, inc);
        LOGGER.debug("got the result of named procedure {}", resultProcedure_INOUT_INOUT_IN);
        return resultProcedure_INOUT_INOUT_IN;
    }

    @ApiOperation(value = "Process request to execute Procedure")
    @RequestMapping(value = "/procedure/execute/Procedure_INOUT_INOUT_INOUT", method = RequestMethod.GET)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public List<Object> executeProcedure_INOUT_INOUT_INOUT(@RequestParam(value = "numerator", required = false) java.lang.Integer numerator, @RequestParam(value = "denominator", required = false) java.lang.Integer denominator, @RequestParam(value = "result1", required = false) java.lang.Double result1) throws QueryParameterMismatchException {
        LOGGER.debug("Executing named procedure Procedure_INOUT_INOUT_INOUT");
        List<Object> resultProcedure_INOUT_INOUT_INOUT = procedureService.executeProcedure_INOUT_INOUT_INOUT(numerator, denominator, result1);
        LOGGER.debug("got the result of named procedure {}", resultProcedure_INOUT_INOUT_INOUT);
        return resultProcedure_INOUT_INOUT_INOUT;
    }

    @ApiOperation(value = "Process request to execute Procedure")
    @RequestMapping(value = "/procedure/execute/Procedure_INOUT_INOUT_OUT", method = RequestMethod.GET)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public List<Object> executeProcedure_INOUT_INOUT_OUT(@RequestParam(value = "numerator", required = false) java.lang.Integer numerator, @RequestParam(value = "denominator", required = false) java.lang.Integer denominator) throws QueryParameterMismatchException {
        LOGGER.debug("Executing named procedure Procedure_INOUT_INOUT_OUT");
        List<Object> resultProcedure_INOUT_INOUT_OUT = procedureService.executeProcedure_INOUT_INOUT_OUT(numerator, denominator);
        LOGGER.debug("got the result of named procedure {}", resultProcedure_INOUT_INOUT_OUT);
        return resultProcedure_INOUT_INOUT_OUT;
    }

    @ApiOperation(value = "Process request to execute Procedure")
    @RequestMapping(value = "/procedure/execute/Procedure_INOUT_OUT", method = RequestMethod.GET)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public List<Object> executeProcedure_INOUT_OUT(@RequestParam(value = "custnum", required = false) java.lang.Integer custnum) throws QueryParameterMismatchException {
        LOGGER.debug("Executing named procedure Procedure_INOUT_OUT");
        List<Object> resultProcedure_INOUT_OUT = procedureService.executeProcedure_INOUT_OUT(custnum);
        LOGGER.debug("got the result of named procedure {}", resultProcedure_INOUT_OUT);
        return resultProcedure_INOUT_OUT;
    }

    @ApiOperation(value = "Process request to execute Procedure")
    @RequestMapping(value = "/procedure/execute/Procedure_INOUT_OUT_IN", method = RequestMethod.GET)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public List<Object> executeProcedure_INOUT_OUT_IN(@RequestParam(value = "numerator", required = false) java.lang.Integer numerator, @RequestParam(value = "denominator", required = false) java.lang.Integer denominator) throws QueryParameterMismatchException {
        LOGGER.debug("Executing named procedure Procedure_INOUT_OUT_IN");
        List<Object> resultProcedure_INOUT_OUT_IN = procedureService.executeProcedure_INOUT_OUT_IN(numerator, denominator);
        LOGGER.debug("got the result of named procedure {}", resultProcedure_INOUT_OUT_IN);
        return resultProcedure_INOUT_OUT_IN;
    }

    @ApiOperation(value = "Process request to execute Procedure")
    @RequestMapping(value = "/procedure/execute/Procedure_INOUT_OUT_INOUT", method = RequestMethod.GET)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public List<Object> executeProcedure_INOUT_OUT_INOUT(@RequestParam(value = "numerator", required = false) java.lang.Integer numerator, @RequestParam(value = "denominator", required = false) java.lang.Integer denominator) throws QueryParameterMismatchException {
        LOGGER.debug("Executing named procedure Procedure_INOUT_OUT_INOUT");
        List<Object> resultProcedure_INOUT_OUT_INOUT = procedureService.executeProcedure_INOUT_OUT_INOUT(numerator, denominator);
        LOGGER.debug("got the result of named procedure {}", resultProcedure_INOUT_OUT_INOUT);
        return resultProcedure_INOUT_OUT_INOUT;
    }

    @ApiOperation(value = "Process request to execute Procedure")
    @RequestMapping(value = "/procedure/execute/Procedure_INOUT_OUT_OUT", method = RequestMethod.GET)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public List<Object> executeProcedure_INOUT_OUT_OUT(@RequestParam(value = "ordrDate", required = false) java.sql.Date ordrDate) throws QueryParameterMismatchException {
        LOGGER.debug("Executing named procedure Procedure_INOUT_OUT_OUT");
        List<Object> resultProcedure_INOUT_OUT_OUT = procedureService.executeProcedure_INOUT_OUT_OUT(ordrDate);
        LOGGER.debug("got the result of named procedure {}", resultProcedure_INOUT_OUT_OUT);
        return resultProcedure_INOUT_OUT_OUT;
    }

    @ApiOperation(value = "Process request to execute Procedure")
    @RequestMapping(value = "/procedure/execute/Procedure_OUT", method = RequestMethod.GET)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public List<Object> executeProcedure_OUT() throws QueryParameterMismatchException {
        LOGGER.debug("Executing named procedure Procedure_OUT");
        List<Object> resultProcedure_OUT = procedureService.executeProcedure_OUT();
        LOGGER.debug("got the result of named procedure {}", resultProcedure_OUT);
        return resultProcedure_OUT;
    }

    @ApiOperation(value = "Process request to execute Procedure")
    @RequestMapping(value = "/procedure/execute/Procedure_OUT_IN", method = RequestMethod.GET)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public List<Object> executeProcedure_OUT_IN(@RequestParam(value = "empNumber", required = false) java.lang.Integer empNumber) throws QueryParameterMismatchException {
        LOGGER.debug("Executing named procedure Procedure_OUT_IN");
        List<Object> resultProcedure_OUT_IN = procedureService.executeProcedure_OUT_IN(empNumber);
        LOGGER.debug("got the result of named procedure {}", resultProcedure_OUT_IN);
        return resultProcedure_OUT_IN;
    }

    @ApiOperation(value = "Process request to execute Procedure")
    @RequestMapping(value = "/procedure/execute/Procedure_OUT_IN_IN", method = RequestMethod.GET)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public List<Object> executeProcedure_OUT_IN_IN(@RequestParam(value = "custNumber", required = false) java.lang.Integer custNumber, @RequestParam(value = "checkNum", required = false) java.lang.String checkNum) throws QueryParameterMismatchException {
        LOGGER.debug("Executing named procedure Procedure_OUT_IN_IN");
        List<Object> resultProcedure_OUT_IN_IN = procedureService.executeProcedure_OUT_IN_IN(custNumber, checkNum);
        LOGGER.debug("got the result of named procedure {}", resultProcedure_OUT_IN_IN);
        return resultProcedure_OUT_IN_IN;
    }

    @ApiOperation(value = "Process request to execute Procedure")
    @RequestMapping(value = "/procedure/execute/Procedure_OUT_IN_INOUT", method = RequestMethod.GET)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public List<Object> executeProcedure_OUT_IN_INOUT(@RequestParam(value = "reqDate", required = false) java.sql.Date reqDate, @RequestParam(value = "ordNumber", required = false) java.lang.Integer ordNumber) throws QueryParameterMismatchException {
        LOGGER.debug("Executing named procedure Procedure_OUT_IN_INOUT");
        List<Object> resultProcedure_OUT_IN_INOUT = procedureService.executeProcedure_OUT_IN_INOUT(reqDate, ordNumber);
        LOGGER.debug("got the result of named procedure {}", resultProcedure_OUT_IN_INOUT);
        return resultProcedure_OUT_IN_INOUT;
    }

    @ApiOperation(value = "Process request to execute Procedure")
    @RequestMapping(value = "/procedure/execute/Procedure_OUT_IN_OUT", method = RequestMethod.GET)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public List<Object> executeProcedure_OUT_IN_OUT(@RequestParam(value = "prodLine", required = false) java.lang.String prodLine) throws QueryParameterMismatchException {
        LOGGER.debug("Executing named procedure Procedure_OUT_IN_OUT");
        List<Object> resultProcedure_OUT_IN_OUT = procedureService.executeProcedure_OUT_IN_OUT(prodLine);
        LOGGER.debug("got the result of named procedure {}", resultProcedure_OUT_IN_OUT);
        return resultProcedure_OUT_IN_OUT;
    }

    @ApiOperation(value = "Process request to execute Procedure")
    @RequestMapping(value = "/procedure/execute/Procedure_OUT_INOUT", method = RequestMethod.GET)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public List<Object> executeProcedure_OUT_INOUT(@RequestParam(value = "prodLine", required = false) java.lang.String prodLine) throws QueryParameterMismatchException {
        LOGGER.debug("Executing named procedure Procedure_OUT_INOUT");
        List<Object> resultProcedure_OUT_INOUT = procedureService.executeProcedure_OUT_INOUT(prodLine);
        LOGGER.debug("got the result of named procedure {}", resultProcedure_OUT_INOUT);
        return resultProcedure_OUT_INOUT;
    }

    @ApiOperation(value = "Process request to execute Procedure")
    @RequestMapping(value = "/procedure/execute/Procedure_OUT_INOUT_IN", method = RequestMethod.GET)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public List<Object> executeProcedure_OUT_INOUT_IN(@RequestParam(value = "reqDate", required = false) java.sql.Date reqDate, @RequestParam(value = "ordNumber", required = false) java.lang.Integer ordNumber) throws QueryParameterMismatchException {
        LOGGER.debug("Executing named procedure Procedure_OUT_INOUT_IN");
        List<Object> resultProcedure_OUT_INOUT_IN = procedureService.executeProcedure_OUT_INOUT_IN(reqDate, ordNumber);
        LOGGER.debug("got the result of named procedure {}", resultProcedure_OUT_INOUT_IN);
        return resultProcedure_OUT_INOUT_IN;
    }

    @ApiOperation(value = "Process request to execute Procedure")
    @RequestMapping(value = "/procedure/execute/Procedure_OUT_INOUT_INOUT", method = RequestMethod.GET)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public List<Object> executeProcedure_OUT_INOUT_INOUT(@RequestParam(value = "reqDate", required = false) java.sql.Date reqDate, @RequestParam(value = "ordNumber", required = false) java.lang.Integer ordNumber) throws QueryParameterMismatchException {
        LOGGER.debug("Executing named procedure Procedure_OUT_INOUT_INOUT");
        List<Object> resultProcedure_OUT_INOUT_INOUT = procedureService.executeProcedure_OUT_INOUT_INOUT(reqDate, ordNumber);
        LOGGER.debug("got the result of named procedure {}", resultProcedure_OUT_INOUT_INOUT);
        return resultProcedure_OUT_INOUT_INOUT;
    }

    @ApiOperation(value = "Process request to execute Procedure")
    @RequestMapping(value = "/procedure/execute/Procedure_OUT_INOUT_OUT", method = RequestMethod.GET)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public List<Object> executeProcedure_OUT_INOUT_OUT(@RequestParam(value = "prodCode", required = false) java.lang.String prodCode) throws QueryParameterMismatchException {
        LOGGER.debug("Executing named procedure Procedure_OUT_INOUT_OUT");
        List<Object> resultProcedure_OUT_INOUT_OUT = procedureService.executeProcedure_OUT_INOUT_OUT(prodCode);
        LOGGER.debug("got the result of named procedure {}", resultProcedure_OUT_INOUT_OUT);
        return resultProcedure_OUT_INOUT_OUT;
    }

    @ApiOperation(value = "Process request to execute Procedure")
    @RequestMapping(value = "/procedure/execute/Procedure_OUT_OUT", method = RequestMethod.GET)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public List<Object> executeProcedure_OUT_OUT() throws QueryParameterMismatchException {
        LOGGER.debug("Executing named procedure Procedure_OUT_OUT");
        List<Object> resultProcedure_OUT_OUT = procedureService.executeProcedure_OUT_OUT();
        LOGGER.debug("got the result of named procedure {}", resultProcedure_OUT_OUT);
        return resultProcedure_OUT_OUT;
    }

    @ApiOperation(value = "Process request to execute Procedure")
    @RequestMapping(value = "/procedure/execute/Procedure_OUT_OUT_IN", method = RequestMethod.GET)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public List<Object> executeProcedure_OUT_OUT_IN(@RequestParam(value = "offCode", required = false) java.lang.Integer offCode) throws QueryParameterMismatchException {
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

    @ApiOperation(value = "Process request to execute Procedure")
    @RequestMapping(value = "/procedure/execute/Procedure_OUT_OUT_OUT", method = RequestMethod.GET)
    @WMAccessVisibility(value = AccessSpecifier.UNAVAILABLE)
    public List<Object> executeProcedure_OUT_OUT_OUT() throws QueryParameterMismatchException {
        LOGGER.debug("Executing named procedure Procedure_OUT_OUT_OUT");
        List<Object> resultProcedure_OUT_OUT_OUT = procedureService.executeProcedure_OUT_OUT_OUT();
        LOGGER.debug("got the result of named procedure {}", resultProcedure_OUT_OUT_OUT);
        return resultProcedure_OUT_OUT_OUT;
    }

    @ApiOperation(value = "Process request to execute Procedure")
    @RequestMapping(value = "/procedure/execute/Procedure_Sysparam", method = RequestMethod.GET)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public List<Object> executeProcedure_Sysparam() throws QueryParameterMismatchException {
        LOGGER.debug("Executing named procedure Procedure_Sysparam");
        List<Object> resultProcedure_Sysparam = procedureService.executeProcedure_Sysparam();
        LOGGER.debug("got the result of named procedure {}", resultProcedure_Sysparam);
        return resultProcedure_Sysparam;
    }

    @ApiOperation(value = "Process request to execute Procedure")
    @RequestMapping(value = "/procedure/execute/Procedure_WithoutAnyParams", method = RequestMethod.GET)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public List<Object> executeProcedure_WithoutAnyParams() {
        LOGGER.debug("Executing named procedure Procedure_WithoutAnyParams");
        List<Object> resultProcedure_WithoutAnyParams = procedureService.executeProcedure_WithoutAnyParams();
        LOGGER.debug("got the result of named procedure {}", resultProcedure_WithoutAnyParams);
        return resultProcedure_WithoutAnyParams;
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
