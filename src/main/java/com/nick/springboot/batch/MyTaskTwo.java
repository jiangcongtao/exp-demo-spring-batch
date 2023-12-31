package com.nick.springboot.batch;

import org.springframework.batch.core.StepContribution;
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.batch.repeat.RepeatStatus;

public class MyTaskTwo implements Tasklet {
    @Override
    public RepeatStatus execute(StepContribution contribution, ChunkContext chunkContext) throws Exception {
        System.out.println(this.getClass().getName() + " => start ...");
        // ... your task processing code
        System.out.println(this.getClass().getName() + " <= done!");
        return RepeatStatus.FINISHED;
    }
}
