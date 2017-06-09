/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Bussiness.PeliculaBussiness;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author andres
 */
public class InternalFrameInsertMovie extends JInternalFrame implements ActionListener{
    private JButton jtbnGuardar;
    private String mensaje;
    private PeliculaBussiness PeliculaBussiness;
    
    private JLabel jlbTitulo;
    private JLabel jlbGuardarNombreActor;
    private JLabel jlbGuardarApellidoActor;
    private JLabel jlbGuardarIdActor;
    
    private JTextField jtfGuardarNombreActor;
    private JTextField jtfGuardarApellidoActor;
    private JTextField jtfGuardarIdActor;
    
    
    public InternalFrameInsertMovie(){
        super();
        this.setSize(600,500);
        this.setClosable(true);
        this.setLayout(null);
        this.mensaje=mensaje;
        
        this.jtbnGuardar=new JButton("Guardar");
        this.jtbnGuardar.setBounds(15, 200, 125, 30);
        this.jtbnGuardar.addActionListener(this);
        this.add(this.jtbnGuardar);
        
        this.jlbTitulo= new JLabel("Ingrese los datos del Actor");
        this.jlbTitulo.setBounds(15, 30, 375, 30);
        this.add(this.jlbTitulo);
        
        this.jlbGuardarNombreActor= new JLabel("Nombre");
        this.jlbGuardarNombreActor.setBounds(43,60 , 75, 30);
        this.add(this.jlbGuardarNombreActor);
        
        
        this.jtfGuardarNombreActor= new JTextField();
        this.jtfGuardarNombreActor.setBounds(40, 90, 75, 30);
        this.add(this.jtfGuardarNombreActor);
                
        this.jlbGuardarApellidoActor= new JLabel("Apellido");
        this.jlbGuardarApellidoActor.setBounds(225,60 , 75, 30);
        this.add(this.jlbGuardarApellidoActor);
        
        this.jtfGuardarApellidoActor= new JTextField();
        this.jtfGuardarApellidoActor.setBounds(220, 90, 100, 30);
        this.add(this.jtfGuardarApellidoActor);
        
        
        
        this.jlbGuardarIdActor= new JLabel("ID");
        this.jlbGuardarIdActor.setBounds(410,60 , 75, 30);
        this.add(this.jlbGuardarIdActor);
        
        this.jtfGuardarIdActor= new JTextField();
        this.jtfGuardarIdActor.setBounds(400, 90, 100, 30);
        this.add(this.jtfGuardarIdActor);
    
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

