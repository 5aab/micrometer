package com.ish.test.main;

import com.ish.test.main.config.CommonSettings;
import io.micrometer.core.annotation.Timed;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

@Controller
@EnableAutoConfiguration
@Slf4j
@AllArgsConstructor
@ComponentScan(basePackages = {
        "com.ish.test.main.config"
})
@Timed
public class SampleController {

    private CommonSettings commonSettings;

    @RequestMapping("/test1")
    @ResponseBody
    String home() {
        log.info(commonSettings.getEnabled());
        log.info("Hello World");
        return "Hello World How r u!";
    }

    public static void main(String[] args) throws Exception {
        log.info("Hello World 2 3 4 ");
        SpringApplication.run(SampleController.class, args);
    }
}
