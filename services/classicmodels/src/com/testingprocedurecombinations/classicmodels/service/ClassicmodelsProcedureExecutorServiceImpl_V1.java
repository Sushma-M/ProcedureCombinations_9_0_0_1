/*Copyright (c) 2016-2017 wavemaker.com All Rights Reserved.
 This software is the confidential and proprietary information of wavemaker.com You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with wavemaker.com*/

package com.testingprocedurecombinations.classicmodels.service;


import java.util.HashMap;
import java.util.Map;
import java.util.Collections;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.wavemaker.runtime.data.model.CustomProcedure;
import com.wavemaker.runtime.data.dao.procedure.WMProcedureExecutor;
import com.wavemaker.runtime.data.exception.QueryParameterMismatchException;

@Service
public class ClassicmodelsProcedureExecutorServiceImpl_V1 implements ClassicmodelsProcedureExecutorService_V1 {
	private static final Logger LOGGER = LoggerFactory.getLogger(ClassicmodelsProcedureExecutorServiceImpl_V1.class);

	@Autowired
	@Qualifier("classicmodelsWMProcedureExecutor")
	private WMProcedureExecutor procedureExecutor;


	@Transactional(value = "classicmodelsTransactionManager")
	@Override
	public List<Object> executeProcedure_getProductDetails(java.lang.String prodLine)
	throws QueryParameterMismatchException{
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("prodLine", prodLine);
        return procedureExecutor.executeNamedProcedure("Procedure_getProductDetails", params);

	}

	@Transactional(value = "classicmodelsTransactionManager")
	@Override
	public List<Object> executeProcedure_IN(java.lang.Integer empNumber)
	throws QueryParameterMismatchException{
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("empNumber", empNumber);
        return procedureExecutor.executeNamedProcedure("Procedure_IN", params);

	}

	@Transactional(value = "classicmodelsTransactionManager")
	@Override
	public List<Object> executeProcedure_IN_IN(java.lang.String empFName,java.lang.Integer empNumber)
	throws QueryParameterMismatchException{
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("empFName", empFName);
        params.put("empNumber", empNumber);
        return procedureExecutor.executeNamedProcedure("Procedure_IN_IN", params);

	}

	@Transactional(value = "classicmodelsTransactionManager")
	@Override
	public List<Object> executeProcedure_IN_IN_IN(java.lang.Integer art_id,java.lang.Integer tag_id,java.lang.String blnak)
	throws QueryParameterMismatchException{
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("art_id", art_id);
        params.put("tag_id", tag_id);
        params.put("blnak", blnak);
        return procedureExecutor.executeNamedProcedure("Procedure_IN_IN_IN", params);

	}

	@Transactional(value = "classicmodelsTransactionManager")
	@Override
	public List<Object> executeProcedure_IN_IN_INOUT(java.sql.Date reqDate,java.lang.Integer ordNumber,java.sql.Date shipDate)
	throws QueryParameterMismatchException{
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("reqDate", reqDate);
        params.put("ordNumber", ordNumber);
        params.put("shipDate", shipDate);
        return procedureExecutor.executeNamedProcedure("Procedure_IN_IN_INOUT", params);

	}

	@Transactional(value = "classicmodelsTransactionManager")
	@Override
	public List<Object> executeProcedure_IN_IN_OUT(java.sql.Date RequiredDate,java.lang.Integer OrderNumber)
	throws QueryParameterMismatchException{
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("RequiredDate", RequiredDate);
        params.put("OrderNumber", OrderNumber);
        return procedureExecutor.executeNamedProcedure("Procedure_IN_IN_OUT", params);

	}

	@Transactional(value = "classicmodelsTransactionManager")
	@Override
	public List<Object> executeProcedure_IN_INOUT(java.lang.Integer custnum,java.lang.String customerLevel)
	throws QueryParameterMismatchException{
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("custnum", custnum);
        params.put("customerLevel", customerLevel);
        return procedureExecutor.executeNamedProcedure("Procedure_IN_INOUT", params);

	}

	@Transactional(value = "classicmodelsTransactionManager")
	@Override
	public List<Object> executeProcedure_IN_INOUT_IN(java.lang.Integer numerator,java.lang.Integer res,java.lang.Integer denominator)
	throws QueryParameterMismatchException{
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("numerator", numerator);
        params.put("res", res);
        params.put("denominator", denominator);
        return procedureExecutor.executeNamedProcedure("Procedure_IN_INOUT_IN", params);

	}

	@Transactional(value = "classicmodelsTransactionManager")
	@Override
	public List<Object> executeProcedure_IN_INOUT_INOUT(java.sql.Date reqDate,java.lang.Integer ordNumber,java.sql.Date shipDate)
	throws QueryParameterMismatchException{
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("reqDate", reqDate);
        params.put("ordNumber", ordNumber);
        params.put("shipDate", shipDate);
        return procedureExecutor.executeNamedProcedure("Procedure_IN_INOUT_INOUT", params);

	}

	@Transactional(value = "classicmodelsTransactionManager")
	@Override
	public List<Object> executeProcedure_IN_INOUT_OUT(java.sql.Date reqDate,java.lang.Integer ordNumber)
	throws QueryParameterMismatchException{
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("reqDate", reqDate);
        params.put("ordNumber", ordNumber);
        return procedureExecutor.executeNamedProcedure("Procedure_IN_INOUT_OUT", params);

	}

	@Transactional(value = "classicmodelsTransactionManager")
	@Override
	public List<Object> executeProcedure_IN_IsList(java.lang.String custNumber)
	throws QueryParameterMismatchException{
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("custNumber", custNumber);
        return procedureExecutor.executeNamedProcedure("Procedure_IN_IsList", params);

	}

	@Transactional(value = "classicmodelsTransactionManager")
	@Override
	public List<Object> executeProcedure_IN_OUT(java.lang.Integer CustomerNumber)
	throws QueryParameterMismatchException{
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("CustomerNumber", CustomerNumber);
        return procedureExecutor.executeNamedProcedure("Procedure_IN_OUT", params);

	}

	@Transactional(value = "classicmodelsTransactionManager")
	@Override
	public List<Object> executePROCEDURE_IN_OUT_IN(java.lang.Integer Numerator,java.lang.Integer Denominator)
	throws QueryParameterMismatchException{
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("Numerator", Numerator);
        params.put("Denominator", Denominator);
        return procedureExecutor.executeNamedProcedure("PROCEDURE_IN_OUT_IN", params);

	}

	@Transactional(value = "classicmodelsTransactionManager")
	@Override
	public List<Object> executeProcedure_IN_OUT_INOUT(java.lang.Integer numerator,java.lang.Integer denominator)
	throws QueryParameterMismatchException{
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("numerator", numerator);
        params.put("denominator", denominator);
        return procedureExecutor.executeNamedProcedure("Procedure_IN_OUT_INOUT", params);

	}

	@Transactional(value = "classicmodelsTransactionManager")
	@Override
	public List<Object> executeProcedure_IN_OUT_OUT(java.lang.Integer cutomerNumber)
	throws QueryParameterMismatchException{
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("cutomerNumber", cutomerNumber);
        return procedureExecutor.executeNamedProcedure("Procedure_IN_OUT_OUT", params);

	}

	@Transactional(value = "classicmodelsTransactionManager")
	@Override
	public List<Object> executeProcedure_IN_STRING(java.lang.String countryname)
	throws QueryParameterMismatchException{
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("countryname", countryname);
        return procedureExecutor.executeNamedProcedure("Procedure_IN_STRING", params);

	}

	@Transactional(value = "classicmodelsTransactionManager")
	@Override
	public List<Object> executeProcedure_INOUT(java.lang.Integer empNumber)
	throws QueryParameterMismatchException{
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("empNumber", empNumber);
        return procedureExecutor.executeNamedProcedure("Procedure_INOUT", params);

	}

	@Transactional(value = "classicmodelsTransactionManager")
	@Override
	public List<Object> executeProcedure_INOUT_IN(java.sql.Date GiveRequiredDateGetShippedDate,java.lang.Integer orderNumber)
	throws QueryParameterMismatchException{
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("GiveRequiredDateGetShippedDate", GiveRequiredDateGetShippedDate);
        params.put("orderNumber", orderNumber);
        return procedureExecutor.executeNamedProcedure("Procedure_INOUT_IN", params);

	}

	@Transactional(value = "classicmodelsTransactionManager")
	@Override
	public List<Object> executeProcedure_INOUT_IN_IN(java.lang.Integer result1,java.lang.Integer numerator,java.lang.Integer denominator)
	throws QueryParameterMismatchException{
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("result1", result1);
        params.put("numerator", numerator);
        params.put("denominator", denominator);
        return procedureExecutor.executeNamedProcedure("Procedure_INOUT_IN_IN", params);

	}

	@Transactional(value = "classicmodelsTransactionManager")
	@Override
	public List<Object> executeProcedure_INOUT_IN_INOUT(java.lang.Double result1,java.lang.Integer numerator,java.lang.Integer denominator)
	throws QueryParameterMismatchException{
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("result1", result1);
        params.put("numerator", numerator);
        params.put("denominator", denominator);
        return procedureExecutor.executeNamedProcedure("Procedure_INOUT_IN_INOUT", params);

	}

	@Transactional(value = "classicmodelsTransactionManager")
	@Override
	public List<Object> executeProcedure_INOUT_IN_OUT(java.lang.Integer numerator,java.lang.Integer denominator)
	throws QueryParameterMismatchException{
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("numerator", numerator);
        params.put("denominator", denominator);
        return procedureExecutor.executeNamedProcedure("Procedure_INOUT_IN_OUT", params);

	}

	@Transactional(value = "classicmodelsTransactionManager")
	@Override
	public List<Object> executeProcedure_INOUT_INOUT(java.lang.Integer custnum,java.lang.String customerLevel)
	throws QueryParameterMismatchException{
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("custnum", custnum);
        params.put("customerLevel", customerLevel);
        return procedureExecutor.executeNamedProcedure("Procedure_INOUT_INOUT", params);

	}

	@Transactional(value = "classicmodelsTransactionManager")
	@Override
	public List<Object> executeProcedure_INOUT_INOUT_IN(java.lang.Integer count1,java.lang.Integer count2,java.lang.Integer count3,java.lang.Integer inc)
	throws QueryParameterMismatchException{
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("count1", count1);
        params.put("count2", count2);
        params.put("count3", count3);
        params.put("inc", inc);
        return procedureExecutor.executeNamedProcedure("Procedure_INOUT_INOUT_IN", params);

	}

	@Transactional(value = "classicmodelsTransactionManager")
	@Override
	public List<Object> executeProcedure_INOUT_INOUT_INOUT(java.lang.Integer numerator,java.lang.Integer denominator,java.lang.Double result1)
	throws QueryParameterMismatchException{
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("numerator", numerator);
        params.put("denominator", denominator);
        params.put("result1", result1);
        return procedureExecutor.executeNamedProcedure("Procedure_INOUT_INOUT_INOUT", params);

	}

	@Transactional(value = "classicmodelsTransactionManager")
	@Override
	public List<Object> executeProcedure_INOUT_INOUT_OUT(java.lang.Integer numerator,java.lang.Integer denominator)
	throws QueryParameterMismatchException{
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("numerator", numerator);
        params.put("denominator", denominator);
        return procedureExecutor.executeNamedProcedure("Procedure_INOUT_INOUT_OUT", params);

	}

	@Transactional(value = "classicmodelsTransactionManager")
	@Override
	public List<Object> executeProcedure_INOUT_OUT(java.lang.Integer custnum)
	throws QueryParameterMismatchException{
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("custnum", custnum);
        return procedureExecutor.executeNamedProcedure("Procedure_INOUT_OUT", params);

	}

	@Transactional(value = "classicmodelsTransactionManager")
	@Override
	public List<Object> executeProcedure_INOUT_OUT_IN(java.lang.Integer numerator,java.lang.Integer denominator)
	throws QueryParameterMismatchException{
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("numerator", numerator);
        params.put("denominator", denominator);
        return procedureExecutor.executeNamedProcedure("Procedure_INOUT_OUT_IN", params);

	}

	@Transactional(value = "classicmodelsTransactionManager")
	@Override
	public List<Object> executeProcedure_INOUT_OUT_INOUT(java.lang.Integer numerator,java.lang.Integer denominator)
	throws QueryParameterMismatchException{
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("numerator", numerator);
        params.put("denominator", denominator);
        return procedureExecutor.executeNamedProcedure("Procedure_INOUT_OUT_INOUT", params);

	}

	@Transactional(value = "classicmodelsTransactionManager")
	@Override
	public List<Object> executeProcedure_INOUT_OUT_OUT(java.sql.Date ordrDate)
	throws QueryParameterMismatchException{
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("ordrDate", ordrDate);
        return procedureExecutor.executeNamedProcedure("Procedure_INOUT_OUT_OUT", params);

	}

	@Transactional(value = "classicmodelsTransactionManager")
	@Override
	public List<Object> executeProcedure_OUT()
	throws QueryParameterMismatchException{
        Map<String, Object> params = new HashMap<String, Object>();
        return procedureExecutor.executeNamedProcedure("Procedure_OUT", params);

	}

	@Transactional(value = "classicmodelsTransactionManager")
	@Override
	public List<Object> executeProcedure_OUT_IN(java.lang.Integer empNumber)
	throws QueryParameterMismatchException{
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("empNumber", empNumber);
        return procedureExecutor.executeNamedProcedure("Procedure_OUT_IN", params);

	}

	@Transactional(value = "classicmodelsTransactionManager")
	@Override
	public List<Object> executeProcedure_OUT_IN_IN(java.lang.Integer custNumber,java.lang.String checkNum)
	throws QueryParameterMismatchException{
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("custNumber", custNumber);
        params.put("checkNum", checkNum);
        return procedureExecutor.executeNamedProcedure("Procedure_OUT_IN_IN", params);

	}

	@Transactional(value = "classicmodelsTransactionManager")
	@Override
	public List<Object> executeProcedure_OUT_IN_INOUT(java.sql.Date reqDate,java.lang.Integer ordNumber)
	throws QueryParameterMismatchException{
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("reqDate", reqDate);
        params.put("ordNumber", ordNumber);
        return procedureExecutor.executeNamedProcedure("Procedure_OUT_IN_INOUT", params);

	}

	@Transactional(value = "classicmodelsTransactionManager")
	@Override
	public List<Object> executeProcedure_OUT_IN_OUT(java.lang.String prodLine)
	throws QueryParameterMismatchException{
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("prodLine", prodLine);
        return procedureExecutor.executeNamedProcedure("Procedure_OUT_IN_OUT", params);

	}

	@Transactional(value = "classicmodelsTransactionManager")
	@Override
	public List<Object> executeProcedure_OUT_INOUT(java.lang.String prodLine)
	throws QueryParameterMismatchException{
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("prodLine", prodLine);
        return procedureExecutor.executeNamedProcedure("Procedure_OUT_INOUT", params);

	}

	@Transactional(value = "classicmodelsTransactionManager")
	@Override
	public List<Object> executeProcedure_OUT_INOUT_IN(java.sql.Date reqDate,java.lang.Integer ordNumber)
	throws QueryParameterMismatchException{
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("reqDate", reqDate);
        params.put("ordNumber", ordNumber);
        return procedureExecutor.executeNamedProcedure("Procedure_OUT_INOUT_IN", params);

	}

	@Transactional(value = "classicmodelsTransactionManager")
	@Override
	public List<Object> executeProcedure_OUT_INOUT_INOUT(java.sql.Date reqDate,java.lang.Integer ordNumber)
	throws QueryParameterMismatchException{
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("reqDate", reqDate);
        params.put("ordNumber", ordNumber);
        return procedureExecutor.executeNamedProcedure("Procedure_OUT_INOUT_INOUT", params);

	}

	@Transactional(value = "classicmodelsTransactionManager")
	@Override
	public List<Object> executeProcedure_OUT_INOUT_OUT(java.lang.String prodCode)
	throws QueryParameterMismatchException{
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("prodCode", prodCode);
        return procedureExecutor.executeNamedProcedure("Procedure_OUT_INOUT_OUT", params);

	}

	@Transactional(value = "classicmodelsTransactionManager")
	@Override
	public List<Object> executeProcedure_OUT_OUT()
	throws QueryParameterMismatchException{
        Map<String, Object> params = new HashMap<String, Object>();
        return procedureExecutor.executeNamedProcedure("Procedure_OUT_OUT", params);

	}

	@Transactional(value = "classicmodelsTransactionManager")
	@Override
	public List<Object> executeProcedure_OUT_OUT_IN(java.lang.Integer offCode)
	throws QueryParameterMismatchException{
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("offCode", offCode);
        return procedureExecutor.executeNamedProcedure("Procedure_OUT_OUT_IN", params);

	}

	@Transactional(value = "classicmodelsTransactionManager")
	@Override
	public List<Object> executeProcedure_OUT_OUT_INOUT(java.lang.Integer empNumber)
	throws QueryParameterMismatchException{
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("empNumber", empNumber);
        return procedureExecutor.executeNamedProcedure("Procedure_OUT_OUT_INOUT", params);

	}

	@Transactional(value = "classicmodelsTransactionManager")
	@Override
	public List<Object> executeProcedure_OUT_OUT_OUT()
	throws QueryParameterMismatchException{
        Map<String, Object> params = new HashMap<String, Object>();
        return procedureExecutor.executeNamedProcedure("Procedure_OUT_OUT_OUT", params);

	}

	@Transactional(value = "classicmodelsTransactionManager")
	@Override
	public List<Object> executeProcedure_Sysparam()
	throws QueryParameterMismatchException{
        Map<String, Object> params = new HashMap<String, Object>();
        return procedureExecutor.executeNamedProcedure("Procedure_Sysparam", params);

	}

	@Transactional(value = "classicmodelsTransactionManager")
	@Override
	public List<Object> executeProcedure_WithoutAnyParams()
	throws QueryParameterMismatchException{
        Map<String, Object> params = new HashMap<String, Object>();
        return procedureExecutor.executeNamedProcedure("Procedure_WithoutAnyParams", params);

	}

	@Transactional(value = "classicmodelsTransactionManager")
	@Override
	public List<Object> executeWMCustomProcedure(CustomProcedure procedure) {
	    return procedureExecutor.executeCustomProcedure(procedure);
	}


}

