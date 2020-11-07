/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg08_cardlayout;

import java.awt.CardLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author mhcrnl
 */
public class Cardlayout extends JFrame implements ActionListener{

    /**
     * @param args the command line arguments
     */
    CardLayout card;
    JButton b1, b2, b3;
    Container c;
    Cardlayout(){
        c = getContentPane();
        card = new CardLayout(40, 30);
        c.setLayout(card);
        b1 = new JButton("Button_1");
        b2 = new JButton("Button_2");
        b3 = new JButton("Button_3");
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        c.add("a", b1);
        c.add("b", b2);
        c.add("c", b3);
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Cardlayout cl = new Cardlayout();
        cl.setTitle("CardLayout Example!");
        cl.setSize(400, 400);
        cl.setVisible(true);
        cl.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        card.next(c);
    }
    
}
