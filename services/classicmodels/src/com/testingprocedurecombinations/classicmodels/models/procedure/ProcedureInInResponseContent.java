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

public class ProcedureInInResponseContent implements Serializable {


    @JsonProperty("employeeNumber")
    @ColumnAlias("employeeNumber")
    private Integer employeeNumber;

    @JsonProperty("lastName")
    @ColumnAlias("lastName")
    private String lastName;

    @JsonProperty("firstName")
    @ColumnAlias("firstName")
    private String firstName;

    @JsonProperty("extension")
    @ColumnAlias("extension")
    private String extension;

    @JsonProperty("email")
    @ColumnAlias("email")
    private String email;

    @JsonProperty("officeCode")
    @ColumnAlias("officeCode")
    private String officeCode;

    @JsonProperty("reportsTo")
    @ColumnAlias("reportsTo")
    private String reportsTo;

    @JsonProperty("jobTitle")
    @ColumnAlias("jobTitle")
    private String jobTitle;

    public Integer getEmployeeNumber() {
        return this.employeeNumber;
    }

    public void setEmployeeNumber(Integer employeeNumber) {
        this.employeeNumber = employeeNumber;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getExtension() {
        return this.extension;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getOfficeCode() {
        return this.officeCode;
    }

    public void setOfficeCode(String officeCode) {
        this.officeCode = officeCode;
    }

    public String getReportsTo() {
        return this.reportsTo;
    }

    public void setReportsTo(String reportsTo) {
        this.reportsTo = reportsTo;
    }

    public String getJobTitle() {
        return this.jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ProcedureInInResponseContent)) return false;
        final ProcedureInInResponseContent procedureInInResponseContent = (ProcedureInInResponseContent) o;
        return Objects.equals(getEmployeeNumber(), procedureInInResponseContent.getEmployeeNumber()) &&
                Objects.equals(getLastName(), procedureInInResponseContent.getLastName()) &&
                Objects.equals(getFirstName(), procedureInInResponseContent.getFirstName()) &&
                Objects.equals(getExtension(), procedureInInResponseContent.getExtension()) &&
                Objects.equals(getEmail(), procedureInInResponseContent.getEmail()) &&
                Objects.equals(getOfficeCode(), procedureInInResponseContent.getOfficeCode()) &&
                Objects.equals(getReportsTo(), procedureInInResponseContent.getReportsTo()) &&
                Objects.equals(getJobTitle(), procedureInInResponseContent.getJobTitle());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getEmployeeNumber(),
                getLastName(),
                getFirstName(),
                getExtension(),
                getEmail(),
                getOfficeCode(),
                getReportsTo(),
                getJobTitle());
    }
}
