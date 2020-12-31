package com.example.secservice.service;

import com.example.secservice.entities.AppRole;
import com.example.secservice.entities.AppUser;
import com.example.secservice.repo.AppRoleRepository;
import com.example.secservice.repo.AppUserRepository;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
@Service
@Transactional
public class AccountServiceImpl implements AccountService {
    private AppUserRepository appUserRepository;
    private AppRoleRepository appRoleRepository;

    public AccountServiceImpl(AppUserRepository appUserRepository, AppRoleRepository appRoleRepository) {
        this.appUserRepository = appUserRepository;
        this.appRoleRepository = appRoleRepository;
    }

    @Override
    public AppUser addNewUser(AppUser appUser) {
        return appUserRepository.save(appUser);
    }

    @Override
    public AppRole addNewRole(AppRole appRole) {
        return appRoleRepository.save(appRole);
    }
    @Override
    public void AddRoleToUser(String username, String roleName) {
        AppUser appUsers=appUserRepository.findByusername(username);
        AppRole appRole= appRoleRepository.findByRoleName(roleName);
        appUsers.getAppRoles().add(appRole);
    }
    @Override
    public AppUser loadUserByUsername(String username) {
        return appUserRepository.findByusername(username);

    }

    @Override
    public List<AppUser> listUsers() {

        return appUserRepository.findAll();
    }
}
