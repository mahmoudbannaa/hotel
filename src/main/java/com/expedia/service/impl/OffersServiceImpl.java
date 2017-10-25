package com.expedia.service.impl;

import com.expedia.dto.OffersSearchResult;
import com.expedia.service.OffersService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;



@Service
public class OffersServiceImpl implements OffersService {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Value("${expedia.hotels.service.url}")
    private String url;

    @Override
    public ResponseEntity<OffersSearchResult> getOffersSearchResult() {

        try {
            return new RestTemplate().exchange(url, HttpMethod.GET, null, OffersSearchResult.class);

        } catch (HttpClientErrorException e) {

            e.printStackTrace();
            return new ResponseEntity<OffersSearchResult>(e.getStatusCode());
        }
    }
}
