package com.ish.test.main.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import javax.validation.constraints.NotNull;

@Configuration
@ConfigurationProperties("endpoints.prometheus")
@Setter
@Getter
@Component
public class CommonSettings {

    @NotNull
    private String enabled;
}
