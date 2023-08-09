/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package consola.calculadora;

import java.util.Scanner;

/**
 *
 * @author SANTIAGO
 */
public class ConsolaCalculadora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner objeto1=new Scanner(System.in);
        Scanner objeto2=new Scanner(System.in);
        Scanner lingo=new Scanner(System.in);
        Scanner valr=new Scanner(System.in);
        int num1, num2, num3, r=1, duo;
        double funct, resu;
        float iva;
    while (r!=0){
        System.out.println("|||||CALCULADORA DE CONSOLA|||||");
        System.out.println("1. suma");
        System.out.println("2. resta");
        System.out.println("3. multiplicacion");
        System.out.println("4. division");
        System.out.println("5. funcion trigonometrica");
        System.out.println("6. Raiz o potencia");
        System.out.println("7. IVA");
        Scanner opcion=new Scanner(System.in);
        System.out.print("Elija una opcion =>");
        int op=opcion.nextInt();
        
        switch(op){
        case 1: System.out.print("ingrese numero 1: ");
            num1=objeto1.nextInt();
            System.out.print("ingrese numero 2: ");
            num2=objeto2.nextInt();
            num3=num1+num2;
            System.out.println("El resultado es: "+num3);
            break;
            
        case 2: System.out.print("ingrese numero 1: ");
            num1=objeto1.nextInt();
            System.out.print("ingrese numero 2: ");
            num2=objeto2.nextInt();
            num3=num1-num2;
            System.out.println("El resultado es: "+num3);
            break;
        case 3: System.out.print("ingrese numero 1: ");
            num1=objeto1.nextInt();
            System.out.print("ingrese numero 2: ");
            num2=objeto2.nextInt();
            num3=num1*num2;
            System.out.println("El resultado es: "+num3);
            break;
        case 4: System.out.print("ingrese numerador: ");
            num1=objeto1.nextInt();
            System.out.print("ingrese divisor: ");
            num2=objeto2.nextInt();
            if (num2!=0){
            num3=num1/num2;
            System.out.println("El resultado es: "+num3);
            }
            else
            System.out.println("INDEFINIDO");
            break;
        case 5: System.out.print("Digite 1 para seno, 2 para coseno o 3 para tangente =>");
            duo=lingo.nextInt();
            if (duo==1) {
                System.out.print("Ingrese el valor al que se desea obtener el seno: ");
                funct=objeto1.nextDouble();
                resu=Math.sin(funct);
                System.out.println("El seno es: "+resu);
            }
            else
            if (duo==2) {
                System.out.print("Ingrese el valor al que se desea obtener el coseno: ");
                funct=objeto1.nextDouble();
                resu=Math.cos(funct);
                System.out.println("El coseno es: "+resu);
            }
            else
            if (duo==3) {
                System.out.print("Ingrese el valor al que se desea obtener la tangente: ");
                funct=objeto1.nextDouble();
                resu=Math.tan(funct);
                System.out.println("La tangente es: "+resu);
            }
            else
            System.out.println("numero incorrecto, solo puede ingresar uno de las tres");
            break;
        case 6: System.out.print("Digite 1 para raiz y 2 para potencia =>");
            duo=lingo.nextInt();
            if (duo==1){
                System.out.print("Digite el radicando o base a la que le quiere sacar raiz: ");
                num1=objeto1.nextInt();
                System.out.print("Digite el indice o exponente: ");
                iva=objeto2.nextFloat();
                if (num1>=0)
                System.out.println("La raiz es: "+Math.pow(num1,1/iva));
                else
                System.out.println("IMAGINARIA");
            }
            else
            if (duo==2){
                System.out.print("Digite la base: ");
                num1=objeto1.nextInt();
                System.out.print("Digite el exponente: ");
                num2=objeto2.nextInt();
                System.out.println("La potencia es: "+Math.pow(num1,num2));
            }
            else
            System.out.println("numero incorrecto, solo puede ingresar uno de las tres");
            break;
        case 7: System.out.print("Ingrese el porcentaje del iva (entre 1 a 100): ");
            iva=objeto1.nextFloat();
            System.out.print("Ingrese el precio de su compra u objeto: ");
            if (iva>=0 && iva<=100){
            iva=iva/100;
            funct=objeto2.nextDouble();
            System.out.println("Precio objeto: "+funct);
            System.out.println("IVA: "+funct*iva);
            System.out.println("Precio con iva: "+(funct+(funct*iva)));
            }
            else
            System.out.println("Este porcentaje no existe");
            break;
            default: System.out.println("Valor invalido, digite un numero");
        }
        System.out.print("Digite 0 para terminar de usar la calculadora, digite cualquier otro numero para seguir usandola =>");
        r=valr.nextInt();
        }
    }
        // TODO code application logic here
    }
