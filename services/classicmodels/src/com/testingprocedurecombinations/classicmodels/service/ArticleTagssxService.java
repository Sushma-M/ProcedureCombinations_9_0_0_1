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

import com.testingprocedurecombinations.classicmodels.ArticleTagssx;
import com.testingprocedurecombinations.classicmodels.ArticleTagssxId;

/**
 * Service object for domain model class {@link ArticleTagssx}.
 */
public interface ArticleTagssxService {

    /**
     * Creates a new ArticleTagssx. It does cascade insert for all the children in a single transaction.
     *
     * This method overrides the input field values using Server side or database managed properties defined on ArticleTagssx if any.
     *
     * @param articleTagssx Details of the ArticleTagssx to be created; value cannot be null.
     * @return The newly created ArticleTagssx.
     */
	ArticleTagssx create(@Valid ArticleTagssx articleTagssx);


	/**
	 * Returns ArticleTagssx by given id if exists.
	 *
	 * @param articletagssxId The id of the ArticleTagssx to get; value cannot be null.
	 * @return ArticleTagssx associated with the given articletagssxId.
     * @throws EntityNotFoundException If no ArticleTagssx is found.
	 */
	ArticleTagssx getById(ArticleTagssxId articletagssxId) throws EntityNotFoundException;

    /**
	 * Find and return the ArticleTagssx by given id if exists, returns null otherwise.
	 *
	 * @param articletagssxId The id of the ArticleTagssx to get; value cannot be null.
	 * @return ArticleTagssx associated with the given articletagssxId.
	 */
	ArticleTagssx findById(ArticleTagssxId articletagssxId);


	/**
	 * Updates the details of an existing ArticleTagssx. It replaces all fields of the existing ArticleTagssx with the given articleTagssx.
	 *
     * This method overrides the input field values using Server side or database managed properties defined on ArticleTagssx if any.
     *
	 * @param articleTagssx The details of the ArticleTagssx to be updated; value cannot be null.
	 * @return The updated ArticleTagssx.
	 * @throws EntityNotFoundException if no ArticleTagssx is found with given input.
	 */
	ArticleTagssx update(@Valid ArticleTagssx articleTagssx) throws EntityNotFoundException;

    /**
	 * Deletes an existing ArticleTagssx with the given id.
	 *
	 * @param articletagssxId The id of the ArticleTagssx to be deleted; value cannot be null.
	 * @return The deleted ArticleTagssx.
	 * @throws EntityNotFoundException if no ArticleTagssx found with the given id.
	 */
	ArticleTagssx delete(ArticleTagssxId articletagssxId) throws EntityNotFoundException;

	/**
	 * Find all ArticleTagssxes matching the given QueryFilter(s).
     * All the QueryFilter(s) are ANDed to filter the results.
     * This method returns Paginated results.
	 *
     * @deprecated Use {@link #findAll(String, Pageable)} instead.
	 *
     * @param queryFilters Array of queryFilters to filter the results; No filters applied if the input is null/empty.
     * @param pageable Details of the pagination information along with the sorting options. If null returns all matching records.
     * @return Paginated list of matching ArticleTagssxes.
     *
     * @see QueryFilter
     * @see Pageable
     * @see Page
	 */
    @Deprecated
	Page<ArticleTagssx> findAll(QueryFilter[] queryFilters, Pageable pageable);

    /**
	 * Find all ArticleTagssxes matching the given input query. This method returns Paginated results.
     * Note: Go through the documentation for <u>query</u> syntax.
	 *
     * @param query The query to filter the results; No filters applied if the input is null/empty.
     * @param pageable Details of the pagination information along with the sorting options. If null returns all matching records.
     * @return Paginated list of matching ArticleTagssxes.
     *
     * @see Pageable
     * @see Page
	 */
    Page<ArticleTagssx> findAll(String query, Pageable pageable);

    /**
	 * Exports all ArticleTagssxes matching the given input query to the given exportType format.
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
	 * Retrieve the count of the ArticleTagssxes in the repository with matching query.
     * Note: Go through the documentation for <u>query</u> syntax.
     *
     * @param query query to filter results. No filters applied if the input is null/empty.
	 * @return The count of the ArticleTagssx.
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
