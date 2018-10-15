package com.sports.api.CricketApp.service.impl;

import com.sports.api.CricketApp.service.AllMatchesService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class AllMatchesServiceImpl implements AllMatchesService {

    public static final String apiKey = "16Dyx0esynMy9Jz4JocdLGC97Ek1";
    public static final String cricApiURL = "http://cricapi.com/api/";
    public static final String MATCHES = "matches";
    private static final Logger log = LoggerFactory.getLogger(AllMatchesServiceImpl.class);

    @Override
    public String getAllCurrentMatches() {
        String response="";
        try {
            String allMatchesURL = cricApiURL + MATCHES + "?apikey=" + apiKey;
            RestTemplate restTemplate = new RestTemplate();
            ResponseEntity<String> responseEntity = restTemplate.getForEntity(allMatchesURL, String.class);
            response = responseEntity.getBody();
        }
        catch (Exception ex) {
            log.error("Error in fetching list of all the matches", ex);
        }
        return response.toString();
    }
}
