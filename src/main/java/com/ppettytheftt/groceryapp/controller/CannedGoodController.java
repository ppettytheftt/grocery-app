package com.ppettytheftt.groceryapp.controller;

import com.ppettytheftt.groceryapp.model.CannedGood;
import com.ppettytheftt.groceryapp.service.CannedGoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/canned-goods")
public class CannedGoodController {

    @Autowired
    private CannedGoodService cannedGoodService;

    @GetMapping
    public List<CannedGood> getAllCannedGoods() {
        return cannedGoodService.getAllCannedGoods();
    }

    @GetMapping("/{id}")
    public CannedGood getCannedGoodById(@PathVariable Integer id) {
        return cannedGoodService.getCannedGoodById(id);
    }

    @PostMapping
    public void addCannedGood(@RequestBody CannedGood cannedGood) {
        cannedGoodService.addCannedGood(cannedGood);
    }

    @PutMapping("/{id}")
    public void updateCannedGood(@PathVariable Integer id, @RequestBody CannedGood newCannedGood) {
        cannedGoodService.updateCannedGood(id, newCannedGood);
    }

    @DeleteMapping("/{id}")
    public void deleteCannedGood(@PathVariable Integer id) {
        cannedGoodService.deleteCannedGoodById(id);
    }
}
