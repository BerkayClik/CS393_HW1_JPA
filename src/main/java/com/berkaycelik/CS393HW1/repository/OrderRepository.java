package com.berkaycelik.CS393HW1.repository;

import com.berkaycelik.CS393HW1.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<Order, Integer> {

}
