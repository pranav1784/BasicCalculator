import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Calculator  implements ActionListener {
	JFrame f;
	JTextField t1;
	JButton b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16;
	double a=0,b=0,result=0;
	int operator=0;
	Calculator()
	{
		f=new JFrame("Calculator");
		
		  JLabel l1=new JLabel("Basic Calculator");
		  l1.setBounds(150,20, 250,50);  
		  
//		  Font f2 = new Font("TimesRoman",Font.BOLD,25);
//		  l1.setFont(f2);
		  f.add(l1);
		  l1.setFont(new Font("Verdana", Font.PLAIN, 30));
	      l1.setPreferredSize(new Dimension(350, 200));
	       t1=new JTextField();  
	      
	      t1.setBounds(100,110, 350,50);
	      t1. setFont(new Font("arial", Font.PLAIN, 30));
	      t1.setEditable(true);
	      t1.setHorizontalAlignment(JTextField.RIGHT);
	      f.add(t1);
	      
	       b10=new JButton("C");
	      b10.setBounds(60, 180, 95, 30);
	      b10. setFont(new Font("arial", Font.PLAIN, 20));
	      b10.addActionListener(this);
	      f.add(b10);
	      
	      b11=new JButton("=");
	      b11. setFont(new Font("arial", Font. PLAIN, 20));
	      b11.setBounds(360, 180, 95, 30);
	      b11.addActionListener(this);
	      f.add(b11);
	      
	      b1=new JButton("1");
	      b1. setFont(new Font("arial", Font. PLAIN, 20));
	      b1.setBounds(60, 250, 45, 45);
	      b1.addActionListener(this);
	      f.add(b1);
	      
	      b2=new JButton("2");
	      b2. setFont(new Font("arial", Font. PLAIN, 20));
	      b2.setBounds(150, 250, 45, 45);
	      b2.addActionListener(this);
	      f.add(b2);
	      
	      b3=new JButton("3");
	      b3. setFont(new Font("arial", Font. PLAIN, 20));
	      b3.setBounds(240, 250, 45, 45);
	      b3.addActionListener(this);
	      f.add(b3);
	      
	      b4=new JButton("4");
	      b4. setFont(new Font("arial", Font. PLAIN, 20));
	      b4.setBounds(60, 320, 45, 45);
	      b4.addActionListener(this);
	      f.add(b4);
	      
	      b5=new JButton("5");
	      b5. setFont(new Font("arial", Font. PLAIN, 20));
	      b5.setBounds(150, 320, 45, 45);
	      b5.addActionListener(this);
	      f.add(b5);
	      
	      b6=new JButton("6");
	      b6. setFont(new Font("arial", Font. PLAIN, 20));
	      b6.setBounds(240, 320, 45, 45);
	      b6.addActionListener(this);
	      f.add(b6);
	      
	      b7=new JButton("7");
	      b7. setFont(new Font("arial", Font. PLAIN, 20));
	      b7.setBounds(60, 390, 45, 45);
	      b7.addActionListener(this);
	      f.add(b7);
	      
	      b8=new JButton("8");
	      b8. setFont(new Font("arial", Font. PLAIN, 20));
	      b8.setBounds(150, 390, 45, 45);
	      b8.addActionListener(this);
	      f.add(b8);
	      
	      b9=new JButton("9");
	      b9. setFont(new Font("arial", Font. PLAIN, 20));
	      b9.setBounds(240, 390, 45, 45);
	      b9.addActionListener(this);
	      f.add(b9);
	      
	      b16=new JButton(".");
	      b16. setFont(new Font("arial", Font. PLAIN, 20));
	      b16.setBounds(240, 460, 45, 45);
	      b16.addActionListener(this);
	      f.add(b16);
	      
	      b0=new JButton("0");
	      b0. setFont(new Font("arial", Font. PLAIN, 20));
	      b0.setBounds(140, 460, 60, 40);
	      b0.addActionListener(this);
	      f.add(b0);
	      
	      b12=new JButton("+");
	      b12. setFont(new Font("arial", Font. PLAIN, 20));
	      b12.setBounds(390, 250, 60, 40);
	      b12.addActionListener(this);
	      f.add(b12);
	      
	      b13=new JButton("-");
	      b13. setFont(new Font("arial", Font. PLAIN, 20));
	      b13.setBounds(390, 320, 60, 40);
	      b13.addActionListener(this);
	      f.add(b13);
	      
	      b14=new JButton("*");
	      b14. setFont(new Font("arial", Font. PLAIN, 20));
	      b14.setBounds(390, 390, 60, 40);
	      b14.addActionListener(this);
	      f.add(b14);
	      
	      b15=new JButton("/");
	      b15. setFont(new Font("arial", Font. PLAIN, 20));
	      b15.setBounds(390, 460, 60, 40);
	      b15.addActionListener(this);
	      f.add(b15);
	      
		 f.setSize(550,600);  
		    f.setLayout(null);  
		    f.setVisible(true);  
		  
	}

	public static void main(String[] args) {
		new Calculator();

	}


	public void actionPerformed(ActionEvent e) {
		//String str=e.getActionCommand();
		if(e.getSource()==b1)
			t1.setText(t1.getText().concat("1"));
		if(e.getSource()==b2)
			t1.setText(t1.getText().concat("2"));
		if(e.getSource()==b3)
			t1.setText(t1.getText().concat("3"));
		if(e.getSource()==b4)
			t1.setText(t1.getText().concat("4"));
		if(e.getSource()==b5)
			t1.setText(t1.getText().concat("5"));
		if(e.getSource()==b6)
			t1.setText(t1.getText().concat("6"));
		if(e.getSource()==b7)
			t1.setText(t1.getText().concat("7"));
		if(e.getSource()==b8)
			t1.setText(t1.getText().concat("8"));
		if(e.getSource()==b9)
			t1.setText(t1.getText().concat("9"));
		if(e.getSource()==b0)
			t1.setText(t1.getText().concat("0"));
		
		if(e.getSource()==b16)
			t1.setText(t1.getText().concat("."));
		
		if(e.getSource()==b12)
		{
			a=Double.parseDouble(t1.getText());
			operator=1;
			t1.setText("");
		} 
		
		if(e.getSource()==b13)
		{
			a=Double.parseDouble(t1.getText());
			operator=2;
			t1.setText("");
		}
		
		if(e.getSource()==b14)
		{
			a=Double.parseDouble(t1.getText());
			operator=3;
			t1.setText("");
		}
		
		if(e.getSource()==b15)
		{
			a=Double.parseDouble(t1.getText());
			operator=4;
			t1.setText("");
		}
		if(e.getSource()==b11)
		{
			b=Double.parseDouble(t1.getText());
		
			switch(operator)
			{
				case 1: result=a+b;
					break;
		
				case 2: result=a-b;
					break;
		
				case 3: result=a*b;
					break;
		
				case 4: result=a/b;
					break;
		
				default: result=0;
			}
		
			t1.setText(""+result);
		}
		
		if(e.getSource()==b10)
			t1.setText("");
		
		

	}
	}
