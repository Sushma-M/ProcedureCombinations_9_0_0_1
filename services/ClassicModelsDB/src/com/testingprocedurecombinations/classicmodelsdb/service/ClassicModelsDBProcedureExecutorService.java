/*Copyright (c) 2016-2017 wavemaker.com All Rights Reserved.
 This software is the confidential and proprietary information of wavemaker.com You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with wavemaker.com*/

package com.testingprocedurecombinations.classicmodelsdb.service;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/


import com.testingprocedurecombinations.classicmodelsdb.models.procedure.*;

public interface ClassicModelsDBProcedureExecutorService {

    ProcedureOutOutInResponse executeProcedure_OUT_OUT_IN(String offCode);

    ProcedureOutOutInoutResponse executeProcedure_OUT_OUT_INOUT(Integer empNumber);

}


