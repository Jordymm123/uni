package unsemaforo;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import java.util.Timer;
import java.util.TimerTask;
import static unsemaforo.Semaforo.priope;
public class Unsemaforo extends Semaforo {

    static int contador=0, r=0, y=0, f,f1, x;
    static int [] imagen=new int[4];
    public static void main(String[] args) {
        int s=1;
        int tiempo=s*1000;
        Timer timer;
        TimerTask tarea;
        Semaforo semaforo=new Semaforo();
        semaforo.setVisible(true);
        tarea=new TimerTask(){
            @Override
            public void run(){
                Icon icono, icono2;
                Icon [] icono3=new Icon[4];
                icono3[0]=new ImageIcon(getClass().getResource("/Imagenes/contact.png"));
                icono3[1]=new ImageIcon(getClass().getResource("/Imagenes/recoil.png"));
                icono3[2]=new ImageIcon(getClass().getResource("/Imagenes/passing.png"));
                icono3[3]=new ImageIcon(getClass().getResource("/Imagenes/high point.png"));
                f=semaforo.jSlider1.getValue();
                if (f<=33) f1=3; else if (f<=66) f1=6; else f1=9;
                if (priope<=5) x=priope;
                switch (contador){
                    case 0: if (r<=22+f1) r++; else contador=1;
                    icono=new ImageIcon(getClass().getResource("/Imagenes/Verde.png"));
                    icono2=new ImageIcon(getClass().getResource("/Imagenes/passing.png"));
                    semaforo.jLabel1.setIcon(icono);
                    semaforo.Tiempore.setText("Tiempo: "+((23+f1)-r));
                    semaforo.jLabel2.setIcon(icono2);
                        break;
                    case 1: if (r<=26+f1) r++; else contador=2;
                    icono=new ImageIcon(getClass().getResource("/Imagenes/Amarillo.png"));
                    icono2=new ImageIcon(getClass().getResource("/Imagenes/passing.png"));
                    semaforo.jLabel1.setIcon(icono);
                    semaforo.Tiempore.setText("Tiempo: "+((27+f1)-r));
                    semaforo.jLabel2.setIcon(icono2);
                        break;
                    case 2: if (r<=53-f1+x) r++; else contador=3;
                    icono=new ImageIcon(getClass().getResource("/Imagenes/Rojo.png"));
                    semaforo.jLabel1.setIcon(icono);
                    semaforo.Tiempore.setText("Tiempo: "+((54-f1+x)-r));
                    semaforo.jLabel2.setIcon(icono3[0+y]);
                    if (y<icono3.length-1) y++; else y=0;
                    break;
                    case 3: if (r<=57-f1+x) r++; else contador=0;
                    y=0;
                    icono=new ImageIcon(getClass().getResource("/Imagenes/Amarillo.png"));
                    icono2=new ImageIcon(getClass().getResource("/Imagenes/passing.png"));
                    semaforo.jLabel1.setIcon(icono);
                    semaforo.Tiempore.setText("Tiempo: "+((58-f1+x)-r));
                    semaforo.jLabel2.setIcon(icono2);
                    if (contador==0) {r=0; x=0; priope=0;}
                        break;
                }
            }
        };
        timer=new Timer();
        timer.scheduleAtFixedRate(tarea, 0, tiempo);
    }
}

