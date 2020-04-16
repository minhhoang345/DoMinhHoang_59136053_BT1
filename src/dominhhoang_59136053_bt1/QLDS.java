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
public class QLDS implements IQLDS
{
    ArrayList<CaNhan> dsCaNhan = new ArrayList<CaNhan>();
    
    @Override
    public int them(CaNhan p) 
    {
    //    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        dsCaNhan.add(p);
        return dsCaNhan.size();
    }

    @Override
    public int xoa(String ten) 
    {
    //    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        for(CaNhan i: dsCaNhan)
        {
            if(i.hoTen==ten)
                dsCaNhan.remove(i);
        }
        return dsCaNhan.size();
    }

    @Override
    public void inDS() 
    {
    //    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        for(int i=0;i<dsCaNhan.size();i++)
        {
            System.out.println(dsCaNhan.get(i).HienThiTT());
        }
    }
    
}
