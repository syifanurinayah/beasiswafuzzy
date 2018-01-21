/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beasiswafuzzy;

import java.math.BigDecimal;
import java.math.RoundingMode;
/**
 *
 * @author ACER
 */
public class conjunction {
    public double ipk( double nilaiipk){
        //drajat keanggotaan untuk nilai rata2 rendah
        double x = 0;
       
        if (nilaiipk>=3.10) {
            System.out.println(x);
        } else if(nilaiipk<=2.99) {
            System.out.println(x=1);
        }else if((nilaiipk>2.99)&&(nilaiipk<3.10)){
                
                x=(3.10-nilaiipk)/3.0;
                BigDecimal bd= new BigDecimal(x);
                bd=bd.setScale(2, BigDecimal.ROUND_UP);
                x=bd.doubleValue();
                System.out.println(x);
        }
        else{
            System.out.println(x);
        }
       
        return x;
    }    
}
