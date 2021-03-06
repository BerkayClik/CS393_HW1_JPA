package com.berkaycelik.CS393HW1.repository;

import com.berkaycelik.CS393HW1.model.Shop;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShopRepository extends JpaRepository<Shop, Integer> {

}
