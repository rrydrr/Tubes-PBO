/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.java.entity;
import java.util.InputMismatchException;
import java.util.Scanner;
import main.java.entity.mapel.Mapel;
import java.util.Scanner;
import java.util.Arrays;

/**
 *
 * @author RyD;
 */
public class kelas {
    public static class Kelas {
        public int id_kelas;
        public Mapel[] mapels;
        public String nama_kelas;
        
        public void tambahKelas() {
            this.id_kelas = id.id_kelas + 1;
            id.id_kelas = this.id_kelas;
            Scanner scan = new Scanner(System.in);
            for (;;) {
                for (int i = 0; i < arrays.listMapel.length; i++) {
                    System.out.println("ID         : " + arrays.listMapel[i].id_mapel);
                    System.out.println("Nama Mapel : " + arrays.listMapel[i].nama_mapel);
                }
                System.out.print("Masukkan ID Mapel yang akan dimasukkan ke kelas : ");
                int IDmk;
                while (true) {
                    try {
                        IDmk = scan.nextInt();
                        System.out.println("ID Mapel yang dimasukkan ke kelas: " + IDmk); // Print the input value
                        break; // Exit the loop if input is valid
                    } catch (InputMismatchException e) {
                        System.out.println("Invalid input. Please enter a valid integer ID.");
                        scan.nextLine(); // Consume invalid input
                    }
                }
                for (int i = 0; i < arrays.listMapel.length; i++) {
                    if (IDmk == arrays.listMapel[i].id_mapel) {
                        if (this.mapels != null) {
                            Mapel[] newArray = Arrays.copyOf(this.mapels, this.mapels.length + 1);
                            newArray[this.mapels.length] = arrays.listMapel[i];
                            this.mapels = newArray;
                        } else {
                            Mapel[] tmparr = { arrays.listMapel[i] };
                            this.mapels = tmparr;
                        }
                    }
                }
                System.out.print("Apakah anda ingin menambahkan mapel lagi? (y/n) ");
                String lanjut = scan.next();
                if (("n".equals(lanjut)) || ("N".equals(lanjut))) {
                    break;
                }
            }
            System.out.print("Masukkan Nama Kelas : ");
            String nk = scan.next();
            System.out.println("Nama Kelas: " + nk); // Print the input value
            this.nama_kelas = nk;

            Kelas tmp = new Kelas();
            tmp.id_kelas = this.id_kelas;
            tmp.mapels = this.mapels;
            tmp.nama_kelas = this.nama_kelas;
            if (arrays.listKelas != null) {
                Kelas[] newArray = Arrays.copyOf(arrays.listKelas, arrays.listKelas.length + 1);
                newArray[arrays.listKelas.length] = tmp;
                arrays.listKelas = newArray;
            } else {
                Kelas[] tmparr = { tmp };
                arrays.listKelas = tmparr;
            }
        }

        
        public void ubahKelas() {
            this.mapels = null;
            Scanner scan = new Scanner(System.in);
            System.out.println("Silahkan pilih Mapel yang akan dimasukkan ke kelas.\n");
            for(;;) {
                for(int i = 0; i < arrays.listMapel.length; i++) {
                    System.out.println("ID         : "+arrays.listMapel[i].id_mapel);
                    System.out.println("Nama Mapel : "+arrays.listMapel[i].nama_mapel);
                }
                System.out.print("Masukkan ID Mapel yang akan dimasukkan ke kelas : ");
                int IDmk = scan.nextInt();
                for(int i = 0; i < arrays.listMapel.length; i++) {
                    if(IDmk == arrays.listMapel[i].id_mapel) {
                        if(this.mapels !=null) {
                            Mapel[] newArray = Arrays.copyOf(this.mapels, this.mapels.length+1);
                            newArray[this.mapels.length] = arrays.listMapel[i];
                            this.mapels = newArray;
                        } else {
                            Mapel[] tmparr = {arrays.listMapel[i]};
                            this.mapels = tmparr;
                        }
                    }
                }
                System.out.print("Apakah anda ingin menambahkan mapel lagi? (y/n) ");
                String lanjut = scan.next();
                if(("n".equals(lanjut)) || ("N".equals(lanjut))) {
                    break;
                }
            }
        }
        
        public void seed(int[] id_mapels, String nama_kelas) {
            this.id_kelas = id.id_kelas+1;
            id.id_kelas = this.id_kelas;
            this.nama_kelas = nama_kelas;
            
            for(int z = 0; z < id_mapels.length; z++) {
                int IDmk = id_mapels[z];
                for(int i = 0; i < arrays.listMapel.length; i++) {
                    if(IDmk == arrays.listMapel[i].id_mapel) {
                        if(this.mapels !=null) {
                            Mapel[] newArray = Arrays.copyOf(this.mapels, this.mapels.length+1);
                            newArray[this.mapels.length] = arrays.listMapel[i];
                            this.mapels = newArray;
                        } else {
                            Mapel[] tmparr = {arrays.listMapel[i]};
                            this.mapels = tmparr;
                        }
                    }
                }
            }
            
            Kelas tmp = new Kelas();
            tmp.id_kelas = this.id_kelas;
            tmp.mapels = this.mapels;
            tmp.nama_kelas = this.nama_kelas;
            if(arrays.listKelas != null) {
                Kelas[] newArray = Arrays.copyOf(arrays.listKelas, arrays.listKelas.length+1);
                newArray[arrays.listKelas.length] = tmp;
                arrays.listKelas = newArray;
            } else {
                Kelas[] tmparr = {tmp};
                arrays.listKelas = tmparr;
            }
        }
        
        public void getDetails() {
            System.out.println(this.id_kelas);
            for(int i = 0; i < mapels.length; i++) {
                System.out.print(this.mapels[i].nama_mapel+" ");
            }
            System.out.println(this.nama_kelas);
        }
    }
}
