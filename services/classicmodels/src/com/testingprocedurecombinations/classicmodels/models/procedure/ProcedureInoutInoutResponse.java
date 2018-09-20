/*Copyright (c) 2016-2017 wavemaker.com All Rights Reserved.
 This software is the confidential and proprietary information of wavemaker.com You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with wavemaker.com*/
package com.testingprocedurecombinations.classicmodels.models.procedure;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/


import java.io.Serializable;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.wavemaker.runtime.data.annotations.ColumnAlias;

public class ProcedureInoutInoutResponse implements Serializable {


    @JsonProperty("custnum")
    @ColumnAlias("custnum")
    private Integer custnum;

    @JsonProperty("customerLevel")
    @ColumnAlias("customerLevel")
    private String customerLevel;

    public Integer getCustnum() {
        return this.custnum;
    }

    public void setCustnum(Integer custnum) {
        this.custnum = custnum;
    }

    public String getCustomerLevel() {
        return this.customerLevel;
    }

    public void setCustomerLevel(String customerLevel) {
        this.customerLevel = customerLevel;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ProcedureInoutInoutResponse)) return false;
        final ProcedureInoutInoutResponse procedureInoutInoutResponse = (ProcedureInoutInoutResponse) o;
        return Objects.equals(getCustnum(), procedureInoutInoutResponse.getCustnum()) &&
                Objects.equals(getCustomerLevel(), procedureInoutInoutResponse.getCustomerLevel());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCustnum(),
                getCustomerLevel());
    }
}
