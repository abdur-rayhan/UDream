/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package udream;

import javax.swing.JFrame;
import javax.swing.JScrollPane;

/**
 *
 * @author User
 */
public class BSc_Courses_Main {

    public BSc_Courses_Main() {
        init();
    }
    public String uni_name;
     public BSc_Courses_Main(String uni_name) {
        
        this.uni_name=uni_name;
         System.out.println("DffffffffffD"+uni_name);
         init();
    }
    public void init()
    {
         double l=Double.parseDouble("7.5");
        System.out.println(l);
        JFrame frame=new JFrame();
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setTitle("Add Courses Information");
        frame.setBounds(200, 50, 913, 700);
        JScrollPane jp;
        Bsc_Courses_Panel jpa=new Bsc_Courses_Panel(frame,uni_name);
        jp=new JScrollPane(jpa);
        frame.add(jp);
         frame.setVisible(true);
    }
     public static void main(String ar[])
    {
       
        BSc_Courses_Main ob=new BSc_Courses_Main();
        
    }
}
