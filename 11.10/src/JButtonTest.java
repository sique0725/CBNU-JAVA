import javax.swing.*;
public class JButtonTest extends JFrame 
{
	public JButtonTest() 
	{
		super("��ư �׽�Ʈ");
		JPanel buttonPanel = new JPanel();
		JButton btn = new JButton("Button");
		buttonPanel.add(btn);
						
		ImageIcon icon1 = new ImageIcon(".\\src\\btn_01.png");
		ImageIcon icon2 = new ImageIcon(".\\src\\btn_02.png");
		JToggleButton tgbutton = new JToggleButton(icon1);
		tgbutton.setPressedIcon(icon2);
		buttonPanel.add(tgbutton);
		
		JLabel lblHobby = new JLabel("���");
		JCheckBox check1 = new JCheckBox("�");
		JCheckBox check2 = new JCheckBox("����");
		JCheckBox check3 = new JCheckBox("��ȭ����");
		buttonPanel.add(lblHobby);
		buttonPanel.add(check1);
		buttonPanel.add(check2);
		buttonPanel.add(check3);
		JLabel lblMale = new JLabel("����");
		JRadioButton rb1 = new JRadioButton("����");
		JRadioButton rb2 = new JRadioButton("����");
		ButtonGroup bg = new ButtonGroup();
		bg.add(rb1);
		bg.add(rb2);
		buttonPanel.add(lblMale);
		buttonPanel.add(rb1);
		buttonPanel.add(rb2);	
				
		add(buttonPanel);
				
		setLocation(150,200);
		setSize(242,150);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args)
	{
		new JButtonTest();		
	}
}

