package com.avm.hotel.service;

import com.avm.hotel.entities.Hotel;

import java.util.List;
import java.util.UUID;

public interface HotelService {
    public Hotel createHotel(Hotel hotel);
    public List<Hotel> getAllHotels();
    public Hotel getHotelById(UUID id);
}
