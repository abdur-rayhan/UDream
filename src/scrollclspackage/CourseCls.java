package scrollclspackage;

import UDream.CoursePage;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import scrollbar.ScrollBarCustom;
public class CourseCls {
    public  CourseCls(String s,String s1){
     JFrame frame=new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Add University Information");
        frame.setBounds(200, 50, 913, 700);
        JScrollPane jp;
        CoursePage jpa=new CoursePage(frame,s,s1);
        jp=new JScrollPane(jpa);
           ScrollBarCustom sp = new ScrollBarCustom();
        jp.setVerticalScrollBar(sp);
        frame.add(jp);
         frame.setVisible(true);
}
     public static void main(String ar[])
    {
    CourseCls ob = new CourseCls("Dhaka University","Computer Science");
    }
}

