package com.ppettytheftt.groceryapp.controller;

import com.ppettytheftt.groceryapp.model.GroceryItem;
import com.ppettytheftt.groceryapp.repository.GroceryItemRepo;
import com.ppettytheftt.groceryapp.service.GroceryItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/grocery")
public class GroceryItemController {

    @Autowired
    private GroceryItemService groceryItemService;

    @RequestMapping("/all")
    public List<GroceryItem> getAllGroceries() {
        return groceryItemService.getAllGroceries();
    }

    @RequestMapping(method = RequestMethod.POST, value = "/grocery")
    public void addGrocery(@RequestBody GroceryItem groceryItem) {
        groceryItemService.addGroceryItem(groceryItem);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/grocery/{id}")
    public void updateGrocery(@PathVariable Integer id, @RequestBody GroceryItem newGroceryItem){
        groceryItemService.updateGrocery(id, newGroceryItem);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/grocery/{id}")
    public void deleteGrocery(@PathVariable Integer id) {
        groceryItemService.deleteGroceryById(id);
    }
}
