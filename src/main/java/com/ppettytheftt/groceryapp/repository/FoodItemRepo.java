package com.ppettytheftt.groceryapp.repository;

import com.ppettytheftt.groceryapp.model.FoodItem;
import org.springframework.data.repository.CrudRepository;

public interface FoodItemRepo extends CrudRepository<FoodItem, Integer> {

}
