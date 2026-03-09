package com.example.demo.service;

import com.example.demo.entity.KtpEntity;
import java.util.List;

public interface KtpService {
    KtpEntity create(KtpEntity ktp);
    List<KtpEntity> findAll();
    KtpEntity findById(Integer id);
    KtpEntity update(Integer id, KtpEntity ktp);
    void delete(Integer id);
}