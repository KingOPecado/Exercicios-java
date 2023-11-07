package lojavendedores;

import java.awt.Font;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import javax.swing.table.DefaultTableModel;

public class LojaVendedores extends javax.swing.JFrame {

    Vendedor vendedores[] = new Vendedor[7];
    DefaultTableModel modelo = new DefaultTableModel();
   
    public LojaVendedores() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaVendedores = new javax.swing.JTable();
        exibirDados = new javax.swing.JButton();
        botaoCalculaSalario = new javax.swing.JButton();
        glennButton = new javax.swing.JRadioButton();
        botaoCalculaMediaSalario = new javax.swing.JButton();
        lableMediaSalario = new javax.swing.JLabel();
        inputCategoria = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        labelPorcentagemVendedores = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tabelaVendedores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nome", "Salario base", "Valor Vendas", "Categorias"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Double.class, java.lang.Double.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelaVendedores.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tabelaVendedores.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tabelaVendedores);
        if (tabelaVendedores.getColumnModel().getColumnCount() > 0) {
            tabelaVendedores.getColumnModel().getColumn(0).setResizable(false);
            tabelaVendedores.getColumnModel().getColumn(1).setResizable(false);
            tabelaVendedores.getColumnModel().getColumn(2).setResizable(false);
            tabelaVendedores.getColumnModel().getColumn(3).setResizable(false);
        }

        exibirDados.setText("Exibir dados:");
        exibirDados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exibirDadosActionPerformed(evt);
            }
        });

        botaoCalculaSalario.setText("Calcular Salário");
        botaoCalculaSalario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCalculaSalarioActionPerformed(evt);
            }
        });

        glennButton.setText("Glenn Button (não aperte)");
        glennButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                glennButtonActionPerformed(evt);
            }
        });

        botaoCalculaMediaSalario.setText("Media Salários Base :");
        botaoCalculaMediaSalario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCalculaMediaSalarioActionPerformed(evt);
            }
        });

        inputCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputCategoriaActionPerformed(evt);
            }
        });
        inputCategoria.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                inputCategoriaKeyPressed(evt);
            }
        });

        jLabel1.setText("Digite a categoria");

        jLabel2.setText("Porcentagem de vendedores: ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(exibirDados)
                        .addGap(18, 18, 18)
                        .addComponent(botaoCalculaSalario)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 252, Short.MAX_VALUE)
                        .addComponent(glennButton)
                        .addGap(62, 62, 62))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(labelPorcentagemVendedores, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(inputCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 471, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(botaoCalculaMediaSalario)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(jLabel1)))
                                .addGap(37, 37, 37)
                                .addComponent(lableMediaSalario, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(exibirDados)
                    .addComponent(glennButton)
                    .addComponent(botaoCalculaSalario))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(botaoCalculaMediaSalario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lableMediaSalario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(28, 28, 28)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inputCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(labelPorcentagemVendedores, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(156, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exibirDadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exibirDadosActionPerformed
        modelo.addColumn("Nome");
        modelo.addColumn("Salario Base");
        modelo.addColumn("Valor Vendas");
        modelo.addColumn("Categoria");
        
        try(Scanner scan = new Scanner(new File("Dados.txt"))) {
            
            for (int i = 0; i < vendedores.length; i++) {
                vendedores[i] = new Vendedor(scan.next(), scan.nextDouble(), scan.nextDouble(), scan.next().charAt(0));
            }
            
            for (Vendedor vendedor : vendedores) {
                Object[] linha = {vendedor.getNome(), String.format("%.2f", vendedor.getSalarioBase()), String.format("%.2f", vendedor.getVendas()), vendedor.getCategoria()};
                modelo.addRow(linha);
            }
            
        tabelaVendedores.setModel(modelo);
            
        } catch (FileNotFoundException e) {
            System.out.println("Deu merda");
        }
        
       
    }//GEN-LAST:event_exibirDadosActionPerformed

    private void botaoCalculaSalarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCalculaSalarioActionPerformed
        String nomeNovaColuna = "Salário Final";
        modelo.addColumn(nomeNovaColuna);
        int colunaSalarioFinal = modelo.findColumn(nomeNovaColuna);
        
        for (int i = 0; i < vendedores.length; i++) {
            modelo.setValueAt(String.format("%.2f", vendedores[i].calcularSalarioFinal()), i, colunaSalarioFinal);
        }
        
        tabelaVendedores.setModel(modelo);
    }//GEN-LAST:event_botaoCalculaSalarioActionPerformed

    private void glennButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_glennButtonActionPerformed
        if (glennButton.isSelected()) {
            glennButton.setText("GLENN EXCEPTION AAAAAAA");
        } else {
            glennButton.setText("Glenn Button (não aperte)");
        }
    }//GEN-LAST:event_glennButtonActionPerformed

    private void botaoCalculaMediaSalarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCalculaMediaSalarioActionPerformed
        
      double somaSalarios = 0;
      double mediaSalarios = 0;
      
        for (Vendedor vendedor : vendedores) {
            somaSalarios += vendedor.getSalarioBase();
        }
        
        mediaSalarios = somaSalarios/vendedores.length;
        lableMediaSalario.setFont(new Font("Arial", Font.PLAIN, 20));
        lableMediaSalario.setText(String.format("R$ %.2f", mediaSalarios));
    }//GEN-LAST:event_botaoCalculaMediaSalarioActionPerformed

    private void inputCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputCategoriaActionPerformed
       
    }//GEN-LAST:event_inputCategoriaActionPerformed

    private void inputCategoriaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_inputCategoriaKeyPressed
       
        int contador = 0;
        
        for (int i = 0; i < vendedores.length; i++) {
            if (vendedores[i].getCategoria() == inputCategoria.getText().charAt(0)) {
                contador++;
            }
        }
        
        double porcentagemCategoria = (double)contador/vendedores.length*100;
        labelPorcentagemVendedores.setText(String.format("%.2f", porcentagemCategoria));
        
    }//GEN-LAST:event_inputCategoriaKeyPressed

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
            java.util.logging.Logger.getLogger(LojaVendedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LojaVendedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LojaVendedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LojaVendedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LojaVendedores().setVisible(true);
            }
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoCalculaMediaSalario;
    private javax.swing.JButton botaoCalculaSalario;
    private javax.swing.JButton exibirDados;
    private javax.swing.JRadioButton glennButton;
    private javax.swing.JTextField inputCategoria;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelPorcentagemVendedores;
    private javax.swing.JLabel lableMediaSalario;
    private javax.swing.JTable tabelaVendedores;
    // End of variables declaration//GEN-END:variables
}
