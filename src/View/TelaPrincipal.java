/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

/**
 *
 * @author Gabriel
 */
public class TelaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form TelaPrincipal
     */
    
    private int status;
    
    public TelaPrincipal() {
        initComponents();
        Medico.setVisible(false);
        Paciente.setVisible(false);
        Funcionario.setVisible(false);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        Cadastrar = new javax.swing.JButton();
        Procurar = new javax.swing.JButton();
        Medico = new javax.swing.JButton();
        Paciente = new javax.swing.JButton();
        Funcionario = new javax.swing.JButton();

        jButton2.setText("jButton2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Cadastrar.setText("Cadastro");
        Cadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadastrarActionPerformed(evt);
            }
        });

        Procurar.setText("Procurar");
        Procurar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProcurarActionPerformed(evt);
            }
        });

        Medico.setText("Médico");
        Medico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MedicoActionPerformed(evt);
            }
        });

        Paciente.setText("Paciente");
        Paciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PacienteActionPerformed(evt);
            }
        });

        Funcionario.setText("Funcionários");
        Funcionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FuncionarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(155, 155, 155)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Medico, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Cadastrar)
                            .addComponent(Paciente)
                            .addComponent(Procurar)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(147, 147, 147)
                        .addComponent(Funcionario)))
                .addContainerGap(160, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(Medico)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Cadastrar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Paciente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Procurar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Funcionario)
                .addContainerGap(117, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadastrarActionPerformed

        
        // Botão cadastro
        
        this.status = 0;
        
        Cadastrar.setVisible(false);
        Procurar.setVisible(false);
        
        Medico.setVisible(true);
        Paciente.setVisible(true);
        Funcionario.setVisible(true);
        

        
    }//GEN-LAST:event_CadastrarActionPerformed

    private void ProcurarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProcurarActionPerformed

        
        this.status = 1;
        
        Cadastrar.setVisible(false);
        Procurar.setVisible(false);
        
        Medico.setVisible(true);
        Paciente.setVisible(true);
        Funcionario.setVisible(true);


    }//GEN-LAST:event_ProcurarActionPerformed

    private void MedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MedicoActionPerformed


            if(this.status == 0)
            {
                // Cadastrar
                CadastroMedico cadastrarMedico = new CadastroMedico();
                cadastrarMedico.setVisible(true);
                
            }

            if(this.status == 1)
            {
                // Procurar
            }




    }//GEN-LAST:event_MedicoActionPerformed

    private void PacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PacienteActionPerformed
        
        
        if(this.status == 0)
        {
            
            CadastroPaciente cadastrarPaciente = new CadastroPaciente();
            cadastrarPaciente.setVisible(true);
        }
        
        
        
        
    }//GEN-LAST:event_PacienteActionPerformed

    private void FuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FuncionarioActionPerformed

        
        if(this.status == 0)
        {
            CadastroFuncionario cadastrarFuncionario = new CadastroFuncionario();
            cadastrarFuncionario.setVisible(true);
        }
        
        
        
    }//GEN-LAST:event_FuncionarioActionPerformed

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
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Cadastrar;
    private javax.swing.JButton Funcionario;
    private javax.swing.JButton Medico;
    private javax.swing.JButton Paciente;
    private javax.swing.JButton Procurar;
    private javax.swing.JButton jButton2;
    // End of variables declaration//GEN-END:variables
}
