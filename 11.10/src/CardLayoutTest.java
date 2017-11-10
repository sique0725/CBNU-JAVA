import java.awt.*;
import java.awt.event.*;
class CardLayoutTest1 extends Frame {	
	CardLayout card = new CardLayout();
	Panel panel[] = new Panel[5];
	Color color[] = {Color.red, Color.blue, Color.yellow, Color.green,Color.cyan};
	public CardLayoutTest1(String str) {
		super(str);
		setLayout(card);
		
		MouseHandle mouse = new MouseHandle();
		
		for(int i = 0; i < 5; i++) 
		{
			panel[i] = new Panel();
			panel[i].setBackground(color[i]);
			panel[i].addMouseListener(mouse);
			add(""+ (i+1), panel[i]);
		}		
		setSize(200,200);
		setVisible(true);
	}
	public class MouseHandle extends MouseAdapter 	{
		public void mouseClicked(MouseEvent e) 	{
			card.next(CardLayoutTest1.this);
		}
	}
}


public class CardLayoutTest{
	public static void main(String[] args) {
		new CardLayoutTest1("CardLayout Test");
	}
}

	
