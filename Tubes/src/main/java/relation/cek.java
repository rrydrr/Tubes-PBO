/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.java.relation;

import main.java.entity.arrays;
import main.java.entity.pelajar;
import main.java.entity.kelas;
import main.java.entity.nilai;

/**
 *
 * @author RyD;
 */
public class cek {
    public static void cekNilai(int id_pelajar) {
        String nama  = null;
        for(int i = 0; i < arrays.listPelajar.length; i++) {
            if(arrays.listPelajar[i].id_pelajar == id_pelajar) {
                nama = arrays.listPelajar[i].nama;
            }
        }
        System.out.println("Nilai untuk siswa "+nama);
        
        for(int i = 0; i < arrays.listNilai.length; i++) {
            if(arrays.listNilai[i].id_pelajar == id_pelajar) {
                String mk = null;
                for(int j = 0; j < arrays.listMapel.length; i++) {
                    System.out.println(i);
                    if(arrays.listNilai[i].id_mapel == arrays.listMapel[j].id_mapel) {
                        mk = arrays.listMapel[j].nama_mapel;
                    }
                }     
                System.out.println("nilai untuk mapel "+mk+" adalah "+arrays.listNilai[i].cekNilai());
            }
        } 
    }
}
