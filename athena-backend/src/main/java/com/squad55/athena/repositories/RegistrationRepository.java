package com.squad55.athena.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.squad55.athena.entities.Registration;
import com.squad55.athena.entities.RegistrationPK;

public interface RegistrationRepository extends JpaRepository<Registration, RegistrationPK> {

}
