package com.ppettytheftt.groceryapp.controller;

import com.ppettytheftt.groceryapp.model.FoodItem;
import com.ppettytheftt.groceryapp.service.FoodItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/food")
public class FoodItemController {

    @Autowired
    private FoodItemService foodItemService;

    @GetMapping
    public List<FoodItem> getAllFoodItems() {
        return foodItemService.getAllFoodItems();
    }

    @GetMapping("/{id}")
    public FoodItem getFoodItemById(@PathVariable Integer id) {
        return foodItemService.getFoodItemById(id);
    }

    @PostMapping
    public void addFoodItem(@RequestBody FoodItem groceryItem) {
        foodItemService.addFoodItem(groceryItem);
    }

    @PutMapping("/{id}")
    public void updateFoodItem(@PathVariable Integer id, @RequestBody FoodItem newFoodItem){
        foodItemService.updateFoodItem(id, newFoodItem);
    }

    @DeleteMapping("/{id}")
    public void deleteGrocery(@PathVariable Integer id) {
        foodItemService.deleteFoodItemById(id);
    }
}
