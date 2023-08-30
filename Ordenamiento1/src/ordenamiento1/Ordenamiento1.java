package ordenamiento1;
public class Ordenamiento1 {
    public static void main(String[] args) {
        ProcesoOrd pro=new ProcesoOrd();
        double [] ord=new double[10000];
        long [] timeElapsed = new long [4];
        for (int x=0;x<ord.length;x++) {
            ord[x]=(double)(Math.random()*10000+1);
        }
        System.out.println("---Bubble---");
        long startTime = System.nanoTime();
        pro.Bubble(ord);
        long endTime = System.nanoTime();
        timeElapsed[0] = endTime - startTime;
        System.out.println("Tiempo trascurrido (nanosegundos): "+timeElapsed[0]); System.out.println();
        ///////////////////////////////////////////////////////////////
        System.out.println("---Insert---");
        startTime=System.nanoTime();
        pro.Insert(ord);
        endTime=System.nanoTime();
        timeElapsed[1]= endTime - startTime;
        System.out.println("Tiempo trascurrido (nanosegundos): "+timeElapsed[1]); System.out.println();
        ///////////////////////////////////////////////////////////////
        System.out.println("---Select---");
        startTime=System.nanoTime();
        pro.Selection(ord);
        endTime=System.nanoTime();
        timeElapsed[2]= endTime - startTime;
        System.out.println("Tiempo trascurrido (nanosegundos): "+timeElapsed[2]); System.out.println();
        ///////////////////////////////////////////////////////////////
        System.out.println("---Merge---");
        startTime=System.nanoTime();
        pro.Mergesort(ord);
        for (int x=0;x<ord.length;x++) System.out.println(ord[x]+" ");
        endTime=System.nanoTime();
        timeElapsed[3]= endTime - startTime;
        System.out.println("Tiempo trascurrido (nanosegundos): "+timeElapsed[3]); System.out.println();
        System.out.println("--Metodo||tiempo (ns)---");
        System.out.println("--Bubble||"+timeElapsed[0]+"--");
        System.out.println("--Insert||"+timeElapsed[1]+"--");
        System.out.println("--Select||"+timeElapsed[2]+"--");
        System.out.println("--Merge||"+timeElapsed[3]+"--");
    }
    
}
