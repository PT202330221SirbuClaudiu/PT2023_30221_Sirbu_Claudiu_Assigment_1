package org.example;

import org.example.model.Operatii;
import org.example.model.Polinom;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controller extends Operatii
{
    public ActionListener AdunareAction(JTextField t1, JTextField t2, JTextField t3)
    {
        ActionListener a= new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Polinom p1= new Polinom(t1.getText());
                Polinom p2 = new Polinom(t2.getText());
              System.out.println(p1.display());
                Polinom rezultat= new Polinom("");
                rezultat=Adunare(p1, p2);

                t3.setText(rezultat.display());
            }
        };
     return a;
    }

    public ActionListener ScadereAction(JTextField t1, JTextField t2, JTextField t3)
    {
        ActionListener a= new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Polinom p1= new Polinom(t1.getText());
                Polinom p2 = new Polinom(t2.getText());
                System.out.println(p1.display());
                Polinom rezultat= new Polinom("");
                rezultat=Scadere(p1, p2);

                t3.setText(rezultat.display());
            }
        };
        return a;
    }

    public ActionListener InmultireAction(JTextField t1, JTextField t2, JTextField t3)
    {
        ActionListener a= new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Polinom p1= new Polinom(t1.getText());
                Polinom p2 = new Polinom(t2.getText());
                System.out.println(p1.display());
                Polinom rezultat= new Polinom("");
                rezultat=Inmultire(p1, p2);

                t3.setText(rezultat.display());
            }
        };
        return a;
    }

    public ActionListener DerivareAction(JTextField t1, JTextField t2, JTextField t3)
    {
        ActionListener a= new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Polinom p1= new Polinom(t1.getText());
                Polinom p2 = new Polinom(t2.getText());
                System.out.println(p1.display());
                Polinom rezultat= new Polinom("");
                rezultat=Derivare(p1);

                t3.setText(rezultat.display());
            }
        };
        return a;
    }

    public ActionListener IntegrareAction(JTextField t1, JTextField t2, JTextField t3)
    {
        ActionListener a= new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Polinom p1= new Polinom(t1.getText());
                Polinom p2 = new Polinom(t2.getText());
                System.out.println(p1.display());
                Polinom rezultat= new Polinom("");
                rezultat=Integrare(p1);

                t3.setText(rezultat.display());
            }
        };
        return a;
    }

    public ActionListener ImpartireAction(JTextField t1, JTextField t2, JTextField t3)
    {
        ActionListener a= new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Polinom p1= new Polinom(t1.getText());
                Polinom p2 = new Polinom(t2.getText());
                System.out.println(p1.display());
                Polinom rezultat= new Polinom("");
                rezultat=Impartire(p1, p2);

                t3.setText(rezultat.display());
            }
        };
        return a;
    }

}
