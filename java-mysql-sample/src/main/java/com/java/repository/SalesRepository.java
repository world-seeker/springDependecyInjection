package com.java.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.java.entity.Sale;

public interface SalesRepository extends JpaRepository<Sale, Integer>
{
}
