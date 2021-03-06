/*
 * Copyright (c) Mirth Corporation. All rights reserved.
 * http://www.mirthcorp.com
 *
 * The software in this package is published under the terms of the MPL
 * license a copy of which has been included with this distribution in
 * the LICENSE.txt file.
 */

package com.mirth.connect.model;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("pluginMetaData")
public class PluginMetaData extends MetaData implements Serializable {
    @XStreamAlias("serverClasses")
    private List<String> serverClasses;
    
    @XStreamAlias("clientClasses")
    private List<String> clientClasses;
    
    private String sqlScript;

    @XStreamAlias("sqlMapConfigs")
    private Map<String, String> sqlMapConfigs;

    public List<String> getServerClasses() {
        return serverClasses;
    }

    public void setServerClasses(List<String> serverClasses) {
        this.serverClasses = serverClasses;
    }

    public List<String> getClientClasses() {
        return clientClasses;
    }

    public void setClientClasses(List<String> clientClasses) {
        this.clientClasses = clientClasses;
    }

    public String getSqlScript() {
        return sqlScript;
    }

    public void setSqlScript(String sqlScript) {
        this.sqlScript = sqlScript;
    }

    public Map<String, String> getSqlMapConfigs() {
        return sqlMapConfigs;
    }

    public void setSqlMapConfigs(Map<String, String> sqlMapConfigs) {
        this.sqlMapConfigs = sqlMapConfigs;
    }

    public boolean equals(Object obj) {
        return EqualsBuilder.reflectionEquals(this, obj);
    }

    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
    }
}
