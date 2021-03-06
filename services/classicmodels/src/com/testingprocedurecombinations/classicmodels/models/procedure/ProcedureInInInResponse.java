/*Copyright (c) 2016-2017 wavemaker.com All Rights Reserved.
 This software is the confidential and proprietary information of wavemaker.com You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with wavemaker.com*/
package com.testingprocedurecombinations.classicmodels.models.procedure;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/


import java.io.Serializable;
import java.util.List;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.wavemaker.runtime.data.annotations.ColumnAlias;

public class ProcedureInInInResponse implements Serializable {


    @JsonProperty("content")
    @ColumnAlias("content")
    private List<ProcedureInInInResponseContent> content;

    public List<ProcedureInInInResponseContent> getContent() {
        return this.content;
    }

    public void setContent(List<ProcedureInInInResponseContent> content) {
        this.content = content;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ProcedureInInInResponse)) return false;
        final ProcedureInInInResponse procedureInInInResponse = (ProcedureInInInResponse) o;
        return Objects.equals(getContent(), procedureInInInResponse.getContent());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getContent());
    }
}
