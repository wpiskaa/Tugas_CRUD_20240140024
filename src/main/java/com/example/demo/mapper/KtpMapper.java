package com.example.demo.mapper;

import com.example.demo.dto.KtpDTO;
import com.example.demo.entity.KtpEntity;

public class KtpMapper {
    public static KtpDTO toDTO(KtpEntity entity) {
        KtpDTO dto = new KtpDTO();
        dto.setId(entity.getId());
        dto.setNomorKtp(entity.getNomorKtp());
        dto.setNamaLengkap(entity.getNamaLengkap());
        dto.setAlamat(entity.getAlamat());
        dto.setTanggalLahir(entity.getTanggalLahir());
        dto.setJenisKelamin(entity.getJenisKelamin());
        return dto;
    }
}