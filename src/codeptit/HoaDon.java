/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codeptit;

public class HoaDon {
    private String maMatHang, tenMatHang;
    private long soLuongMua, donGia, tienChietKhau;

    public HoaDon(String maMatHang, String tenMatHang, long soLuongMua, long donGia, long tienChietKhau) {
        this.maMatHang = maMatHang;
        this.tenMatHang = tenMatHang;
        this.soLuongMua = soLuongMua;
        this.donGia = donGia;
        this.tienChietKhau = tienChietKhau;
    }
    public long tongTien(){
        return this.soLuongMua * this.donGia - this.tienChietKhau;
    }
    @Override
    public String toString(){
        return this.maMatHang + ' ' + this.tenMatHang + ' ' + this.soLuongMua
                + ' ' + this.donGia + ' ' + this.tienChietKhau + ' ' + this.tongTien();
    }
}