package ordenamiento1;
import java.util.Arrays;
public class ProcesoOrd {
    //BUBBLE SORT
    public void Bubble(double []A){
        double temp;
        for (int x=0;x<A.length-1;x++){
            for (int y=0;y<A.length-x-1;y++){
                if (A[y]>A[y+1]){
                    temp=A[y];
                    A[y]=A[y+1];
                    A[y+1]=temp;
                }
            }
        }
        for(int x=0;x<A.length;x++) System.out.println(A[x]+" ");
    };
    //INSERTION SORT
    public void Insert(double []A){
        int f,g;
        double temp;
        for (f=1;f<A.length;f++){
            temp=A[f];
            g=f-1;
            while (g>=0 && temp<A[g]){
                A[g+1]=A[g];
                g--;
            }
            A[g+1]=temp;
        }
        for(int x=0;x<A.length;x++) System.out.println(A[x]+" ");
    };
    //SELECTION SORT
    public void Selection(double []A){
        for (int x=0;x<A.length-1;x++){
            int min=x;
            for (int y=x+1;y<A.length;y++){
                if (A[y]<A[min])
                    min=y;
            }
            double temp=A[x];
            A[x]=A[min];
            A[min]=temp;
        }
        for(int x=0;x<A.length;x++) System.out.println(A[x]+" ");
    };
    //MERGESORT1
    public void Mergesort(double []A){
        if (A.length<=1) return;
        int Mitad=A.length/2;
        double [] left=Arrays.copyOfRange(A,0,Mitad);
        double [] right=Arrays.copyOfRange(A,Mitad,A.length);
        Mergesort(left);
        Mergesort(right);
        Merge(A,left,right);
    };
    public void Merge(double []A, double []left, double []right){
        int x=0,y=0;
        for (int z=0;z<A.length;z++){
            if (x>=left.length){
                A[z]=right[y];
                y++;
                continue; //salta a la siguiente interaccion
            }
            if (y>=right.length){
                A[z]=left[x];
                x++;
                continue;
            }
            if (left[x]<right[y]){
                A[z]=left[x];
                x++;
            }
            else {
                A[z]=right[y];
                y++;
            }
        }
    };
}
