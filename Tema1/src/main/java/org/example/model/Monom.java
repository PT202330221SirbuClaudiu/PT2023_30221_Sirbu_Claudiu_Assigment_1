package org.example.model;

public class Monom
{
   private Integer Exponent;
   private Double Coef;

   public Monom(Integer a, Double b)
   {
       this.Exponent=a;
       this.Coef=b;
   }

    public Double getCoef() {
        return Coef;
    }

    public Integer getExponent() {
        return Exponent;
    }

    public void setCoef(Double coef) {
        Coef = coef;
    }

    public void setExponent(Integer exponent) {
        Exponent = exponent;
    }


}
