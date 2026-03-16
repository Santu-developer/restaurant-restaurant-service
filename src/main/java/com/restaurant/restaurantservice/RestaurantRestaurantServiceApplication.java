package com.restaurant.restaurantservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class RestaurantRestaurantServiceApplication {

	public static void main(String[] args) {

        SpringApplication.run(RestaurantRestaurantServiceApplication.class, args);
        System.out.println("Jay Shree Ram - 5");
	}

}
