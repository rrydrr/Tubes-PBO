/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main.java.main;
import java.util.Scanner;

import main.java.entity.arrays;
import main.java.entity.jadwal.Jadwal;
import main.java.entity.kehadiran.Kehadiran;
import main.java.entity.mapel.Mapel;
import main.java.entity.kelas.Kelas;
import main.java.entity.pelajar.Pelajar;
import main.java.entity.nilai.Nilai;

/**
 *
 * @author RyD;
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean loggedIn = Login.login();

        if (!loggedIn) {
            return; // Exit if login failed
        }
        
        // Initialize arrays
        arrays.listMapel = new Mapel[0];
        arrays.listNilai = new Nilai[0];
        arrays.listKelas = new Kelas[0];
        arrays.listJadwal = new Jadwal[0];
        arrays.listKehadiran = new Kehadiran[0];
        arrays.listPelajar = new Pelajar[0];
        
        Scanner scanner = new Scanner(System.in);
        Kelas kelas = new Kelas();
        
        while (true) {
            if (Login.isAdmin()) {
                System.out.println("Admin Menu:");
                System.out.println("1. Tambah Kelas");
                System.out.println("2. Ubah Kelas");
                System.out.println("3. Tambah Nilai");
                System.out.println("4. Tambah Mapel");
                System.out.println("5. Hapus Mapel");
                System.out.println("6. Tambah Jadwal");
                System.out.println("7. Hapus Jadwal");
                System.out.println("8. Ubah Kehadiran");
                System.out.println("9. Menampilkan Nilai");
                System.out.println("10. Logout");

                int choice = scanner.nextInt();
                scanner.nextLine(); // Consume newline character
                switch (choice) {
                    case 1:
                        // Create an instance of Kelas
                        kelas.tambahKelas(); // Call the tambahKelas method
                        break;
                        // Implement Tambah Kelas
                    case 2:
                        // Create an instance of Kelas
                        kelas.ubahKelas();         // Call the ubahKelas method
                        break;
                        // Implement Ubah Kelas
                    // Add cases for other menu options
                    case 3:
                        // Tambah Nilai
                        Nilai nilaiObj = new Nilai();
                        System.out.println("Input ID Pelajar:");
                        int id_pelajar = scanner.nextInt();
                        scanner.nextLine(); // Consume newline character
                        System.out.println("Input ID Mapel:");
                        int id_mapel = scanner.nextInt();
                        scanner.nextLine(); // Consume newline character
                        System.out.println("Input Nilai:");
                        int nilaiInput = scanner.nextInt();
                        scanner.nextLine(); // Consume newline character
                        nilaiObj.tambahNilai(id_pelajar, id_mapel, nilaiInput);
                        System.out.println("Nilai added successfully.");
                        break;
                        
                    case 4:
                        // Tambah Mapel
                        Mapel mapelObj = new Mapel();
                        System.out.println("Input Nama Mapel:");
                        String nama_mapel = scanner.nextLine();
                        mapelObj.tambahMapel(nama_mapel);
                        System.out.println("Mapel added successfully.");
                        break;
                    case 5:
                        // Hapus Mapel
                        System.out.println("Input ID Mapel:");
                        int id_mapel_hapus = scanner.nextInt();
                        scanner.nextLine(); // Consume newline character
                        Mapel mapelObj2 = new Mapel();
                        mapelObj2.hapusMapel(id_mapel_hapus);
                        System.out.println("Mapel deleted successfully.");
                        break;
                        
                    case 6:
                        // Tambah Jadwal
                        Jadwal jadwalObj = new Jadwal();
                        System.out.println("Input ID Kelas:");
                        int id_kelas = scanner.nextInt();
                        scanner.nextLine(); // Consume newline character
                        System.out.println("Input ID Mapel:");
                        int id_mapel_jadwal = scanner.nextInt();
                        scanner.nextLine(); // Consume newline character
                        System.out.println("Input Hari:");
                        String jadwal_hari = scanner.nextLine();
                        System.out.println("Input Waktu:");
                        String jadwal_time = scanner.nextLine();
                        jadwalObj.tambahJadwal(id_kelas, id_mapel_jadwal, jadwal_hari, jadwal_time);
                        System.out.println("Jadwal added successfully.");
                        break;
                        
                    case 7:
                        // Hapus Jadwal
                        System.out.println("Input ID Jadwal:");
                        int id_jadwal_hapus = scanner.nextInt();
                        scanner.nextLine(); // Consume newline character
                        Jadwal jadwalObj2 = new Jadwal();
                        jadwalObj2.hapusJadwal(id_jadwal_hapus);
                        System.out.println("Jadwal deleted successfully.");
                        break;
                        
                    case 8:
                      // Ubah Kehadiran
                      Kehadiran kehadiranObj = new Kehadiran();
                      System.out.println("Input ID Jadwal:");
                      int id_jadwal_kehadiran = scanner.nextInt();
                      scanner.nextLine(); // Consume newline character
                      System.out.println("Input Tingkat Kehadiran:");
                      int tingkat_kehadiran = scanner.nextInt();
                      scanner.nextLine(); // Consume newline character
                      kehadiranObj.ubahKehadiran(id_jadwal_kehadiran, tingkat_kehadiran);
                      System.out.println("Kehadiran updated successfully.");
                      break;
                    
                    case 9:
                    
                    case 10:
                        Login.logout();
                        return; // Exit the program
                    default:
                        System.out.println("Invalid choice. Please try again.");
                }
            } else {
                System.out.println("Student Menu:");
                System.out.println("1. Cek Nilai");
                System.out.println("2. Cek Jadwal");
                System.out.println("3. Logout");

                int choice = scanner.nextInt();
                scanner.nextLine(); // Consume newline character
                switch (choice) {
                    case 1:
                        // Implement Cek Nilai
                        break;
                    case 2:
                        // Implement Cek Jadwal
                        break;
                    case 3:
                        Login.logout();
                        return; // Exit the program
                    default:
                        System.out.println("Invalid choice. Please try again.");
                }
            }
        }
    }
}
