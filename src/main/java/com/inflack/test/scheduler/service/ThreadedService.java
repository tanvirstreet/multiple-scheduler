package com.inflack.test.scheduler.service;

import com.inflack.test.scheduler.model.SchedulerIdentifier;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Tanvir Hossain
 * @since 2020-04-24 16:24
 */
@Slf4j
@Service
public class ThreadedService {

    private SchedulerIdentifier schedulerIdentifier;

    @Autowired
    public ThreadedService(SchedulerIdentifier schedulerIdentifier){
        this.schedulerIdentifier = schedulerIdentifier;
    }

    public void describe(){
        log.info("SchedulerIdentifier : {}", schedulerIdentifier.get());
    }


    public void describe(int i){
        log.info("SchedulerIdentifier : {} : {}", schedulerIdentifier.get(), i);
    }
}
