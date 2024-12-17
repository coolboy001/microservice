package com.avm.rating.services.impl;

import com.avm.rating.entities.Rating;
import com.avm.rating.exception.ResourceNotFoundException;
import com.avm.rating.repositories.RatingRepository;
import com.avm.rating.services.RatingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.UUID;

@Service
public class RatingServiceImpl implements RatingService {

    @Autowired
    private RatingRepository ratingRepository;

    @Override
    public List<Rating> getAllRatings() {
        return ratingRepository.findAll();
    }

    @Override
    public List<Rating> getAllByUserId(UUID userId) {
        return ratingRepository.findByUserId(userId);
    }

    @Override
    public List<Rating> getAllByHotelId(UUID hotelId) {
         return ratingRepository.findByHotelId(hotelId);
    }

    @Override
    public Rating getRating(UUID id) {
        return ratingRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException());
    }

    @Override
    public Rating createRating(Rating rating) {
        return ratingRepository.save(rating);
    }
}
