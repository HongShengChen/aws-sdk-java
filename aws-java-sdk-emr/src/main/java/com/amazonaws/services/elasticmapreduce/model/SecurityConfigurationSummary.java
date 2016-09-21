/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not
 * use this file except in compliance with the License. A copy of the License is
 * located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.elasticmapreduce.model;

import java.io.Serializable;

/**
 * <p>
 * The creation date and time, and name, of a security configuration.
 * </p>
 */
public class SecurityConfigurationSummary implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the security configuration.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The date and time the security configuration was created.
     * </p>
     */
    private java.util.Date creationDateTime;

    /**
     * <p>
     * The name of the security configuration.
     * </p>
     * 
     * @param name
     *        The name of the security configuration.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the security configuration.
     * </p>
     * 
     * @return The name of the security configuration.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the security configuration.
     * </p>
     * 
     * @param name
     *        The name of the security configuration.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public SecurityConfigurationSummary withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The date and time the security configuration was created.
     * </p>
     * 
     * @param creationDateTime
     *        The date and time the security configuration was created.
     */

    public void setCreationDateTime(java.util.Date creationDateTime) {
        this.creationDateTime = creationDateTime;
    }

    /**
     * <p>
     * The date and time the security configuration was created.
     * </p>
     * 
     * @return The date and time the security configuration was created.
     */

    public java.util.Date getCreationDateTime() {
        return this.creationDateTime;
    }

    /**
     * <p>
     * The date and time the security configuration was created.
     * </p>
     * 
     * @param creationDateTime
     *        The date and time the security configuration was created.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public SecurityConfigurationSummary withCreationDateTime(
            java.util.Date creationDateTime) {
        setCreationDateTime(creationDateTime);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getName() != null)
            sb.append("Name: " + getName() + ",");
        if (getCreationDateTime() != null)
            sb.append("CreationDateTime: " + getCreationDateTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SecurityConfigurationSummary == false)
            return false;
        SecurityConfigurationSummary other = (SecurityConfigurationSummary) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null
                && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getCreationDateTime() == null
                ^ this.getCreationDateTime() == null)
            return false;
        if (other.getCreationDateTime() != null
                && other.getCreationDateTime().equals(
                        this.getCreationDateTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime
                * hashCode
                + ((getCreationDateTime() == null) ? 0 : getCreationDateTime()
                        .hashCode());
        return hashCode;
    }

    @Override
    public SecurityConfigurationSummary clone() {
        try {
            return (SecurityConfigurationSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}