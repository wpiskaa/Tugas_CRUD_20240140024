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

{
  "nomorKtp": "20240140024",
  "namaLengkap": "Hafiz Kurniawan",
  "alamat": "Jln. Raya Sempalai",
  "tanggalLahir": "2001-09-14",
  "jenisKelamin": "Laki-laki"
}

{
  "nomorKtp": "20240140024",
  "namaLengkap": "Hafiz Kurniawan Update",
  "alamat": "Jln. Raya Sempalai",
  "tanggalLahir": "2001-09-14",
  "jenisKelamin": "Laki-laki"
}

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
```

Screenshot :

Sususnan Folder Di IntellIj
<img width="1920" height="1032" alt="Screenshot 2026-03-09 143808" src="https://github.com/user-attachments/assets/c222f540-d9ab-4697-981d-8156d8478f1b" />

Tampilan Utama
<img width="1920" height="1032" alt="Screenshot 2026-03-09 151636" src="https://github.com/user-attachments/assets/83a9a3f8-e54a-43f0-8c86-96980e451053" />

Berhasil Menambahkan
<img width="1920" height="1032" alt="Screenshot 2026-03-09 143642" src="https://github.com/user-attachments/assets/e03ad373-886d-40fe-b592-8b03d49ffda3" />

Database MySQL yang berhasil ditambahkan
<img width="1920" height="1032" alt="Screenshot 2026-03-09 143835" src="https://github.com/user-attachments/assets/dc4e4fda-48e0-4102-a7f5-2e93284733f7" />

Update Berhasil
<img width="1920" height="1032" alt="Screenshot 2026-03-09 151552" src="https://github.com/user-attachments/assets/ea320dba-d129-402f-8ff5-ca10082e2587" />

Data Delete
<img width="1920" height="1032" alt="Screenshot 2026-03-09 151617" src="https://github.com/user-attachments/assets/6ce52c8d-57ab-42ff-a012-b286fd1b3092" />


