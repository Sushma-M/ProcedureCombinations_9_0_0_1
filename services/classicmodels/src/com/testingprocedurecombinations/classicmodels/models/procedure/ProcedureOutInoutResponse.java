/*Copyright (c) 2016-2017 wavemaker.com All Rights Reserved.
 This software is the confidential and proprietary information of wavemaker.com You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with wavemaker.com*/
package com.testingprocedurecombinations.classicmodels.models.procedure;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/


import java.io.Serializable;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.wavemaker.runtime.data.annotations.ColumnAlias;

public class ProcedureOutInoutResponse implements Serializable {


    @JsonProperty("txtDesc")
    @ColumnAlias("txtDesc")
    private String txtDesc;

    @JsonProperty("prodLine")
    @ColumnAlias("prodLine")
    private String prodLine;

    public String getTxtDesc() {
        return this.txtDesc;
    }

    public void setTxtDesc(String txtDesc) {
        this.txtDesc = txtDesc;
    }

    public String getProdLine() {
        return this.prodLine;
    }

    public void setProdLine(String prodLine) {
        this.prodLine = prodLine;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ProcedureOutInoutResponse)) return false;
        final ProcedureOutInoutResponse procedureOutInoutResponse = (ProcedureOutInoutResponse) o;
        return Objects.equals(getTxtDesc(), procedureOutInoutResponse.getTxtDesc()) &&
                Objects.equals(getProdLine(), procedureOutInoutResponse.getProdLine());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getTxtDesc(),
                getProdLine());
    }
}