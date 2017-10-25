package com.expedia.service;

import com.expedia.Application;
import com.expedia.dto.OffersSearchResult;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
public class OffersServiceTest {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private OffersService offersService;


    @Test
    public void getOffersSearchResultTest() {

        ResponseEntity<OffersSearchResult> offersSearchResult= offersService.getOffersSearchResult();
        logger.info(offersSearchResult.toString());
    }


}
