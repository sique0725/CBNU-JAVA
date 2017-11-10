import java.awt.*;
class FlickeringLabel1 extends Label implements Runnable{
	public FlickeringLabel1(String text) {
		super(text);
		Thread th = new Thread(this);
		th.start();
	}

	public void run() {
		int n=0;
		while(true) { 
			if(n == 0)
				setBackground(Color.YELLOW);
			else
				setBackground(Color.GREEN);
			if(n == 0) n = 1;
			else n = 0;
			try {
				Thread.sleep(500); 
			}
			catch(InterruptedException e) {
				return; 
			}
		}
	}
}
class FlickeringLabelEx extends Frame {
	public FlickeringLabelEx() {
		setTitle("FlickeringLabelEx ¿¹Á¦");
	
		FlickeringLabel1 fLabel = new FlickeringLabel1("±ô¹Ú");
		Label label = new Label("¾È±ô¹Ú");
		FlickeringLabel1 fLabel2 = new FlickeringLabel1("¿©±âµµ ±ô¹Ú");
		Panel p = new Panel();
		p.add(fLabel);
		p.add(label);
		p.add(fLabel2);
		add(p);
		setSize(300,150);
		setVisible(true);
	}
}
public class FlickeringLabel{
	public static void main(String[] args) {
		new FlickeringLabelEx();
	}
}
