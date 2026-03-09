package com.example.demo.service;

import com.example.demo.dto.KtpDTO;
import java.util.List;

public interface KtpService {
    KtpDTO save(KtpDTO ktpDTO);
    List<KtpDTO> findAll();
    KtpDTO findById(Integer id);
    KtpDTO update(Integer id, KtpDTO ktpDTO);
    void delete(Integer id);
}