/*Copyright (c) 2016-2017 wavemaker.com All Rights Reserved.
 This software is the confidential and proprietary information of wavemaker.com You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with wavemaker.com*/
package com.testingprocedurecombinations.classicmodels.models.procedure;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/


import java.io.Serializable;
import java.sql.Date;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.wavemaker.runtime.data.annotations.ColumnAlias;

public class ProcedureOutInoutInResponse implements Serializable {


    @JsonProperty("shipDate")
    @ColumnAlias("shipDate")
    private Date shipDate;

    @JsonProperty("reqDate")
    @ColumnAlias("reqDate")
    private Date reqDate;

    public Date getShipDate() {
        return this.shipDate;
    }

    public void setShipDate(Date shipDate) {
        this.shipDate = shipDate;
    }

    public Date getReqDate() {
        return this.reqDate;
    }

    public void setReqDate(Date reqDate) {
        this.reqDate = reqDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ProcedureOutInoutInResponse)) return false;
        final ProcedureOutInoutInResponse procedureOutInoutInResponse = (ProcedureOutInoutInResponse) o;
        return Objects.equals(getShipDate(), procedureOutInoutInResponse.getShipDate()) &&
                Objects.equals(getReqDate(), procedureOutInoutInResponse.getReqDate());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getShipDate(),
                getReqDate());
    }
}
