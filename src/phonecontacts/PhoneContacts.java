/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package phonecontacts;

import java.awt.Color;
import javax.swing.JFrame;

/**
 *
 * @author El-Sakka group
 */
public class PhoneContacts {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //frm f = new frm() ;
        login l = new login() ;
        l.setVisible(true);
        l.setLocationRelativeTo(null);
        l.setTitle(" Phone contacts" );
        l.getContentPane().setBackground(new Color(37,138,250));
    }
    
}
