/*Copyright (c) 2016-2017 wavemaker.com All Rights Reserved.
 This software is the confidential and proprietary information of wavemaker.com You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with wavemaker.com*/

package com.testingprocedurecombinations.classicmodelsdb.service;


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
public class ClassicModelsDBProcedureExecutorServiceImpl_V1 implements ClassicModelsDBProcedureExecutorService_V1 {
	private static final Logger LOGGER = LoggerFactory.getLogger(ClassicModelsDBProcedureExecutorServiceImpl_V1.class);

	@Autowired
	@Qualifier("ClassicModelsDBWMProcedureExecutor")
	private WMProcedureExecutor procedureExecutor;


	@Transactional(value = "ClassicModelsDBTransactionManager")
	@Override
	public List<Object> executeProcedure_OUT_OUT_IN(java.lang.String offCode)
	throws QueryParameterMismatchException{
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("offCode", offCode);
        return procedureExecutor.executeNamedProcedure("Procedure_OUT_OUT_IN", params);

	}

	@Transactional(value = "ClassicModelsDBTransactionManager")
	@Override
	public List<Object> executeProcedure_OUT_OUT_INOUT(java.lang.Integer empNumber)
	throws QueryParameterMismatchException{
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("empNumber", empNumber);
        return procedureExecutor.executeNamedProcedure("Procedure_OUT_OUT_INOUT", params);

	}

	@Transactional(value = "ClassicModelsDBTransactionManager")
	@Override
	public List<Object> executeWMCustomProcedure(CustomProcedure procedure) {
	    return procedureExecutor.executeCustomProcedure(procedure);
	}


}

