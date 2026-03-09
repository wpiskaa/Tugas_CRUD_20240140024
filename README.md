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
<img width="1920" height="1032" alt="image" src="https://github.com/user-attachments/assets/777d7d56-8c15-4ea1-97c0-1bd4aaadab16" />
<img width="1920" height="1032" alt="image" src="https://github.com/user-attachments/assets/07f8831e-f9a0-4ec1-bf8c-1edb385bbc9a" />
<img width="1920" height="1032" alt="image" src="https://github.com/user-attachments/assets/ae1205da-2ba0-48b1-8276-30018e693b5c" />
<img width="1920" height="1032" alt="image" src="https://github.com/user-attachments/assets/f2ca21c9-53a0-4d3b-b49c-293c5ea911ef" />
<img width="1920" height="1032" alt="image" src="https://github.com/user-attachments/assets/218f6218-20a6-40b4-bda3-a5f6d9588397" />
<img width="1920" height="1032" alt="image" src="https://github.com/user-attachments/assets/e0411981-63ba-45fc-bb21-cb07f61affdc" />





