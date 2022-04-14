package com.ppettytheftt.groceryapp.repository;

import com.ppettytheftt.groceryapp.model.GroceryItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GroceryItemRepo extends JpaRepository<GroceryItem, Integer> {
}
