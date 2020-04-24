/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts_18090003;
import java.util.*;
import javax.xml.transform.Result;
/**
 *
 * @author Anan
 */
public class App {
    public static void main(String args[]) {
        App app = new App();
        Scanner sc = new Scanner(System.in);
        while(true) {
            app.printMenu();
            int pilihan = sc.nextInt();
            switch(pilihan) {
                case 1: 
                    System.out.println("Tambah Data");
                    app.addData();
                    break;
                case 2:
                    System.out.println("Ubah Data");
                    List<Data> result = Operasi.getListData();
                    if(result.size() > 0){
                         app.ubahData();
                    }else {
                        System.out.println("Maaf tidak ada data pada list");
                    }
                   
                    break;
                case 3:
                    System.out.println("Hapus Data");
                    List<Data> result2 = Operasi.getListData();
                    if(result2.size() > 0){
                         app.hapusData();
                    }else {
                        System.out.println("Maaf tidak ada data pada list");
                    }
                    break;
                case 4:
                    System.out.println("Daftar Data Mahasiswa");
                    List<Data> result3 = Operasi.getListData();
                    if(result3.size() > 0){
                         app.listData();
                    }else {
                        System.out.println("Maaf tidak ada data pada list");
                    }
                    break;
                case 5:
                    return;
            }
        }
    }

    public void hapusData() {
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.print("Urutan data yang akan dihapus : "); int index = Integer.parseInt(sc.nextLine());
        Operasi.removeData(index-1);
    }

    public void ubahData() {
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.print("Nomor data mahasiswa yang akan diubah : "); int index = Integer.parseInt(sc.nextLine());
        System.out.println("---------------------------------");
        System.out.print("NIM : "); String nim = sc.nextLine();
        System.out.print("Nama Lengkap : "); String nama = sc.nextLine();
        System.out.print("No. HP : "); String no_hp = sc.nextLine();
        System.out.print("Alamat Lengkap : "); String alamat = sc.nextLine();
        Operasi.editData(new Data(nim, nama, no_hp, alamat), index-1);
    }

    public void listData() {
        List<Data> result = Operasi.getListData();
        for(int i=0; i<result.size(); i++) {
            System.out.println();
            System.out.println("Data Mahasiswa ke-" + (i+1));
            System.out.println("  NIM : " + result.get(i).getNim());
            System.out.println("  Nama Lengkap : " + result.get(i).getNama());
            System.out.println("  No. HP : " + result.get(i).getNo_hp());
            System.out.println("  Alamat Lengkap : " + result.get(i).getAlamat());
            System.out.println("=======================================================");
            System.out.println("\n");
        }
    }

    public void addData() {
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.print("NIM : "); String nim = sc.nextLine();
        System.out.print("Nama Lengkap : "); String nama = sc.nextLine();
        System.out.print("No. HP : "); String no_hp = sc.nextLine();
        System.out.print("Alamat Lengkap : "); String alamat = sc.nextLine();
        Operasi.addData(new Data(nim, nama, no_hp, alamat));
    }

    public void printMenu() {
        System.out.println();
        System.out.println("-------------------------------");
        System.out.println("Aplikasi Perekaman Data Mahasiswa");
        System.out.println("-------------------------------");
        System.out.println("1. Tambah Data");
        System.out.println("2. Ubah Data");
        System.out.println("3. Hapus Data");
        System.out.println("4. Lihat Data");
        System.out.println("5. Keluar");
        System.out.print("Pilihan : ");
    }

}

