/*Copyright (c) 2016-2017 wavemaker.com All Rights Reserved.
 This software is the confidential and proprietary information of wavemaker.com You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with wavemaker.com*/

package com.testingprocedurecombinations.classicmodels.service;

import java.util.Map;
import java.util.List;


import com.wavemaker.runtime.data.model.CustomProcedure;
import com.wavemaker.runtime.data.exception.QueryParameterMismatchException;

public interface ClassicmodelsProcedureExecutorService_V1 {

    List<Object> executeProcedure_getProductDetails(java.lang.String prodLine) throws QueryParameterMismatchException;


    List<Object> executeProcedure_IN(java.lang.Integer empNumber) throws QueryParameterMismatchException;


    List<Object> executeProcedure_IN_IN(java.lang.String empFName,java.lang.Integer empNumber) throws QueryParameterMismatchException;


    List<Object> executeProcedure_IN_IN_IN(java.lang.Integer art_id,java.lang.Integer tag_id,java.lang.String blnak) throws QueryParameterMismatchException;


    List<Object> executeProcedure_IN_IN_INOUT(java.sql.Date reqDate,java.lang.Integer ordNumber,java.sql.Date shipDate) throws QueryParameterMismatchException;


    List<Object> executeProcedure_IN_IN_OUT(java.sql.Date RequiredDate,java.lang.Integer OrderNumber) throws QueryParameterMismatchException;


    List<Object> executeProcedure_IN_INOUT(java.lang.Integer custnum,java.lang.String customerLevel) throws QueryParameterMismatchException;


    List<Object> executeProcedure_IN_INOUT_IN(java.lang.Integer numerator,java.lang.Integer res,java.lang.Integer denominator) throws QueryParameterMismatchException;


    List<Object> executeProcedure_IN_INOUT_INOUT(java.sql.Date reqDate,java.lang.Integer ordNumber,java.sql.Date shipDate) throws QueryParameterMismatchException;


    List<Object> executeProcedure_IN_INOUT_OUT(java.sql.Date reqDate,java.lang.Integer ordNumber) throws QueryParameterMismatchException;


    List<Object> executeProcedure_IN_IsList(java.lang.String custNumber) throws QueryParameterMismatchException;


    List<Object> executeProcedure_IN_OUT(java.lang.Integer CustomerNumber) throws QueryParameterMismatchException;


    List<Object> executePROCEDURE_IN_OUT_IN(java.lang.Integer Numerator,java.lang.Integer Denominator) throws QueryParameterMismatchException;


    List<Object> executeProcedure_IN_OUT_INOUT(java.lang.Integer numerator,java.lang.Integer denominator) throws QueryParameterMismatchException;


    List<Object> executeProcedure_IN_OUT_OUT(java.lang.Integer cutomerNumber) throws QueryParameterMismatchException;


    List<Object> executeProcedure_IN_STRING(java.lang.String countryname) throws QueryParameterMismatchException;


    List<Object> executeProcedure_INOUT(java.lang.Integer empNumber) throws QueryParameterMismatchException;


    List<Object> executeProcedure_INOUT_IN(java.sql.Date GiveRequiredDateGetShippedDate,java.lang.Integer orderNumber) throws QueryParameterMismatchException;


    List<Object> executeProcedure_INOUT_IN_IN(java.lang.Integer result1,java.lang.Integer numerator,java.lang.Integer denominator) throws QueryParameterMismatchException;


    List<Object> executeProcedure_INOUT_IN_INOUT(java.lang.Double result1,java.lang.Integer numerator,java.lang.Integer denominator) throws QueryParameterMismatchException;


    List<Object> executeProcedure_INOUT_IN_OUT(java.lang.Integer numerator,java.lang.Integer denominator) throws QueryParameterMismatchException;


    List<Object> executeProcedure_INOUT_INOUT(java.lang.Integer custnum,java.lang.String customerLevel) throws QueryParameterMismatchException;


    List<Object> executeProcedure_INOUT_INOUT_IN(java.lang.Integer count1,java.lang.Integer count2,java.lang.Integer count3,java.lang.Integer inc) throws QueryParameterMismatchException;


    List<Object> executeProcedure_INOUT_INOUT_INOUT(java.lang.Integer numerator,java.lang.Integer denominator,java.lang.Double result1) throws QueryParameterMismatchException;


    List<Object> executeProcedure_INOUT_INOUT_OUT(java.lang.Integer numerator,java.lang.Integer denominator) throws QueryParameterMismatchException;


    List<Object> executeProcedure_INOUT_OUT(java.lang.Integer custnum) throws QueryParameterMismatchException;


    List<Object> executeProcedure_INOUT_OUT_IN(java.lang.Integer numerator,java.lang.Integer denominator) throws QueryParameterMismatchException;


    List<Object> executeProcedure_INOUT_OUT_INOUT(java.lang.Integer numerator,java.lang.Integer denominator) throws QueryParameterMismatchException;


    List<Object> executeProcedure_INOUT_OUT_OUT(java.sql.Date ordrDate) throws QueryParameterMismatchException;


    List<Object> executeProcedure_OUT() throws QueryParameterMismatchException;


    List<Object> executeProcedure_OUT_IN(java.lang.Integer empNumber) throws QueryParameterMismatchException;


    List<Object> executeProcedure_OUT_IN_IN(java.lang.Integer custNumber,java.lang.String checkNum) throws QueryParameterMismatchException;


    List<Object> executeProcedure_OUT_IN_INOUT(java.sql.Date reqDate,java.lang.Integer ordNumber) throws QueryParameterMismatchException;


    List<Object> executeProcedure_OUT_IN_OUT(java.lang.String prodLine) throws QueryParameterMismatchException;


    List<Object> executeProcedure_OUT_INOUT(java.lang.String prodLine) throws QueryParameterMismatchException;


    List<Object> executeProcedure_OUT_INOUT_IN(java.sql.Date reqDate,java.lang.Integer ordNumber) throws QueryParameterMismatchException;


    List<Object> executeProcedure_OUT_INOUT_INOUT(java.sql.Date reqDate,java.lang.Integer ordNumber) throws QueryParameterMismatchException;


    List<Object> executeProcedure_OUT_INOUT_OUT(java.lang.String prodCode) throws QueryParameterMismatchException;


    List<Object> executeProcedure_OUT_OUT() throws QueryParameterMismatchException;


    List<Object> executeProcedure_OUT_OUT_IN(java.lang.Integer offCode) throws QueryParameterMismatchException;


    List<Object> executeProcedure_OUT_OUT_INOUT(java.lang.Integer empNumber) throws QueryParameterMismatchException;


    List<Object> executeProcedure_OUT_OUT_OUT() throws QueryParameterMismatchException;


    List<Object> executeProcedure_Sysparam() throws QueryParameterMismatchException;


    List<Object> executeProcedure_WithoutAnyParams() throws QueryParameterMismatchException;


	
	List<Object> executeWMCustomProcedure(CustomProcedure procedure) ;


}

