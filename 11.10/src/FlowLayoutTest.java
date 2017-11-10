import java.awt.*;
class FlowLayoutTest1 extends Frame 
{
	FlowLayout f = new FlowLayout();
	Button btn[] = new Button[10];
	public FlowLayoutTest1(String str)
	{		
		super(str);
		setLayout(f) ;
		for( int i = 0; i < 10; i++) 
		{
			btn[i] = new Button((i+1)+"번 버튼");
			add(btn[i]);
		}
		setBounds(100,100,200,200);
		setVisible(true);
	}
}
public class FlowLayoutTest{
	public static void main(String[] args) {
		new FlowLayoutTest1("FlowLayout 테스트");
	}
}