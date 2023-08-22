package calculadoramatricial;
import java.util.Scanner;
public class Calculadoramatricial {
    public static void main(String[] args) {
        Scanner opcion=new Scanner(System.in);
        operaciones oper=new operaciones();
        int r=1;
        while (r!=0){
        System.out.println("-----Calculadora Matricial-----");
        System.out.print("Digite las dimensiones de sus matrices separadas por un espacio (primera matriz) ->");
        int dim1=opcion.nextInt();
        int dim2=opcion.nextInt();
        double [][] dato1=new double[dim1][dim2];
        System.out.print("Ahora las dimensiones de la segunda matriz ->");
        int dim3=opcion.nextInt();
        int dim4=opcion.nextInt();
        double [][] dato2=new double[dim3][dim4];
        System.out.println("1. Suma de matrices");
        System.out.println("2. Producto de matrices");
        System.out.println("3. Producto escalar por matriz matrices");
        System.out.println("4. Traspuesta de una matriz");
        System.out.print("Seleccione una opcion: ");
        int op=opcion.nextInt();
        switch (op){
            case 1: oper.sumaM(dato1,dato2);
                break;
            case 2: oper.productoM(dato1,dato2);
                break;
            case 3: oper.escalarM(dato1);
                break;
            case 4: oper.traspuestaM(dato1);
                break;
            default: System.out.println("Dato invalido, por favor digite uno de los numeros de arriba");
        }
        System.out.print("Para dejar de usar la calculadora digite el numero 0, para seguir usandola cualquier otro numero ->");
        r=opcion.nextInt();
        }
    }
}
