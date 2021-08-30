package com.andre.usuariossql.view;

import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;
import java.util.Locale;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

/**
 * 
 *
 * @author lucas
 */
public class TelaPrincipal extends javax.swing.JFrame {

    public TelaPrincipal() {
        initComponents();
        Locale locale = new Locale("pt","BR"); 
        GregorianCalendar calendar = new GregorianCalendar();
        SimpleDateFormat dataHora = new SimpleDateFormat("dd' de 'MMMMM' de 'yyyy' - 'HH':'mm'.'",locale); 
        lblData.setText("Nova Marilandia-MT, "+dataHora.format(calendar.getTime()));
        UIManager.put("OptionPane.yesButtonText", "Sim"); 
        UIManager.put("OptionPane.noButtonText", "Não"); 
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        toolBar = new javax.swing.JToolBar();
        btSair = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        desktopPane = new javax.swing.JDesktopPane();
        lblNome = new javax.swing.JLabel();
        lblData = new javax.swing.JLabel();
        menuBar = new javax.swing.JMenuBar();
        mFerramentas = new javax.swing.JMenu();
        miTestarConexao = new javax.swing.JMenuItem();
        mSistema = new javax.swing.JMenu();
        miSair = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema Empresarial");
        setIconImages(null);

        toolBar.setFloatable(false);

        btSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/sair.png"))); // NOI18N
        btSair.setText("Sair");
        btSair.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btSair.setFocusable(false);
        btSair.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btSair.setMargin(new java.awt.Insets(2, 12, 2, 12));
        btSair.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/sair.png"))); // NOI18N
        btSair.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miSairActionPerformed(evt);
            }
        });
        toolBar.add(btSair);

        jButton1.setText("Usuarios");
        jButton1.setFocusable(false);
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        toolBar.add(jButton1);

        getContentPane().add(toolBar, java.awt.BorderLayout.PAGE_START);

        desktopPane.setOpaque(false);

        lblNome.setText(".");
        desktopPane.add(lblNome);
        lblNome.setBounds(790, 580, 160, 14);

        lblData.setText("........");
        desktopPane.add(lblData);
        lblData.setBounds(670, 600, 310, 14);

        getContentPane().add(desktopPane, java.awt.BorderLayout.CENTER);

        mFerramentas.setText("Ferramentas");

        miTestarConexao.setText("Testar Conexão");
        miTestarConexao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miTestarConexaoActionPerformed(evt);
            }
        });
        mFerramentas.add(miTestarConexao);

        menuBar.add(mFerramentas);

        mSistema.setText("Sistema");

        miSair.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_DOWN_MASK));
        miSair.setText("Sair");
        miSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miSairActionPerformed(evt);
            }
        });
        mSistema.add(miSair);

        menuBar.add(mSistema);

        setJMenuBar(menuBar);

        setSize(new java.awt.Dimension(589, 627));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void miSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miSairActionPerformed
        int q = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja sair do sistema?", "Atenção",JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
        if (q==JOptionPane.YES_OPTION){
            System.exit(0);
        }
    }//GEN-LAST:event_miSairActionPerformed

    private void miTestarConexaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miTestarConexaoActionPerformed
        TestaConexao c = new TestaConexao();
        desktopPane.add(c);
        c.setVisible(true);
    }//GEN-LAST:event_miTestarConexaoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        TelaUsuarios c = new TelaUsuarios();
        desktopPane.add(c);
        c.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btSair;
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel lblData;
    public javax.swing.JLabel lblNome;
    private javax.swing.JMenu mFerramentas;
    private javax.swing.JMenu mSistema;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenuItem miSair;
    private javax.swing.JMenuItem miTestarConexao;
    private javax.swing.JToolBar toolBar;
    // End of variables declaration//GEN-END:variables
}
