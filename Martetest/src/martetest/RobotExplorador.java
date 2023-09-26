package martetest;
import java.util.Stack;
import martetest.latarea.Tarea;
import java.util.Timer;
import java.util.TimerTask;
public class RobotExplorador extends javax.swing.JFrame {

    /**
     * Creates new form RobotExplorador
     */
    public RobotExplorador() {
        this.timertask=new TimerTask(){
        @Override
            public void run() {
                String Tipot;
                switch (op){
                    case 0:
                    pro++;
                    if (check==true){
                        if (tarea2.getTipo()==0)Tipot="Ts";else Tipot="Tc";
                        Ejecutando.setText("Ejecutando tarea: "+tarea2.toString()+"Tipo "+Tipot);
                        Tiempobarra.setMaximum(tarea2.getTiempoEjecucion());
                        Tiempobarra.setValue(pro);
                        if (pro>=tarea2.getTiempoEjecucion()){ 
                            op=1;
                        }
                    }else pro=-1;
                    break;
                    case 1:
                        pro2++;
                        if (pilaTareas.isEmpty()==true && pro2==0){
                            Ejecutando.setText("Ejecutando tarea: NINGUNA");
                            Tiempobarra.setValue(0);
                            check=false;
                            pro=-1;
                            pro2=-1;
                            op=0;
                            break;
                        }
                        if (pilaTareas.isEmpty()==false) {
                            if (check2==false){
                            tarea2=pilaTareas.pop();
                            check2=true;}
                        }
                            if (tarea2.getTipo()==0)Tipot="Ts";else Tipot="Tc";
                            Ejecutando.setText("Ejecutando tarea: "+tarea2.toString()+"Tipo "+Tipot);
                            Tiempobarra.setMaximum(tarea2.getTiempoEjecucion());
                            Tiempobarra.setValue(pro2);
                            if (pro2==tarea2.getTiempoEjecucion()){check2=false;pro2=-1;}
                    break;
                }
            }
        };
        initComponents();
    }
Stack<Tarea> pilaTareas = new Stack<>();
latarea mate = new latarea();
latarea.Tarea tarea1, tarea2, tarea3;
Timer timer;
TimerTask timertask;
static int presionado=0, pro=-1, pro2=-1, op=0, x=0;
static boolean check=false, check2=false;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Titulo = new javax.swing.JLabel();
        Ts = new javax.swing.JLabel();
        Tc = new javax.swing.JLabel();
        Nombrets = new javax.swing.JTextField();
        TiempoTs = new javax.swing.JTextField();
        Nombretc = new javax.swing.JTextField();
        TiempoTc = new javax.swing.JTextField();
        Anadirts = new javax.swing.JButton();
        Anadirtc = new javax.swing.JButton();
        Iniciar = new javax.swing.JButton();
        Ejecutando = new javax.swing.JLabel();
        Tiempomostrar = new javax.swing.JLabel();
        Tiempobarra = new javax.swing.JProgressBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Titulo.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        Titulo.setText("Robot Explorador JAAM");

        Ts.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        Ts.setText("Tarea de Sensores Ts");

        Tc.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        Tc.setText("Tarea de Comunicaciones Tc");

        Nombrets.setFont(new java.awt.Font("Ebrima", 0, 12)); // NOI18N
        Nombrets.setText("Nombre");

        TiempoTs.setFont(new java.awt.Font("Ebrima", 0, 12)); // NOI18N
        TiempoTs.setText("Tiempo (seg)");

        Nombretc.setFont(new java.awt.Font("Ebrima", 0, 12)); // NOI18N
        Nombretc.setText("Nombre");

        TiempoTc.setFont(new java.awt.Font("Ebrima", 0, 12)); // NOI18N
        TiempoTc.setText("Tiempo (seg)");

        Anadirts.setFont(new java.awt.Font("Yu Gothic Light", 0, 10)); // NOI18N
        Anadirts.setText("Añadir Ts");
        Anadirts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AnadirtsActionPerformed(evt);
            }
        });

        Anadirtc.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 10)); // NOI18N
        Anadirtc.setText("Añadir Tc");
        Anadirtc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AnadirtcActionPerformed(evt);
            }
        });

        Iniciar.setFont(new java.awt.Font("Lucida Sans", 0, 18)); // NOI18N
        Iniciar.setText("INICIAR");
        Iniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IniciarActionPerformed(evt);
            }
        });

        Ejecutando.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        Ejecutando.setText("Ejecutando tarea: NINGUNA ");

        Tiempomostrar.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        Tiempomostrar.setText("Tiempo restante:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Ejecutando, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Ts)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(Titulo)
                        .addGap(160, 160, 160))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(Tc, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(Nombretc, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(TiempoTc, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(Nombrets, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(33, 33, 33)
                                        .addComponent(TiempoTs, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Anadirtc, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Anadirts, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Tiempomostrar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Tiempobarra, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                                .addComponent(Iniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(63, 63, 63))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Titulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Ts)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Nombrets, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TiempoTs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Anadirts, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(Tc)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Nombretc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TiempoTc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Anadirtc, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addComponent(Ejecutando)
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Iniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Tiempobarra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Tiempomostrar, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AnadirtsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AnadirtsActionPerformed
        String nombre;
        int tiempo, tipo;
        nombre=Nombrets.getText();
        tiempo=Integer.parseInt(TiempoTs.getText());
        tipo=0;
        tarea1 = mate.new Tarea(nombre, tiempo, tipo);
        if (check==true)
        pilaTareas.push(tarea1);
        else {tarea2 = tarea1; check=true;}
    }//GEN-LAST:event_AnadirtsActionPerformed

    private void AnadirtcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AnadirtcActionPerformed
        String nombre;
        int tiempo, tipo;
        nombre=Nombretc.getText();
        tiempo=Integer.parseInt(TiempoTc.getText());
        tipo=1;
        tarea1 = mate.new Tarea(nombre, tiempo, tipo);
        if (check==true)
        pilaTareas.push(tarea1);
        else {tarea2 = tarea1; check=true;}
    }//GEN-LAST:event_AnadirtcActionPerformed

    private void IniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IniciarActionPerformed
        presionado++;
        if (presionado==1){
        timer=new Timer();
        timer.scheduleAtFixedRate(timertask, 0, 1000);
        }
    }//GEN-LAST:event_IniciarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(RobotExplorador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RobotExplorador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RobotExplorador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RobotExplorador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RobotExplorador().setVisible(true);
            }
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Anadirtc;
    private javax.swing.JButton Anadirts;
    private javax.swing.JLabel Ejecutando;
    private javax.swing.JButton Iniciar;
    private javax.swing.JTextField Nombretc;
    private javax.swing.JTextField Nombrets;
    private javax.swing.JLabel Tc;
    private javax.swing.JTextField TiempoTc;
    private javax.swing.JTextField TiempoTs;
    private javax.swing.JProgressBar Tiempobarra;
    private javax.swing.JLabel Tiempomostrar;
    private javax.swing.JLabel Titulo;
    private javax.swing.JLabel Ts;
    // End of variables declaration//GEN-END:variables
}
