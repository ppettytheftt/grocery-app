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
    public FoodItemRepo groceryItemRepo;

    public List<FoodItem> getAllGroceries() {
        List<FoodItem> groceryItems = new ArrayList<>();
        groceryItemRepo.findAll().forEach(groceryItems::add);

        return groceryItems;
    }

    public void addGroceryItem(FoodItem groceryItem) {
        groceryItemRepo.save(groceryItem);
    }

    public void updateGrocery(Integer id, FoodItem newGroceryItem) {
        groceryItemRepo.save(newGroceryItem);
    }

    public void deleteGroceryById(Integer id) {
        groceryItemRepo.deleteById(id);

    }
}
