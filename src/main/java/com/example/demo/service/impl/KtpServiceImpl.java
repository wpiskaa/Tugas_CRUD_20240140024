package com.example.demo.service.impl;

import com.example.demo.dto.KtpDTO;
import com.example.demo.entity.KtpEntity;
import com.example.demo.mapper.KtpMapper;
import com.example.demo.repository.KtpRepository;
import com.example.demo.service.KtpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class KtpServiceImpl implements KtpService {

    private final KtpRepository ktpRepository;
    private final KtpMapper ktpMapper;

    @Autowired
    public KtpServiceImpl(KtpRepository ktpRepository, KtpMapper ktpMapper) {
        this.ktpRepository = ktpRepository;
        this.ktpMapper = ktpMapper;
    }

    @Override
    public KtpDTO save(KtpDTO ktpDTO) {
        KtpEntity entity = ktpMapper.toEntity(ktpDTO);
        return ktpMapper.toDTO(ktpRepository.save(entity));
    }

    @Override
    public List<KtpDTO> findAll() {
        return ktpRepository.findAll().stream()
                .map(ktpMapper::toDTO)
                .collect(Collectors.toList());
    }

    @Override
    public KtpDTO findById(Integer id) {
        KtpEntity entity = ktpRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Data tidak ditemukan"));
        return ktpMapper.toDTO(entity);
    }

    @Override
    public KtpDTO update(Integer id, KtpDTO ktpDTO) {
        KtpEntity entity = ktpRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Data tidak ditemukan"));

        entity.setNomorKtp(ktpDTO.getNomorKtp());
        entity.setNamaLengkap(ktpDTO.getNamaLengkap());
        entity.setAlamat(ktpDTO.getAlamat());
        entity.setTanggalLahir(ktpDTO.getTanggalLahir());
        entity.setJenisKelamin(ktpDTO.getJenisKelamin());

        return ktpMapper.toDTO(ktpRepository.save(entity));
    }

    @Override
    public void delete(Integer id) {
        ktpRepository.deleteById(id);
    }
}