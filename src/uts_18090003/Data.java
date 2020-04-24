/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts_18090003;

/**
 *
 * @author Anan
 */
public class Data {

    private String nim;
    private String nama;
    private String no_hp;
    private String alamat;

    public Data() {
        nim = "";
        nama = "";
        no_hp = "";
        alamat = "";
    }

    public Data(String nim, String nama, String alamat, String no_hp) {
        this.nim = nim;
        this.nama = nama;
        this.alamat = alamat;
        this.no_hp = no_hp;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public void setNo_hp(String no_hp) {
        this.no_hp = no_hp;
    }

    public String getNim() {
        return nim;
    }

    public String getNama() {
        return nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public String getNo_hp() {
        return no_hp;
    }

}
