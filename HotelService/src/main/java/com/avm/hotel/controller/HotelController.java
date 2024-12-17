package com.avm.hotel.controller;

import com.avm.hotel.entities.Hotel;
import com.avm.hotel.service.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/hotels")
public class HotelController {
    @Autowired
    private HotelService hotelService;

    @PostMapping
    public ResponseEntity<Hotel> createHotel(@RequestBody Hotel hotel){
        System.out.println(hotel.getName());

        return new ResponseEntity<>(hotelService.createHotel(hotel), HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<Hotel>> getHotels(){
        return new ResponseEntity<>(hotelService.getAllHotels(), HttpStatus.OK);
    }
    @GetMapping("/{id}")
    public ResponseEntity<Hotel> getHotelById(@PathVariable UUID id){
        return new ResponseEntity<>(hotelService.getHotelById(id), HttpStatus.OK);
    }

}
