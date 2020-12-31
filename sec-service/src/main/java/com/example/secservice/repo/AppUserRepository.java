package com.example.secservice.repo;

import com.example.secservice.entities.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppUserRepository extends JpaRepository<AppUser,Long>{
    AppUser findByusername(String Username);


}
