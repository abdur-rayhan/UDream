
package udream;

import javax.swing.JFrame;
import javax.swing.JScrollPane;

/**
 *
 * @author User
 */
public class University_info_frame  {
    public static void main(String ar[])
    {
        JFrame frame=new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Add University Information");
        frame.setBounds(200, 50, 913, 700);
        JScrollPane jp;
        University_info_jpanel jpa=new University_info_jpanel();
        jp=new JScrollPane(jpa);
        frame.add(jp);
         frame.setVisible(true);
        
        
    }
}
