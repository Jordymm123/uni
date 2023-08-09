/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Metodos;

/**
 *
 * @author nicof
 */
public class Operaciones {
   //Suma
    public double Suma (double primerNumero,double segundoNumero)
    {
       double resultadoSuma;
        resultadoSuma=primerNumero+segundoNumero;
       return resultadoSuma;
    }
    //resta
    public double Resta(double minuendo, double sustraendo)
    {
        double resultadoResta;
        resultadoResta=minuendo-sustraendo;
        return resultadoResta;
    }
    //Multiplicacion
    public double Multiplicacion (double factor1,double factor2)
    {
       double resultadoMultiplicacion;
       resultadoMultiplicacion=factor1*factor2;
       return resultadoMultiplicacion;
    }
    //division
    public double Division (double dividendo, double divisor)
    {
        double resultadoDivision = 0;
        if(divisor==0)
            System.out.println("NO ES POSIBLE DIVIDIR POR 0");
        else
            resultadoDivision=dividendo/divisor;
        return resultadoDivision;
    
    }  
    
    //Potencia
    
    public double Potencia(double base, double potencia)
    {
        double resultadoPotencia;
        resultadoPotencia=Math.pow(base,potencia);
        return resultadoPotencia;
    }
    
    //Raiz
    public double Raiz (double numero, double raiz)
    {
        raiz=1/raiz;
       double resultadoRaiz=0;
       if(numero<0)
           System.out.println("El resultado seria un numero imaginario");
       else
        resultadoRaiz=Math.pow(numero, raiz);
       
        return resultadoRaiz; 
    }
    //IVA
public double iva (double valor)
    {
        double resultadoIva;
        resultadoIva=valor*0.19;
        return resultadoIva;  
    }
    //Sin
public double sin (double angulo)
    {
        double resultadoSin;
        resultadoSin=Math.sin(angulo);
        return resultadoSin;
    }
    //Cos 
    public double cos (double angulo)
    {
        double resultadoCos;
        resultadoCos=Math.cos(angulo);
        return resultadoCos;
    }
    //tan
    public double tan (double angulo)
    {
        double resultadoTan=0;
        if(Math.cos(angulo)==0)
                System.out.println("No pertenece al dominio de la funcion TAN X");
        else
        resultadoTan=Math.tan(angulo);
        return resultadoTan;
    }

    
}