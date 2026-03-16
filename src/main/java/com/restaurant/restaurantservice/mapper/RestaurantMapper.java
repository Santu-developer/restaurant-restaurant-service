package com.restaurant.restaurantservice.mapper;

import com.restaurant.restaurantservice.dto.RestaurantRequest;
import com.restaurant.restaurantservice.dto.RestaurantResponse;
import com.restaurant.restaurantservice.model.Restaurant;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface RestaurantMapper {

    Restaurant toEntity(RestaurantRequest request);

    RestaurantResponse toResponse(Restaurant restaurant);
}