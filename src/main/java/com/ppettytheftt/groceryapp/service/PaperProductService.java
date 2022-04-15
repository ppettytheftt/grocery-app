package com.ppettytheftt.groceryapp.service;

import com.ppettytheftt.groceryapp.model.PaperProduct;
import com.ppettytheftt.groceryapp.repository.PaperProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class PaperProductService {

    @Autowired
    public PaperProductRepo paperProductRepo;

    public List<PaperProduct> getAllPaperProducts() {
        List<PaperProduct> paperProducts = new ArrayList<>();
        paperProductRepo.findAll().forEach(paperProducts::add);

        return paperProducts;
    }

    public PaperProduct getPaperProductById(Integer id) {
        Optional<PaperProduct> paperProduct = paperProductRepo.findById(id);
        if(paperProduct.isPresent()) {
            return paperProduct.get();
        } else {
            return null;
        }
    }

    public void addPaperProduct(PaperProduct paperProduct) {
        paperProductRepo.save(paperProduct);
    }

    public void updatePaperProduct(Integer id, PaperProduct newPaperProduct) {
        paperProductRepo.save(newPaperProduct);
    }

    public void deletePaperProductById(Integer id) {
        paperProductRepo.deleteById(id);

    }
}
