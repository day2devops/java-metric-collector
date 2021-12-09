package com.day2devops.collector;

import com.capitalone.dashboard.collector.CollectorTask;
import com.capitalone.dashboard.model.Collector;
import com.capitalone.dashboard.repository.BaseCollectorRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.TaskScheduler;
import org.springframework.stereotype.Component;

/**
 * CollectorTask that fetches Java information from GitHub project
 */
@Component
public class JavaMetricCollectorTask extends CollectorTask<Collector> {
    @Autowired
    public JavaMetricCollectorTask(TaskScheduler taskScheduler) {
        super(taskScheduler, "Java Metrics");
    }

    @Override
    public Collector getCollector() {
        return null;
    }

    @Override
    public BaseCollectorRepository<Collector> getCollectorRepository() {
        return null;
    }

    @Override
    public String getCron() {
        return null;
    }

    @Override
    public void collect(Collector collector) {

    }
}
