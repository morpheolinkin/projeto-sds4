package com.devsuperior.dsvenddas.repositores;

import com.devsuperior.dsvenddas.entities.Sale;
import com.devsuperior.dsvenddas.entities.Seller;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SaleRepository extends JpaRepository<Sale, Long> {
}
