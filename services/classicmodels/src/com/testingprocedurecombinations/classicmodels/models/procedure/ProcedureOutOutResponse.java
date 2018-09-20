/*Copyright (c) 2016-2017 wavemaker.com All Rights Reserved.
 This software is the confidential and proprietary information of wavemaker.com You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with wavemaker.com*/
package com.testingprocedurecombinations.classicmodels.models.procedure;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/


import java.io.Serializable;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.wavemaker.runtime.data.annotations.ColumnAlias;

public class ProcedureOutOutResponse implements Serializable {


    @JsonProperty("empFName")
    @ColumnAlias("empFName")
    private String empFname;

    @JsonProperty("empLName")
    @ColumnAlias("empLName")
    private String empLname;

    public String getEmpFname() {
        return this.empFname;
    }

    public void setEmpFname(String empFname) {
        this.empFname = empFname;
    }

    public String getEmpLname() {
        return this.empLname;
    }

    public void setEmpLname(String empLname) {
        this.empLname = empLname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ProcedureOutOutResponse)) return false;
        final ProcedureOutOutResponse procedureOutOutResponse = (ProcedureOutOutResponse) o;
        return Objects.equals(getEmpFname(), procedureOutOutResponse.getEmpFname()) &&
                Objects.equals(getEmpLname(), procedureOutOutResponse.getEmpLname());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getEmpFname(),
                getEmpLname());
    }
}
