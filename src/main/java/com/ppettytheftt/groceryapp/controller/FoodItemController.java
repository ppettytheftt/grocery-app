package com.ppettytheftt.groceryapp.controller;

import com.ppettytheftt.groceryapp.model.FoodItem;
import com.ppettytheftt.groceryapp.service.FoodItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/grocery/food")
public class FoodItemController {

    @Autowired
    private FoodItemService foodItemService;

    @RequestMapping(method = RequestMethod.GET, value = "/grocery/food")
    public List<FoodItem> getAllFoodItems() {
        return foodItemService.getAllGroceries();
    }

    @RequestMapping(method = RequestMethod.POST, value = "/grocery/food")
    public void addFoodItem(@RequestBody FoodItem groceryItem) {
        foodItemService.addGroceryItem(groceryItem);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/grocery/food/{id}")
    public void updateFoodItem(@PathVariable Integer id, @RequestBody FoodItem newGroceryItem){
        foodItemService.updateGrocery(id, newGroceryItem);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/grocery/{id}")
    public void deleteGrocery(@PathVariable Integer id) {
        foodItemService.deleteGroceryById(id);
    }
}
