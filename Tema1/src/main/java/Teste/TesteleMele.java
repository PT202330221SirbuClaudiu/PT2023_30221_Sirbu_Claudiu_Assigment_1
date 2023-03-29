package Teste;

import org.example.model.Operatii;
import org.example.model.Polinom;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TesteleMele
{
    Polinom p1 = new Polinom("1.0x^2+10.0x^1");
    Polinom p2 = new Polinom("3.0x^3+2x^1");
    @Test
    public void TestSuma()
    {

        assertEquals(10, 3+7);
    }

    @Test
    public void TestDiferenta()
    {
        assertEquals("+10.0x^1+1.0x^2-3.0x^3", Operatii.Scadere(p1, p2).display());
    }

    @Test
    public void TestInmultire()
    {
        assertEquals("+30.0x^4+3.0x^5", Operatii.Inmultire(p1, p2).display());
    }

   // @Test
   // public void TestImpartire()
    //{
     //   assertEquals(10, Operatii.Impartire(p1, p2).display());
    //}

    @Test
    public void TestDerivare()
    {
        assertEquals("+10.0x^0+2.0x^1", Operatii.Derivare(p1).display());
    }

    @Test
    public void TestIntegrare()
    {
        assertEquals("+5.0x^2+0.3333333333333333x^3", Operatii.Integrare(p1).display());
    }

}
