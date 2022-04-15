package com.ppettytheftt.groceryapp.controller;

import com.ppettytheftt.groceryapp.model.PaperProduct;
import com.ppettytheftt.groceryapp.service.PaperProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/paper-products")
public class PaperProductController {

    @Autowired
    private PaperProductService paperProductService;

    @GetMapping
    public List<PaperProduct> getAllPaperProducts() {
        return paperProductService.getAllPaperProducts();
    }

    @GetMapping("/{id}")
    public PaperProduct getPaperProductById(@PathVariable Integer id) {
        return paperProductService.getPaperProductById(id);
    }

    @PostMapping
    public void addPaperProduct(@RequestBody PaperProduct paperProduct) {
        paperProductService.addPaperProduct(paperProduct);
    }

    @PutMapping("/{id}")
    public void updatePaperProduct(@PathVariable Integer id, @RequestBody PaperProduct newPaperProduct){
        paperProductService.updatePaperProduct(id, newPaperProduct);
    }

    @DeleteMapping("/{id}")
    public void deletePaperProduct(@PathVariable Integer id) {
        paperProductService.deletePaperProductById(id);
    }
}
