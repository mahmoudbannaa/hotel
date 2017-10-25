package com.expedia.api;

import com.expedia.dto.OffersSearchResult;
import com.expedia.service.OffersService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/offers/")
public class OffersSearchApi {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private OffersService offersService;

    @RequestMapping(value = "/search",
            produces = "application/json" ,
            method = RequestMethod.GET)
    public OffersSearchResult getOffersSearchResult(){

        logger.info("calling getOffersSearchResult API method");
        return offersService.getOffersSearchResult();
    }
}
