package com.codewiththarjun.fullstackbackend.repository;

import com.codewiththarjun.fullstackbackend.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {

}
