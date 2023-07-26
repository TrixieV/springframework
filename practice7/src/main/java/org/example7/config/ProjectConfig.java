package org.example7.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"org.example7.beans", "org.example7.impl", "org.example7.service"})
public class ProjectConfig {
}
