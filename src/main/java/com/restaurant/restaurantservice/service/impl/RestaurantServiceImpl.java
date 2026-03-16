package com.restaurant.restaurantservice.service.impl;

import com.restaurant.restaurantservice.dto.RestaurantRequest;
import com.restaurant.restaurantservice.dto.RestaurantResponse;
import com.restaurant.restaurantservice.mapper.RestaurantMapper;
import com.restaurant.restaurantservice.model.Restaurant;
import com.restaurant.restaurantservice.repository.RestaurantRepository;
import com.restaurant.restaurantservice.service.RestaurantService;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class RestaurantServiceImpl implements RestaurantService {

    private final RestaurantRepository repository;
    private final RestaurantMapper mapper;

    public RestaurantServiceImpl(RestaurantRepository repository,
                                 RestaurantMapper mapper){
        this.repository = repository;
        this.mapper = mapper;
    }

    @Override
    public RestaurantResponse createRestaurant(RestaurantRequest request) {

        Restaurant restaurant = mapper.toEntity(request);

        Restaurant saved = repository.save(restaurant);

        return mapper.toResponse(saved);
    }

    @Override
    public RestaurantResponse getRestaurant(Long id) {

        Restaurant restaurant = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Restaurant not found"));

        return mapper.toResponse(restaurant);
    }

    @Override
    public List<RestaurantResponse> getAllRestaurants() {

        return repository.findAll()
                .stream()
                .map(mapper::toResponse)
                .collect(Collectors.toList());
    }

    @Override
    public void deleteRestaurant(Long id) {

        repository.deleteById(id);
    }
}