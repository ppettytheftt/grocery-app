package com.ppettytheftt.groceryapp.controller;

import com.ppettytheftt.groceryapp.repository.GroceryItemRepo;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/grocery")
public class GroceryItemController {

    private final GroceryItemRepo groceryRepo;

    public GroceryItemController(GroceryItemRepo groceryRepo) {
        this.groceryRepo = groceryRepo;
    }

    @GetMapping
    public ResponseEntity getAllGroceries() {
        return ResponseEntity.ok(this.groceryRepo.findAll());
    }
}
