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
public class me {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Login.login();
        System.out.println("login");//
        //loop
        //if !isAdmin
        System.out.println("cek nilai");//
        System.out.println("cek jadwal");//
        System.out.println("logout");//
        
        //if isAdmin
        System.out.println("tambah kelas*");//
        System.out.println("ubah kelas*");//
        System.out.println("tambah nilai*");//
        System.out.println("tambah mapel*");//
        System.out.println("hapus mapel*");//
        System.out.println("tambah jadwal*");//
        System.out.println("hapus jadwal*");//
        System.out.println("ubah kehadiran*");//
        System.out.println("logout");//
        
        //test
        System.out.println();
        
        Mapel mt1 = new Mapel();
        Mapel mt2 = new Mapel();
        Mapel mt3 = new Mapel();
        mt1.tambahMapel("tes mapel dan ID 1");
        mt2.tambahMapel("tes mapel dan ID 2");
        mt3.tambahMapel("tes mapel dan ID 3");
        
        /*for (Mapel listMapel : arrays.listMapel) {
            System.out.println("ID         : " + listMapel.id_mapel);
            System.out.println("Nama Mapel : " + listMapel.nama_mapel);
        }*/
        
        Kelas tesKelas = new Kelas();
        int[] seedKelas = {1, 2};
        tesKelas.seed(seedKelas, "TEST");
        tesKelas.getDetails();
        /*tesKelas.tambahKelas();
        tesKelas.getDetails();
        tesKelas.ubahKelas();
        tesKelas.getDetails();*/
        
        Pelajar std1 = new Pelajar();
        std1.addPelajar(1, "Abdi", 19, 2021);
        std1.getDetails();
        
        Nilai n1 = new Nilai();
        Nilai n2 = new Nilai();
        n1.tambahNilai(1, 1, 100);
        n2.tambahNilai(1, 2, 80);
        
        n1.getDetails();
        n2.getDetails();
        
        //mt3.hapusMapel(3);
        //tesKelas.tambahKelas();
        
        Jadwal j1 = new Jadwal();
        Jadwal j2 = new Jadwal();
        j1.tambahJadwal(1, 1, "Senin", "08:00");
        j2.tambahJadwal(1, 2, "Kamis", "12:00");
        
        for(int i = 0; i < arrays.listJadwal.length; i++) {
            Jadwal jp = new Jadwal();
            jp = arrays.listJadwal[i];
            jp.getDetails();
        }
        
        j2.hapusJadwal(2);
        j2.tambahJadwal(1, 2, "rabu", "18:00");
        for(int i = 0; i < arrays.listJadwal.length; i++) {
            Jadwal jp = new Jadwal();
            jp = arrays.listJadwal[i];
            jp.getDetails();
        }
        
        Kehadiran kh = new Kehadiran();
        kh.ubahKehadiran(1, 90);
        kh.ubahKehadiran(2, 90);
        
        System.out.println();
        for(int i = 0; i < arrays.listKehadiran.length; i++) {
            Kehadiran jk = new Kehadiran();
            jk = arrays.listKehadiran[i];
            jk.getDetails();
        }
        Login.logout();
    }
    
}
