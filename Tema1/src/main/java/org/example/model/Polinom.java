package org.example.model;

import org.example.model.Monom;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Polinom
{
    private Map<Integer, Monom> Ecuatie;

    public Map<Integer, Monom> getEcuatie()
    {
        return Ecuatie;
    }

    public void setEcuatie(Map<Integer, Monom> ecuatie)
    {
        Ecuatie = ecuatie;
    }

    public Polinom(String str)
    {
        this.Ecuatie=new HashMap<>();

    Pattern regex = Pattern.compile( "(([-+])?\\d+\\.?\\d)+x(\\^(\\d+))?");

     Matcher match= regex.matcher(str);
     while(match.find())
     {
         String gr1=match.group(1);
         String gr2=match.group(2);
         String gr3=match.group(3);
         String gr4=match.group(4);

         if(gr2==null)
             gr2="+";
         if(gr1==null)
             gr1="1";
         if(gr4==null)
            gr4="1";
         if(gr3==null)
            gr3="1";

         Integer exponent= Integer.parseInt(gr4);
         Double coeficient=Double.parseDouble(gr1);


             Monom aux= new Monom(exponent, coeficient);

             this.Ecuatie.put(exponent, aux);
     }
    }

    public int cautaMax() {
        Monom max = null;

        for (Monom m : this.Ecuatie.values()) {
            if (max == null || m.getExponent() > max.getExponent()) {
                max = m;
            }
        }
        return max.getExponent();
    }


    public String display()
    {
        String output="";
        for(Monom x: this.Ecuatie.values())
        {
            if(x.getCoef()!=0)
            if(x.getCoef()>0)
                output+="+"+x.getCoef()+"x^"+ x.getExponent();
            else  output+=x.getCoef()+"x^"+ x.getExponent();
        }
        return output;
    }

}
