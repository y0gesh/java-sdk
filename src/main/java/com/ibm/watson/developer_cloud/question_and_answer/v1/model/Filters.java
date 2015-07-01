/**
 * Copyright 2015 IBM Corp. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.ibm.watson.developer_cloud.question_and_answer.v1.model;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.GsonBuilder;

/**
 * The Class Filters.
 */
public class Filters {

	/**
	 * Field filters.
	 */
	private List<Filter> filters = new ArrayList<Filter>();

	/**
	 * Gets the filters.
	 * 
	 * @return The filters
	 */
	public List<Filter> getFilters() {
		return filters;
	}

	/**
	 * Sets the filters.
	 * 
	 * @param filters
	 *            The filters
	 */
	public void setFilters(List<Filter> filters) {
		this.filters = filters;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return getClass().getName() + " "
				+ new GsonBuilder().setPrettyPrinting().create().toJson(this);
	}

}
