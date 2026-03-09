# KTP Management API Specification

Dokumentasi ini merinci spesifikasi endpoint REST API untuk sistem manajemen data kependudukan (KTP) yang dibangun menggunakan **Spring Boot** dan **MySQL**.

## 1. Endpoint API

### Create KTP
**Endpoint** : `POST /ktp`

**Request Body** :
```json
{
  "nomorKtp": "20240140024",
  "namaLengkap": "Hafiz Kurniawan",
  "alamat": "Jln. Raya Sempalai",
  "tanggalLahir": "2001-09-14",
  "jenisKelamin": "Laki-laki"
}
[
  {
    "nomorKtp": "20240140024",
    "namaLengkap": "Hafiz Kurniawan",
    "alamat": "Jln. Raya Sempalai",
    "tanggalLahir": "2001-09-14",
    "jenisKelamin": "Laki-laki"
  }
]
{
  "nomorKtp": "20240140024",
  "namaLengkap": "Hafiz Kurniawan Update",
  "alamat": "Jln. Raya Sempalai",
  "tanggalLahir": "2001-09-14",
  "jenisKelamin": "Laki-laki"
}
{
  "message": "Data KTP berhasil dihapus"
}

Screenshot

<img width="1920" height="1032" alt="Screenshot 2026-03-09 151636" src="https://github.com/user-attachments/assets/77d545dd-2be9-49f6-b991-43ad8a0b6d35" />

