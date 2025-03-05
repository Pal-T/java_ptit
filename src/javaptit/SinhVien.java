/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaptit;


public class SinhVien implements Comparable<SinhVien>{
    private String maSinhVien, hoTen, sdt, email;

    public SinhVien(String maSinhVien, String hoTen, String lop, String email) {
        this.maSinhVien = maSinhVien;
        this.hoTen = hoTen;
        this.sdt = lop;
        this.email = email;
    }
    
    public String getTen() {
        String[] arr = this.hoTen.split("\\s+");
        return arr[arr.length - 1];
    }
    
    public String getHoVaTenDem() {
        String[] arr = this.hoTen.split("\\s+");
        String res = "";
        for (int i = 0; i < arr.length - 1; i++) {
            res += arr[i];
        }
        return res;
    }
    
    @Override
    public String toString() {
        return this.maSinhVien + " " + this.hoTen + " " + this.sdt + " " + this.email;
    }

    @Override
    public int compareTo(SinhVien other) {
        if (this.hoTen.equals(other.hoTen)) {
            if (this.maSinhVien.compareTo(other.maSinhVien) < 0) return -1;
            return 1;
        }
        else {
            if (this.getTen().equals(other.getTen())) {
                if (this.getHoVaTenDem().compareTo(other.getHoVaTenDem()) < 0) return -1;
                return 1;
            }
            else {
                if (this.getTen().compareTo(other.getTen()) < 0) return -1;
                return 1;
            }
        }
    }
}
