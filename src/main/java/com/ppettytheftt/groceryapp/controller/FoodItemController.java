package com.ppettytheftt.groceryapp.controller;

import com.ppettytheftt.groceryapp.model.FoodItem;
import com.ppettytheftt.groceryapp.service.FoodItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class FoodItemController {

    @Autowired
    private FoodItemService foodItemService;

    @RequestMapping(method = RequestMethod.GET, value = "/grocery/food")
    public List<FoodItem> getAllFoodItems() {
        return foodItemService.getAllFoodItems();
    }

    @RequestMapping(method = RequestMethod.POST, value = "/grocery/food")
    public void addFoodItem(@RequestBody FoodItem groceryItem) {
        foodItemService.addFoodItem(groceryItem);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/grocery/food/{id}")
    public void updateFoodItem(@PathVariable Integer id, @RequestBody FoodItem newFoodItem){
        foodItemService.updateFoodItem(id, newFoodItem);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/grocery/food/{id}")
    public void deleteGrocery(@PathVariable Integer id) {
        foodItemService.deleteFoodItemById(id);
    }
}
