package com.day2devops.collector;

import com.capitalone.dashboard.model.CollectorItem;

public class JavaMetricCollectorItem extends CollectorItem {
    private String javaVersion;

    public String getJavaVersion() {
        return javaVersion;
    }

    public void setJavaVersion(String javaVersion) {
        this.javaVersion = javaVersion;
    }
}
