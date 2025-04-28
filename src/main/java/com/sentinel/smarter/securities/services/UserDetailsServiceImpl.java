package com.sentinel.smarter.securities.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sentinel.smarter.models.view.UserView;
import com.sentinel.smarter.repositories.view.UserViewRepo;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {
    @Autowired
    private UserViewRepo userViewRepo;

    @Override
    @Transactional
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        UserView userView = userViewRepo.findByUsername(username).orElseThrow(() -> new UsernameNotFoundException("username tidak ditemukan"));

        return UserDetailsImpl.build(userView);
    }
}
