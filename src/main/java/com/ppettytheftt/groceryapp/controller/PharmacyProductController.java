package com.ppettytheftt.groceryapp.controller;

import com.ppettytheftt.groceryapp.model.PharmacyProduct;
import com.ppettytheftt.groceryapp.service.PharmacyProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pharmacy-products")
public class PharmacyProductController {

    @Autowired
    private PharmacyProductService pharmacyProductService;

    @GetMapping
    public List<PharmacyProduct> getAllPharmacyProducts() {
        return pharmacyProductService.getAllPharmacyProducts();
    }

    @GetMapping("/{id}")
    public PharmacyProduct getPharmacyProductById(@PathVariable Integer id) {
        return pharmacyProductService.getPharmacyProductById(id);
    }

    @PostMapping
    public void addPharmacyProduct(@RequestBody PharmacyProduct pharmacyProduct) {
        pharmacyProductService.addPharmacyProduct(pharmacyProduct);
    }

    @PutMapping("/{id}")
    public void updatePharmacyProduct(@PathVariable Integer id, @RequestBody PharmacyProduct newPharmacyProduct){
        pharmacyProductService.updatePharmacyProduct(id, newPharmacyProduct);
    }

    @DeleteMapping("/{id}")
    public void deletePharmacyProduct(@PathVariable Integer id) {
        pharmacyProductService.deletePharmacyProductById(id);
    }
}

