package com.example.asynccontroller.controller;

import com.example.asynccontroller.service.AsyncService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    private Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    private AsyncService asyncService;

    @GetMapping("testAsync")
    public void testAsync() throws InterruptedException {
        logger.debug("DemoController::testAsync start");
        asyncService.executeAsync();
        logger.debug("DemoController::testAsync end");
    }

}
