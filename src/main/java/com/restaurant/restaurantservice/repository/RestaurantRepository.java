package com.restaurant.restaurantservice.repository;

import com.restaurant.restaurantservice.model.Restaurant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RestaurantRepository extends JpaRepository<Restaurant,Long> {
}