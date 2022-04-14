package com.ppettytheftt.groceryapp.controller;

import com.ppettytheftt.groceryapp.model.FoodItem;
import com.ppettytheftt.groceryapp.service.PaperProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/grocery/paper-products")
public class PaperProductController {

    @Autowired
    private PaperProductService paperProductService;

    @RequestMapping(method = RequestMethod.GET, value = "grocery/paper-products")
    public List<FoodItem> getAllPaperProducts() {
        return paperProductService.getAllGroceries();
    }

    @RequestMapping(method = RequestMethod.POST, value = "/grocery/paper-products")
    public void addPaperProduct(@RequestBody FoodItem groceryItem) {
        paperProductService.addGroceryItem(groceryItem);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/grocery/paper-products/{id}")
    public void updatePaperProduct(@PathVariable Integer id, @RequestBody FoodItem newGroceryItem){
        paperProductService.updateGrocery(id, newGroceryItem);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/grocery/paper-products/{id}")
    public void deletePaperProduct(@PathVariable Integer id) {
        paperProductService.deleteGroceryById(id);
    }
}
