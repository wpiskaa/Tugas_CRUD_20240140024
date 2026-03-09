# KTP Management API Specification

Dokumentasi ini merinci spesifikasi endpoint REST API untuk sistem manajemen data kependudukan (KTP) yang dibangun menggunakan Spring Boot dan MySQL.

## 1. Create KTP
Endpoint : `POST /ktp`

Request Body :
```json
{
  "nomorKtp": "20240140024",
  "namaLengkap": "Hafiz Kurniawan",
  "alamat domisili": "Jln. Raya Sempalai",
  "tanggalLahir": "2000-01-01",
  "jenisKelamin": "Laki-laki"
}

{
  "id": 1,
  "nomorKtp": "20240140024",
  "namaLengkap": "Hafiz Kurniawan",
  "alamat domisili": "Jln. Raya Sempalai",
  "tanggalLahir": "2000-01-01",
  "jenisKelamin": "Laki-laki"
}

[
  {
    "id": 1,
    "nomorKtp": "20240140024",
    "namaLengkap": "Hafiz Kurniawan",
    "alamat domisili": "Jln. Raya Sempalai",
    "tanggalLahir": "2000-01-01",
    "jenisKelamin": "Laki-laki"
  }
]

{
  "nomorKtp": "20240140024",
  "namaLengkap": "Hafiz Kurniawan Update",
  "alamat domisili": "Jln. Raya Sempalai",
  "tanggalLahir": "2000-01-01",
  "jenisKelamin": "Laki-laki"
}

{
  "message": "Data KTP berhasil dihapus"
}

Screenshot :

<img width="1920" height="1032" alt="Screenshot 2026-03-09 143808" src="https://github.com/user-attachments/assets/712aa22c-b68f-4bec-bb79-1f7ff378e798" />





