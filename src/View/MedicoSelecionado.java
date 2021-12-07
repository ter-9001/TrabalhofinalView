package View;

import Control.MedicoControl;
//import Model.Aluno;
import java.util.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class MedicoSelecionado extends javax.swing.JFrame {

    private MedicoControl controlador; // cria o v�nculo com o controlador
    
    
   
    
    
    
    public MedicoSelecionado() {
        initComponents();
        setLocationRelativeTo(null);
        this.controlador = new MedicoControl(); // carrega controlador de aluno
        this.carregaTabela();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTableAlunos = new javax.swing.JTable();
        b_alterar = new javax.swing.JButton();
        b_apagar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        c_nome = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        c_CRM = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        c_especialidade = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        c_periodo_de_atendimento = new javax.swing.JTextField();
        c_telefone = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();

        setTitle("Paciente Selecionado");
        setResizable(false);

        jTableAlunos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null}
            },
            new String [] {
                "Id", "Nome", "CRM", "Especialidade", "Telefone", "Período de Atendimento"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableAlunos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableAlunosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableAlunos);
        if (jTableAlunos.getColumnModel().getColumnCount() > 0) {
            jTableAlunos.getColumnModel().getColumn(1).setMinWidth(200);
            jTableAlunos.getColumnModel().getColumn(2).setMinWidth(30);
            jTableAlunos.getColumnModel().getColumn(3).setMinWidth(100);
        }

        b_alterar.setText("Alterar");
        b_alterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_alterarActionPerformed(evt);
            }
        });

        b_apagar.setText("Apagar");
        b_apagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_apagarActionPerformed(evt);
            }
        });

        jLabel1.setText("Nome:");

        jLabel2.setText("CRM:");

        jLabel3.setText("Telefone:");

        jLabel4.setText("Período de Atendimento");

        jLabel5.setText("Especialidade:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(187, 187, 187)
                        .addComponent(b_alterar)
                        .addGap(251, 251, 251)
                        .addComponent(b_apagar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(290, 290, 290)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(c_CRM, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(c_nome, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(c_periodo_de_atendimento, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(c_telefone, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(c_especialidade, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 780, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(c_nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(c_CRM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(jLabel5)
                .addGap(2, 2, 2)
                .addComponent(c_especialidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(c_telefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(c_periodo_de_atendimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(b_alterar)
                    .addComponent(b_apagar))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void b_alterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_alterarActionPerformed

        try {
            // recebendo e validando dados da interface gr�fica.
            int id = 0;
            String nome = "";
            String crm = "";
            String telefone = "";
            String periodo_de_atendimento = "";
            String especialidade = "";
            int teste;
            
            if (this.c_nome.getText().length() < 2) {
                throw new Mensagens("Nome deve conter ao menos 2 caracteres.");
            } else {
                nome = this.c_nome.getText();
            }

            if (this.c_CRM.getText().length() <= 2) {
                throw new Mensagens("CRM deve possuir ao menos 2 caracteres numéricos.");
            } else {
               crm = this.c_CRM.getText();
               //teste = Integer.parseInt(this.c_CRM.getText());
            }
            
            
            if (this.c_especialidade.getText().length() < 2) {
                throw new Mensagens("Especialidade deve conter ao menos 2 caracteres.");
            } else {
                especialidade = this.c_especialidade.getText();
            }

            if (this.c_telefone.getText().length() < 2) {
                throw new Mensagens("Telefone deve conter ao menos 2 caracteres numéricos.");
            } else {
                telefone = this.c_telefone.getText();
            }

            if ( !this.c_periodo_de_atendimento.getText().equals("Manhã")  && !this.c_periodo_de_atendimento.getText().equals("Tarde")) {
                throw new Mensagens("Período de Atedimento deve ser\n Manhã ou Tarde");
            } else {
                periodo_de_atendimento = this.c_periodo_de_atendimento.getText();
            }

            if (this.jTableAlunos.getSelectedRow() == -1) {
                throw new Mensagens("Primeiro toque em uma linha da Tabela para Alterar");
            } else {
                id = Integer.parseInt(this.jTableAlunos.getValueAt(this.jTableAlunos.getSelectedRow(), 0).toString());
            }
            
            // envia os dados para o Controlador processar
            if (this.controlador.Editar(nome, crm, id, especialidade,  periodo_de_atendimento, telefone)) {

                // limpa os campos
                this.c_nome.setText("");
                this.c_CRM.setText("");
                this.c_telefone.setText("");
                this.c_especialidade.setText("");
                this.c_periodo_de_atendimento.setText("");
                JOptionPane.showMessageDialog(rootPane, "Médico Alterado com Sucesso!");

            }
            System.out.println(this.controlador.getMinhaLista().toString());
        } catch (Mensagens erro) {
            JOptionPane.showMessageDialog(null, erro.getMessage());
        } catch (NumberFormatException erro2) {
            JOptionPane.showMessageDialog(null, "Informe um número.");
        } finally {
            carregaTabela(); // atualiza a tabela.
        }
    }//GEN-LAST:event_b_alterarActionPerformed

    private void jTableAlunosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableAlunosMouseClicked

        if (this.jTableAlunos.getSelectedRow() != -1) {

            String nome = this.jTableAlunos.getValueAt(this.jTableAlunos.getSelectedRow(), 1).toString();
            String crm = this.jTableAlunos.getValueAt(this.jTableAlunos.getSelectedRow(), 2).toString();
            String especialidade = this.jTableAlunos.getValueAt(this.jTableAlunos.getSelectedRow(), 3).toString();
            String telefone = this.jTableAlunos.getValueAt(this.jTableAlunos.getSelectedRow(), 4).toString();
            String periodo_de_atendimento = this.jTableAlunos.getValueAt(this.jTableAlunos.getSelectedRow(), 5).toString();
            
            

            this.c_nome.setText(nome);
            this.c_CRM.setText(crm);
            this.c_especialidade.setText(especialidade);
            this.c_telefone.setText(telefone);
            this.c_periodo_de_atendimento.setText(periodo_de_atendimento);

        }
    }//GEN-LAST:event_jTableAlunosMouseClicked

    private void b_apagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_apagarActionPerformed
        // validando dados da interface gr�fica.
        
        // envia os dados para o Controlador processar
        
         try {
            // validando dados da interface gr�fica.
            int id = 0;
            if (this.jTableAlunos.getSelectedRow() == -1) {
                throw new Mensagens("Médico Selecione um Paciente para APAGAR");
            } else {
                id = Integer.parseInt(this.jTableAlunos.getValueAt(this.jTableAlunos.getSelectedRow(), 0).toString());
            }

            // retorna 0 -> primeiro bot�o | 1 -> segundo bot�o | 2 -> terceiro bot�o
            int resposta_usuario = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja APAGAR este Médico ?");

            if (resposta_usuario == 0) {// clicou em SIM

                // envia os dados para o Controlador processar
                if (this.controlador.Apagar(id)) {

                    // limpa os campos
                    this.c_nome.setText("");
                    this.c_CRM.setText("");
                    this.c_especialidade.setText("");
                    this.c_periodo_de_atendimento.setText("");
                    JOptionPane.showMessageDialog(rootPane, "Médico Apagado com Sucesso!");

                }

            }

            System.out.println(this.controlador.getMinhaLista().toString());

        } catch (Mensagens erro) {
            JOptionPane.showMessageDialog(null, erro.getMessage());
        } finally {
            // atualiza a tabela.
            carregaTabela();
        }

    }//GEN-LAST:event_b_apagarActionPerformed

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("unchecked")
    public void carregaTabela() {

       DefaultTableModel modelo = (DefaultTableModel) this.jTableAlunos.getModel();
        modelo.setNumRows(0);
        
        

        String linhasMatriz[][] = controlador.getMinhaMatrizTexto();
        for (int i = 0; i < linhasMatriz.length; i++) {
            modelo.addRow(
                    
            new Object[]{
                linhasMatriz[i][0],
                linhasMatriz[i][1],
                linhasMatriz[i][3],
                linhasMatriz[i][4],
                linhasMatriz[i][2],
                linhasMatriz[i][5]
             }
            
            
            );

        }

// � poss�vel manipular diretamente um objeto de Aluno, por�m, 
// tal a��o quebra o fluxo esperado.
// MVC Cl�ssico permite.

//        ArrayList<Aluno> minhalista = new ArrayList<>();
//        minhalista = controlador.getMinhaLista();
//
//        for (Aluno a : minhalista) {
//            modelo.addRow(new Object[]{
//                a.getId(),
//                a.getNome(),
//                a.getIdade(),
//                a.getCurso(),
//                a.getFase()
//            });
//        }
    }

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
            java.util.logging.Logger.getLogger(MedicoSelecionado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MedicoSelecionado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MedicoSelecionado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MedicoSelecionado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MedicoSelecionado().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b_alterar;
    private javax.swing.JButton b_apagar;
    private javax.swing.JTextField c_CRM;
    private javax.swing.JTextField c_especialidade;
    private javax.swing.JTextField c_nome;
    private javax.swing.JTextField c_periodo_de_atendimento;
    private javax.swing.JTextField c_telefone;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableAlunos;
    // End of variables declaration//GEN-END:variables
}
