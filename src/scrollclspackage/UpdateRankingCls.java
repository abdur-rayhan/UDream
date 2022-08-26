package scrollclspackage;

import UDream.Update_Ranking;
import javax.swing.JFrame;
import javax.swing.JScrollPane;

public class UpdateRankingCls  {
  public  UpdateRankingCls(){
      JFrame frame=new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Add University Information");
        frame.setBounds(200, 50, 913, 700);
        JScrollPane jp;
        Update_Ranking jpa=new Update_Ranking(frame);
        jp=new JScrollPane(jpa);
   
        frame.add(jp);
         frame.setVisible(true);  
    }
    public static void main(String ar[])
    {
    UpdateRankingCls ob = new UpdateRankingCls();
    }
}
