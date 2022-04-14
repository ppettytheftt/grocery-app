package com.ppettytheftt.groceryapp.service;

import com.ppettytheftt.groceryapp.model.FoodItem;
import com.ppettytheftt.groceryapp.repository.FoodItemRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class FoodItemService {

    @Autowired
    public FoodItemRepo foodItemRepo;

    public List<FoodItem> getAllFoodItems() {
        List<FoodItem> groceryItems = new ArrayList<>();
        foodItemRepo.findAll().forEach(groceryItems::add);

        return groceryItems;
    }

    public void addFoodItem(FoodItem groceryItem) {
        foodItemRepo.save(groceryItem);
    }

    public void updateFoodItem(Integer id, FoodItem newGroceryItem) {
        foodItemRepo.save(newGroceryItem);
    }

    public void deleteFoodItemById(Integer id) {
        foodItemRepo.deleteById(id);

    }
}
