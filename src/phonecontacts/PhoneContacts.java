/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package phonecontacts;

import java.awt.Color;

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
        frm f = new frm() ;
        f.setVisible(true);
        f.setLocationRelativeTo(null);
        f.setTitle(" Phone contacts" );
        f.getContentPane().setBackground(new Color(37,138,250));

    }
    
}
