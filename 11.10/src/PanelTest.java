import java.awt.*;
class PanelTest1 extends Frame {
	public PanelTest1(String str) {
		super(str);
		Panel panel1=new Panel();
		panel1.setBackground(Color.lightGray);
		add(panel1);
		setSize(300,300);
		setVisible(true);
		
	}
}
public class PanelTest{
	public static void main(String[] args) {
		new PanelTest1("패널 테스트");
	}
}
