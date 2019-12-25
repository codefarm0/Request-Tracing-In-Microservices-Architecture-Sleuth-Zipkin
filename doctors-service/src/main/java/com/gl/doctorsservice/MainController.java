package com.gl.doctorsservice;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author - GreenLearner(https://www.youtube.com/channel/UCaH2MTg94hrJZTolW01a3ZA)
 */

@RestController
public class MainController {
    private static Logger logger = LoggerFactory.getLogger(MainController.class);
    @GetMapping("/allDoctors")
    public String doctors(){
        logger.info("got hit on /allDoctors");
        return "List of doctors";
    }
}
