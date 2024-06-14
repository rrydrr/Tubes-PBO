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
public class nilai {
    public static class Nilai {
        public int id_pelajar;
        public int id_mapel;
        public int nilai;
        
        public void tambahNilai(int id_pelajar, int id_mapel, int nilai) {
            this.id_pelajar = id_pelajar;
            this.id_mapel = id_mapel;
            this.nilai = nilai;
            
            Nilai tmp = new Nilai();
            tmp.id_pelajar = id_pelajar;
            tmp.id_mapel = id_mapel;
            tmp.nilai = nilai;
            if(arrays.listNilai != null) {
                Nilai[] newArray = Arrays.copyOf(arrays.listNilai, arrays.listNilai.length+1);
                newArray[arrays.listNilai.length] = tmp;
                arrays.listNilai = newArray;
            } else {
                Nilai[] tmparr = {tmp};
                arrays.listNilai = tmparr;
            }
        }
        
        public int cekNilai() {
            return this.nilai;
        }
        
        public void getDetails() {
            System.out.println("ID_Pelajar :"+this.id_pelajar);
            System.out.println("ID_Mapel   :"+this.id_mapel);
            System.out.println("Nilai      :"+this.nilai);
        }
    }
}
