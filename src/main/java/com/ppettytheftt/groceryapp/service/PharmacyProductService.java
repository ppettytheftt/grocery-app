package com.ppettytheftt.groceryapp.service;

import com.ppettytheftt.groceryapp.model.PharmacyProduct;
import com.ppettytheftt.groceryapp.repository.PharmacyProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PharmacyProductService {

    @Autowired
    public PharmacyProductRepo pharmacyProductRepo;

    public List<PharmacyProduct> getAllPharmacyProducts() {
        List<PharmacyProduct> pharmacyProducts = new ArrayList<>();
        pharmacyProductRepo.findAll().forEach(pharmacyProducts::add);

        return pharmacyProducts;
    }

    public void addPharmacyProduct(PharmacyProduct pharmacyProduct) {
        pharmacyProductRepo.save(pharmacyProduct);
    }

    public void updatePharmacyProduct(Integer id, PharmacyProduct newPharmacyProduct) {
        pharmacyProductRepo.save(newPharmacyProduct);
    }

    public void deletePharmacyProductById(Integer id) {
        pharmacyProductRepo.deleteById(id);

    }
}
