/*Copyright (c) 2016-2017 wavemaker.com All Rights Reserved.
 This software is the confidential and proprietary information of wavemaker.com You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with wavemaker.com*/

package com.testingprocedurecombinations.classicmodels.service;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/

import java.sql.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.wavemaker.runtime.data.dao.procedure.WMProcedureExecutor;

import com.testingprocedurecombinations.classicmodels.models.procedure.*;

@Service
public class ClassicmodelsProcedureExecutorServiceImpl implements ClassicmodelsProcedureExecutorService {

    private static final Logger LOGGER = LoggerFactory.getLogger(ClassicmodelsProcedureExecutorServiceImpl.class);

    @Autowired
    @Qualifier("classicmodelsWMProcedureExecutor")
    private WMProcedureExecutor procedureExecutor;

    @Transactional(value = "classicmodelsTransactionManager")
    @Override
    public ProcedureInoutOutOutResponse executeProcedure_INOUT_OUT_OUT(Date ordrDate) {
        Map params = new HashMap(3);

        params.put("ordrDate", ordrDate);

        return procedureExecutor.executeNamedProcedure("Procedure_INOUT_OUT_OUT", params, ProcedureInoutOutOutResponse.class);
    }

    @Transactional(value = "classicmodelsTransactionManager")
    @Override
    public ProcedureInoutInInResponse executeProcedure_INOUT_IN_IN(Integer result1, Integer numerator, Integer denominator) {
        Map params = new HashMap(3);

        params.put("result1", result1);
        params.put("numerator", numerator);
        params.put("denominator", denominator);

        return procedureExecutor.executeNamedProcedure("Procedure_INOUT_IN_IN", params, ProcedureInoutInInResponse.class);
    }

    @Transactional(value = "classicmodelsTransactionManager")
    @Override
    public ProcedureInoutInInoutResponse executeProcedure_INOUT_IN_INOUT(Double result1, Integer numerator, Integer denominator) {
        Map params = new HashMap(3);

        params.put("result1", result1);
        params.put("numerator", numerator);
        params.put("denominator", denominator);

        return procedureExecutor.executeNamedProcedure("Procedure_INOUT_IN_INOUT", params, ProcedureInoutInInoutResponse.class);
    }

    @Transactional(value = "classicmodelsTransactionManager")
    @Override
    public ProcedureInoutInOutResponse executeProcedure_INOUT_IN_OUT(Integer numerator, Integer denominator) {
        Map params = new HashMap(3);

        params.put("numerator", numerator);
        params.put("denominator", denominator);

        return procedureExecutor.executeNamedProcedure("Procedure_INOUT_IN_OUT", params, ProcedureInoutInOutResponse.class);
    }

    @Transactional(value = "classicmodelsTransactionManager")
    @Override
    public ProcedureInOutResponse executeProcedure_IN_OUT(Integer customerNumber) {
        Map params = new HashMap(2);

        params.put("CustomerNumber", customerNumber);

        return procedureExecutor.executeNamedProcedure("Procedure_IN_OUT", params, ProcedureInOutResponse.class);
    }

    @Transactional(value = "classicmodelsTransactionManager")
    @Override
    public ProcedureInInoutInResponse executeProcedure_IN_INOUT_IN(Integer numerator, Integer res, Integer denominator) {
        Map params = new HashMap(3);

        params.put("numerator", numerator);
        params.put("res", res);
        params.put("denominator", denominator);

        return procedureExecutor.executeNamedProcedure("Procedure_IN_INOUT_IN", params, ProcedureInInoutInResponse.class);
    }

    @Transactional(value = "classicmodelsTransactionManager")
    @Override
    public ProcedureOutInInResponse executeProcedure_OUT_IN_IN(Integer custNumber, String checkNum) {
        Map params = new HashMap(3);

        params.put("custNumber", custNumber);
        params.put("checkNum", checkNum);

        return procedureExecutor.executeNamedProcedure("Procedure_OUT_IN_IN", params, ProcedureOutInInResponse.class);
    }

    @Transactional(value = "classicmodelsTransactionManager")
    @Override
    public ProcedureInoutInoutInResponse executeProcedure_INOUT_INOUT_IN(Integer count1, Integer count2, Integer count3, Integer inc) {
        Map params = new HashMap(4);

        params.put("count1", count1);
        params.put("count2", count2);
        params.put("count3", count3);
        params.put("inc", inc);

        return procedureExecutor.executeNamedProcedure("Procedure_INOUT_INOUT_IN", params, ProcedureInoutInoutInResponse.class);
    }

    @Transactional(value = "classicmodelsTransactionManager")
    @Override
    public ProcedureInInoutInoutResponse executeProcedure_IN_INOUT_INOUT(Date reqDate, Integer ordNumber, Date shipDate) {
        Map params = new HashMap(3);

        params.put("reqDate", reqDate);
        params.put("ordNumber", ordNumber);
        params.put("shipDate", shipDate);

        return procedureExecutor.executeNamedProcedure("Procedure_IN_INOUT_INOUT", params, ProcedureInInoutInoutResponse.class);
    }

    @Transactional(value = "classicmodelsTransactionManager")
    @Override
    public ProcedureWithoutAnyParamsResponse executeProcedure_WithoutAnyParams() {
        Map params = new HashMap(0);


        return procedureExecutor.executeNamedProcedure("Procedure_WithoutAnyParams", params, ProcedureWithoutAnyParamsResponse.class);
    }

    @Transactional(value = "classicmodelsTransactionManager")
    @Override
    public ProcedureInoutInoutInoutResponse executeProcedure_INOUT_INOUT_INOUT(Integer numerator, Integer denominator, Double result1) {
        Map params = new HashMap(3);

        params.put("numerator", numerator);
        params.put("denominator", denominator);
        params.put("result1", result1);

        return procedureExecutor.executeNamedProcedure("Procedure_INOUT_INOUT_INOUT", params, ProcedureInoutInoutInoutResponse.class);
    }

    @Transactional(value = "classicmodelsTransactionManager")
    @Override
    public ProcedureOutInInoutResponse executeProcedure_OUT_IN_INOUT(Date reqDate, Integer ordNumber) {
        Map params = new HashMap(3);

        params.put("reqDate", reqDate);
        params.put("ordNumber", ordNumber);

        return procedureExecutor.executeNamedProcedure("Procedure_OUT_IN_INOUT", params, ProcedureOutInInoutResponse.class);
    }

    @Transactional(value = "classicmodelsTransactionManager")
    @Override
    public ProcedureInInoutResponse executeProcedure_IN_INOUT(Integer custnum, String customerLevel) {
        Map params = new HashMap(2);

        params.put("custnum", custnum);
        params.put("customerLevel", customerLevel);

        return procedureExecutor.executeNamedProcedure("Procedure_IN_INOUT", params, ProcedureInInoutResponse.class);
    }

    @Transactional(value = "classicmodelsTransactionManager")
    @Override
    public ProcedureInInResponse executeProcedure_IN_IN(String empFname, Integer empNumber) {
        Map params = new HashMap(2);

        params.put("empFName", empFname);
        params.put("empNumber", empNumber);

        return procedureExecutor.executeNamedProcedure("Procedure_IN_IN", params, ProcedureInInResponse.class);
    }

    @Transactional(value = "classicmodelsTransactionManager")
    @Override
    public ProcedureInoutInoutResponse executeProcedure_INOUT_INOUT(Integer custnum, String customerLevel) {
        Map params = new HashMap(2);

        params.put("custnum", custnum);
        params.put("customerLevel", customerLevel);

        return procedureExecutor.executeNamedProcedure("Procedure_INOUT_INOUT", params, ProcedureInoutInoutResponse.class);
    }

    @Transactional(value = "classicmodelsTransactionManager")
    @Override
    public ProcedureInoutInoutOutResponse executeProcedure_INOUT_INOUT_OUT(Integer numerator, Integer denominator) {
        Map params = new HashMap(3);

        params.put("numerator", numerator);
        params.put("denominator", denominator);

        return procedureExecutor.executeNamedProcedure("Procedure_INOUT_INOUT_OUT", params, ProcedureInoutInoutOutResponse.class);
    }

    @Transactional(value = "classicmodelsTransactionManager")
    @Override
    public ProcedureInIsListResponse executeProcedure_IN_IsList(String custNumber) {
        Map params = new HashMap(1);

        params.put("custNumber", custNumber);

        return procedureExecutor.executeNamedProcedure("Procedure_IN_IsList", params, ProcedureInIsListResponse.class);
    }

    @Transactional(value = "classicmodelsTransactionManager")
    @Override
    public ProcedureOutInOutResponse executeProcedure_OUT_IN_OUT(String prodLine) {
        Map params = new HashMap(3);

        params.put("prodLine", prodLine);

        return procedureExecutor.executeNamedProcedure("Procedure_OUT_IN_OUT", params, ProcedureOutInOutResponse.class);
    }

    @Transactional(value = "classicmodelsTransactionManager")
    @Override
    public ProcedureInOutOutResponse executeProcedure_IN_OUT_OUT(Integer cutomerNumber) {
        Map params = new HashMap(7);

        params.put("cutomerNumber", cutomerNumber);

        return procedureExecutor.executeNamedProcedure("Procedure_IN_OUT_OUT", params, ProcedureInOutOutResponse.class);
    }

    @Transactional(value = "classicmodelsTransactionManager")
    @Override
    public ProcedureSysparamResponse executeProcedure_Sysparam() {
        Map params = new HashMap(1);


        return procedureExecutor.executeNamedProcedure("Procedure_Sysparam", params, ProcedureSysparamResponse.class);
    }

    @Transactional(value = "classicmodelsTransactionManager")
    @Override
    public ProcedureInOutInoutResponse executeProcedure_IN_OUT_INOUT(Integer numerator, Integer denominator) {
        Map params = new HashMap(3);

        params.put("numerator", numerator);
        params.put("denominator", denominator);

        return procedureExecutor.executeNamedProcedure("Procedure_IN_OUT_INOUT", params, ProcedureInOutInoutResponse.class);
    }

    @Transactional(value = "classicmodelsTransactionManager")
    @Override
    public ProcedureOutInoutOutResponse executeProcedure_OUT_INOUT_OUT(String prodCode) {
        Map params = new HashMap(3);

        params.put("prodCode", prodCode);

        return procedureExecutor.executeNamedProcedure("Procedure_OUT_INOUT_OUT", params, ProcedureOutInoutOutResponse.class);
    }

    @Transactional(value = "classicmodelsTransactionManager")
    @Override
    public ProcedureOutInResponse executeProcedure_OUT_IN(Integer empNumber) {
        Map params = new HashMap(2);

        params.put("empNumber", empNumber);

        return procedureExecutor.executeNamedProcedure("Procedure_OUT_IN", params, ProcedureOutInResponse.class);
    }

    @Transactional(value = "classicmodelsTransactionManager")
    @Override
    public ProcedureOutInoutInResponse executeProcedure_OUT_INOUT_IN(Date reqDate, Integer ordNumber) {
        Map params = new HashMap(3);

        params.put("reqDate", reqDate);
        params.put("ordNumber", ordNumber);

        return procedureExecutor.executeNamedProcedure("Procedure_OUT_INOUT_IN", params, ProcedureOutInoutInResponse.class);
    }

    @Transactional(value = "classicmodelsTransactionManager")
    @Override
    public ProcedureOutOutResponse executeProcedure_OUT_OUT() {
        Map params = new HashMap(2);


        return procedureExecutor.executeNamedProcedure("Procedure_OUT_OUT", params, ProcedureOutOutResponse.class);
    }

    @Transactional(value = "classicmodelsTransactionManager")
    @Override
    public ProcedureInoutOutInResponse executeProcedure_INOUT_OUT_IN(Integer numerator, Integer denominator) {
        Map params = new HashMap(3);

        params.put("numerator", numerator);
        params.put("denominator", denominator);

        return procedureExecutor.executeNamedProcedure("Procedure_INOUT_OUT_IN", params, ProcedureInoutOutInResponse.class);
    }

    @Transactional(value = "classicmodelsTransactionManager")
    @Override
    public ProcedureInInOutResponse executeProcedure_IN_IN_OUT(Date requiredDate, Integer orderNumber) {
        Map params = new HashMap(3);

        params.put("RequiredDate", requiredDate);
        params.put("OrderNumber", orderNumber);

        return procedureExecutor.executeNamedProcedure("Procedure_IN_IN_OUT", params, ProcedureInInOutResponse.class);
    }

    @Transactional(value = "classicmodelsTransactionManager")
    @Override
    public ProcedureOutInoutResponse executeProcedure_OUT_INOUT(String prodLine) {
        Map params = new HashMap(2);

        params.put("prodLine", prodLine);

        return procedureExecutor.executeNamedProcedure("Procedure_OUT_INOUT", params, ProcedureOutInoutResponse.class);
    }

    @Transactional(value = "classicmodelsTransactionManager")
    @Override
    public ProcedureInoutOutInoutResponse executeProcedure_INOUT_OUT_INOUT(Integer numerator, Integer denominator) {
        Map params = new HashMap(3);

        params.put("numerator", numerator);
        params.put("denominator", denominator);

        return procedureExecutor.executeNamedProcedure("Procedure_INOUT_OUT_INOUT", params, ProcedureInoutOutInoutResponse.class);
    }

    @Transactional(value = "classicmodelsTransactionManager")
    @Override
    public ProcedureOutInoutInoutResponse executeProcedure_OUT_INOUT_INOUT(Date reqDate, Integer ordNumber) {
        Map params = new HashMap(3);

        params.put("reqDate", reqDate);
        params.put("ordNumber", ordNumber);

        return procedureExecutor.executeNamedProcedure("Procedure_OUT_INOUT_INOUT", params, ProcedureOutInoutInoutResponse.class);
    }

    @Transactional(value = "classicmodelsTransactionManager")
    @Override
    public ProcedureInoutInResponse executeProcedure_INOUT_IN(Date giveRequiredDateGetShippedDate, Integer orderNumber) {
        Map params = new HashMap(2);

        params.put("GiveRequiredDateGetShippedDate", giveRequiredDateGetShippedDate);
        params.put("orderNumber", orderNumber);

        return procedureExecutor.executeNamedProcedure("Procedure_INOUT_IN", params, ProcedureInoutInResponse.class);
    }

    @Transactional(value = "classicmodelsTransactionManager")
    @Override
    public ProcedureOutOutOutResponse executeProcedure_OUT_OUT_OUT() {
        Map params = new HashMap(6);


        return procedureExecutor.executeNamedProcedure("Procedure_OUT_OUT_OUT", params, ProcedureOutOutOutResponse.class);
    }

    @Transactional(value = "classicmodelsTransactionManager")
    @Override
    public ProcedureInInoutOutResponse executeProcedure_IN_INOUT_OUT(Date reqDate, Integer ordNumber) {
        Map params = new HashMap(3);

        params.put("reqDate", reqDate);
        params.put("ordNumber", ordNumber);

        return procedureExecutor.executeNamedProcedure("Procedure_IN_INOUT_OUT", params, ProcedureInInoutOutResponse.class);
    }

    @Transactional(value = "classicmodelsTransactionManager")
    @Override
    public ProcedureOutOutInoutResponse executeProcedure_OUT_OUT_INOUT(Integer empNumber) {
        Map params = new HashMap(3);

        params.put("empNumber", empNumber);

        return procedureExecutor.executeNamedProcedure("Procedure_OUT_OUT_INOUT", params, ProcedureOutOutInoutResponse.class);
    }

    @Transactional(value = "classicmodelsTransactionManager")
    @Override
    public ProcedureInInInoutResponse executeProcedure_IN_IN_INOUT(Date reqDate, Integer ordNumber, Date shipDate) {
        Map params = new HashMap(3);

        params.put("reqDate", reqDate);
        params.put("ordNumber", ordNumber);
        params.put("shipDate", shipDate);

        return procedureExecutor.executeNamedProcedure("Procedure_IN_IN_INOUT", params, ProcedureInInInoutResponse.class);
    }

    @Transactional(value = "classicmodelsTransactionManager")
    @Override
    public ProcedureOutResponse executeProcedure_OUT() {
        Map params = new HashMap(1);


        return procedureExecutor.executeNamedProcedure("Procedure_OUT", params, ProcedureOutResponse.class);
    }

    @Transactional(value = "classicmodelsTransactionManager")
    @Override
    public ProcedureInStringResponse executeProcedure_IN_STRING(String countryname) {
        Map params = new HashMap(1);

        params.put("countryname", countryname);

        return procedureExecutor.executeNamedProcedure("Procedure_IN_STRING", params, ProcedureInStringResponse.class);
    }

    @Transactional(value = "classicmodelsTransactionManager")
    @Override
    public ProcedureInoutResponse executeProcedure_INOUT(Integer empNumber) {
        Map params = new HashMap(1);

        params.put("empNumber", empNumber);

        return procedureExecutor.executeNamedProcedure("Procedure_INOUT", params, ProcedureInoutResponse.class);
    }

    @Transactional(value = "classicmodelsTransactionManager")
    @Override
    public ProcedureInoutOutResponse executeProcedure_INOUT_OUT(Integer custnum) {
        Map params = new HashMap(2);

        params.put("custnum", custnum);

        return procedureExecutor.executeNamedProcedure("Procedure_INOUT_OUT", params, ProcedureInoutOutResponse.class);
    }

    @Transactional(value = "classicmodelsTransactionManager")
    @Override
    public ProcedureOutOutInResponse executeProcedure_OUT_OUT_IN(Integer offCode) {
        Map params = new HashMap(3);

        params.put("offCode", offCode);

        return procedureExecutor.executeNamedProcedure("Procedure_OUT_OUT_IN", params, ProcedureOutOutInResponse.class);
    }

    @Transactional(value = "classicmodelsTransactionManager")
    @Override
    public ProcedureInOutInResponse executePROCEDURE_IN_OUT_IN(Integer numerator, Integer denominator) {
        Map params = new HashMap(3);

        params.put("Numerator", numerator);
        params.put("Denominator", denominator);

        return procedureExecutor.executeNamedProcedure("PROCEDURE_IN_OUT_IN", params, ProcedureInOutInResponse.class);
    }

    @Transactional(value = "classicmodelsTransactionManager")
    @Override
    public ProcedureInResponse executeProcedure_IN(Integer empNumber) {
        Map params = new HashMap(1);

        params.put("empNumber", empNumber);

        return procedureExecutor.executeNamedProcedure("Procedure_IN", params, ProcedureInResponse.class);
    }

    @Transactional(value = "classicmodelsTransactionManager")
    @Override
    public ProcedureInInInResponse executeProcedure_IN_IN_IN(Integer artId, Integer tagId, String blnak) {
        Map params = new HashMap(3);

        params.put("art_id", artId);
        params.put("tag_id", tagId);
        params.put("blnak", blnak);

        return procedureExecutor.executeNamedProcedure("Procedure_IN_IN_IN", params, ProcedureInInInResponse.class);
    }

    @Transactional(value = "classicmodelsTransactionManager")
    @Override
    public ProcedureGetProductDetailsResponse executeProcedure_getProductDetails(String prodLine) {
        Map params = new HashMap(1);

        params.put("prodLine", prodLine);

        return procedureExecutor.executeNamedProcedure("Procedure_getProductDetails", params, ProcedureGetProductDetailsResponse.class);
    }

}


