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
