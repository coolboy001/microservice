package com.avm.rating.repositories;

import com.avm.rating.entities.Rating;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;
@Repository
public interface  RatingRepository extends JpaRepository<Rating, UUID> {

    // custom finder method
    List<Rating> findByUserId(UUID userId);
    List<Rating> findByHotelId(UUID hotelId);


}
