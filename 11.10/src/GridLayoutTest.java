import java.awt.*;
class GridLayoutTest1 extends Frame 
{
	Button btn[] = new Button[6];
	public GridLayoutTest1(String str) 
	{
		super(str);
		setLayout(new GridLayout(3,2) );
		for(int i = 0; i <  6; i++) 
		{
			btn[i] = new Button(i+1 + "¹ø ¹öÆ°");
			add(btn[i]);
		}
		setSize(200,200);
		setVisible(true);
	}
}


public class GridLayoutTest{
	public static void main(String[] args) {
		new GridLayoutTest1("GridLayout Test");
	}
}
