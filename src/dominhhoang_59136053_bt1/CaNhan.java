/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominhhoang_59136053_bt1;

/**
 *
 * @author DELL
 */
public abstract class CaNhan 
{
    String hoTen;
    int tuoi;
    String diaChi;
    String sdt;

    public CaNhan(String hoTen, int tuoi, String diaChi, String sdt) {
        this.hoTen = hoTen;
        this.tuoi = tuoi;
        this.diaChi = diaChi;
        this.sdt = sdt;
    }
    
    public String HienThiTT()
    {
        return  "Họ Tên: "+ hoTen+ "\n"+
                "Tuổi: "+ tuoi+ "\n"+
                "Địa Chỉ: "+ diaChi+ "\n"+
                "Số Điện Thoại: "+ sdt+ "\n";
    }
}
