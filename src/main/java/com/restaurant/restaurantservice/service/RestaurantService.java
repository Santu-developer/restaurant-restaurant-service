package com.restaurant.restaurantservice.service;

import com.restaurant.restaurantservice.dto.RestaurantRequest;
import com.restaurant.restaurantservice.dto.RestaurantResponse;

import java.util.List;

public interface RestaurantService {

    RestaurantResponse createRestaurant(RestaurantRequest request);

    RestaurantResponse getRestaurant(Long id);

    List<RestaurantResponse> getAllRestaurants();

    void deleteRestaurant(Long id);
}