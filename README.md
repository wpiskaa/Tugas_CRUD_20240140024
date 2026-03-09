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
<img width="1920" height="1032" alt="Screenshot 2026-03-09 143642" src="https://github.com/user-attachments/assets/98f58ca8-d46b-489b-94f4-094047bdba11" />
<img width="1920" height="1032" alt="Screenshot 2026-03-09 143808" src="https://github.com/user-attachments/assets/a2933f6c-269e-4253-a3ee-b4d3d0a4f4c2" />
<img width="1920" height="1032" alt="Screenshot 2026-03-09 143835" src="https://github.com/user-attachments/assets/89b0f70a-6298-4790-8956-0b31e9f78b98" />
<img width="1920" height="1032" alt="Screenshot 2026-03-09 143949" src="https://github.com/user-attachments/assets/64b4afe6-1ed6-4ac6-8a73-bcad786e6d8a" />
<img width="1920" height="1032" alt="Screenshot 2026-03-09 151552" src="https://github.com/user-attachments/assets/fb7decdc-a125-4a24-be40-4224c5246b86" />
<img width="1920" height="1032" alt="Screenshot 2026-03-09 151617" src="https://github.com/user-attachments/assets/df7ecd0a-d20f-4c0c-9a52-b9f69310e0ed" />
<img width="1920" height="1032" alt="Screenshot 2026-03-09 151636" src="https://github.com/user-attachments/assets/63450cc9-c01e-4660-9b84-47af01663a1f" />






