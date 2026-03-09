package com.example.demo.mapper;

import com.example.demo.dto.KtpDTO;
import com.example.demo.entity.KtpEntity;
import org.springframework.stereotype.Component;

@Component
public class KtpMapper {


    public KtpDTO toDTO(KtpEntity entity) {
        if (entity == null) return null;

        KtpDTO dto = new KtpDTO();
        dto.setId(entity.getId());
        dto.setNomorKtp(entity.getNomorKtp());
        dto.setNamaLengkap(entity.getNamaLengkap());
        dto.setAlamat(entity.getAlamat());
        dto.setTanggalLahir(entity.getTanggalLahir());
        dto.setJenisKelamin(entity.getJenisKelamin());
        return dto;
    }


    public KtpEntity toEntity(KtpDTO dto) {
        if (dto == null) return null;

        KtpEntity entity = new KtpEntity();
        entity.setId(dto.getId());
        entity.setNomorKtp(dto.getNomorKtp());
        entity.setNamaLengkap(dto.getNamaLengkap());
        entity.setAlamat(dto.getAlamat());
        entity.setTanggalLahir(dto.getTanggalLahir());
        entity.setJenisKelamin(dto.getJenisKelamin());
        return entity;
    }
}