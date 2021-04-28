package com.bank.ams.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bank.ams.model.Denomination;

@Repository
public interface DenominationRepository extends JpaRepository<Denomination, String>{

}
