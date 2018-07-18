package org.manriquecms.fintech.api.openfintech.controller;

import java.util.concurrent.atomic.AtomicLong;

import org.manriquecms.fintech.api.openfintech.utils.HttpClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.client.*;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/api/v1")
public class BanksController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();
    private static final String server = "https://api.openfintech.io";

    private HttpStatus status;


    @RequestMapping("/banks")
    public String getBanks() {
        HttpHeaders headers = new HttpHeaders();
        HttpEntity<String> requestEntity = new HttpEntity<String>("", headers);

        ResponseEntity<String> responseEntity = HttpClient.getHttpClient().exchange(server + "/v1/banks", HttpMethod.GET, requestEntity, String.class);
        status = responseEntity.getStatusCode();

        return responseEntity.getBody();


    }

//    @RequestMapping("/banks")
//    public Greeting greeting(@RequestParam(value="name", defaultValue="World") String name) {
//        return new Greeting(counter.incrementAndGet(),
//                String.format(template, name));
//    }
}