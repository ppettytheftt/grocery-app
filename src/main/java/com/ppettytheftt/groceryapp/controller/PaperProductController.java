package com.ppettytheftt.groceryapp.controller;

import com.ppettytheftt.groceryapp.model.PaperProduct;
import com.ppettytheftt.groceryapp.service.PaperProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PaperProductController {

    @Autowired
    private PaperProductService paperProductService;

    @RequestMapping(method = RequestMethod.GET, value = "grocery/paper-products")
    public List<PaperProduct> getAllPaperProducts() {
        return paperProductService.getAllPaperProducts();
    }

    @RequestMapping(method = RequestMethod.POST, value = "/grocery/paper-products")
    public void addPaperProduct(@RequestBody PaperProduct paperProduct) {
        paperProductService.addPaperProduct(paperProduct);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/grocery/paper-products/{id}")
    public void updatePaperProduct(@PathVariable Integer id, @RequestBody PaperProduct newPaperProduct){
        paperProductService.updatePaperProduct(id, newPaperProduct);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/grocery/paper-products/{id}")
    public void deletePaperProduct(@PathVariable Integer id) {
        paperProductService.deletePaperProductById(id);
    }
}
