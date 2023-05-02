//package com.learn.cruddemo.config;
//
//import com.learn.cruddemo.prometheus.CustomCollector;
//import io.prometheus.client.CollectorRegistry;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.boot.CommandLineRunner;
//
//import java.io.IOException;
//
//public class PrometheusConfiguration implements CommandLineRunner {
//    @Value("${prometheus.server.port:1234}")
//    private int prometheusServerPort ;
//
//    @Override
//    public void run(String... args) throws IOException {
//        CollectorRegistry.defaultRegistry.register(new CustomCollector());
//        HTTPS
//
//    }
//}
