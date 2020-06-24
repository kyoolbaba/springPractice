package com.springcore.core;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ReadExternalProperties {

    @Value("${external.mysql.jdbc.url}")
    private String url;

    public String getUrl() {
        return url;
    }
}
