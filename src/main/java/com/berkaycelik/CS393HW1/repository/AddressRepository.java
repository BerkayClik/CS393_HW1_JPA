package com.berkaycelik.CS393HW1.repository;

import com.berkaycelik.CS393HW1.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepository extends JpaRepository<Address, Integer> {

}
