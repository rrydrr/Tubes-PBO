/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.java.entity;

import java.util.Arrays;

/**
 *
 * @author RyD;
 */
public class pelajar {
    public static class Pelajar {
        public int id_pelajar;
        public int id_kelas;
        public String nama;
        public int umur;
        public int tahun_masuk;
        public String nama_kelas;
        
        public void addPelajar(int id_kelas, String nama, int umur, int tahun_masuk) {
            this.id_pelajar = id.id_pelajar+1;
            id.id_pelajar = this.id_pelajar;
            this.id_kelas = id_kelas;
            this.nama = nama;
            this.umur = umur;
            this.tahun_masuk = tahun_masuk;
            for(int i = 0; i<arrays.listKelas.length; i++) {
                if(arrays.listKelas[i].id_kelas == this.id_kelas) {
                    this.nama_kelas = arrays.listKelas[i].nama_kelas;
                }
            }
            
            Pelajar tmp = new Pelajar();
            tmp.id_pelajar = this.id_pelajar;
            tmp.id_kelas = this.id_kelas;
            tmp.nama = this.nama;
            tmp.umur = this.umur;
            tmp.tahun_masuk = this.tahun_masuk;
            tmp.nama_kelas = this.nama_kelas;
            
            if(arrays.listPelajar != null) {
                Pelajar[] newArray = Arrays.copyOf(arrays.listPelajar, arrays.listPelajar.length+1);
                newArray[arrays.listPelajar.length] = tmp;
                arrays.listPelajar = newArray;
            } else {
                Pelajar[] tmparr = {tmp};
                arrays.listPelajar = tmparr;
            }
        }
        
        public void getDetails() {
            System.out.println(this.id_pelajar);
            System.out.println(this.id_kelas);
            System.out.println(this.nama);
            System.out.println(this.umur);
            System.out.println(this.tahun_masuk);
            System.out.println(this.nama_kelas);
        }
    }
}
