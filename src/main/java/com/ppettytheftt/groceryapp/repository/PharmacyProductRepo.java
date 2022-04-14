package com.ppettytheftt.groceryapp.repository;

import com.ppettytheftt.groceryapp.model.PharmacyProduct;
import org.springframework.data.repository.CrudRepository;

public interface PharmacyProductRepo extends CrudRepository<PharmacyProduct, Integer> {
}
