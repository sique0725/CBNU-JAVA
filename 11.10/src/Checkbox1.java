import java.awt.*;
class Checkbox2
extends Frame {
	public Checkbox2(String str){
		super(str);
		Panel p = new Panel();
		Checkbox cbx1=new Checkbox("�̴�",true);
		Checkbox cbx2=new Checkbox("����");	
		Checkbox cbx3=new Checkbox("����");
		p.add(cbx1);
		p.add(cbx2);
		p.add(cbx3);
		
		CheckboxGroup group = new CheckboxGroup();
		Checkbox cbx4=new Checkbox("�̴�",group,true);
		Checkbox cbx5=new Checkbox("����",group,false);	
		Checkbox cbx6=new Checkbox("����",group,false);
		p.add(cbx4);
		p.add(cbx5);
		p.add(cbx6);

		add(p);
		setSize(180, 300);
		setVisible(true);
	}
}
public class Checkbox1
{
	public static void main(String[] args) 
	{
		new Checkbox2("üũ �ڽ� �׽�Ʈ");
	}
}
