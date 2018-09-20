/*Copyright (c) 2016-2017 wavemaker.com All Rights Reserved.
 This software is the confidential and proprietary information of wavemaker.com You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with wavemaker.com*/

package com.testingprocedurecombinations.classicmodels.service;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/

import java.sql.Date;

import com.testingprocedurecombinations.classicmodels.models.procedure.*;

public interface ClassicmodelsProcedureExecutorService {

    ProcedureInoutOutOutResponse executeProcedure_INOUT_OUT_OUT(Date ordrDate);

    ProcedureInoutInInResponse executeProcedure_INOUT_IN_IN(Integer result1, Integer numerator, Integer denominator);

    ProcedureInoutInInoutResponse executeProcedure_INOUT_IN_INOUT(Double result1, Integer numerator, Integer denominator);

    ProcedureInoutInOutResponse executeProcedure_INOUT_IN_OUT(Integer numerator, Integer denominator);

    ProcedureInOutResponse executeProcedure_IN_OUT(Integer customerNumber);

    ProcedureInInoutInResponse executeProcedure_IN_INOUT_IN(Integer numerator, Integer res, Integer denominator);

    ProcedureOutInInResponse executeProcedure_OUT_IN_IN(Integer custNumber, String checkNum);

    ProcedureInoutInoutInResponse executeProcedure_INOUT_INOUT_IN(Integer count1, Integer count2, Integer count3, Integer inc);

    ProcedureInInoutInoutResponse executeProcedure_IN_INOUT_INOUT(Date reqDate, Integer ordNumber, Date shipDate);

    ProcedureWithoutAnyParamsResponse executeProcedure_WithoutAnyParams();

    ProcedureInoutInoutInoutResponse executeProcedure_INOUT_INOUT_INOUT(Integer numerator, Integer denominator, Double result1);

    ProcedureOutInInoutResponse executeProcedure_OUT_IN_INOUT(Date reqDate, Integer ordNumber);

    ProcedureInInoutResponse executeProcedure_IN_INOUT(Integer custnum, String customerLevel);

    ProcedureInInResponse executeProcedure_IN_IN(String empFname, Integer empNumber);

    ProcedureInoutInoutResponse executeProcedure_INOUT_INOUT(Integer custnum, String customerLevel);

    ProcedureInoutInoutOutResponse executeProcedure_INOUT_INOUT_OUT(Integer numerator, Integer denominator);

    ProcedureInIsListResponse executeProcedure_IN_IsList(String custNumber);

    ProcedureOutInOutResponse executeProcedure_OUT_IN_OUT(String prodLine);

    ProcedureInOutOutResponse executeProcedure_IN_OUT_OUT(Integer cutomerNumber);

    ProcedureSysparamResponse executeProcedure_Sysparam();

    ProcedureInOutInoutResponse executeProcedure_IN_OUT_INOUT(Integer numerator, Integer denominator);

    ProcedureOutInoutOutResponse executeProcedure_OUT_INOUT_OUT(String prodCode);

    ProcedureOutInResponse executeProcedure_OUT_IN(Integer empNumber);

    ProcedureOutInoutInResponse executeProcedure_OUT_INOUT_IN(Date reqDate, Integer ordNumber);

    ProcedureOutOutResponse executeProcedure_OUT_OUT();

    ProcedureInoutOutInResponse executeProcedure_INOUT_OUT_IN(Integer numerator, Integer denominator);

    ProcedureInInOutResponse executeProcedure_IN_IN_OUT(Date requiredDate, Integer orderNumber);

    ProcedureOutInoutResponse executeProcedure_OUT_INOUT(String prodLine);

    ProcedureInoutOutInoutResponse executeProcedure_INOUT_OUT_INOUT(Integer numerator, Integer denominator);

    ProcedureOutInoutInoutResponse executeProcedure_OUT_INOUT_INOUT(Date reqDate, Integer ordNumber);

    ProcedureInoutInResponse executeProcedure_INOUT_IN(Date giveRequiredDateGetShippedDate, Integer orderNumber);

    ProcedureOutOutOutResponse executeProcedure_OUT_OUT_OUT();

    ProcedureInInoutOutResponse executeProcedure_IN_INOUT_OUT(Date reqDate, Integer ordNumber);

    ProcedureOutOutInoutResponse executeProcedure_OUT_OUT_INOUT(Integer empNumber);

    ProcedureInInInoutResponse executeProcedure_IN_IN_INOUT(Date reqDate, Integer ordNumber, Date shipDate);

    ProcedureOutResponse executeProcedure_OUT();

    ProcedureInStringResponse executeProcedure_IN_STRING(String countryname);

    ProcedureInoutResponse executeProcedure_INOUT(Integer empNumber);

    ProcedureInoutOutResponse executeProcedure_INOUT_OUT(Integer custnum);

    ProcedureOutOutInResponse executeProcedure_OUT_OUT_IN(Integer offCode);

    ProcedureInOutInResponse executePROCEDURE_IN_OUT_IN(Integer numerator, Integer denominator);

    ProcedureInResponse executeProcedure_IN(Integer empNumber);

    ProcedureInInInResponse executeProcedure_IN_IN_IN(Integer artId, Integer tagId, String blnak);

    ProcedureGetProductDetailsResponse executeProcedure_getProductDetails(String prodLine);

}


