package com.learn.cruddemo.prometheus;

import io.prometheus.client.Collector;
import io.prometheus.client.Counter;

import java.util.ArrayList;
import java.util.List;

public class CustomCollector extends Collector {
    private final Counter requestsTotal = Counter.build()
            .name("requests_total")
            .help("Total number of requests.")
            .register();
    @Override
    public List<MetricFamilySamples> collect() {
        List<MetricFamilySamples> metricFamilySamples = new ArrayList<>() ;
        metricFamilySamples.add((MetricFamilySamples) requestsTotal.collect());
        return metricFamilySamples;
    }
}
