package com.devsuperior.dsvenddas.services;

import com.devsuperior.dsvenddas.dto.SellerDTO;
import com.devsuperior.dsvenddas.entities.Seller;
import com.devsuperior.dsvenddas.repositores.SellerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class SellerService {
    @Autowired
    private SellerRepository sellerRepository;

    public Seller findById(Long id) {
        return sellerRepository.findById(id).orElse(null);
    }

    public void insert(Seller seller) {
        sellerRepository.save(seller);
    }

    public void update(Seller seller) {
        sellerRepository.save(seller);
    }

    public void delete(Long id) {
        sellerRepository.deleteById(id);
    }

    public List<SellerDTO> findAll(){
        List<Seller> result = sellerRepository.findAll();
        return result.stream().map(SellerDTO::new).collect(Collectors.toList());
    }

}
