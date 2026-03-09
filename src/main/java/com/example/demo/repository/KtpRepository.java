package com.example.demo.repository;

import com.example.demo.entity.KtpEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface KtpRepository extends JpaRepository<KtpEntity, Integer> {
    boolean existsByNomorKtp(String nomorKtp);
}