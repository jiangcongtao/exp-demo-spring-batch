package com.nick.springboot.batch;

import org.springframework.batch.core.StepContribution;
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.batch.repeat.RepeatStatus;

public class MyTaskOne implements Tasklet {
    @Override
    public RepeatStatus execute(StepContribution contribution, ChunkContext chunkContext) throws Exception {
        System.out.println(this.getClass().getName() + " => start ...");
        // ... your task processing code
        // get Job parameter
        System.out.println(String.format("Hello Step %s, %s", chunkContext.getStepContext().getId(), chunkContext.getStepContext().getJobName()));
        System.out.println(this.getClass().getName() + " <= done!");
        return RepeatStatus.FINISHED;

    }
}
