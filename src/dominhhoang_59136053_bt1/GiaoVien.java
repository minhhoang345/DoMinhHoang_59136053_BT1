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
public class GiaoVien extends CaNhan
{
    String monDay;
    String toBoMon;

    public GiaoVien(String monDay, String toBoMon, String hoTen, int tuoi, String diaChi, String sdt) 
    {
        super(hoTen, tuoi, diaChi, sdt);
        this.monDay = monDay;
        this.toBoMon = toBoMon;
    }

    @Override
    public String HienThiTT() 
    {
        return super.HienThiTT()+ //To change body of generated methods, choose Tools | Templates.
                    "Môn Dạy: "+ monDay+ "\n"+ 
                    "Tổ Bộ Môn: "+ toBoMon+ "\n";
    }
    
    
}
