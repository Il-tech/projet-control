package com.example.secservice;

import com.example.secservice.entities.AppRole;
import com.example.secservice.entities.AppUser;
import com.example.secservice.service.AccountService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;

@SpringBootApplication
public class SecServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(SecServiceApplication.class, args);
    }
   @Bean
    CommandLineRunner start(AccountService accountService){
        return  args->{
            accountService.addNewRole(new AppRole(1,"User"));
            accountService.addNewRole(new AppRole(33,"Admin"));
            accountService.addNewRole(new AppRole(44,"Customer_manager"));
            accountService.addNewRole(new AppRole(55,"Bills_manager"));
            accountService.addNewRole(new AppRole(56,"Product_manager"));
            accountService.addNewUser(new AppUser(474  ,"user1","134",new ArrayList<>()));
            accountService.addNewUser(new AppUser(55,"Admin","134",new ArrayList<>()));
            accountService.addNewUser(new AppUser(88,"user2","134",new ArrayList<>()));
            accountService.addNewUser(new AppUser(2,"user3","134",new ArrayList<>()));
            accountService.addNewUser(new AppUser(3,"user4","134",new ArrayList<>()));
            accountService.AddRoleToUser("user1","product_manager");
            accountService.AddRoleToUser("user2","Customer_manager");
            accountService.AddRoleToUser("user3","Bills_manager");
            accountService.AddRoleToUser("user4","Product_manager");
            accountService.AddRoleToUser("Admin","admin");

        };
    }
}

