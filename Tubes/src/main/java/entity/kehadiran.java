/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.java.entity;

/**
 *
 * @author RyD;
 */
public class kehadiran {
    public static class Kehadiran {
        public int id_jadwal;
        public int tingkat_kehadiran;
        
        public void ubahKehadiran(int id_jadwal, int tingkat_kehadiran) {
            this.id_jadwal = id_jadwal;
            this.tingkat_kehadiran = tingkat_kehadiran;
            
            for(int i = 0; i < arrays.listKehadiran.length; i++) {
                if(id_jadwal == arrays.listKehadiran[i].id_jadwal) {
                    arrays.listKehadiran[i].tingkat_kehadiran = tingkat_kehadiran;
                }
            }
        }
        
        public void getDetails() {
            System.out.println(this.id_jadwal);
            System.out.println(this.tingkat_kehadiran);
        }
    }
}
