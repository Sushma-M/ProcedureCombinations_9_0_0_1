/*Copyright (c) 2016-2017 wavemaker.com All Rights Reserved.
 This software is the confidential and proprietary information of wavemaker.com You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with wavemaker.com*/
package com.testingprocedurecombinations.classicmodelsdb.service;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/


import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.wavemaker.runtime.data.exception.EntityNotFoundException;
import com.wavemaker.runtime.data.export.ExportType;
import com.wavemaker.runtime.data.expression.QueryFilter;
import com.wavemaker.runtime.file.model.Downloadable;

import com.testingprocedurecombinations.classicmodelsdb.Table12;

/**
 * Service object for domain model class {@link Table12}.
 */
public interface Table12Service {

    /**
     * Creates a new Table12. It does cascade insert for all the children in a single transaction.
     *
     * This method overrides the input field values using Server side or database managed properties defined on Table12 if any.
     *
     * @param table12 Details of the Table12 to be created; value cannot be null.
     * @return The newly created Table12.
     */
	Table12 create(Table12 table12);


	/**
	 * Returns Table12 by given id if exists.
	 *
	 * @param table12Id The id of the Table12 to get; value cannot be null.
	 * @return Table12 associated with the given table12Id.
     * @throws EntityNotFoundException If no Table12 is found.
	 */
	Table12 getById(Integer table12Id) throws EntityNotFoundException;

    /**
	 * Find and return the Table12 by given id if exists, returns null otherwise.
	 *
	 * @param table12Id The id of the Table12 to get; value cannot be null.
	 * @return Table12 associated with the given table12Id.
	 */
	Table12 findById(Integer table12Id);


	/**
	 * Updates the details of an existing Table12. It replaces all fields of the existing Table12 with the given table12.
	 *
     * This method overrides the input field values using Server side or database managed properties defined on Table12 if any.
     *
	 * @param table12 The details of the Table12 to be updated; value cannot be null.
	 * @return The updated Table12.
	 * @throws EntityNotFoundException if no Table12 is found with given input.
	 */
	Table12 update(Table12 table12) throws EntityNotFoundException;

    /**
	 * Deletes an existing Table12 with the given id.
	 *
	 * @param table12Id The id of the Table12 to be deleted; value cannot be null.
	 * @return The deleted Table12.
	 * @throws EntityNotFoundException if no Table12 found with the given id.
	 */
	Table12 delete(Integer table12Id) throws EntityNotFoundException;

	/**
	 * Find all Table12s matching the given QueryFilter(s).
     * All the QueryFilter(s) are ANDed to filter the results.
     * This method returns Paginated results.
	 *
     * @deprecated Use {@link #findAll(String, Pageable)} instead.
	 *
     * @param queryFilters Array of queryFilters to filter the results; No filters applied if the input is null/empty.
     * @param pageable Details of the pagination information along with the sorting options. If null returns all matching records.
     * @return Paginated list of matching Table12s.
     *
     * @see QueryFilter
     * @see Pageable
     * @see Page
	 */
    @Deprecated
	Page<Table12> findAll(QueryFilter[] queryFilters, Pageable pageable);

    /**
	 * Find all Table12s matching the given input query. This method returns Paginated results.
     * Note: Go through the documentation for <u>query</u> syntax.
	 *
     * @param query The query to filter the results; No filters applied if the input is null/empty.
     * @param pageable Details of the pagination information along with the sorting options. If null returns all matching records.
     * @return Paginated list of matching Table12s.
     *
     * @see Pageable
     * @see Page
	 */
    Page<Table12> findAll(String query, Pageable pageable);

    /**
	 * Exports all Table12s matching the given input query to the given exportType format.
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
	 * Retrieve the count of the Table12s in the repository with matching query.
     * Note: Go through the documentation for <u>query</u> syntax.
     *
     * @param query query to filter results. No filters applied if the input is null/empty.
	 * @return The count of the Table12.
	 */
	long count(String query);


}

