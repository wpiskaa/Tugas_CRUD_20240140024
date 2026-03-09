package com.example.demo.controller;

import com.example.demo.entity.KtpEntity;
import com.example.demo.service.KtpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ktp")
@CrossOrigin(origins = "*")
public class KtpController {

    @Autowired
    private KtpService ktpService;

    // Tambahkan method POST ini agar 'Simpan Data' tidak 404
    @PostMapping
    public ResponseEntity<?> addKtp(@RequestBody KtpEntity ktp) {
        try {
            return ResponseEntity.ok(ktpService.create(ktp));
        } catch (Exception e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }

    @GetMapping
    public List<KtpEntity> getAllKtp() {
        return ktpService.findAll();
    }

    // ... tambahkan method PUT dan DELETE jika diperlukan
}