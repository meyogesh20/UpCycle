package com.upcycle.Dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.upcycle.Entity.Payment;



public interface PaymentDao extends JpaRepository<Payment, Integer> {

}
