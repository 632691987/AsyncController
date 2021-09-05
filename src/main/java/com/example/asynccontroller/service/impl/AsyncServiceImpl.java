package com.example.asynccontroller.service.impl;

import com.example.asynccontroller.service.AsyncService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

@Service
public class AsyncServiceImpl implements AsyncService {


    private static final Logger logger = LoggerFactory.getLogger(AsyncServiceImpl.class);

    @Override
    @Async("asyncServiceExecutor")
    public void executeAsync() throws InterruptedException {
        logger.debug("AsyncServiceImpl::executeAsync start");
        TimeUnit.SECONDS.sleep(5);
        logger.debug("AsyncServiceImpl::executeAsync end");
    }
}