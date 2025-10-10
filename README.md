ini fitur 1
ini fitur 2
ini baris baru ditambahkan di Github
ini fitur 3

jawaban Praktikum 1

1. karena variabel yang diperiksa adalah boolean "uktLunas", bukan angka ataupun teks
2. tidak ada pesan tambahan yang muncul karena program belum memiliki else
3. else {
            System.out.println("Registrasi ditolak. Silakan lunasi UKT terlebih dahulu.");
        }

Jawaban Percobaan 2

1. sintaks break berfungsi untuk menghentikan eksekusi switch setelah satu case cocok, jika tidak ada break, maka program akan terus mengeksekusi case berikutnya, walaupun nilainya tidak cocok lagi
2. sintaks default berperan sebagai penanganan kondisi yang tidak terduga atau tidak sesuai pilihan yang ada dalam struktur switch-case, semisal ada studi kasus memasukkan semester selain dari 1-8 maka program akan memberikan respon yang informatif, tidak hanya diam saja

Jawaban Percobaan 3
1. akan muncul "Masukkan jumlah log bimbingan Pembimbing 1 :" karena sistem perlu memastikan apakah mahasiswa benar-benar aktif melakukan bimbingan dengan pembimbing sesuai jumlah minimal yang telah ditentukan sebagai syarat administratif untuk mendaftar ujian skripsi
2. Jika jumlah bimbingan Pembimbing 1 minimal 8 kali dan jumlah bimbingan Pembimbing 2 minimal 4 kali, maka mahasiswa memenuhi syarat untuk mendaftar ujian skripsi apabila tidak memenuhi (kurang dari minimal yang di sebutkan) maka tidak dapat mendaftar ujian skripsi
3.  
    Alur pemeriksaan syarat mahasiswa
    1.	Apakah mahasiswa Bebas kompen?	jika Tidak akan	❌ Gagal, mahasiswa masih memiliki tanggungan kompen
    2.	Apakah mahasiswa Bebas kompen?	jika Ya akan Lanjut ke pengecekan log
    3.	Log P1 ≥ 8 dan Log P2 ≥ 4	✅ Semua syarat terpenuhi, boleh daftar	
    4.	Log P1 < 8 dan Log P2 < 4	❌ Gagal, dua-duanya kurang	
    5.	Log P1 < 8 saja	❌ Gagal, P1 kurang dari 8	
    6.	Log P2 < 4 saja	❌ Gagal, P2 kurang dari 4