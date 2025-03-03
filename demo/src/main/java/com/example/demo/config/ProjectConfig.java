package com.example.demo.config;

import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.stereotype.Controller;

@Controller
@EnableFeignClients(basePackages = "com.example.proxy")
public class ProjectConfig {
}
