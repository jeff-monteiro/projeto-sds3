package com.sds3.dsvendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sds3.dsvendas.entities.Seller;

public interface SellerRepository extends JpaRepository<Seller, Long>{//JpaRepository já é um componente

}
