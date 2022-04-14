package com.ppettytheftt.groceryapp.repository;

import com.ppettytheftt.groceryapp.model.GroceryItem;
import org.springframework.data.repository.CrudRepository;

public interface GroceryItemRepo extends CrudRepository<GroceryItem, Integer> {

}
