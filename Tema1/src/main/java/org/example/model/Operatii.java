package org.example.model;

public class Operatii
{
    public static Polinom Adunare(Polinom p1, Polinom p2)
    {
        Polinom result=new Polinom("");
        for (Monom i:p1.getEcuatie().values())
        {
            if(p2.getEcuatie().containsKey(i.getExponent())==true)
            {
                Monom termen = new Monom(i.getExponent(), i.getCoef()+p2.getEcuatie().get(i.getExponent()).getCoef());
                result.getEcuatie().put(i.getExponent(), termen);
            }
            else result.getEcuatie().put(i.getExponent(), new Monom(i.getExponent(), i.getCoef()));

        }

        for (Monom i:p2.getEcuatie().values())
        {
            if(p1.getEcuatie().containsKey(i.getExponent())==false) {

                result.getEcuatie().put(i.getExponent(), new Monom(i.getExponent(), i.getCoef()));
            }
        }

        return result;
    }

    public static Polinom Scadere(Polinom p1, Polinom p2)
    {
        Polinom result=new Polinom("");
        for (Monom i:p1.getEcuatie().values())
        {
            if(p2.getEcuatie().containsKey(i.getExponent())==true)
            {
                Monom termen = new Monom(i.getExponent(), i.getCoef()-p2.getEcuatie().get(i.getExponent()).getCoef());
                result.getEcuatie().put(i.getExponent(), termen);
            }
            else result.getEcuatie().put(i.getExponent(), new Monom(i.getExponent(), i.getCoef()));

        }

        for (Monom i:p2.getEcuatie().values())
        {
            if(p1.getEcuatie().containsKey(i.getExponent())==false) {
                i.setCoef(-i.getCoef());
                result.getEcuatie().put(i.getExponent(), new Monom(i.getExponent(), i.getCoef()));
            }
        }

        return result;
    }

    public static Polinom Inmultire(Polinom p1, Polinom p2)
    {
        Polinom result=new Polinom("");
        for (Monom i:p1.getEcuatie().values())
        {
            Polinom paux=new Polinom("");
            for(Monom j:p2.getEcuatie().values())
            {
                Monom aux = new Monom(i.getExponent()+j.getExponent(), i.getCoef()*j.getCoef());
                paux.getEcuatie().put(i.getExponent()+j.getExponent(), aux);
            }
            result=Adunare(result, paux);


        }

        return result;
    }

    public static Polinom Derivare(Polinom p1)
    {
        Polinom result=new Polinom("");
        for (Monom i:p1.getEcuatie().values())
        {
            result.getEcuatie().put(i.getExponent()-1, new Monom(i.getExponent()-1, i.getExponent()*i.getCoef()));
        }
        return result;
    }

    public static Polinom Integrare(Polinom p1)
    {
        Polinom result=new Polinom("");
        for (Monom i:p1.getEcuatie().values())
        {
            result.getEcuatie().put(i.getExponent()+1, new Monom(i.getExponent()+1, i.getCoef()/(i.getExponent()+1)));
        }
        return result;
    }

    public static Polinom Impartire(Polinom p1, Polinom p2) {
        Polinom cat = new Polinom("");

        while (p1.cautaMax() >= p2.cautaMax()) {
            double coef = p1.cautaMax() / p2.cautaMax();
            int exp = p1.cautaMax() - p2.cautaMax();

            Monom monom = new Monom(exp, coef);
            cat.getEcuatie().put(exp, monom);

            Polinom term = new Polinom("");
            term.getEcuatie().put(exp, monom);

            Polinom product = Inmultire(p2, term);
            p1 = Scadere(p1, product);
        }

        return cat;
    }



}
