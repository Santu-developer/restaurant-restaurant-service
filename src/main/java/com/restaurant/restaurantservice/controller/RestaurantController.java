package com.restaurant.restaurantservice.controller;

import com.restaurant.restaurantservice.dto.RestaurantRequest;
import com.restaurant.restaurantservice.dto.RestaurantResponse;
import com.restaurant.restaurantservice.service.RestaurantService;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/restaurants")
public class RestaurantController {

    private final RestaurantService service;

    public RestaurantController(RestaurantService service){
        this.service = service;
    }

    @PostMapping
    public RestaurantResponse createRestaurant(
            @RequestBody RestaurantRequest request){

        return service.createRestaurant(request);
    }

    @GetMapping("/{id}")
    public RestaurantResponse getRestaurant(@PathVariable Long id){

        return service.getRestaurant(id);
    }

    @GetMapping
    public List<RestaurantResponse> getAllRestaurants(){

        return service.getAllRestaurants();
    }

    @DeleteMapping("/{id}")
    public void deleteRestaurant(@PathVariable Long id){

        service.deleteRestaurant(id);
    }
}