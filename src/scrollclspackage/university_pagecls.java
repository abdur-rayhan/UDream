/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package scrollclspackage;

import UDream.NewJPanel;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import scrollbar.ScrollBarCustom;

public class university_pagecls extends JFrame{
     JScrollPane jp;
    public  university_pagecls(String s){
      JFrame frame=new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(200, 50, 913, 700);
        NewJPanel jpa=new  NewJPanel(frame,s);
        jp=new JScrollPane(jpa);
        ScrollBarCustom sp = new ScrollBarCustom();
        jp.setVerticalScrollBar(sp);
         frame.add(jp);
         frame.setVisible(true);  
    }
      public static void main(String ar[])
    {
    university_pagecls ob = new university_pagecls("Dhaka University");
    }
}
