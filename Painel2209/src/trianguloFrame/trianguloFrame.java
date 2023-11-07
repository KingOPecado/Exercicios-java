
package trianguloFrame;

import java.awt.Color;

public class trianguloFrame extends javax.swing.JFrame {

    public trianguloFrame() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jProgressBar1 = new javax.swing.JProgressBar();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        ladoA = new javax.swing.JTextField();
        ladoB = new javax.swing.JTextField();
        ladoC = new javax.swing.JTextField();
        classificar = new javax.swing.JButton();
        tipoTriangulo = new javax.swing.JLabel();
        areaTriangulo = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        limpar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Digite os lados:");

        jLabel2.setText("Lado1:");

        jLabel3.setText("Lado2:");

        jLabel4.setText("Lado3:");

        ladoA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ladoAActionPerformed(evt);
            }
        });

        ladoC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ladoCActionPerformed(evt);
            }
        });

        classificar.setText("Classificar");
        classificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                classificarActionPerformed(evt);
            }
        });

        tipoTriangulo.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N

        areaTriangulo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jRadioButton1.setText("Glenn Button (não aperte)");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        limpar.setText("Limpar 🧹");
        limpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limparActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ladoC, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(ladoA, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE)
                                    .addComponent(ladoB)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(classificar)
                                .addGap(18, 18, 18)
                                .addComponent(limpar))
                            .addComponent(jRadioButton1))
                        .addGap(51, 51, 51)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(areaTriangulo, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tipoTriangulo, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(62, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(tipoTriangulo, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(ladoA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(ladoB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(ladoC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(areaTriangulo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(classificar)
                    .addComponent(limpar, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jRadioButton1)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void classificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_classificarActionPerformed
        double a = Double.parseDouble(ladoA.getText());
        double b = Double.parseDouble(ladoB.getText());
        double c = Double.parseDouble(ladoC.getText());
        
        if (!isTriangle(a, b, c)) {
            tipoTriangulo.setForeground(Color.red);
            tipoTriangulo.setText("Não é um triangulo :("); 
            return;
        }
        
        tipoTriangulo.setForeground(Color.green);
        tipoTriangulo.setText(getTriangleType(a, b, c)); 
        areaTriangulo.setText("Área: " + String.format("%.2f", getTriangleArea(a, b, c)) + "cm²");
        
    }//GEN-LAST:event_classificarActionPerformed

    private void ladoAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ladoAActionPerformed
        
    }//GEN-LAST:event_ladoAActionPerformed

    private void ladoCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ladoCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ladoCActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        if (jRadioButton1.isSelected()) {
            jRadioButton1.setText("Glenn Exception 💥💥💥💥💥💥💥");
        } else {
            jRadioButton1.setText("Glenn Button (não aperte)");
        }
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void limparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limparActionPerformed
        ladoA.setText("");
        ladoB.setText("");
        ladoC.setText("");
        tipoTriangulo.setText("");
        areaTriangulo.setText("");
    }//GEN-LAST:event_limparActionPerformed
    
    public static boolean isTriangle(double a, double b, double c) {
        return ((a < b + c) && (b < a + c) && (c < a + b));
    }
    
    
    public static String getTriangleType(double a, double b, double c) {
        if (a == b && a == c) return "Equilátero";
        if (a == b || a == c || b == c) return "Isósceles";
        return "Escaleno";
    }
    
    public static double getTriangleArea(double a, double b, double c) {
        double p = (a + b + c) / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }
    
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new trianguloFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel areaTriangulo;
    private javax.swing.JButton classificar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JTextField ladoA;
    private javax.swing.JTextField ladoB;
    private javax.swing.JTextField ladoC;
    private javax.swing.JButton limpar;
    private javax.swing.JLabel tipoTriangulo;
    // End of variables declaration//GEN-END:variables
}
