/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


/**
 *
 * @author andres
 */

public class VentanaPrincipal extends JFrame implements ActionListener {
    
    JDesktopPane desktopPane;// cuando no se pone la visibilidad por defecto es privated
    private InternalFrameInsertMovie firstInternalFrame;
    private JMenuBar mn;
    private JMenu jMenuMain;
    private JMenuItem  jMenuItemInsertMovie;
    private JMenuItem  jMenuItemChargeList;
    private JMenuItem  jMenuItemChargeAllMovie;
    private JMenuItem jMenuItemSearchMovie;
    
    
    public VentanaPrincipal(){
        super();
        this.setSize(800, 600);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        this.desktopPane= new JDesktopPane();
        this.desktopPane.setLayout(null);
   
        init();
        this.add(this.desktopPane);
        
    }// VentanaPrincipal() constructor
    
    private void init(){
        
        this.mn=new JMenuBar();
        setJMenuBar(this.mn);
        this.jMenuMain=new JMenu("Menu");
        this.mn.add(jMenuMain);
        
        this.jMenuItemInsertMovie=new JMenuItem("Agregar película");
        this.jMenuItemInsertMovie.addActionListener(this);
        this.jMenuMain.add(this.jMenuItemInsertMovie);
        
        this.jMenuItemChargeList=new JMenuItem("Cargar y buscar Película");
        this.jMenuItemChargeList.addActionListener(this);
        this.jMenuMain.add(this.jMenuItemChargeList);

        this.jMenuItemChargeAllMovie=new JMenuItem("Cargar por Película");
        this.jMenuItemChargeAllMovie.addActionListener(this);
        this.jMenuMain.add(this.jMenuItemChargeAllMovie);
        
        this.jMenuItemSearchMovie=new JMenuItem("Buscar Película");
        this.jMenuItemSearchMovie.addActionListener(this);
        this.jMenuMain.add(this.jMenuItemSearchMovie);
        
        
    }//init()
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==jMenuItemInsertMovie){
            InternalFrameInsertMovie insertarPeli= new InternalFrameInsertMovie();
            insertarPeli.setVisible(true);
            this.desktopPane.add(insertarPeli);
            
        
        }else if(e.getSource()==jMenuItemChargeList){            
//            InternalFrameChargeList chargeListMovie= new InternalFrameChargeList();
//            chargeListMovie.setVisible(true);
//            this.desktopPane.add(chargeListMovie);
              testTable table= new testTable();
              table.setVisible(true);
              
        
        }else if(e.getSource()==jMenuItemChargeAllMovie){
        
        
        }else if(e.getSource()==jMenuItemSearchMovie){
            
            
        }else{
            JOptionPane.showMessageDialog(null,"Acción no válida intentelo de nuevo ");
        }
        
    }
    
}
