package com.jrmanchay.spring_security.config;

import com.jrmanchay.spring_security.repository.CustomerRepository;
import lombok.AllArgsConstructor;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@AllArgsConstructor
public class CustomerUserDetails implements UserDetailsService {

    private final CustomerRepository customerRepository;

    @Transactional(readOnly = true)
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return this.customerRepository.findByEmail(username)
                .map(customerDetails -> {
                    var authorities = List.of(new SimpleGrantedAuthority(customerDetails.getRole()));
                    return new User(customerDetails.getEmail(), customerDetails.getPassword(), authorities);
                })
                .orElseThrow(() -> new UsernameNotFoundException("User not found with email: " + username));
    }
}
