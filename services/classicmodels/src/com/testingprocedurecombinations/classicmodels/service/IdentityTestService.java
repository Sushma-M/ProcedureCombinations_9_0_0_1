/*Copyright (c) 2016-2017 wavemaker.com All Rights Reserved.
 This software is the confidential and proprietary information of wavemaker.com You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with wavemaker.com*/
package com.testingprocedurecombinations.classicmodels.service;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/

import java.util.Map;

import javax.validation.Valid;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.wavemaker.runtime.data.exception.EntityNotFoundException;
import com.wavemaker.runtime.data.export.ExportType;
import com.wavemaker.runtime.data.expression.QueryFilter;
import com.wavemaker.runtime.data.model.AggregationInfo;
import com.wavemaker.runtime.file.model.Downloadable;

import com.testingprocedurecombinations.classicmodels.IdentityTest;

/**
 * Service object for domain model class {@link IdentityTest}.
 */
public interface IdentityTestService {

    /**
     * Creates a new IdentityTest. It does cascade insert for all the children in a single transaction.
     *
     * This method overrides the input field values using Server side or database managed properties defined on IdentityTest if any.
     *
     * @param identityTest Details of the IdentityTest to be created; value cannot be null.
     * @return The newly created IdentityTest.
     */
	IdentityTest create(@Valid IdentityTest identityTest);


	/**
	 * Returns IdentityTest by given id if exists.
	 *
	 * @param identitytestId The id of the IdentityTest to get; value cannot be null.
	 * @return IdentityTest associated with the given identitytestId.
     * @throws EntityNotFoundException If no IdentityTest is found.
	 */
	IdentityTest getById(String identitytestId) throws EntityNotFoundException;

    /**
	 * Find and return the IdentityTest by given id if exists, returns null otherwise.
	 *
	 * @param identitytestId The id of the IdentityTest to get; value cannot be null.
	 * @return IdentityTest associated with the given identitytestId.
	 */
	IdentityTest findById(String identitytestId);


	/**
	 * Updates the details of an existing IdentityTest. It replaces all fields of the existing IdentityTest with the given identityTest.
	 *
     * This method overrides the input field values using Server side or database managed properties defined on IdentityTest if any.
     *
	 * @param identityTest The details of the IdentityTest to be updated; value cannot be null.
	 * @return The updated IdentityTest.
	 * @throws EntityNotFoundException if no IdentityTest is found with given input.
	 */
	IdentityTest update(@Valid IdentityTest identityTest) throws EntityNotFoundException;

    /**
	 * Deletes an existing IdentityTest with the given id.
	 *
	 * @param identitytestId The id of the IdentityTest to be deleted; value cannot be null.
	 * @return The deleted IdentityTest.
	 * @throws EntityNotFoundException if no IdentityTest found with the given id.
	 */
	IdentityTest delete(String identitytestId) throws EntityNotFoundException;

	/**
	 * Find all IdentityTests matching the given QueryFilter(s).
     * All the QueryFilter(s) are ANDed to filter the results.
     * This method returns Paginated results.
	 *
     * @deprecated Use {@link #findAll(String, Pageable)} instead.
	 *
     * @param queryFilters Array of queryFilters to filter the results; No filters applied if the input is null/empty.
     * @param pageable Details of the pagination information along with the sorting options. If null returns all matching records.
     * @return Paginated list of matching IdentityTests.
     *
     * @see QueryFilter
     * @see Pageable
     * @see Page
	 */
    @Deprecated
	Page<IdentityTest> findAll(QueryFilter[] queryFilters, Pageable pageable);

    /**
	 * Find all IdentityTests matching the given input query. This method returns Paginated results.
     * Note: Go through the documentation for <u>query</u> syntax.
	 *
     * @param query The query to filter the results; No filters applied if the input is null/empty.
     * @param pageable Details of the pagination information along with the sorting options. If null returns all matching records.
     * @return Paginated list of matching IdentityTests.
     *
     * @see Pageable
     * @see Page
	 */
    Page<IdentityTest> findAll(String query, Pageable pageable);

    /**
	 * Exports all IdentityTests matching the given input query to the given exportType format.
     * Note: Go through the documentation for <u>query</u> syntax.
	 *
     * @param exportType The format in which to export the data; value cannot be null.
     * @param query The query to filter the results; No filters applied if the input is null/empty.
     * @param pageable Details of the pagination information along with the sorting options. If null exports all matching records.
     * @return The Downloadable file in given export type.
     *
     * @see Pageable
     * @see ExportType
     * @see Downloadable
	 */
    Downloadable export(ExportType exportType, String query, Pageable pageable);

	/**
	 * Retrieve the count of the IdentityTests in the repository with matching query.
     * Note: Go through the documentation for <u>query</u> syntax.
     *
     * @param query query to filter results. No filters applied if the input is null/empty.
	 * @return The count of the IdentityTest.
	 */
	long count(String query);

	/**
	 * Retrieve aggregated values with matching aggregation info.
     *
     * @param aggregationInfo info related to aggregations.
     * @param pageable Details of the pagination information along with the sorting options. If null exports all matching records.
	 * @return Paginated data with included fields.

     * @see AggregationInfo
     * @see Pageable
     * @see Page
	 */
	Page<Map<String, Object>> getAggregatedValues(AggregationInfo aggregationInfo, Pageable pageable);


}

