
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.JOptionPane;
import java.util.Random;

public class manejo_Cola extends javax.swing.JFrame {

    Cola_Banco Cola  = new Cola_Banco (5);
    Cola_Banco Cola2 = new Cola_Banco (10);
    int cont1 = 1;
    int cont2 = 1;
    public manejo_Cola() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField2 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jtxtCola = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jtxtCola2 = new javax.swing.JTextField();
        jtxtDatoDesencolado = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jtxtDato = new javax.swing.JTextField();
        jbtnDesencolar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jtxtNoTrans = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jtxtTTrans = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();

        jTextField2.setText("jTextField2");
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("Agregar VIP");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Agregar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel1.setText("_______________________________________________________________________");

        jLabel2.setText("Turno de:");

        jLabel3.setText("Elemento a encolar:");

        jbtnDesencolar.setText("Siguiente");
        jbtnDesencolar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDesencolarActionPerformed(evt);
            }
        });

        jLabel4.setText("Número de transacciones:");

        jLabel5.setText("Tiempo por transaccion:");

        jLabel6.setText("mins.");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jbtnDesencolar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel2))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel4))))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtxtDatoDesencolado, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jtxtTTrans, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                                    .addComponent(jtxtNoTrans, javax.swing.GroupLayout.Alignment.LEADING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel6))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jtxtDato, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtxtCola, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jtxtCola2))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtxtDatoDesencolado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jbtnDesencolar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jtxtNoTrans, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jtxtTTrans, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtxtCola, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jtxtCola2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jtxtDato, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       if (Cola.encolar(jtxtDato.getText()))
       {
       datosCola();
       }
       else JOptionPane.showMessageDialog(this, "La Cola esta llena el cliente no quizo esperar :(");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if (Cola2.encolar2(jtxtDato.getText()))
       {
       datosCola2();
       }
       else JOptionPane.showMessageDialog(this, "La Cola esta llena el cliente no quizo esperar :("); 
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jbtnDesencolarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDesencolarActionPerformed
        if (!Cola.estaVacia() && cont1<=3){   
        jtxtDatoDesencolado.setText(Cola.desencolar());
        datosCola();   
        }
       
        else if(!Cola2.estaVacia() && cont2 <=2){
            jtxtDatoDesencolado.setText(Cola2.desencolar2());
            datosCola2();
        }   
        Random rnd = new Random();
        int a=rnd.nextInt(100-10+1)+10;
        int b=rnd.nextInt(5-1+1)+1;
    jtxtNoTrans.setText(String.valueOf(a));
    jtxtTTrans.setText(String.valueOf(b));
    //------------TIMER---------------
    Timer timer;
    timer = new Timer();

    TimerTask task = new TimerTask() {

        public void run()
        {
            if (!Cola.estaVacia()){
        Cola.desencolar();
        datosCola(); }
            else if(!Cola2.estaVacia()){
        Cola2.desencolar2();
        datosCola2();}
        }
        };
        // Empezamos dentro de 10ms y luego lanzamos la tarea cada 1000ms

    //rnd.nextInt(HASTA-DESDE+1)+DESDE
    timer.schedule(task, rnd.nextInt(5000-1000+1)+1000, rnd.nextInt(5000-1000+1)+1000);
    
    
    }//GEN-LAST:event_jbtnDesencolarActionPerformed

    private void datosCola()
    {
        jtxtCola.setText("");
        for (int i=Cola.frente; i<= Cola.ultimo; i++)
        {
            jtxtCola.setText(jtxtCola.getText()+" "+Cola.COLA[i]);
        }
    }
     private void datosCola2()
     {
             jtxtCola2.setText("");
        for (int i=Cola2.frente; i<= Cola2.ultimo; i++)
        {
            jtxtCola2.setText(jtxtCola2.getText()+" "+Cola2.COLA2[i]);
        }
     }
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new manejo_Cola().setVisible(true);
            }
        });
        }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JButton jbtnDesencolar;
    private javax.swing.JTextField jtxtCola;
    private javax.swing.JTextField jtxtCola2;
    private javax.swing.JTextField jtxtDato;
    private javax.swing.JTextField jtxtDatoDesencolado;
    private javax.swing.JTextField jtxtNoTrans;
    private javax.swing.JTextField jtxtTTrans;
    // End of variables declaration//GEN-END:variables
}
