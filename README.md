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
