import javax.swing.*;
public class JFrameTest extends JFrame 
{
    	public JFrameTest()
	{
		super("J�����ӿ���");
		setSize(260,100);
		setVisible(true);
	}
	public static void main(String[] args) 
	{
		JFrameTest  f = new JFrameTest();
		f.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
}

