package com.devsuperior.dsvenddas.services;

import com.devsuperior.dsvenddas.dto.SaleDTO;
import com.devsuperior.dsvenddas.entities.Sale;
import com.devsuperior.dsvenddas.repositores.SaleRepository;
import com.devsuperior.dsvenddas.repositores.SellerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class SaleService {
    @Autowired
    private SaleRepository saleRepository;
    @Autowired
    private SellerRepository sellerRepository;


    @Transactional(readOnly = true)
    public Page<SaleDTO> findAll(Pageable pageable) {
        sellerRepository.findAll();
        Page<Sale> result = saleRepository.findAll(pageable);
        return result.map(SaleDTO::new);
    }
}
