/*Copyright (c) 2016-2017 wavemaker.com All Rights Reserved.
 This software is the confidential and proprietary information of wavemaker.com You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with wavemaker.com*/
package com.testingprocedurecombinations.classicmodels.models.procedure;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/


import java.io.Serializable;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.wavemaker.runtime.data.annotations.ColumnAlias;

public class ProcedureInoutInInoutResponse implements Serializable {


    @JsonProperty("result1")
    @ColumnAlias("result1")
    private Double result1;

    @JsonProperty("denominator")
    @ColumnAlias("denominator")
    private Integer denominator;

    public Double getResult1() {
        return this.result1;
    }

    public void setResult1(Double result1) {
        this.result1 = result1;
    }

    public Integer getDenominator() {
        return this.denominator;
    }

    public void setDenominator(Integer denominator) {
        this.denominator = denominator;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ProcedureInoutInInoutResponse)) return false;
        final ProcedureInoutInInoutResponse procedureInoutInInoutResponse = (ProcedureInoutInInoutResponse) o;
        return Objects.equals(getResult1(), procedureInoutInInoutResponse.getResult1()) &&
                Objects.equals(getDenominator(), procedureInoutInInoutResponse.getDenominator());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getResult1(),
                getDenominator());
    }
}
