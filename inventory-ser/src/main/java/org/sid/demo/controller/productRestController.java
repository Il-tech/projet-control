package org.sid.demo.controller;

import org.sid.demo.entities.product;
import org.sid.demo.repository.ProduitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
public class productRestController {


        @Autowired
        private ProduitRepository prodRepo;
        @GetMapping(path="/produits")
        public List<product> list(){
            return prodRepo.findAll();
        }
        @PostMapping(path="/produits")
        public product save(@RequestBody product produit){
            return prodRepo.save(produit);
        }
        @GetMapping(path="/produits/{id}")
        public product getOne(@PathVariable Long id ){
            return prodRepo.findById(id).get();
        }
        @PutMapping (path="/produits/{id}")
        public product update(@PathVariable Long id, @RequestBody product produit){
            produit.setId(id);
            return prodRepo.save(produit);
        }
        @DeleteMapping(path="/produits/{id}")
        public void delete(@PathVariable Long id, @RequestBody product produit){
            prodRepo.deleteById(id);
        }

}
