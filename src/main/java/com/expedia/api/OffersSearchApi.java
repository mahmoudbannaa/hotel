package com.expedia.api;

import com.expedia.dto.OffersSearchResult;
import com.expedia.service.OffersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/offers/")
public class OffersSearchApi {


    @Autowired
    private OffersService offersService;

    @RequestMapping(value = "/search", method = RequestMethod.GET)
    public ResponseEntity<OffersSearchResult> getOffersSearchResult(){
        return offersService.getOffersSearchResult();
    }
}
