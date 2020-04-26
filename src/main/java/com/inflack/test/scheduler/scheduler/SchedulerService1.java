package com.inflack.test.scheduler.scheduler;

import com.inflack.test.scheduler.model.SchedulerIdentifier;
import com.inflack.test.scheduler.service.ThreadedService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

/**
 * @author Tanvir Hossain
 * @since 2020-04-24 16:21
 */
@Slf4j
@Service
public class SchedulerService1 {

    private ThreadedService threadedService;
    private SchedulerIdentifier schedulerIdentifier;

    public SchedulerService1(
            ThreadedService threadedService,
            SchedulerIdentifier schedulerIdentifier
    ) {
        this.threadedService = threadedService;
        this.schedulerIdentifier = schedulerIdentifier;
    }

    @Scheduled(cron = "*/1 * * * * *")
    public void start() {
        log.info("Scheduled : every after 1s");
        String identifier = "service 1";
        schedulerIdentifier.set(identifier);

        threadedService.describe();
    }
}
