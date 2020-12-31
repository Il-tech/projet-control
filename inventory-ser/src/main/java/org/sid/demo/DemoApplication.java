package org.sid.demo;

import org.sid.demo.entities.product;
import org.sid.demo.repository.ProduitRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @Bean
    CommandLineRunner start(ProduitRepository produitRepository){
        return args->{
            produitRepository.save(new product(null,"mohmd",3456,5567));
            produitRepository.save(new product(null,"mohmd",3456,5567));
            produitRepository.save(new product(null,"mohmd",3456,5567));
            produitRepository.save(new product(null,"mohmd",3456,5567));
            produitRepository.save(new product(null,"mohmd",3456,5567));

        };
    }
}
