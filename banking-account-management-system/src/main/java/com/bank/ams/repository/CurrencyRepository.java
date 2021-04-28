package com.bank.ams.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bank.ams.model.Currency;

@Repository
public interface CurrencyRepository extends JpaRepository<Currency, String>{

}
