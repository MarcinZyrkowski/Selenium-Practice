package org.example.conf;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = {"org.example"})
@PropertySource({"application.properties"})
public class SpringConfiguration {

    @Bean
    public WebDriver chromeDriver() {
        return new ChromeDriver();
    }

}
