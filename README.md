# Pemrograman Berorientasi Objek - Tugas Geometri (Shape, Square, Circle, Cylinder)

Repositori ini berisi implementasi kode program Java untuk memenuhi tugas praktikum Pemrograman Berorientasi Objek (PBO) mengenai konsep *Encapsulation*, *Inheritance*, dan *Polymorphism*[cite: 1, 2, 3].

## Deskripsi Tugas

Program ini dirancang untuk menerapkan hierarki kelas geometri menggunakan bahasa pemrograman Java. Tugas dibagi menjadi beberapa tahapan (*Exercise*):

1. **Exercise 1 (Bentuk & BujurSangkar)**:
   - Membuat kelas induk `Bentuk` dengan atribut `warna` serta method getter, setter, dan `printInfo()`.
   - Membuat kelas turunan `BujurSangkar` yang mewarisi `Bentuk` dengan tambahan atribut `side/sisi`, perhitungan luas, dan *override* method `printInfo()`[cite: 2, 3].

2. **Exercise 2 (Lingkaran)**[cite: 2]:
   - Membuat kelas turunan `Lingkaran` dari kelas `Bentuk`[cite: 2].
   - Menambahkan atribut `radius`, konstanta `PHI` (3.14), perhitungan luas lingkaran, dan *override* method `printInfo()`[cite: 2].

3. **Exercise 3 (Silinder)**:
   - Membuat kelas turunan `Silinder` dari kelas `Lingkaran`.
   - Menambahkan atribut `tinggi`, perhitungan volume (`hitungVolume()`), dan *override* method `printInfo()`[cite: 3].

---

## Struktur File

Program dipisahkan ke dalam beberapa file terpisah agar modular dan menerapkan prinsip *good practices* dalam pemrograman Java:

* `Bentuk.java` : Kelas induk dasar untuk semua bentuk geometri.
* `BujurSangkar.java` : Kelas turunan yang merepresentasikan bangun datar bujur sangkar.
* `Lingkaran.java` : Kelas turunan yang merepresentasikan bangun datar lingkaran.
* `Silinder.java` : Kelas turunan dari lingkaran yang merepresentasikan bangun ruang silinder.
* `Main.java` : Kelas utama yang menyediakan menu interaktif berbasis konsol menggunakan `java.util.Scanner`[cite: 1].

---

## Cara Menjalankan Program

1. Pastikan Anda sudah menginstal **Java Development Kit (JDK)** di komputer Anda.
2. Unduh atau *clone* repositori ini, lalu simpan semua file `.java` ke dalam satu folder yang sama.
3. Buka terminal atau Command Prompt pada direktori folder tersebut.
4. Kompilasi semua file dengan perintah:
   ```bash
   javac *.java
