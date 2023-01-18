package ru.otr.auth.service.service;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import ru.otr.auth.service.config.RestTemplateAuthLocalCredentials;

@Service
public class SomeService {

    private final RestTemplate restTemplate;

    public SomeService(@Qualifier("restTemplateLocalCredentials") RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public String getSomeData(){
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_FORM_URLENCODED);

        ResponseEntity<String> objectResponseEntity = restTemplate.getForEntity("http://localhost:8086/api/hhh", String.class, headers);

        return "data for view = " +  objectResponseEntity;
    }
}
