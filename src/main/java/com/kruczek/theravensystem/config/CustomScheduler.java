package com.kruczek.theravensystem.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.task.TaskSchedulerCustomizer;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.concurrent.ThreadPoolTaskScheduler;

import com.kruczek.theravensystem.exception.CustomExceptionHandler;

@Configuration
class CustomScheduler implements TaskSchedulerCustomizer {

    private final CustomExceptionHandler customExceptionHandler;

    @Autowired
    CustomScheduler(CustomExceptionHandler customExceptionHandler) {
        this.customExceptionHandler = customExceptionHandler;
    }

    @Override
    public void customize(ThreadPoolTaskScheduler taskScheduler) {
        taskScheduler.setErrorHandler(customExceptionHandler);
    }
}
