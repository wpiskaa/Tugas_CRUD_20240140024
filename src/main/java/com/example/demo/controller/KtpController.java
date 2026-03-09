package com.example.demo.controller;

import com.example.demo.dto.KtpDTO;
import com.example.demo.service.KtpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ktp")
public class KtpController {

    private final KtpService ktpService;

    @Autowired
    public KtpController(KtpService ktpService) {
        this.ktpService = ktpService;
    }

    @PostMapping
    public ResponseEntity<KtpDTO> create(@RequestBody KtpDTO ktpDTO) {
        return ResponseEntity.ok(ktpService.save(ktpDTO));
    }

    @GetMapping
    public ResponseEntity<List<KtpDTO>> getAll() {
        return ResponseEntity.ok(ktpService.findAll());
    }

    @PutMapping("/{id}")
    public ResponseEntity<KtpDTO> update(@PathVariable("id") Integer id, @RequestBody KtpDTO ktpDTO) {
        return ResponseEntity.ok(ktpService.update(id, ktpDTO));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable("id") Integer id) {
        ktpService.delete(id);
        return ResponseEntity.noContent().build();
    }
}