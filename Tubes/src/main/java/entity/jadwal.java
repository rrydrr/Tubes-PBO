/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.java.entity;

import java.util.Arrays;
import main.java.entity.kehadiran.Kehadiran;

/**
 *
 * @author RyD;
 */
public class jadwal {
    public static class Jadwal {
        private int id_kelas;
        private int id_mapel;
        private int id_jadwal;
        private String jadwal_hari;
        private String jadwal_time;
        
        public void tambahJadwal(int id_kelas, int id_mapel, String jadwal_hari, String jadwal_time) {
            this.id_kelas = id_kelas;
            this.id_mapel = id_mapel;
            this.id_jadwal = id.id_jadwal+1;
            id.id_jadwal = this.id_jadwal;
            this.jadwal_hari = jadwal_hari;
            this.jadwal_time = jadwal_time;
            
            Jadwal tmp = new Jadwal();
            tmp.id_kelas = this.id_kelas;
            tmp.id_mapel = this.id_mapel;
            tmp.id_jadwal = this.id_jadwal;
            tmp.jadwal_hari = this.jadwal_hari;
            tmp.jadwal_time = this.jadwal_time;
            
            if(arrays.listJadwal != null) {
                Jadwal[] newArray = Arrays.copyOf(arrays.listJadwal, arrays.listJadwal.length+1);
                newArray[arrays.listJadwal.length] = tmp;
                arrays.listJadwal = newArray;
            } else {
                Jadwal[] tmparr = {tmp};
                arrays.listJadwal = tmparr;
            }
            
            Kehadiran kh = new Kehadiran();
            kh.id_jadwal = this.id_jadwal;
            kh.tingkat_kehadiran = 0;
            if(arrays.listKehadiran != null) {
                Kehadiran[] newArray = Arrays.copyOf(arrays.listKehadiran, arrays.listKehadiran.length+1);
                newArray[arrays.listKehadiran.length] = kh;
                arrays.listKehadiran = newArray;
            } else {
                Kehadiran[] tmparr = {kh};
                arrays.listKehadiran = tmparr;
            }
            
        }
        
        public void hapusJadwal(int id_jadwal) {
            Jadwal[] tmp = null;
            for(int i = 0; i < arrays.listJadwal.length; i++) {
                if(arrays.listJadwal[i].id_jadwal != id_jadwal) {
                    if(tmp != null) {
                        Jadwal[] newArray = Arrays.copyOf(tmp, tmp.length+1);
                        newArray[tmp.length] = arrays.listJadwal[i];
                        tmp = newArray;
                    } else {
                        Jadwal[] tmparr = {arrays.listJadwal[i]};
                        tmp = tmparr;
                    }
                }
            }
            arrays.listJadwal = tmp;
            hapusKehadiran(id_jadwal);
        }
        
        public void hapusKehadiran(int id_jadwal) {
            Kehadiran[] tmp = null;
            for(int i = 0; i < arrays.listKehadiran.length; i++) {
                if(arrays.listKehadiran[i].id_jadwal != id_jadwal) {
                    if(tmp != null) {
                        Kehadiran[] newArray = Arrays.copyOf(tmp, tmp.length+1);
                        newArray[tmp.length] = arrays.listKehadiran[i];
                        tmp = newArray;
                    } else {
                        Kehadiran[] tmparr = {arrays.listKehadiran[i]};
                        tmp = tmparr;
                    }
                }
            }
            arrays.listKehadiran = tmp;
        }
        
        public void getDetails() {
            System.out.println(this.id_kelas);
            System.out.println(this.id_mapel);
            System.out.println(this.id_jadwal);
            System.out.println(this.jadwal_hari);
            System.out.println(this.jadwal_time);
        }
    }    
}
