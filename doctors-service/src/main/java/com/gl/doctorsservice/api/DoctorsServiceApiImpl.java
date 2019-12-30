package com.gl.doctorsservice.api;

import com.gl.doctorsservice.MainController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @author - GreenLearner(https://www.youtube.com/channel/UCaH2MTg94hrJZTolW01a3ZA)
 */
@Service
public class DoctorsServiceApiImpl implements DoctorsServiceApi {
    private static Logger logger = LoggerFactory.getLogger(DoctorsServiceApiImpl.class);

    @Autowired
    private RestTemplateBuilder builder;
    @Override
    public String getDoctors(String hospital) {
        logger.info("fetching doctors list from db for hospital -{}", hospital);

        RestTemplate template = builder.build();
        template.getForObject("http://localhost:5081/notify/doctors", String.class);

        return "List of doctors for hospital - " + hospital;
    }
}
