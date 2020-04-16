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
public class DoMinhHoang_59136053_bt1 
{
    public static void main(String[] args) 
    {
        CaNhan hs1 = new HocSinh("59CNTT3", "", "Đỗ Minh Hoàng", 21, "15/12 Máy Nước", "0772482088");
        CaNhan hs2 = new HocSinh("59CNTT3", "", "Thái Thành Đạt", 21, "123 Lê Hồng Phong", "0787826767");
        CaNhan hs3 = new HocSinh("59CNTT3", "", "Nguyễn Hoàng Long", 21, "15 Quốc Tuấn", "0772305767");
        CaNhan gv1 = new GiaoVien("Thiết Kế Web", "TKW001", "Hồ Đắc Tâm", 41, "123 Lê Văn Tám", "0123456789");
        CaNhan gv2 = new GiaoVien("Hướng Đối Tượng", "HDT001", "Hồ Đắc Vương", 41, "124 Lê Văn Tám", "099874523");
        CaNhan gv3 = new GiaoVien("Nhập Môn Lập Trình", "NMLT001", "Hồ Đắc Vũ", 41, "125 Lê Văn Tám", "0312345681");
        LopHoc dsLopHoc = new LopHoc();
        dsLopHoc.themHocSinh((HocSinh) hs1);
        dsLopHoc.themHocSinh((HocSinh) hs2);
        dsLopHoc.themHocSinh((HocSinh) hs3);
        dsLopHoc.themGVGD((GiaoVien) gv1);
        dsLopHoc.themGVGD((GiaoVien) gv2);
        dsLopHoc.themGVGD((GiaoVien) gv3);
        System.out.println("----Danh Sách Học Sinh: ");
        dsLopHoc.inDSHS();
        System.out.println("----Danh Sách Giáo Viên: ");
        dsLopHoc.inDSGVGD();
        
        
    }
    
    
}
