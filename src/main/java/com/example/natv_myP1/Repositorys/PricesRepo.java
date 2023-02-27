package com.example.natv_myP1.Repositorys;

import com.example.natv_myP1.Entitiys.Prices;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PricesRepo extends JpaRepository<Prices,Long> {
}
