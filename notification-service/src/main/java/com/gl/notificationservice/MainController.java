package com.gl.notificationservice;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author - GreenLearner(https://www.youtube.com/channel/UCaH2MTg94hrJZTolW01a3ZA)
 */

@RestController
public class MainController {
private static Logger logger = LoggerFactory.getLogger(MainController.class);

    @GetMapping("/notify/{enquiry}")
    public String notifyUser(@PathVariable String enquiry){
        logger.info("notified user for enquiry of - {}", enquiry);
        return "notified user for enquiry of " + enquiry;
    }
}
