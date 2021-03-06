/*
 * Copyright 2010-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.services.sqs.model;

import java.io.Serializable;

/**
 * <p>
 * A list of your queues.
 * </p>
 */
public class ListQueuesResult implements Serializable {
    /**
     * <p>
     * A list of queue URLs, up to 1000 entries.
     * </p>
     */
    private java.util.List<String> queueUrls = new java.util.ArrayList<String>();

    /**
     * <p>
     * A list of queue URLs, up to 1000 entries.
     * </p>
     *
     * @return <p>
     *         A list of queue URLs, up to 1000 entries.
     *         </p>
     */
    public java.util.List<String> getQueueUrls() {
        return queueUrls;
    }

    /**
     * <p>
     * A list of queue URLs, up to 1000 entries.
     * </p>
     *
     * @param queueUrls <p>
     *            A list of queue URLs, up to 1000 entries.
     *            </p>
     */
    public void setQueueUrls(java.util.Collection<String> queueUrls) {
        if (queueUrls == null) {
            this.queueUrls = null;
            return;
        }

        this.queueUrls = new java.util.ArrayList<String>(queueUrls);
    }

    /**
     * <p>
     * A list of queue URLs, up to 1000 entries.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param queueUrls <p>
     *            A list of queue URLs, up to 1000 entries.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListQueuesResult withQueueUrls(String... queueUrls) {
        if (getQueueUrls() == null) {
            this.queueUrls = new java.util.ArrayList<String>(queueUrls.length);
        }
        for (String value : queueUrls) {
            this.queueUrls.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of queue URLs, up to 1000 entries.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param queueUrls <p>
     *            A list of queue URLs, up to 1000 entries.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListQueuesResult withQueueUrls(java.util.Collection<String> queueUrls) {
        setQueueUrls(queueUrls);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getQueueUrls() != null)
            sb.append("QueueUrls: " + getQueueUrls());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getQueueUrls() == null) ? 0 : getQueueUrls().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListQueuesResult == false)
            return false;
        ListQueuesResult other = (ListQueuesResult) obj;

        if (other.getQueueUrls() == null ^ this.getQueueUrls() == null)
            return false;
        if (other.getQueueUrls() != null
                && other.getQueueUrls().equals(this.getQueueUrls()) == false)
            return false;
        return true;
    }
}
