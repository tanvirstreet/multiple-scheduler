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
public class SchedulerService2 {

    private ThreadedService threadedService;
    private SchedulerIdentifier schedulerIdentifier;

    public SchedulerService2(
            ThreadedService threadedService,
            SchedulerIdentifier schedulerIdentifier
    ) {
        this.threadedService = threadedService;
        this.schedulerIdentifier = schedulerIdentifier;
    }

    @Scheduled(cron = "*/3 * * * * *")
    public void start() {
        log.info("Scheduled : every after 3s");
        String identifier = "service 2";
        schedulerIdentifier.set(identifier);

        for (int i = 1; i <= 18; i++) {

            try {
                Thread.sleep(100);
            } catch (InterruptedException e){
                log.error(e.getMessage(),e);
            }
            threadedService.describe(i * 100);
        }
    }
}
