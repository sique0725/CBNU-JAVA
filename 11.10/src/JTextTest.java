import javax.swing.*;
import java.awt.*;
import javax.swing.border.*;

public class JTextTest extends JFrame 
{
   JLabel lbl,la1,la2;
   JTextField id;
   JPasswordField passwd;
   JPanel idPanel,paPanel,loginPanel;
   JButton b1,b2;
   JTextArea content;
   public JTextTest()
   {
      super( "JText�׽�Ʈ" );
      setLayout( new FlowLayout() );
      EtchedBorder eborder =  new EtchedBorder();
           
      lbl = new JLabel( "���̵�� �н����带 �Է��� �ּ���" );
      lbl.setBorder(eborder);
      add( lbl );
      paPanel = new JPanel();
      la2 = new JLabel("�н�����");
      passwd = new JPasswordField(10);
      paPanel.add( la2 );
      paPanel.add( passwd );
      loginPanel = new JPanel();
      b1 = new JButton("�α���");
      b2 = new JButton("ȸ������");
      loginPanel.add( b1 );
      loginPanel.add( b2 );
      add(idPanel);
      add(paPanel);
      add(loginPanel);
      content = new JTextArea(3,20);
      JScrollPane s= new JScrollPane(content);
      add(s);
      setSize( 250, 350 );
      setVisible(true);
	  setDefaultCloseOperation(EXIT_ON_CLOSE);
   }
   public static void main( String args[] )
   { 
	new JTextTest();
   }
}

	
