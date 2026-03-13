# Program Bangun Ruang Menggunakan Java
Author : Muhammad iqbal dzulfaqor


# Deskripsi Program

Program ini merupakan aplikasi sederhana berbasis Java yang digunakan untuk menghitung volume dan luas permukaan beberapa bangun ruang. Bangun ruang yang tersedia dalam program ini meliputi:

Kubus

Balok

Bola

Tabung

Program bekerja dengan cara menampilkan menu pilihan kepada pengguna. Pengguna dapat memilih bangun ruang yang ingin dihitung, kemudian memasukkan nilai yang diperlukan seperti sisi, panjang, lebar, tinggi, atau jari-jari. Setelah itu program akan menghitung dan menampilkan volume serta luas permukaan dari bangun ruang tersebut.

Program ini dibuat untuk melatih pemahaman konsep dasar dalam pemrograman Java, seperti:

Input dari pengguna menggunakan Scanner

Struktur kontrol percabangan (switch-case)

Penggunaan operasi matematika

Penggunaan konstanta matematika dari Math.PI

Source Code Program
``
import java.util.Scanner;
public class BangunRuang {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int pilihan;

        System.out.println("=== Program Menghitung Volume Bangun Ruang ===");
        System.out.println("1. Kubus");
        System.out.println("2. Balok");
        System.out.println("3. Tabung");
        System.out.print("Pilih bangun ruang (1-3): ");
        pilihan = input.nextInt();

        switch (pilihan) {

            case 1:
                // Kubus
                System.out.print("Masukkan panjang sisi kubus: ");
                double sisi = input.nextDouble();
                double volumeKubus = sisi * sisi * sisi;

                System.out.println("Volume Kubus = " + volumeKubus);
                break;

            case 2:
                // Balok
                System.out.print("Masukkan panjang: ");
                double panjang = input.nextDouble();

                System.out.print("Masukkan lebar: ");
                double lebar = input.nextDouble();

                System.out.print("Masukkan tinggi: ");
                double tinggi = input.nextDouble();

                double volumeBalok = panjang * lebar * tinggi;

                System.out.println("Volume Balok = " + volumeBalok);
                break;

            case 3:
                // Tabung
                System.out.print("Masukkan jari-jari: ");
                double r = input.nextDouble();

                System.out.print("Masukkan tinggi: ");
                double t = input.nextDouble();

                double volumeTabung = Math.PI * r * r * t;

                System.out.println("Volume Tabung = " + volumeTabung);
                break;

            default:
                System.out.println("Pilihan tidak tersedia!");
        }

        input.close();
    }
}
``

Penjelasan Program
 1. Import Library
``t java.util.Scanner;
``
Library Scanner digunakan untuk mengambil input dari pengguna melalui keyboard.

 2. Membuat Class Utama
``
public class BangunRuang {
``
Class BangunRuang merupakan class utama yang berisi seluruh program.

impor
 3. Method Main
``
public static void main(String[] args)
``
Method main() adalah titik awal eksekusi program Java. Semua perintah program dijalankan dari method ini.

 4. Membuat Objek Scanner
``
Scanner input = new Scanner(System.in);
``
Objek ini digunakan untuk membaca input dari pengguna seperti angka yang dimasukkan melalui keyboard.

 5. Menampilkan Menu Program
``
System.out.println("1. Kubus");
System.out.println("2. Balok");
System.out.println("3. Bola");
System.out.println("4. Tabung");
``
Program menampilkan menu pilihan bangun ruang agar pengguna dapat memilih bangun ruang yang ingin dihitung.

 6. Mengambil Input Pilihan User
``
int pilihan = input.nextInt();
``
Program membaca pilihan pengguna dan menyimpannya dalam variabel pilihan.

 7. Percabangan Switch Case
``
switch(pilihan)
``
Struktur switch-case digunakan untuk menjalankan perhitungan sesuai dengan pilihan pengguna.

Setiap case merepresentasikan bangun ruang yang berbeda.

 8. Perhitungan Bangun Ruang
``
Kubus

Rumus:

Volume

V = s³

Luas Permukaan

L = 6s²

Implementasi dalam kode:

double volumeKubus = sisi * sisi * sisi;
double luasKubus = 6 * sisi * sisi;
Balok

Rumus:

Volume

V = p × l × t

Luas Permukaan

L = 2(pl + pt + lt)

Kode program:

double volumeBalok = panjang * lebar * tinggi;
double luasBalok = 2 * (panjang*lebar + panjang*tinggi + lebar*tinggi);
Bola

Rumus:

Volume

V = 4/3 π r³

Luas Permukaan

L = 4 π r²

Kode:

double volumeBola = (4.0/3.0) * Math.PI * r * r * r;
double luasBola = 4 * Math.PI * r * r;
Tabung

Rumus:

Volume

V = π r² t

Luas Permukaan

L = 2πr(r+t)

# Output


# Tujuan Pembuatan Program
Program ini dibuat untuk:
Memahami dasar pemrograman Java,Mengimplementasikan rumus matematika dalam program,Mempelajari struktur percabangan
Dan Melatih penggunaan input dan output dalam Java
