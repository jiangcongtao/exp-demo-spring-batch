package com.nick.springboot.batch;

import org.springframework.batch.core.JobExecution;


public class JobResultListener implements org.springframework.batch.core.JobExecutionListener {
    @Override
    public void beforeJob(JobExecution jobExecution) {
        System.out.println("Called beforeJob().");
    }

    @Override
    public void afterJob(JobExecution jobExecution) {
        System.out.println("Called afterJob().");
    }
}
