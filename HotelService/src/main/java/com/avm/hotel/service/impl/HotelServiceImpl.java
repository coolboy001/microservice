package com.avm.hotel.service.impl;

import com.avm.hotel.entities.Hotel;
import com.avm.hotel.exception.ResourceNotFoundException;
import com.avm.hotel.repositories.HotelRepository;
import com.avm.hotel.service.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class HotelServiceImpl implements HotelService {

    @Autowired
    private HotelRepository hotelRepository;

    @Override
    public Hotel createHotel(Hotel hotel) {
        return hotelRepository.save(hotel);
    }

    @Override
    public List<Hotel> getAllHotels() {
        return hotelRepository.findAll();
    }

    @Override
    public Hotel getHotelById(UUID id) {
        return hotelRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException());
    }
}
