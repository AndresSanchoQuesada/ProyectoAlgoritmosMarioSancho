/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextField;

/**
 *
 * @author andres
 */
public class InternalFrameChargeList extends JInternalFrame implements ActionListener{
    
    private JMenuBar barMenu;
    private JMenu jMenuMainChargeList;
    private JMenuItem  jMenuItemDrama;
    private JMenuItem  jMenuItemComedy;
    private JMenuItem  jMenuItemChildDish;
    private JMenuItem jMenuItemAction;
    private JMenuItem jMenuItemRomance;
    private JMenuItem jMenuItemFiction;
    public InternalFrameChargeList(){
        super();
        this.setSize(600,500);
        this.setClosable(true);
        this.setLayout(null);
        
        this.barMenu=new JMenuBar();
        setJMenuBar(this.barMenu);
        this.jMenuMainChargeList=new JMenu("Cargar Pelicula por Genero ");
        this.barMenu.add(jMenuMainChargeList);
        
            this.jMenuItemComedy=new JMenuItem("Comedia");
            this.jMenuItemComedy.addActionListener(this);
            this.jMenuMainChargeList.add(this.jMenuItemComedy);
            
            this.jMenuItemDrama=new JMenuItem("Drama");
            this.jMenuItemDrama.addActionListener(this);
            this.jMenuMainChargeList.add(this.jMenuItemDrama);
            
            this.jMenuItemChildDish=new JMenuItem("Childish");
            this.jMenuItemChildDish.addActionListener(this);
            this.jMenuMainChargeList.add(this.jMenuItemChildDish);
        
            this.jMenuItemAction=new JMenuItem("Action");
            this.jMenuItemAction.addActionListener(this);
            this.jMenuMainChargeList.add(this.jMenuItemAction);
        
            this.jMenuItemRomance=new JMenuItem("Romance");
            this.jMenuItemRomance.addActionListener(this);
            this.jMenuMainChargeList.add(this.jMenuItemRomance);
            
            this.jMenuItemFiction=new JMenuItem("Fiction");
            this.jMenuItemFiction.addActionListener(this);
            this.jMenuMainChargeList.add(this.jMenuItemFiction);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
