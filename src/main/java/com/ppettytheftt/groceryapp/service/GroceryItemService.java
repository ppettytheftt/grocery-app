package com.ppettytheftt.groceryapp.service;

import com.ppettytheftt.groceryapp.model.GroceryItem;
import com.ppettytheftt.groceryapp.repository.GroceryItemRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class GroceryItemService {

    @Autowired
    public GroceryItemRepo groceryItemRepo;

    public List<GroceryItem> getAllGroceries() {
        List<GroceryItem> groceryItems = new ArrayList<>();
        groceryItemRepo.findAll().forEach(groceryItems::add);

        return groceryItems;
    }

    public void addGroceryItem(GroceryItem groceryItem) {
        groceryItemRepo.save(groceryItem);
    }

    public void updateGrocery(Integer id, GroceryItem newGroceryItem) {
        groceryItemRepo.save(newGroceryItem);
    }

    public void deleteGroceryById(Integer id) {
        groceryItemRepo.deleteById(id);

    }
}
