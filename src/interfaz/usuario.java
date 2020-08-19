/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import auxiliares.archivos;
import auxiliares.clienteRegistrado;
import estructuras.ListaDoble;
import estructuras.Vector;
import java.awt.Image;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author CARLOS
 */
public class usuario extends javax.swing.JFrame {
    /**
     * Creates new form usuario
     */
    public usuario() {
        initComponents();
        fondo();
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
        jEditorPane1 = new javax.swing.JEditorPane();
        jProgressBar1 = new javax.swing.JProgressBar();
        correo1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        subtitulo = new javax.swing.JLabel();
        nombre = new javax.swing.JLabel();
        apellido = new javax.swing.JLabel();
        fechaNacimiento = new javax.swing.JLabel();
        dia = new javax.swing.JComboBox<>();
        mes = new javax.swing.JComboBox<>();
        año = new javax.swing.JComboBox<>();
        documento = new javax.swing.JLabel();
        correo = new javax.swing.JLabel();
        contraseña = new javax.swing.JLabel();
        contraseñaA = new javax.swing.JLabel();
        password = new javax.swing.JPasswordField();
        password2 = new javax.swing.JPasswordField();
        nombre_Text = new javax.swing.JTextField();
        dni_Text = new javax.swing.JTextField();
        correo_Text = new javax.swing.JTextField();
        apellido_Text = new javax.swing.JTextField();
        datos = new javax.swing.JLabel();
        aceptar = new javax.swing.JButton();
        salir = new javax.swing.JButton();
        foto = new javax.swing.JLabel();
        cargar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        jScrollPane1.setViewportView(jEditorPane1);

        correo1.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        correo1.setText("Correo electrónico : ");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        subtitulo.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        subtitulo.setForeground(new java.awt.Color(255, 255, 255));
        subtitulo.setText("Datos de inicio de sesión ");

        nombre.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        nombre.setForeground(new java.awt.Color(255, 255, 255));
        nombre.setText("Nombre :");

        apellido.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        apellido.setForeground(new java.awt.Color(255, 255, 255));
        apellido.setText("Apellido :");

        fechaNacimiento.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        fechaNacimiento.setForeground(new java.awt.Color(255, 255, 255));
        fechaNacimiento.setText("Fecha de nacimiento : ");

        dia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", " " }));

        mes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "setiembre", "octubre", "noviembre", "diciembre" }));

        año.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2016\t", "2015", "2014", "2013", "2012", "2011", "2010", "2009", "2008", "2007", "2006", "2005", "2004", "2003", "2002", "2001", "2000", "1999", "1998", "1997", "1996", "1995", "1994", "1993", "1992", "1991", "1990", "1989", "1988", "1987" }));

        documento.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        documento.setForeground(new java.awt.Color(255, 255, 255));
        documento.setText("DNI: ");

        correo.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        correo.setForeground(new java.awt.Color(255, 255, 255));
        correo.setText("Correo electrónico : ");

        contraseña.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        contraseña.setForeground(new java.awt.Color(255, 255, 255));
        contraseña.setText("Contraseña :");

        contraseñaA.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        contraseñaA.setForeground(new java.awt.Color(255, 255, 255));
        contraseñaA.setText("Repita contraseña : ");

        dni_Text.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dni_TextActionPerformed(evt);
            }
        });

        datos.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        datos.setForeground(new java.awt.Color(255, 255, 255));
        datos.setText("Tus datos");

        aceptar.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        aceptar.setText("Crear cuenta");
        aceptar.setFocusable(false);
        aceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aceptarActionPerformed(evt);
            }
        });

        salir.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        salir.setText("Cancelar");
        salir.setFocusable(false);
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });

        foto.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));

        cargar.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        cargar.setText("Cargar foto");
        cargar.setFocusable(false);
        cargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cargarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(274, 274, 274)
                .addComponent(jLabel1))
            .addGroup(layout.createSequentialGroup()
                .addGap(260, 260, 260)
                .addComponent(apellido_Text, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(260, 260, 260)
                .addComponent(dia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(mes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(subtitulo))
            .addGroup(layout.createSequentialGroup()
                .addGap(415, 415, 415)
                .addComponent(salir))
            .addGroup(layout.createSequentialGroup()
                .addGap(414, 414, 414)
                .addComponent(año, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(documento))
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(contraseña))
            .addGroup(layout.createSequentialGroup()
                .addGap(260, 260, 260)
                .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(554, 554, 554)
                .addComponent(foto, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(609, 609, 609)
                .addComponent(cargar))
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(datos, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(correo))
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(apellido, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(contraseñaA))
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(fechaNacimiento))
            .addGroup(layout.createSequentialGroup()
                .addGap(260, 260, 260)
                .addComponent(correo_Text, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(260, 260, 260)
                .addComponent(password2, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(260, 260, 260)
                .addComponent(dni_Text, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(260, 260, 260)
                .addComponent(aceptar))
            .addGroup(layout.createSequentialGroup()
                .addGap(260, 260, 260)
                .addComponent(nombre_Text, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addComponent(jLabel1)
                .addGap(87, 87, 87)
                .addComponent(apellido_Text, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(83, 83, 83)
                .addComponent(subtitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(201, 201, 201)
                .addComponent(salir))
            .addGroup(layout.createSequentialGroup()
                .addGap(243, 243, 243)
                .addComponent(año, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(111, 111, 111)
                .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(300, 300, 300)
                .addComponent(documento))
            .addGroup(layout.createSequentialGroup()
                .addGap(470, 470, 470)
                .addComponent(contraseña))
            .addGroup(layout.createSequentialGroup()
                .addGap(469, 469, 469)
                .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(96, 96, 96)
                .addComponent(foto, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(368, 368, 368)
                .addComponent(cargar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(datos, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(410, 410, 410)
                .addComponent(correo))
            .addGroup(layout.createSequentialGroup()
                .addGap(175, 175, 175)
                .addComponent(apellido, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(529, 529, 529)
                .addComponent(contraseñaA))
            .addGroup(layout.createSequentialGroup()
                .addGap(240, 240, 240)
                .addComponent(fechaNacimiento))
            .addGroup(layout.createSequentialGroup()
                .addGap(410, 410, 410)
                .addComponent(correo_Text, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(527, 527, 527)
                .addComponent(password2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(300, 300, 300)
                .addComponent(dni_Text, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(593, 593, 593)
                .addComponent(aceptar))
            .addGroup(layout.createSequentialGroup()
                .addGap(113, 113, 113)
                .addComponent(nombre_Text, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 680, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void fondo(){
        ImageIcon promo=new ImageIcon(getClass().getResource("/imagenes/fondoUsuario.jpg"));
        ImageIcon icono=new ImageIcon(promo.getImage().getScaledInstance(jLabel2.getWidth(),jLabel2.getHeight(),Image.SCALE_DEFAULT));
        jLabel2.setIcon(icono);
    }
    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        usuario.this.setVisible(false);
        menuCliente m=new menuCliente();
        m.setVisible(true);
        m.setLocationRelativeTo(null);
    }//GEN-LAST:event_salirActionPerformed
    
    ListaDoble<clienteRegistrado> registro=new ListaDoble<>();
    private void aceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aceptarActionPerformed
        if(nombre_Text.getText().isEmpty() || dni_Text.getText().isEmpty() || correo_Text.getText().isEmpty() || apellido_Text.getText().isEmpty() || password.getText().trim().isEmpty() || password2.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(null, "ALGUN CAMPO ESTA VACIO");
        }
        else{
            try {
                Pattern pat=Pattern.compile("^[\\w-]+(\\.[\\w-]+)*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
                Matcher mat=pat.matcher(correo_Text.getText());
                FileReader nb = new FileReader("bandera2.txt");
                BufferedReader a = new BufferedReader(nb); 
                String lec=a.readLine();
                a.close();
                if(lec.equals("Si")){
                    clienteRegistrado cli=new clienteRegistrado();
                    if(dni_Text.getText().length()==8 && mat.find()==true && password.getText().equals(password2.getText()) ){
                        cli.setNombre(nombre_Text.getText()+" "+apellido_Text.getText());
                        cli.setDni(Integer.parseInt(dni_Text.getText()));
                        cli.setFnacimiento(String.valueOf(dia.getSelectedItem())+"/"+String.valueOf(mes.getSelectedItem())+"/"+String.valueOf(año.getSelectedItem()));
                        cli.setCorreo(correo_Text.getText());
                        cli.setContra(password.getText().trim());
                        cli.setRepetición(password2.getText().trim());
                        archivos archi=new archivos();
                        registro.insertarFinal(cli);
                        archi.guardarCliente(registro);
                        FileWriter sc = new FileWriter("bandera2.txt");
                        BufferedWriter c = new BufferedWriter(sc);
                        c.write("No");
                        c.close();
                        JOptionPane.showMessageDialog(this, "Registro Correcto");
                        sitioWeb2 ax=new sitioWeb2(cli);
                        ax.setVisible(true);
                        ax.setLocationRelativeTo(null);
                        this.setVisible(false);
                    }
                    else{
                        if(dni_Text.getText().length()!=8){
                            JOptionPane.showMessageDialog(this, "Número de DNI incorrecto.");
                        }
                        if(mat.find()==false){
                            JOptionPane.showMessageDialog(this, "Correo inválido.");
                        }
                        if(password.getText()!=password2.getText()){
                            JOptionPane.showMessageDialog(this, "Las contraseñas no coinciden.");
                        }
                    }                   
                }
                else{
                    archivos ar=new archivos();
                    registro=ar.cargarCliente();
                    if(dni_Text.getText().length()==8 && mat.find()==true&& password.getText().equals(password2.getText()) ){
                        clienteRegistrado cli=new clienteRegistrado();
                        cli.setNombre(nombre_Text.getText()+" "+apellido_Text.getText());
                        cli.setDni(Integer.parseInt(dni_Text.getText()));
                        cli.setCorreo(correo_Text.getText());
                        cli.setFnacimiento(String.valueOf(dia.getSelectedItem())+"/"+String.valueOf(mes.getSelectedItem())+"/"+String.valueOf(año.getSelectedItem()));
                        cli.setContra(password.getText().trim());
                        cli.setRepetición(password2.getText().trim());
                        registro.insertarFinal(cli);
                        ar.guardarCliente(registro);
                        JOptionPane.showMessageDialog(this, "Registro Correcto");
                        sitioWeb2 ax=new sitioWeb2(cli);
                        ax.setVisible(true);
                        ax.setLocationRelativeTo(null);
                        this.setVisible(false);
                    }
                    else{
                        if(dni_Text.getText().length()!=8){
                            JOptionPane.showMessageDialog(this, "Número de DNI incorrecto.");
                        }
                        if(mat.find()==false && password.getText()==password2.getText()){
                            JOptionPane.showMessageDialog(this, "Correo inválido.");
                        }
                        if(password.getText()!=password2.getText()){
                            JOptionPane.showMessageDialog(this, "Las contraseñas no coinciden.");
                        }
                    }
                    
                }
            } catch (FileNotFoundException ex) {
                Logger.getLogger(usuario.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException | ClassNotFoundException ex) {
                Logger.getLogger(usuario.class.getName()).log(Level.SEVERE, null, ex);
            } catch (NumberFormatException ex){
                JOptionPane.showMessageDialog(this, "No ingrese caracteres en el campo DNI");
            }
        }
    }//GEN-LAST:event_aceptarActionPerformed
    File fichero;
    private void cargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cargarActionPerformed
        int resultado;
        cargaFotos ventana=new cargaFotos();
        FileNameExtensionFilter filtro=new FileNameExtensionFilter("JPG y PNG","jpg","png");
        ventana.jFileChooser1.setFileFilter(filtro);
        resultado=ventana.jFileChooser1.showOpenDialog(null);
        if(JFileChooser.APPROVE_OPTION==resultado){
            fichero=ventana.jFileChooser1.getSelectedFile();
            try{
                ImageIcon icon=new ImageIcon(fichero.toString());
                Icon icono=new ImageIcon(icon.getImage().getScaledInstance(foto.getWidth(),foto.getHeight() , Image.SCALE_DEFAULT));
                foto.setText(null);
                foto.setIcon(icono);
            }catch(Exception ex){
                JOptionPane.showMessageDialog(null,"Error abriendo la imagen"+ex);
            }
        }
    }//GEN-LAST:event_cargarActionPerformed

    private void dni_TextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dni_TextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dni_TextActionPerformed

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
            java.util.logging.Logger.getLogger(usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new usuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton aceptar;
    private javax.swing.JLabel apellido;
    private javax.swing.JTextField apellido_Text;
    private javax.swing.JComboBox<String> año;
    private javax.swing.JButton cargar;
    private javax.swing.JLabel contraseña;
    private javax.swing.JLabel contraseñaA;
    private javax.swing.JLabel correo;
    private javax.swing.JLabel correo1;
    private javax.swing.JTextField correo_Text;
    private javax.swing.JLabel datos;
    private javax.swing.JComboBox<String> dia;
    private javax.swing.JTextField dni_Text;
    private javax.swing.JLabel documento;
    private javax.swing.JLabel fechaNacimiento;
    private javax.swing.JLabel foto;
    private javax.swing.JEditorPane jEditorPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> mes;
    private javax.swing.JLabel nombre;
    private javax.swing.JTextField nombre_Text;
    private javax.swing.JPasswordField password;
    private javax.swing.JPasswordField password2;
    private javax.swing.JButton salir;
    private javax.swing.JLabel subtitulo;
    // End of variables declaration//GEN-END:variables
}