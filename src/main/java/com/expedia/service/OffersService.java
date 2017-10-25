package com.expedia.service;

import com.expedia.dto.OffersSearchResult;
import org.springframework.http.ResponseEntity;

public interface OffersService {

    public ResponseEntity<OffersSearchResult> getOffersSearchResult();
}

