package com.routes.maps.services;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class MapsService {

    @Value("${google.maps.api.key}")
    private String apiKey;
    @Value("${mapsUrl}")
    private String mapsUrl;



    public String getRoute( String origin, String destination) {
        String url = mapsUrl+origin+"&destination="+destination+"&key="+apiKey;
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(url, String.class);
    }
}

