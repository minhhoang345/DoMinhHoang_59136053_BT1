/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominhhoang_59136053_bt1;

import java.util.ArrayList;

/**
 *
 * @author DELL
 */
public class LopHoc 
{
    QLDS qlds = new QLDS();
    ArrayList<GiaoVien> dsGiaoVien = new ArrayList<GiaoVien>();
    ArrayList<HocSinh> dsHocSinh = new ArrayList<HocSinh>();
    
    public int themHocSinh(HocSinh hs)
    {
        dsHocSinh.add(hs);
        return dsHocSinh.size();
    }
    
    public int themGVGD(GiaoVien gv)
    {
        dsGiaoVien.add(gv);
        return dsGiaoVien.size();
    }
    
    public void inDSHS()
    {
        for(int i=0;i<dsHocSinh.size();i++)
        {
            System.out.println(dsHocSinh.get(i).HienThiTT());
        }
    }
    public void inDSGVGD()
    {
        for(int i=0;i<dsGiaoVien.size();i++)
        {
            System.out.println(dsGiaoVien.get(i).HienThiTT());
        }
    }
}
