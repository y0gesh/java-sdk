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

package com.ibm.watson.developer_cloud.dialog.v1.model;

import com.google.gson.GsonBuilder;
import com.google.gson.annotations.SerializedName;

/**
 * The Class HitNode.
 */
public class HitNode {

	/** The details. */
	private String details;
	
	/** The label. */
	private String label;
	
	/** The type. */
	private String type;

	/**
	 * The node id.
	 */
	@SerializedName("node_id")
	private int nodeId;

	/**
	 * Gets the details.
	 * 
	 * @return The details
	 */
	public String getDetails() {
		return details;
	}

	/**
	 * Sets the details.
	 * 
	 * @param details
	 *            The details
	 */
	public void setDetails(final String details) {
		this.details = details;
	}

	/**
	 * With details.
	 * 
	 * @param details
	 *            the details
	 * @return the hit node
	 */
	public HitNode withDetails(final String details) {
		this.details = details;
		return this;
	}

	/**
	 * Gets the label.
	 * 
	 * @return The label
	 */
	public String getLabel() {
		return label;
	}

	/**
	 * Sets the label.
	 * 
	 * @param label
	 *            The label
	 */
	public void setLabel(final String label) {
		this.label = label;
	}

	/**
	 * With label.
	 * 
	 * @param label
	 *            the label
	 * @return the hit node
	 */
	public HitNode withLabel(final String label) {
		this.label = label;
		return this;
	}

	/**
	 * Gets the type.
	 * 
	 * @return The type
	 */
	public String getType() {
		return type;
	}

	/**
	 * Sets the type.
	 * 
	 * @param type
	 *            The type
	 */
	public void setType(final String type) {
		this.type = type;
	}

	/**
	 * With type.
	 * 
	 * @param type
	 *            the type
	 * @return the hit node
	 */
	public HitNode withType(final String type) {
		this.type = type;
		return this;
	}

	/**
	 * Gets the node id.
	 * 
	 * @return The nodeId
	 */
	public int getNodeId() {
		return nodeId;
	}

	/**
	 * Sets the node id.
	 * 
	 * @param nodeId
	 *            The node_id
	 */
	public void setNodeId(final int nodeId) {
		this.nodeId = nodeId;
	}

	/**
	 * With node id.
	 * 
	 * @param nodeId
	 *            the node id
	 * @return the hit node
	 */
	public HitNode withNodeId(final int nodeId) {
		this.nodeId = nodeId;
		return this;
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
