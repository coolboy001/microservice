package com.avm.rating.services;

import com.avm.rating.entities.Rating;

import java.util.List;
import java.util.UUID;

public interface RatingService {

    List<Rating> getAllRatings();
    List<Rating> getAllByUserId(UUID userId);
    List<Rating> getAllByHotelId(UUID hotelId);
    Rating getRating(UUID id);
    Rating createRating(Rating rating);

}
