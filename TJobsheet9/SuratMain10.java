package TJobsheet9;

import java.util.Scanner;

public class SuratMain10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StackSurat10 stack = new StackSurat10(10); // kapasitas stack 10

        int pilih;
        do {
            System.out.println("\nMenu Surat Izin Mahasiswa:");
            System.out.println("1. Terima Surat Izin");
            System.out.println("2. Proses Surat Izin");
            System.out.println("3. Lihat Surat Izin Terakhir");
            System.out.println("4. Cari Surat Izin (berdasarkan nama mahasiswa)");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilih = sc.nextInt();
            sc.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("ID Surat: ");
                    String id = sc.nextLine();
                    System.out.print("Nama Mahasiswa: ");
                    String nama = sc.nextLine();
                    System.out.print("Kelas: ");
                    String kelas = sc.nextLine();
                    System.out.print("Jenis Izin (S/I): ");
                    char jenis = sc.nextLine().toUpperCase().charAt(0);
                    System.out.print("Durasi (hari): ");
                    int durasi = sc.nextInt();
                    sc.nextLine();
                    Surat10 surat = new Surat10(id, nama, kelas, jenis, durasi);
                    stack.push(surat);
                    break;
                case 2:
                    stack.pop();
                    break;
                case 3:
                    Surat10 topSurat = stack.peek();
                    if (topSurat != null) {
                        System.out.println("Surat Terakhir: " + topSurat.idSurat + " | " + topSurat.namaMahasiswa + " | " + topSurat.kelas + " | " + topSurat.jenisIzin + " | " + topSurat.durasi);
                    }
                    break;
                case 4:
                    System.out.print("Masukkan nama mahasiswa yang dicari: ");
                    String cariNama = sc.nextLine();
                    Surat10 hasil = stack.cariSurat(cariNama);
                    if (hasil != null) {
                        System.out.println("Surat ditemukan: " + hasil.idSurat + " | " + hasil.namaMahasiswa + " | " + hasil.kelas + " | " + hasil.jenisIzin + " | " + hasil.durasi);
                    } else {
                        System.out.println("Surat tidak ditemukan.");
                    }
                    break;
                case 0:
                    System.out.println("Terima kasih!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilih != 0);

        sc.close();
    }
}