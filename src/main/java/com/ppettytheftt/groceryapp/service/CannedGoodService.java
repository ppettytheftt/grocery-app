package com.ppettytheftt.groceryapp.service;

import com.ppettytheftt.groceryapp.model.CannedGood;
import com.ppettytheftt.groceryapp.repository.CannedGoodRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CannedGoodService {

    @Autowired
    public CannedGoodRepo cannedGoodRepo;

    public List<CannedGood> getAllCannedGoods() {
        List<CannedGood> cannedGoods = new ArrayList<>();
        cannedGoodRepo.findAll().forEach(cannedGoods::add);

        return cannedGoods;
    }

    public CannedGood getCannedGoodById(Integer id) {
        Optional<CannedGood> cannedGood = cannedGoodRepo.findById(id);
        if (cannedGood.isPresent()) {
            return cannedGood.get();
        } else {
            return null;
        }
    }

    public void addCannedGood(CannedGood cannedGood) {
    cannedGoodRepo.save(cannedGood);
    }

    public void updateCannedGood(Integer id, CannedGood newCannedGood) {
        cannedGoodRepo.save(newCannedGood);
    }

    public void deleteCannedGoodById(Integer id) {
        cannedGoodRepo.deleteById(id);
    }
}
