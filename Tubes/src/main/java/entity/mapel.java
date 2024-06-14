package main.java.entity;

import java.util.Arrays;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author RyD;
 */
public class mapel {
    public static class Mapel {
        public int id_mapel;
        public String nama_mapel;
        
        public void tambahMapel(String nama_mapel) {
            this.id_mapel = id.id_mapel+1;
            id.id_mapel=this.id_mapel;
            this.nama_mapel = nama_mapel;
            Mapel tmp = new Mapel();
            tmp.id_mapel = this.id_mapel;
            tmp.nama_mapel = this.nama_mapel;
            if(arrays.listMapel != null) {
                Mapel[] newArray = Arrays.copyOf(arrays.listMapel, arrays.listMapel.length+1);
                newArray[arrays.listMapel.length] = tmp;
                arrays.listMapel = newArray;
            } else {
                Mapel[] tmparr = {tmp};
                arrays.listMapel = tmparr;
            }
        }
        
        public void hapusMapel(int id_mapel) {
            Mapel[] tmp = null;
            for(int i = 0; i < arrays.listMapel.length; i++) {
                if(arrays.listMapel[i].id_mapel != id_mapel) {
                    if(tmp != null) {
                        Mapel[] newArray = Arrays.copyOf(tmp, tmp.length+1);
                        newArray[tmp.length] = arrays.listMapel[i];
                        tmp = newArray;
                    } else {
                        Mapel[] tmparr = {arrays.listMapel[i]};
                        tmp = tmparr;
                    }
                }
            }
            arrays.listMapel = tmp;
        }
        
        public void getDetails() {
            System.out.println("ID         :"+this.id_mapel);
            System.out.println("Nama Mapel :"+this.nama_mapel);
        }
    }
}
