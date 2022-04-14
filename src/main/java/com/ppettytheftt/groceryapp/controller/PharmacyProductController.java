package com.ppettytheftt.groceryapp.controller;

import com.ppettytheftt.groceryapp.model.PharmacyProduct;
import com.ppettytheftt.groceryapp.service.PharmacyProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PharmacyProductController {

    @Autowired
    private PharmacyProductService pharmacyProductService;

    @RequestMapping(method = RequestMethod.GET, value = "/grocery/pharmacy")
    public List<PharmacyProduct> getAllPharmacyProducts() {
        return pharmacyProductService.getAllPharmacyProducts();
    }

    @RequestMapping(method = RequestMethod.POST, value = "/grocery/pharmacy")
    public void addPharmacyProduct(@RequestBody PharmacyProduct pharmacyProduct) {
        pharmacyProductService.addPharmacyProduct(pharmacyProduct);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/grocery/pharmacy/{id}")
    public void updatePharmacyProduct(@PathVariable Integer id, @RequestBody PharmacyProduct newPharmacyProduct){
        pharmacyProductService.updatePharmacyProduct(id, newPharmacyProduct);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/grocery/pharmacy/{id}")
    public void deletePharmacyProduct(@PathVariable Integer id) {
        pharmacyProductService.deletePharmacyProductById(id);
    }
}

