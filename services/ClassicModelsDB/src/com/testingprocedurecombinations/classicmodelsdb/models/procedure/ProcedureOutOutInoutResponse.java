/*Copyright (c) 2016-2017 wavemaker.com All Rights Reserved.
 This software is the confidential and proprietary information of wavemaker.com You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with wavemaker.com*/
package com.testingprocedurecombinations.classicmodelsdb.models.procedure;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/


import java.io.Serializable;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.wavemaker.runtime.data.annotations.ColumnAlias;

public class ProcedureOutOutInoutResponse implements Serializable {


    @JsonProperty("empEmail")
    @ColumnAlias("empEmail")
    private String empEmail;

    @JsonProperty("empJobTitle")
    @ColumnAlias("empJobTitle")
    private String empJobTitle;

    @JsonProperty("empNumber")
    @ColumnAlias("empNumber")
    private Integer empNumber;

    public String getEmpEmail() {
        return this.empEmail;
    }

    public void setEmpEmail(String empEmail) {
        this.empEmail = empEmail;
    }

    public String getEmpJobTitle() {
        return this.empJobTitle;
    }

    public void setEmpJobTitle(String empJobTitle) {
        this.empJobTitle = empJobTitle;
    }

    public Integer getEmpNumber() {
        return this.empNumber;
    }

    public void setEmpNumber(Integer empNumber) {
        this.empNumber = empNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ProcedureOutOutInoutResponse)) return false;
        final ProcedureOutOutInoutResponse procedureOutOutInoutResponse = (ProcedureOutOutInoutResponse) o;
        return Objects.equals(getEmpEmail(), procedureOutOutInoutResponse.getEmpEmail()) &&
                Objects.equals(getEmpJobTitle(), procedureOutOutInoutResponse.getEmpJobTitle()) &&
                Objects.equals(getEmpNumber(), procedureOutOutInoutResponse.getEmpNumber());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getEmpEmail(),
                getEmpJobTitle(),
                getEmpNumber());
    }
}
