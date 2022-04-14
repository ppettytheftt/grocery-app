package com.ppettytheftt.groceryapp.controller;

import com.ppettytheftt.groceryapp.model.CannedGood;
import com.ppettytheftt.groceryapp.service.CannedGoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CannedGoodController {

    @Autowired
    private CannedGoodService cannedGoodService;

    @RequestMapping(method = RequestMethod.GET, value = "grocery/canned-goods")
    public List<CannedGood> getAllCannedGoods() {
        return cannedGoodService.getAllCannedGoods();
    }

    @RequestMapping(method = RequestMethod.POST, value = "grocery/canned-goods")
    public void addCannedGood(@RequestBody CannedGood cannedGood) {
        cannedGoodService.addCannedGood(cannedGood);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "grocery/canned-goods/{id}")
    public void updateCannedGood(@PathVariable Integer id, @RequestBody CannedGood newCannedGood) {
        cannedGoodService.updateCannedGood(id, newCannedGood);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "grocery/canned-goods/{id}")
    public void deleteCannedGood(@PathVariable Integer id) {
        cannedGoodService.deleteCannedGoodById(id);
    }
}
