package com.gl.doctorportal;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author - GreenLearner(https://www.youtube.com/channel/UCaH2MTg94hrJZTolW01a3ZA)
 */

@RestController
public class MainController {
private static Logger logger = LoggerFactory.getLogger(MainController.class);
    @Autowired
    RestTemplateBuilder restTemplateBuilder;

    @GetMapping("/doctors")
    public String getDoctors(){
        logger.info("Going to call doctors service");
        RestTemplate restTemplate = restTemplateBuilder.build();
        return restTemplate.getForObject("http://localhost:9081/allDoctors", String.class);
    }

    @GetMapping("/diseases")
    public String getDiseases(){
        logger.info("Going to call diseases service");
        RestTemplate restTemplate = restTemplateBuilder.build();
        return restTemplate.getForObject("http://localhost:9081/allDiseases", String.class);

    }
    @GetMapping("/patients")
    public String getPatients(){
        logger.info("Going to call patients service");
        RestTemplate restTemplate = restTemplateBuilder.build();
        return restTemplate.getForObject("http://localhost:9081/allPatients", String.class);

    }
}
