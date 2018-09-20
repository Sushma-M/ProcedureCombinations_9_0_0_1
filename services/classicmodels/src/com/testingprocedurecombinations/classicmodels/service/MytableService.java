/*Copyright (c) 2016-2017 wavemaker.com All Rights Reserved.
 This software is the confidential and proprietary information of wavemaker.com You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with wavemaker.com*/
package com.testingprocedurecombinations.classicmodels.service;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/


import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.wavemaker.runtime.data.exception.EntityNotFoundException;
import com.wavemaker.runtime.data.export.ExportType;
import com.wavemaker.runtime.data.expression.QueryFilter;
import com.wavemaker.runtime.file.model.Downloadable;

import com.testingprocedurecombinations.classicmodels.Mytable;
import com.testingprocedurecombinations.classicmodels.MytableId;

/**
 * Service object for domain model class {@link Mytable}.
 */
public interface MytableService {

    /**
     * Creates a new Mytable. It does cascade insert for all the children in a single transaction.
     *
     * This method overrides the input field values using Server side or database managed properties defined on Mytable if any.
     *
     * @param mytable Details of the Mytable to be created; value cannot be null.
     * @return The newly created Mytable.
     */
	Mytable create(Mytable mytable);


	/**
	 * Returns Mytable by given id if exists.
	 *
	 * @param mytableId The id of the Mytable to get; value cannot be null.
	 * @return Mytable associated with the given mytableId.
     * @throws EntityNotFoundException If no Mytable is found.
	 */
	Mytable getById(MytableId mytableId) throws EntityNotFoundException;

    /**
	 * Find and return the Mytable by given id if exists, returns null otherwise.
	 *
	 * @param mytableId The id of the Mytable to get; value cannot be null.
	 * @return Mytable associated with the given mytableId.
	 */
	Mytable findById(MytableId mytableId);


	/**
	 * Updates the details of an existing Mytable. It replaces all fields of the existing Mytable with the given mytable.
	 *
     * This method overrides the input field values using Server side or database managed properties defined on Mytable if any.
     *
	 * @param mytable The details of the Mytable to be updated; value cannot be null.
	 * @return The updated Mytable.
	 * @throws EntityNotFoundException if no Mytable is found with given input.
	 */
	Mytable update(Mytable mytable) throws EntityNotFoundException;

    /**
	 * Deletes an existing Mytable with the given id.
	 *
	 * @param mytableId The id of the Mytable to be deleted; value cannot be null.
	 * @return The deleted Mytable.
	 * @throws EntityNotFoundException if no Mytable found with the given id.
	 */
	Mytable delete(MytableId mytableId) throws EntityNotFoundException;

	/**
	 * Find all Mytables matching the given QueryFilter(s).
     * All the QueryFilter(s) are ANDed to filter the results.
     * This method returns Paginated results.
	 *
     * @deprecated Use {@link #findAll(String, Pageable)} instead.
	 *
     * @param queryFilters Array of queryFilters to filter the results; No filters applied if the input is null/empty.
     * @param pageable Details of the pagination information along with the sorting options. If null returns all matching records.
     * @return Paginated list of matching Mytables.
     *
     * @see QueryFilter
     * @see Pageable
     * @see Page
	 */
    @Deprecated
	Page<Mytable> findAll(QueryFilter[] queryFilters, Pageable pageable);

    /**
	 * Find all Mytables matching the given input query. This method returns Paginated results.
     * Note: Go through the documentation for <u>query</u> syntax.
	 *
     * @param query The query to filter the results; No filters applied if the input is null/empty.
     * @param pageable Details of the pagination information along with the sorting options. If null returns all matching records.
     * @return Paginated list of matching Mytables.
     *
     * @see Pageable
     * @see Page
	 */
    Page<Mytable> findAll(String query, Pageable pageable);

    /**
	 * Exports all Mytables matching the given input query to the given exportType format.
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
	 * Retrieve the count of the Mytables in the repository with matching query.
     * Note: Go through the documentation for <u>query</u> syntax.
     *
     * @param query query to filter results. No filters applied if the input is null/empty.
	 * @return The count of the Mytable.
	 */
	long count(String query);


}

