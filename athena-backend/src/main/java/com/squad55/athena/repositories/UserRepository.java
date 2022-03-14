package com.squad55.athena.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.squad55.athena.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
