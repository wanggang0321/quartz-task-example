package com.ppdtbb.task;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class QuartzJob {
	
	private final Logger logger = LoggerFactory.getLogger(QuartzJob.class);
	
	public void work() {
        System.out.println("test first taskJob .... ");
        logger.info("test first taskJob .... ");
    }
	
}
