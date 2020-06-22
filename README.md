# pemlan-06
Praktikum Pemrograman Lanjut Bab 6. Polimorfisme

Buatlah sebuah sistem keanggotaan & pemesanan hotel sederhana yang memiliki 2 jenis anggota
1. Premium Member dengan ketentuan:
- Tidak ada batas kamar yang dapat di pesan
- Makan: breakfast, lunch, dinner
- Fasilitas: kolam renang, spa, dan sauna
- Diskon 5% pada weekend
- Diskon 10% pada hari kerja
2. Member dengan ketentuan:
- Dibatasi pemesanan maksimal 5 kamar
- Makan: breakfast, lunch
- Fasilitas: kolam renang
- Diskon 5% pada hari kerja
3. Non Member dengan ketentuan:
- Dibatasi pemesanan maksimal 3 kamar
- Makan: breakfast
- Fasilitas: -
Adapun biaya per kamar berdasarkan jenis:
1. Single: 200000 (hari kerja), 250000 (weekend) (memperoleh voucher makan utk 1 orang)
2. Double: 375000 (hari kerja), 450000 (weekend) (memperoleh voucher makan utk 2 orang)
3. Suite: 750000 (hari kerja), 800000 (weekend) (memperoleh voucher makan utk 6 orang)
Biaya makan:
1. Breakfast 25000
2. Lunch 25000
3. Dinner 30000
Fasilitas:
1. Kolam Renang: 25000 / orang
2. Sauna: 150000 / orang
3. Spa: 150000 / orang

Tampilkan Data Pemesan dan Jenis Pemesan berserta total biaya yang harus dibayarkan
Contoh:
Nama: Fadel
NoKTP: 12345
NoTelp: 087875607293
Alamat: Malang
Jenis Member: Premium
Jumlah Pesan Kamar (Tidak Dibatasi): 6
1. Double Weekend: 450000
2. Double Weekend: 450000
3. Double Weekend: 450000
4. Double Weekend: 450000
5. Suite Weekend: 800000
6. Suite Weekend: 800000
Total: 3.400.000
Diskon Member: 170.000
Biaya Kamar: 3.230.000
Fasilitas Diperoleh:
1. Kolam Renang: 20 orang
2. Sauna: 20 orang
3. Spa: 20 orang
Tambahan Pesan Fasilitas:
Tidak Ada
Voucher Makan Diperoleh:
1. Breakfast: 20 (Free)
2. Lunch: 20 (Free)
3. Dinner: 20 (Free)
Tambahan Pesan Makanan:
1. Breakfast 5 x 25000 = 125000
2. Dinner 5 x 30000 = 150000
Total yang harus dibayarkan: Rp 3.505.000

Test Case:
1. Premium, 6 Kamar Hari Kerja (2 Single, 3 Double, 1 Suite), Breakfast 5, Dinner 5
2. Member, 4 Kamar Hari Kerja, (1 Single, 2 Double, 1 Suite), Breakfast 1, Lunch 1, Dinner 6, Sauna 6
3. Non Member, 2 Kamar Weekend, (2 Suite), Lunch 12, Dinner 12, Kolam Renang 12, Spa 12

Class:
1. abstract induk
2. premium extend induk
3. member extend induk
4. non member extend induk
5. main class
