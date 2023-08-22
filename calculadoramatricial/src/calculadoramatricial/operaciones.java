package calculadoramatricial;
import java.util.Scanner;
public class operaciones {
    //SUMA DE MATRICES, POSDATA, ME TARDE 5 HORAS HACIENDO SOLO ESTA IMAGINATE HACIENDO LAS DEMAS ;-;
    public void sumaM(double [][] A, double [][] B){
        Scanner tomadato=new Scanner(System.in);
        System.out.print("Asignele valores a la primera matriz (fila 1 colum 1, fila 1 colum 2, asi progresivamente -> ");
        for (int x=0;x<A.length;x++) {
            for (int y=0;y<A[0].length;y++){
                A[x][y]=tomadato.nextDouble();
            }
        }
        System.out.print("Asignele valores a la segunda matriz -> ");
        for (int x=0;x<B.length;x++) {
            for (int y=0;y<B[0].length;y++){
                B[x][y]=tomadato.nextDouble();
            }
        }
        if (A.length==B.length && A[0].length==B[0].length){
            double [][] matricialsuma=new double[A.length][A[0].length] ;
            for (int x=0;x<B.length;x++) {
                for (int y=0;y<B[0].length;y++){
                    matricialsuma[x][y]=(A[x][y]+B[x][y]);
                }
            }
            System.out.println("Resultado: ");
            for (int x=0;x<matricialsuma.length;x++){
                for (int y=0;y<matricialsuma[0].length;y++){
                    System.out.print(matricialsuma[x][y]+" ");
                }
                System.out.println();
            }
        }
        else System.out.println("Las matrices no son de igual tamaño");
    };
    //no voy a optimizar, directamente no se como se hace
    //la multiplicacion
    public void productoM(double [][] A, double [][] B){
        Scanner tomadato=new Scanner(System.in);
        System.out.print("Asignele valores a la primera matriz (fila 1 colum 1, fila 1 colum 2, asi progresivamente -> ");
        for (int x=0;x<A.length;x++) {
            for (int y=0;y<A[0].length;y++){
                A[x][y]=tomadato.nextDouble();
            }
        }
        System.out.print("Asignele valores a la segunda matriz -> ");
        for (int x=0;x<B.length;x++) {
            for (int y=0;y<B[0].length;y++){
                B[x][y]=tomadato.nextDouble();
            }
        }
        if (A[0].length==B.length){
            System.out.println("Resultado: ");
            int f3=0;
            double [][] matricialproducto=new double[A.length][B[0].length];
            double f4=0;
            for (int x=0;x<A.length;x++){
                for (int y=0;y<B[0].length;y++){
                    for (f3=0;f3<A[0].length;f3++)
                        f4+=A[x][f3]*B[f3][y];
                    matricialproducto[x][y]=f4;
                    f4=0;
                } 
            }
            for (int x=0;x<matricialproducto.length;x++){
                for (int y=0;y<matricialproducto[0].length;y++){
                    System.out.print(matricialproducto[x][y]+" ");
                }
                System.out.println();
            }
        }
        else System.out.println("No se pueden multiplicar estas matrices");
    };
    //fan numero 1 del ctrl + c y ctrl + v, esta fue un DOLOR no la quiero volver a hacer
    //multiplicacion por escalar
    public void escalarM(double [][] A){
        Scanner tomadato=new Scanner(System.in);
        System.out.print("Asignele valores a la matriz (fila 1 colum 1, fila 1 colum 2, asi progresivamente -> ");
        for (int x=0;x<A.length;x++) {
            for (int y=0;y<A[0].length;y++){
                A[x][y]=tomadato.nextDouble();
            }
        }
        System.out.print("Ingrese el numero escalar por el cual multiplicar la matriz ->");
        int esc=tomadato.nextInt();
        System.out.println("Resultados: ");
        for (int x=0;x<A.length;x++) {
            for (int y=0;y<A[0].length;y++){
                System.out.print(A[x][y]*esc+" ");
            }
            System.out.println();
        }
    };
    //facilito
    //traspuesta :p
    public void traspuestaM(double [][] A){
        Scanner tomadato=new Scanner(System.in);
        double [][] guardar=new double [A[0].length][A.length];
        System.out.print("Asignele valores a la matriz (fila 1 colum 1, fila 1 colum 2, asi progresivamente -> ");
        for (int x=0;x<A.length;x++) {
            for (int y=0;y<A[0].length;y++){
                A[x][y]=tomadato.nextDouble();
            }
        }
        System.out.println("Resultados: ");
        for (int x=0;x<A.length;x++) {
            for (int y=0;y<A[0].length;y++){
                guardar[y][x]=A[x][y];
            }
        }
        for (int x=0;x<guardar.length;x++) {
            for (int y=0;y<guardar[0].length;y++){
                System.out.print(guardar[x][y]+" ");
            }
            System.out.println();
        }
    };
    //era tan facil y me demore media hora, que triste
}
