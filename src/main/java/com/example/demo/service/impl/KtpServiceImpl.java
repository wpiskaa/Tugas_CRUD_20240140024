package com.example.demo.service.impl;

import com.example.demo.entity.KtpEntity;
import com.example.demo.repository.KtpRepository;
import com.example.demo.service.KtpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class KtpServiceImpl implements KtpService {

    @Autowired
    private KtpRepository ktpRepository;

    @Override
    public KtpEntity create(KtpEntity ktp) {
        if (ktpRepository.existsByNomorKtp(ktp.getNomorKtp())) {
            throw new RuntimeException("Nomor KTP sudah terdaftar!");
        }
        return ktpRepository.save(ktp);
    }

    @Override
    public List<KtpEntity> findAll() { return ktpRepository.findAll(); }

    @Override
    public KtpEntity findById(Integer id) {
        return ktpRepository.findById(id).orElseThrow(() -> new RuntimeException("Data tidak ditemukan"));
    }

    @Override
    public KtpEntity update(Integer id, KtpEntity details) {
        KtpEntity ktp = findById(id);
        ktp.setNomorKtp(details.getNomorKtp());
        ktp.setNamaLengkap(details.getNamaLengkap());
        ktp.setAlamat(details.getAlamat());
        ktp.setTanggalLahir(details.getTanggalLahir());
        ktp.setJenisKelamin(details.getJenisKelamin());
        return ktpRepository.save(ktp);
    }

    @Override
    public void delete(Integer id) {
        ktpRepository.delete(findById(id));
    }
}