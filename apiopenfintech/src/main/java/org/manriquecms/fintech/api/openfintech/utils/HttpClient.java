package org.manriquecms.fintech.api.openfintech.utils;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.client.ClientHttpResponse;
import org.springframework.web.client.ResponseErrorHandler;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;

public class HttpClient {
    private RestTemplate rest;
    private static HttpClient httpClient;

    public static RestTemplate getHttpClient(){
        if (httpClient==null){
            httpClient = new HttpClient();
        }
        return httpClient.rest;
    }

    private HttpClient (){
        rest = new RestTemplate();
    }

}
