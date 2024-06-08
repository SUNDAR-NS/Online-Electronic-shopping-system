import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.awt.event.*;
import java.util.*;
import java.awt.geom.*;
import java.sql.*;
public class Electronicshopping
{
	public static void main(String[] args)
	{
		Start f1 = new Start();
		f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
class Start extends JFrame
{
     JButton b1;
     JPanel p1;
     JLabel l,l1,l2,l3,l4;
     public Start()
     {
                setVisible(true);
		setTitle("ELECTRONICS STORE ");
		setSize(1000,1000);
		constructUI();
		designUI();
		handleEvent(); 
     }
     public void constructUI()
     {
	b1 = new JButton("START");
        p1 = new JPanel();
        l = new JLabel("|ELectronic item shopping system|");
        l1 = new JLabel(new ImageIcon("99.jpg"));
        l3 = new JLabel("N.S.SUNDAR-202004152");
        l4= new JLabel("S.BALASUBRAMANIAM-202004020");
        l2= new JLabel("S.AMAL-202004011");
       
     }
     public void designUI()
     {
        p1.add(l1);
        l.setFont(new Font("ALGERIAN",Font.PLAIN,50));
        l.setForeground(Color.WHITE);
        p1.add(l);
        getContentPane().add(l,BorderLayout.CENTER);
        p1.add(l2);
        getContentPane().add(l2,BorderLayout.CENTER);
        p1.add(l3);
        getContentPane().add(l3,BorderLayout.CENTER);
        p1.add(l4);
        getContentPane().add(l4,BorderLayout.CENTER);
        l.setBounds(300,-15,1000,150);
        b1.setFont(new Font("ALGERIAN",Font.PLAIN,30));
        p1.add(b1);
        getContentPane().add(b1,BorderLayout.SOUTH);
        b1.setBackground(Color.WHITE);
        l2.setBounds(1050,500,350,70);
        l3.setBounds(1050,575,350,70);
        l4.setBounds(1050,535,350,70);
        l2.setFont(new Font("ALGERIAN",Font.BOLD,18));
        l3.setFont(new Font("ALGERIAN",Font.BOLD,18));
        l4.setFont(new Font("ALGERIAN",Font.BOLD,18));
        l2.setForeground(Color.WHITE);
   	l3.setForeground(Color.WHITE);
	l4.setForeground(Color.WHITE);
        add(p1);
      }
      public void handleEvent()
      {
      b1.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{
				     dispose();
				     MyFrame f1 = new MyFrame();
                                     f1.setVisible(true);
                                    
		        }
        
     });
}
class MyFrame extends JFrame
{
	JButton usubmit,nusr,home;
	JTextField t1,t2;
	JLabel l,l1,l2,l3,l4;
	JPasswordField ps1;
	JPanel p1,p2;
	JCheckBox c1;
        Connection con;
	Statement st;
	ResultSet rs;

	public MyFrame()
	{
                try
		{
		setVisible(true);
		setTitle("ELECTRONICS STORE ");
		setSize(10000,10000);
		constructUI();
		designUI();
		handleEvent();
                   
                makeConnection();
		rs=st.executeQuery("Select * from login");
		rs.first();
		}
		catch(Exception e)
		{
			System.out.println(e);
		} 
	}
         
	public void constructUI()
	{
		usubmit = new JButton("LOGIN");
                home=new JButton("HOME");
		ps1 = new JPasswordField(10);
		t1 = new JTextField(10);
		p1 = new JPanel();
		p2 = new JPanel();               
		l = new JLabel("|ELectronic item shopping system|");
		l1 = new JLabel("UserName:");
		l2 = new JLabel("PassWord:");
                l3 = new JLabel(new ImageIcon("hiii.jpg"));
                l4 = new JLabel("Login Form:");
		c1 = new JCheckBox("Show password");
		nusr=new JButton("SIGNUP");
	}
        public void makeConnection()
	{
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Electronic","root","");
			st=con.createStatement();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

	public void designUI()
	{
		
                p1.add(l3);
		//getContentPane().add(l3,BorderLayout.EAST);
                p1.add(l);
		getContentPane().add(l,BorderLayout.CENTER);
		p1.add(l1);
		getContentPane().add(l1,BorderLayout.CENTER);
		p1.add(l2);
		getContentPane().add(l2,BorderLayout.CENTER);
                p1.add(l4);
		getContentPane().add(l4,BorderLayout.CENTER);
		p1.add(t1);
		getContentPane().add(t1,BorderLayout.CENTER);
		p1.add(ps1);
		getContentPane().add(ps1,BorderLayout.CENTER);
		p1.add(c1);
		getContentPane().add(c1,BorderLayout.CENTER);
		p1.add(usubmit);
		getContentPane().add(usubmit,BorderLayout.CENTER);
		p1.add(nusr);
		getContentPane().add(nusr,BorderLayout.CENTER);
                p1.add(home);
		getContentPane().add(home,BorderLayout.CENTER);
		l.setBounds(300,10,1000,70);
                l.setFont(new Font("SHOWCARD GOTHIC",Font.PLAIN,50));
                l1.setFont(new Font("Cooper",Font.BOLD,25));
                l2.setFont(new Font("Cooper",Font.BOLD,22));
                l4.setFont(new Font("SHOWCARD GOTHIC",Font.BOLD,22));
                ps1.setFont(new Font("Elephant",Font.BOLD,20));
                t1.setFont(new Font("Elephant",Font.BOLD,20));
                l4.setBounds(930,110,150,70);
		l1.setBounds(930,175,150,70);
		t1.setBounds(1075,195,200,40);
		l2.setBounds(940,268,125,70);
		ps1.setBounds(1075,285,200,40);
		c1.setBounds(1075,355,200,40);
		usubmit.setBounds(1125,440,150,40);
		nusr.setBounds(935,440,150,40);
                home.setBounds(1025,525,150,40);
                usubmit.setFont(new Font("SHOWCARD GOTHIC",Font.BOLD,25));
                nusr.setFont(new Font("SHOWCARD GOTHIC",Font.BOLD,25));
                home.setFont(new Font("SHOWCARD GOTHIC",Font.BOLD,25));
                p1.setBackground(Color.WHITE);
                usubmit.setBackground(Color.BLUE);
                nusr.setBackground(Color.BLUE);
                home.setBackground(Color.BLUE);
                p1.setBackground(Color.WHITE);
		add(p1);
		
	}
	public void handleEvent()
	{
		c1.addItemListener(new ItemListener()
		{
			public void itemStateChanged(ItemEvent ie)
			{
				if(ie.getSource() == c1)
				{
					if (c1.isSelected() )
					{
						ps1.setEchoChar((char) 0);
					}
					else
						ps1.setEchoChar('*');
				}
			}
		});
		
		usubmit.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{
                           try
			{
				rs.first();int flag =0;
				do{
					if (rs.getString(1).equals(t1.getText()) && rs.getString(2).equals(ps1.getText()))
					{
                                            dispose();
			                    Shopping f1 = new Shopping();
                                            f1.setVisible(true);
 			                    flag=1;
			                    rs.first();
			                    break;
					}
				}
				while(rs.next());
				 if(flag==0)
				   JOptionPane.showMessageDialog(null," Invalid UserName/Password");
			}
			   catch(Exception e)
		          {
			      System.out.println(e);
		          }
			
		      }
	
		});
		nusr.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{
				     dispose();
				     NewUser f1 = new NewUser();
                                     f1.setVisible(true);
			}
		});
                home.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{
				     dispose();
				     Start f1 = new Start();
                                     f1.setVisible(true);
			}
		});
	}

}
class NewUser extends JFrame
{
	JButton usubmit,pr;
	JTextField t1,t2;
	JLabel l,l1,l2,l3,l4,l5;
	JPasswordField ps1;
	JPanel p1,p2;
	JCheckBox c1;
        Connection con;
	Statement st;
	ResultSet rs;

	public NewUser()
	{
		setVisible(true);
		setTitle("ELECTRONICS STORE ");
		setSize(10000,10000);
		constructUI();
		designUI();
		handleEvent();
		
                try{
		makeConnection();
		rs=st.executeQuery("Select * from login");
		rs.first();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	public void constructUI()
	{
		usubmit = new JButton("LOGIN");
                pr = new JButton("BACK");
		ps1 = new JPasswordField(10);
		t1 = new JTextField(10);
                t2 = new JTextField(10);
		p1 = new JPanel();
		p2 = new JPanel();               
		l = new JLabel("|ELectronic item shopping system|");
		l1 = new JLabel("UserName:");
		l2 = new JLabel("PassWord:");
                l3 = new JLabel("Mobile No:");   
                l4 = new JLabel(new ImageIcon("hii.jpg"));
                l5= new JLabel("NEW USER:");
		c1 = new JCheckBox("Show password");
		
	}

	public void designUI()
	{
                try
                {
                p1.add(l4);
		p1.add(l);
		getContentPane().add(l,BorderLayout.CENTER);
		p1.add(l1);
		getContentPane().add(l1,BorderLayout.CENTER);
		p1.add(l2);
		getContentPane().add(l2,BorderLayout.CENTER);
                p1.add(l3);
		getContentPane().add(l3,BorderLayout.CENTER);
                p1.add(l5);
                getContentPane().add(l5,BorderLayout.CENTER);
		p1.add(t1);
		getContentPane().add(t1,BorderLayout.CENTER);
                p1.add(t2);
		getContentPane().add(t2,BorderLayout.CENTER);
		p1.add(ps1);
		getContentPane().add(ps1,BorderLayout.CENTER);
		p1.add(c1);
		getContentPane().add(c1,BorderLayout.CENTER);
		p1.add(usubmit);
		getContentPane().add(usubmit,BorderLayout.CENTER);
                p1.add(pr);
		getContentPane().add(pr,BorderLayout.CENTER);
		l.setBounds(300,10,1000,70);
                l.setFont(new Font("SHOWCARD GOTHIC",Font.PLAIN,50));
                l1.setFont(new Font("Cooper",Font.BOLD,25));
                l2.setFont(new Font("Cooper",Font.BOLD,22));
                l3.setFont(new Font("Cooper",Font.BOLD,22));
                l5.setFont(new Font("SHOWCARD GOTHIC",Font.BOLD,25));
                ps1.setFont(new Font("Elephant",Font.BOLD,20));
                t1.setFont(new Font("Elephant",Font.BOLD,20));
                t2.setFont(new Font("Elephant",Font.BOLD,20));
		l1.setBounds(1005,158,150,70);
		l3.setBounds(1015,235,150,70);
                l5.setBounds(1005,100,500,50);
		t1.setBounds(1150,175,200,40);
                t2.setBounds(1150,255,200,40);
		l2.setBounds(1015,305,125,70);
		ps1.setBounds(1150,325,200,40);
		c1.setBounds(1150,395,200,40);
		usubmit.setBounds(1175,470,150,40);
                usubmit.setFont(new Font("SHOWCARD GOTHIC",Font.BOLD,25));
                pr.setBounds(1175,540,150,40);
                pr.setFont(new Font("SHOWCARD GOTHIC",Font.BOLD,20));
                p1.setBackground(Color.WHITE);
                usubmit.setBackground(Color.BLUE);
                pr.setBackground(Color.BLUE);	
		add(p1);
		}
                catch(Exception e)
                {
                }
     }
        public void makeConnection()
	{
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Electronic","root","");
			st=con.createStatement();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	public void handleEvent()
	{
		c1.addItemListener(new ItemListener()
		{
			public void itemStateChanged(ItemEvent ie)
			{
				if(ie.getSource() == c1)
				{
					if (c1.isSelected() )
					{
						ps1.setEchoChar((char) 0);
					}
					else
						ps1.setEchoChar('*');
				}
			}
		});
		
		usubmit.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{
				    try{
					String uname=t1.getText();
					String pass=ps1.getText();
					st.executeUpdate("Insert into login values('"+uname+"','"+pass+"')");
				 JOptionPane.showMessageDialog(null,"Registered Successfully!");
				}
				catch(Exception e)
		{
			System.out.println(e);
		}
				   
			}
		});
                 
                 pr.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{
				     dispose();
				     MyFrame f1 = new MyFrame();
                                     f1.setVisible(true);
			}
		});
                             
	}

}
class Shopping extends JFrame
{
	JScrollPane a;
	JScrollPane s;
	JMenu cmp,lig,ha,lap;
	JMenuItem mon,cpu,mou,sl,bl,gl,led,tube,fan,ac,fridge,wm;
	JMenuBar b;
        JPanel p1;
        JLabel l,l1;
        JButton home;
	Shopping()
	{ 
		setSize(10000,10000);
		setVisible(true);
		setTitle("ELECTRICAL STORE");
		construct();
		design();
		handleEvents();
	}	
	void construct()
	{
		cmp=new JMenu("COMPUTERS");
		lig=new JMenu("LIGHT");
		lap=new JMenu("LAPTOP");
		ha=new JMenu("HOME APPLIANCES");
		mon=new JMenuItem("MONITOR");
		cpu=new JMenuItem("CPU");
		mou=new JMenuItem("MOUSE");
		sl=new JMenuItem("STUDENT LAPTOP");
		gl=new JMenuItem("GAMING LAPTOP");
		bl=new JMenuItem("BASIC LAPTOP");
		led=new JMenuItem("LED");
		tube=new JMenuItem("TUBE");
		fan=new JMenuItem("FAN");
		ac=new JMenuItem("AIR CONDITIONER");
		fridge=new JMenuItem("FRIDGE");
		wm=new JMenuItem("WASHING MACHINE");
		b=new JMenuBar();
                l=new JLabel(new ImageIcon("chrishmas.gif"));
                l1=new JLabel(new ImageIcon("online m.jpg"));
                home=new JButton("HOME");
                p1=new JPanel();
		s=new JScrollPane(a,ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS,ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
	}
	void design()
	{
                p1.add(l);
		p1.add(l1);
		//getContentPane().add(l1,BorderLayout.EAST);
                p1.add(home);
                getContentPane().add(home,BorderLayout.CENTER);
                home.setBounds(700,650,100,50);
 		home.setFont(new Font("Cooper",Font.BOLD,20));
       		home.setBackground(Color.WHITE);
                p1.setBackground(Color.BLACK);
		cmp.add(mon);
		cmp.add(cpu);
		cmp.addSeparator();
		cmp.add(mou);
		ha.add(fan);
		ha.add(ac);
		ha.add(fridge);
		ha.add(wm);
		b.add(cmp);
		b.add(lig);
		b.add(ha);
		lap.add(sl);
		lap.add(gl);
		lap.add(bl);
		lig.add(led);
		lig.add(tube);
		cmp.addSeparator();
		cmp.add(lap);
		setJMenuBar(b);
		add(s);
                add(p1);
	}
	void handleEvents()
	{
		mon.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{
					Mon f1=new Mon();
			}
		});
		cpu.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{
				    
				     Cpu f1 = new Cpu();
			}
		});
		mou.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{
				    
				     Mou f1 = new Mou();
			}
		});
		sl.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{
				    
				     Sl f1 = new Sl();
			}
		});
		gl.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{
				    
				     Gl f1 = new Gl();
			}
		});
		bl.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{
				    
				     Bl f1 = new Bl();
			}
		});
		led.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{
				    
				     Led f1 = new Led();
			}
		});
		tube.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{
				    
				     Tube f1 = new Tube();
			}
		});
		fan.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{
				    
				    Fan f1 = new Fan();
			}
		});
		ac.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{
				    
				     Ac f1 = new Ac();
			}
		});
		fridge.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{
				    
				     Fridge f1 = new Fridge();
			}
		});
		wm.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{
				    
				     Wm f1 = new Wm();
			}
		});
                home.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{
				     dispose();
				     Start f1 = new Start();
                                     f1.setVisible(true);
			}
		});
	}
}
class Mon extends JFrame
{	
	JPanel p1;
	JButton buy,buy1,buy2;
	JLabel l1,l2,l3,b1,b2,b3,l4,l5,l6;
	JTextField t1,t2,t3,t11,t22,t33;
	Connection con;
	Statement st;
	ResultSet rs;
	Mon()
	{ 	try
		{
		setSize(10000,10000);
		setVisible(true);
		setTitle("ELECTRICAL STORE");
		constructui();
		designUI();
		handleevent();
		makeConnection();
		rs=st.executeQuery("Select * from buydetails");
		rs.first();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	public void makeConnection()
	{
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/electronic","root","");
			st=con.createStatement();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	
	}
	void constructui()
	{
	  	p1 = new JPanel();
		buy=new JButton("BUY");
		buy1=new JButton("BUY");
		buy2=new JButton("BUY");
		l1=new JLabel(new ImageIcon("gl.jpg"));
		t1 = new JTextField(10);
		t11 = new JTextField(10);
		t2 = new JTextField(10);
		t22 = new JTextField(10);
		t3 = new JTextField(10);
		t33 = new JTextField(10);
		l1=new JLabel(new ImageIcon("monitor1.jpg"));
		l2=new JLabel(new ImageIcon("mon2.jpg"));
		l3=new JLabel(new ImageIcon("monitor3.jpg"));
		b1=new JLabel("No of Item:");
		b2=new JLabel("No of Item:");
		b3=new JLabel("No of Item:");
		l4=new JLabel("TOTAL PRICE:");
		l5=new JLabel("TOTAL PRICE:");
		l6=new JLabel("TOTAL PRICE:");
                
	}
	public void designUI()
	{
		getContentPane().add(buy,BorderLayout.CENTER);
		buy.setBounds(160,500,280,50);
		getContentPane().add(buy1,BorderLayout.CENTER);
		buy1.setBounds(640,500,280,50);
		getContentPane().add(buy2,BorderLayout.CENTER);
		buy2.setBounds(1100,500,280,50);
		getContentPane().add(l1,BorderLayout.CENTER);
		l1.setBounds(150,80,300,250);
		getContentPane().add(l2,BorderLayout.CENTER);
		l2.setBounds(630,80,300,250);
		getContentPane().add(l3,BorderLayout.CENTER);
		l3.setBounds(1090,80,300,250);
		getContentPane().add(b1,BorderLayout.CENTER);
		b1.setBounds(160,400,100,90);
		getContentPane().add(b2,BorderLayout.CENTER);
		b2.setBounds(640,400,100,90);
		getContentPane().add(b3,BorderLayout.CENTER);
		b3.setBounds(1100,400,100,90);
		getContentPane().add(l4,BorderLayout.CENTER);
		l4.setBounds(160,600,300,90);
		getContentPane().add(l5,BorderLayout.CENTER);
		l5.setBounds(640,600,300,90);
		getContentPane().add(l6,BorderLayout.CENTER);
		l6.setBounds(1100,600,300,90);	
		getContentPane().add(t1,BorderLayout.CENTER);
		t1.setBounds(330,410,100,50);
		getContentPane().add(t2,BorderLayout.CENTER);
		t2.setBounds(810,410,100,50);
		getContentPane().add(t3,BorderLayout.CENTER);
		t3.setBounds(1270,410,100,50);
		getContentPane().add(t11,BorderLayout.CENTER);
		t11.setBounds(330,610,100,50);
		getContentPane().add(t22,BorderLayout.CENTER);
		t22.setBounds(810,610,100,50);
		getContentPane().add(t33,BorderLayout.CENTER);
		t33.setBounds(1270,610,100,50);
                 b1.setFont(new Font("Cooper",Font.BOLD,15));
		 b2.setFont(new Font("Cooper",Font.BOLD,15));
		 b3.setFont(new Font("Cooper",Font.BOLD,15));
                 l4.setFont(new Font("Cooper",Font.BOLD,15));
                 l5.setFont(new Font("Cooper",Font.BOLD,15));
                 l6.setFont(new Font("Cooper",Font.BOLD,15));       
		add(p1);
	}
	public void handleevent()
	{
	buy.addActionListener(new ActionListener()
	{
		public void actionPerformed(ActionEvent ae)
		{
		try{
				int p= Integer.parseInt(t1.getText());
				p*=12000;
				t11.setText(p+"");
				String x =t11.getText();
				String y =t1.getText();
				String q = "HP MONITOR";
				st.executeUpdate("Insert into buydetails values('"+q+"','"+x+"','"+y+"')");
				JOptionPane.showMessageDialog(null,"Purchased Successfully!");
                                Thankyou f1=new Thankyou();
		    }
				catch(Exception e)
		    {
			System.out.println(e);
		    }
		
				
	}});
	buy1.addActionListener(new ActionListener()
	{
		public void actionPerformed(ActionEvent ae)
		{
		try{
				int p = Integer.parseInt(t2.getText());
				p*=10000;
				t22.setText(p+"");
				String x =t22.getText();
				String y =t2.getText();
				String q = "SAMSUNG MONITOR";
				st.executeUpdate("Insert into buydetails values('"+q+"','"+x+"','"+y+"')");
				JOptionPane.showMessageDialog(null,"Booked Successfully!");
				  Thankyou f1=new Thankyou();
		}
		
				catch(Exception e)
		{
			System.out.println(e);
		}
		
				
	}});
	buy2.addActionListener(new ActionListener()
	{
		public void actionPerformed(ActionEvent ae)
		{
		try{
				int p = Integer.parseInt(t3.getText());
				p*=14000;
				t33.setText(p+"");
				String x =t33.getText();
				String y =t3.getText();
				String q = "DELL MONITOR";
				st.executeUpdate("Insert into buydetails values('"+q+"','"+x+"','"+y+"')");
				JOptionPane.showMessageDialog(null,"Booked Successfully!");
		}
				catch(Exception e)
		{
			System.out.println(e);
		}
		
				
	}});
	}
}
class Cpu extends JFrame
{	
	JPanel p1,p2,p3;
	JButton buy,buy1,buy2;
	JLabel l1,l2,l3,l4,l5,l6;
	JLabel b1,b2,b3;
	JTextField t1,t2,t3,t11,t22,t33;
	Connection con;
	Statement st;
	ResultSet rs;
	Cpu()
	{ 	try
		{
		setSize(500,500);
		setVisible(true);
		setTitle("ELECTRICAL STORE");
		constructui();
		designUI();
                handleevent();
		makeConnection();
		rs=st.executeQuery("Select * from buydetails");
		rs.first();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	public void makeConnection()
	{
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/electronic","root","");
			st=con.createStatement();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	
	}
	void constructui()
	{
	  	p1 = new JPanel();
		buy=new JButton("BUY");
		buy1=new JButton("BUY");
		buy2=new JButton("BUY");
		l1=new JLabel(new ImageIcon("c.jpg"));
		l2=new JLabel(new ImageIcon("c2.jpg"));
		l3=new JLabel(new ImageIcon("c3.jpg"));
		t1 = new JTextField(10);
		t2 = new JTextField(10);
		t3 = new JTextField(10);
		t11 = new JTextField(10);
		t22 = new JTextField(10);
		t33 = new JTextField(10);
		b1=new JLabel("No of Item:");
		b2=new JLabel("No of Item:");
		b3=new JLabel("No of Item:");
		l4=new JLabel("TOTAL PRICE:");
		l5=new JLabel("TOTAL PRICE:");
		l6=new JLabel("TOTAL PRICE:");
	}
	public void designUI()
	{
		getContentPane().add(buy,BorderLayout.CENTER);
		buy.setBounds(160,500,280,50);
		getContentPane().add(buy1,BorderLayout.CENTER);
		buy1.setBounds(640,500,280,50);
		getContentPane().add(buy2,BorderLayout.CENTER);
		buy2.setBounds(1100,500,280,50);
		getContentPane().add(l1,BorderLayout.CENTER);
		l1.setBounds(150,80,300,250);
		getContentPane().add(l2,BorderLayout.CENTER);
		l2.setBounds(630,80,300,250);
		getContentPane().add(l3,BorderLayout.CENTER);
		l3.setBounds(1090,80,300,250);
		getContentPane().add(b1,BorderLayout.CENTER);
		b1.setBounds(160,400,100,90);
		getContentPane().add(b2,BorderLayout.CENTER);
		b2.setBounds(640,400,100,90);
		getContentPane().add(b3,BorderLayout.CENTER);
		b3.setBounds(1100,400,100,90);
		getContentPane().add(l4,BorderLayout.CENTER);
		l4.setBounds(160,600,300,90);
		getContentPane().add(l5,BorderLayout.CENTER);
		l5.setBounds(640,600,300,90);
		getContentPane().add(l6,BorderLayout.CENTER);
		l6.setBounds(1100,600,300,90);	
		getContentPane().add(t1,BorderLayout.CENTER);
		t1.setBounds(330,410,100,50);
		getContentPane().add(t2,BorderLayout.CENTER);
		t2.setBounds(810,410,100,50);
		getContentPane().add(t3,BorderLayout.CENTER);
		t3.setBounds(1270,410,100,50);
		getContentPane().add(t11,BorderLayout.CENTER);
		t11.setBounds(330,610,100,50);
		getContentPane().add(t22,BorderLayout.CENTER);
		t22.setBounds(810,610,100,50);
		getContentPane().add(t33,BorderLayout.CENTER);
		t33.setBounds(1270,610,100,50);
                 b1.setFont(new Font("Cooper",Font.BOLD,15));
		 b2.setFont(new Font("Cooper",Font.BOLD,15));
		 b3.setFont(new Font("Cooper",Font.BOLD,15));
                 l4.setFont(new Font("Cooper",Font.BOLD,15));
                 l5.setFont(new Font("Cooper",Font.BOLD,15));
                 l6.setFont(new Font("Cooper",Font.BOLD,15));       
		add(p1);
	}
	public void handleevent()
	{
	buy.addActionListener(new ActionListener()
	{
		public void actionPerformed(ActionEvent ae)
		{
		try{
				int p= Integer.parseInt(t1.getText());
				p*=3000;
				t11.setText(p+"");
				String x =t11.getText();
				String y =t1.getText();
				String q = "HP CPU";
				st.executeUpdate("Insert into buydetails values('"+q+"','"+x+"','"+y+"')");
				JOptionPane.showMessageDialog(null,"Purchased Successfully!");
				  Thankyou f1=new Thankyou();
		}
                               
				catch(Exception e)
		{
			System.out.println(e);
		}
		
				
	}});
	buy1.addActionListener(new ActionListener()
	{
		public void actionPerformed(ActionEvent ae)
		{
		try{
				int p = Integer.parseInt(t2.getText());
				p*=4000;
				t22.setText(p+"");
				String x =t22.getText();
				String y =t2.getText();
				String q = "SAMSUNG CPU";
				st.executeUpdate("Insert into buydetails values('"+q+"','"+x+"','"+y+"')");
				JOptionPane.showMessageDialog(null,"Purchased Successfully!");
				Thankyou f1=new Thankyou();
                                
		}
				catch(Exception e)
		{
			System.out.println(e);
		}
		
				
	}});
	buy2.addActionListener(new ActionListener()
	{
		public void actionPerformed(ActionEvent ae)
		{
		try{
				int p = Integer.parseInt(t3.getText());
				p*=5000;
				t33.setText(p+"");
				String x =t33.getText();
				String y =t3.getText();
				String q = "DELL CPU";
				st.executeUpdate("Insert into buydetails values('"+q+"','"+x+"','"+y+"')");
				JOptionPane.showMessageDialog(null,"Purchased Successfully!");
				  Thankyou f1=new Thankyou();
		}
		
				catch(Exception e)
		{
			System.out.println(e);
		}
		
				
	}});
	}
}
class Mou extends JFrame
{	
	JPanel p1;
	JButton buy,buy1,buy2;
	JLabel l1,l2,l3,l4,l5,l6;
	JLabel b1,b2,b3;
	JTextField t1,t2,t3,t11,t22,t33;
	Connection con;
	Statement st;
	ResultSet rs;
	Mou()
	{ 	try
		{
		setSize(5000,5000);
		setVisible(true);
		setTitle("ELECTRICAL STORE");
		constructui();
		designUI();
		handleevent();
		makeConnection();
		rs=st.executeQuery("Select * from buydetails");
		rs.first();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	public void makeConnection()
	{
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/electronic","root","");
			st=con.createStatement();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	
	}
	void constructui()
	{
	  	p1 = new JPanel();
		buy=new JButton("BUY");
		buy1=new JButton("BUY");
		buy2=new JButton("BUY");
		l1=new JLabel(new ImageIcon("gl.jpg"));
		t1 = new JTextField(10);
		t2 = new JTextField(10);
		t3 = new JTextField(10);
		t11 = new JTextField(10);
		t22 = new JTextField(10);
		t33 = new JTextField(10);
		l1=new JLabel(new ImageIcon("m.jpg"));
		l2=new JLabel(new ImageIcon("m2.jpg"));
		l3=new JLabel(new ImageIcon("m3.jpg"));
		b1=new JLabel("No of Item:");
		b2=new JLabel("No of Item:");
		b3=new JLabel("No of Item:");
		l4=new JLabel("TOTAL PRICE:");
		l5=new JLabel("TOTAL PRICE:");
		l6=new JLabel("TOTAL PRICE:");
	}
	public void designUI()
	{
		getContentPane().add(buy,BorderLayout.CENTER);
		buy.setBounds(160,500,280,50);
		getContentPane().add(buy1,BorderLayout.CENTER);
		buy1.setBounds(640,500,280,50);
		getContentPane().add(buy2,BorderLayout.CENTER);
		buy2.setBounds(1100,500,280,50);
		getContentPane().add(l1,BorderLayout.CENTER);
		l1.setBounds(150,80,300,250);
		getContentPane().add(l2,BorderLayout.CENTER);
		l2.setBounds(630,80,300,250);
		getContentPane().add(l3,BorderLayout.CENTER);
		l3.setBounds(1090,80,300,250);
		getContentPane().add(b1,BorderLayout.CENTER);
		b1.setBounds(160,400,100,90);
		getContentPane().add(b2,BorderLayout.CENTER);
		b2.setBounds(640,400,100,90);
		getContentPane().add(b3,BorderLayout.CENTER);
		b3.setBounds(1100,400,100,90);
		getContentPane().add(l4,BorderLayout.CENTER);
		l4.setBounds(160,600,300,90);
		getContentPane().add(l5,BorderLayout.CENTER);
		l5.setBounds(640,600,300,90);
		getContentPane().add(l6,BorderLayout.CENTER);
		l6.setBounds(1100,600,300,90);	
		getContentPane().add(t1,BorderLayout.CENTER);
		t1.setBounds(330,410,100,50);
		getContentPane().add(t2,BorderLayout.CENTER);
		t2.setBounds(810,410,100,50);
		getContentPane().add(t3,BorderLayout.CENTER);
		t3.setBounds(1270,410,100,50);
		getContentPane().add(t11,BorderLayout.CENTER);
		t11.setBounds(330,610,100,50);
		getContentPane().add(t22,BorderLayout.CENTER);
		t22.setBounds(810,610,100,50);
		getContentPane().add(t33,BorderLayout.CENTER);
		t33.setBounds(1270,610,100,50);
                 b1.setFont(new Font("Cooper",Font.BOLD,15));
		 b2.setFont(new Font("Cooper",Font.BOLD,15));
		 b3.setFont(new Font("Cooper",Font.BOLD,15));
                 l4.setFont(new Font("Cooper",Font.BOLD,15));
                 l5.setFont(new Font("Cooper",Font.BOLD,15));
                 l6.setFont(new Font("Cooper",Font.BOLD,15));       
		add(p1);
	}
	public void handleevent()
	{
	buy.addActionListener(new ActionListener()
	{
		public void actionPerformed(ActionEvent ae)
		{
		try{
				int p= Integer.parseInt(t1.getText());
				p*=500;
				t11.setText(p+"");
				String x =t11.getText();
				String y =t1.getText();
				String q = "MODERN MOUSE";
				st.executeUpdate("Insert into buydetails values('"+q+"','"+x+"','"+y+"')");
				JOptionPane.showMessageDialog(null,"Purchased Successfully!");
				  Thankyou f1=new Thankyou();
		}
		
				catch(Exception e)
		{
			System.out.println(e);
		}
		
				
	}});
	buy1.addActionListener(new ActionListener()
	{
		public void actionPerformed(ActionEvent ae)
		{
		try{
				int p = Integer.parseInt(t2.getText());
				p*=600;
				t22.setText(p+"");
				String x =t22.getText();
				String y =t2.getText();
				String q = "DIGITAL MOUSE";
				st.executeUpdate("Insert into buydetails values('"+q+"','"+x+"','"+y+"')");
				JOptionPane.showMessageDialog(null,"Purchased Successfully!");
				Thankyou f1=new Thankyou();
		}
				catch(Exception e)
		{
			System.out.println(e);
		}
		
				
	}});
	buy2.addActionListener(new ActionListener()
	{
		public void actionPerformed(ActionEvent ae)
		{
		try{
				int p = Integer.parseInt(t3.getText());
				p*=700;
				t33.setText(p+"");
				String x =t33.getText();
				String y =t3.getText();
				String q = "SMART MOUSE";
				st.executeUpdate("Insert into buydetails values('"+q+"','"+x+"','"+y+"')");
				JOptionPane.showMessageDialog(null,"Purchased Successfully!");
				Thankyou f1=new Thankyou();
		}
				catch(Exception e)
		{
			System.out.println(e);
		}
		
				
	}});
	}
}
class Sl extends JFrame
{	
	JPanel p1,p2,p3;
	JButton buy,buy1,buy2;
	JLabel l1,l2,l3,l4,l5,l6;
	JLabel b1,b2,b3;
	JTextField t1,t2,t3,t11,t22,t33;
	Connection con;
	Statement st;
	ResultSet rs;
	Sl()
	{ 	try{
		setSize(500,500);
		setVisible(true);
		setTitle("ELECTRICAL STORE");
		constructui();
		designUI();
		handleevent();
		makeConnection();
		rs=st.executeQuery("Select * from buydetails");
		rs.first();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	public void makeConnection()
	{
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/electronic","root","");
			st=con.createStatement();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	
	}
	void constructui()
	{
	  	p1 = new JPanel();
		buy=new JButton("BUY");
		buy1=new JButton("BUY");
		buy2=new JButton("BUY");
		l1=new JLabel(new ImageIcon("sl.jpg"));
		l2=new JLabel(new ImageIcon("sl2.jpg"));
		l3=new JLabel(new ImageIcon("sl3.jpg"));
		t1 = new JTextField(10);
		t2 = new JTextField(10);
		t3 = new JTextField(10);
		t11 = new JTextField(10);
		t22 = new JTextField(10);
		t33 = new JTextField(10);
		b1=new JLabel("No of Item:");
		b2=new JLabel("No of Item:");
		b3=new JLabel("No of Item:");
		l4=new JLabel("TOTAL PRICE:");
		l5=new JLabel("TOTAL PRICE:");
		l6=new JLabel("TOTAL PRICE:");
	}
	public void designUI()
	{
		getContentPane().add(buy,BorderLayout.CENTER);
		buy.setBounds(160,500,280,50);
		getContentPane().add(buy1,BorderLayout.CENTER);
		buy1.setBounds(640,500,280,50);
		getContentPane().add(buy2,BorderLayout.CENTER);
		buy2.setBounds(1100,500,280,50);
		getContentPane().add(l1,BorderLayout.CENTER);
		l1.setBounds(150,80,300,250);
		getContentPane().add(l2,BorderLayout.CENTER);
		l2.setBounds(630,80,300,250);
		getContentPane().add(l3,BorderLayout.CENTER);
		l3.setBounds(1090,80,300,250);
		getContentPane().add(b1,BorderLayout.CENTER);
		b1.setBounds(160,400,100,90);
		getContentPane().add(b2,BorderLayout.CENTER);
		b2.setBounds(640,400,100,90);
		getContentPane().add(b3,BorderLayout.CENTER);
		b3.setBounds(1100,400,100,90);
		getContentPane().add(l4,BorderLayout.CENTER);
		l4.setBounds(160,600,300,90);
		getContentPane().add(l5,BorderLayout.CENTER);
		l5.setBounds(640,600,300,90);
		getContentPane().add(l6,BorderLayout.CENTER);
		l6.setBounds(1100,600,300,90);	
		getContentPane().add(t1,BorderLayout.CENTER);
		t1.setBounds(330,410,100,50);
		getContentPane().add(t2,BorderLayout.CENTER);
		t2.setBounds(810,410,100,50);
		getContentPane().add(t3,BorderLayout.CENTER);
		t3.setBounds(1270,410,100,50);
		getContentPane().add(t11,BorderLayout.CENTER);
		t11.setBounds(330,610,100,50);
		getContentPane().add(t22,BorderLayout.CENTER);
		t22.setBounds(810,610,100,50);
		getContentPane().add(t33,BorderLayout.CENTER);
		t33.setBounds(1270,610,100,50);
                 b1.setFont(new Font("Cooper",Font.BOLD,15));
		 b2.setFont(new Font("Cooper",Font.BOLD,15));
		 b3.setFont(new Font("Cooper",Font.BOLD,15));
                 l4.setFont(new Font("Cooper",Font.BOLD,15));
                 l5.setFont(new Font("Cooper",Font.BOLD,15));
                 l6.setFont(new Font("Cooper",Font.BOLD,15));       
		add(p1);
	}
	public void handleevent()
	{
	buy.addActionListener(new ActionListener()
	{
		public void actionPerformed(ActionEvent ae)
		{
		try{
				int p= Integer.parseInt(t1.getText());
				p*=25000;
				t11.setText(p+"");
				String x =t11.getText();
				String y =t1.getText();
				String q = "HP";
				st.executeUpdate("Insert into buydetails values('"+q+"','"+x+"','"+y+"')");
				JOptionPane.showMessageDialog(null,"Purchased Successfully!");
				  Thankyou f1=new Thankyou();
		
		}
				catch(Exception e)
		{
			System.out.println(e);
		}
		
				
	}});
	buy1.addActionListener(new ActionListener()
	{
		public void actionPerformed(ActionEvent ae)
		{
		try{
				int p = Integer.parseInt(t2.getText());
				p*=28000;
				t22.setText(p+"");
				String x =t22.getText();
				String y =t2.getText();
				String q = "SAMSUNG";
				st.executeUpdate("Insert into buydetails values('"+q+"','"+x+"','"+y+"')");
				JOptionPane.showMessageDialog(null,"Purchased Successfully!");
				Thankyou f1=new Thankyou();
		}
				catch(Exception e)
		{
			System.out.println(e);
		}
		
				
	}});
	buy2.addActionListener(new ActionListener()
	{
		public void actionPerformed(ActionEvent ae)
		{
		try{
				int p = Integer.parseInt(t3.getText());
				p*=23000;
				t33.setText(p+"");
				String x =t33.getText();
				String y =t3.getText();
				String q = "DELL";
				st.executeUpdate("Insert into buydetails values('"+q+"','"+x+"','"+y+"')");
				JOptionPane.showMessageDialog(null,"Purchased Successfully!");
				  Thankyou f1=new Thankyou();
		
		}
				catch(Exception e)
		{
			System.out.println(e);
		}
		
				
	}});
	}
}
class Gl extends JFrame
{	
	JPanel p1,p2,p3;
	JButton buy,buy1,buy2;
	JLabel l1,l2,l3,l4,l5,l6;
	JLabel b1,b2,b3;
	JTextField t1,t2,t3,t11,t22,t33;
	Connection con;
	Statement st;
	ResultSet rs;
	Gl()
	{ 	try
		{
		setSize(500,500);
		setVisible(true);
		setTitle("ELECTRICAL STORE");
		constructui();
		designUI();
		handleevent();
		makeConnection();
		rs=st.executeQuery("Select * from buydetails");
		rs.first();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	public void makeConnection()
	{
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/electronic","root","");
			st=con.createStatement();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	
	}
	void constructui()
	{
	  	p1 = new JPanel();
		buy=new JButton("BUY");
		buy1=new JButton("BUY");
		buy2=new JButton("BUY");
		l1=new JLabel(new ImageIcon("gl.jpg"));
		l2=new JLabel(new ImageIcon("gl2.jpg"));
		l3=new JLabel(new ImageIcon("gl3.jpg"));
		t1 = new JTextField(10);
		t2 = new JTextField(10);
		t3 = new JTextField(10);
		t11 = new JTextField(10);
		t22 = new JTextField(10);
		t33 = new JTextField(10);
		b1=new JLabel("No of Item:");
		b2=new JLabel("No of Item:");
		b3=new JLabel("No of Item:");
                l4=new JLabel("TOTAL PRICE:");
		l5=new JLabel("TOTAL PRICE:");
		l6=new JLabel("TOTAL PRICE:");
	}
	public void designUI()
	{
		getContentPane().add(buy,BorderLayout.CENTER);
		buy.setBounds(160,500,280,50);
		getContentPane().add(buy1,BorderLayout.CENTER);
		buy1.setBounds(640,500,280,50);
		getContentPane().add(buy2,BorderLayout.CENTER);
		buy2.setBounds(1100,500,280,50);
		getContentPane().add(l1,BorderLayout.CENTER);
		l1.setBounds(150,80,300,250);
		getContentPane().add(l2,BorderLayout.CENTER);
		l2.setBounds(630,80,300,250);
		getContentPane().add(l3,BorderLayout.CENTER);
		l3.setBounds(1090,80,300,250);
		getContentPane().add(b1,BorderLayout.CENTER);
		b1.setBounds(160,400,100,90);
		getContentPane().add(b2,BorderLayout.CENTER);
		b2.setBounds(640,400,100,90);
		getContentPane().add(b3,BorderLayout.CENTER);
		b3.setBounds(1100,400,100,90);
		getContentPane().add(l4,BorderLayout.CENTER);
		l4.setBounds(160,600,300,90);
		getContentPane().add(l5,BorderLayout.CENTER);
		l5.setBounds(640,600,300,90);
		getContentPane().add(l6,BorderLayout.CENTER);
		l6.setBounds(1100,600,300,90);	
		getContentPane().add(t1,BorderLayout.CENTER);
		t1.setBounds(330,410,100,50);
		getContentPane().add(t2,BorderLayout.CENTER);
		t2.setBounds(810,410,100,50);
		getContentPane().add(t3,BorderLayout.CENTER);
		t3.setBounds(1270,410,100,50);
		getContentPane().add(t11,BorderLayout.CENTER);
		t11.setBounds(330,610,100,50);
		getContentPane().add(t22,BorderLayout.CENTER);
		t22.setBounds(810,610,100,50);
		getContentPane().add(t33,BorderLayout.CENTER);
		t33.setBounds(1270,610,100,50);
                 b1.setFont(new Font("Cooper",Font.BOLD,15));
		 b2.setFont(new Font("Cooper",Font.BOLD,15));
		 b3.setFont(new Font("Cooper",Font.BOLD,15));
                 l4.setFont(new Font("Cooper",Font.BOLD,15));
                 l5.setFont(new Font("Cooper",Font.BOLD,15));
                 l6.setFont(new Font("Cooper",Font.BOLD,15));       
		add(p1);
	}
	public void handleevent()
	{
	buy.addActionListener(new ActionListener()
	{
		public void actionPerformed(ActionEvent ae)
		{
		try{
				int p= Integer.parseInt(t1.getText());
				p*=35000;
				t11.setText(p+"");
				String x =t11.getText();
				String y =t1.getText();
				String q = "HP";
				st.executeUpdate("Insert into buydetails values('"+q+"','"+x+"','"+y+"')");

				JOptionPane.showMessageDialog(null,"Purchased Successfully!");
				  Thankyou f1=new Thankyou();
		}
		
				catch(Exception e)
		{
			System.out.println(e);
		}
		
				
	}});
	buy1.addActionListener(new ActionListener()
	{
		public void actionPerformed(ActionEvent ae)
		{
		try{
				int p = Integer.parseInt(t2.getText());
				p*=33000;
				t22.setText(p+"");
				String x =t22.getText();
				String y =t2.getText();
				String q = "SAMSUNG";
				st.executeUpdate("Insert into buydetails values('"+q+"','"+x+"','"+y+"')");
				JOptionPane.showMessageDialog(null,"Purchased Successfully!");
				Thankyou f1=new Thankyou();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
				
	}});
	buy2.addActionListener(new ActionListener()
	{
		public void actionPerformed(ActionEvent ae)
		{
		try{
				int p = Integer.parseInt(t3.getText());
				p*=38000;
				t33.setText(p+"");
				String x =t33.getText();
				String y =t3.getText();
				String q = "DELL";
				st.executeUpdate("Insert into buydetails values('"+q+"','"+x+"','"+y+"')");
				JOptionPane.showMessageDialog(null,"Purchased Successfully!");
				 Thankyou f1=new Thankyou();
		
		}

				catch(Exception e)
		{
			System.out.println(e);
		}
		
				
	}});
	}
}
class Bl extends JFrame
{	
	JPanel p1,p2,p3;
	JButton buy,buy1,buy2;
	JTextField t1,t2,t3,t11,t22,t33;
	JLabel l1,l2,l3,b1,b2,b3,l4,l5,l6;
	Connection con;
	Statement st;
	ResultSet rs;
	Bl()
	{ 	try
		{
		setSize(500,500);
		setVisible(true);
		setTitle("ELECTRICAL STORE");
		constructui();
		designUI();
		handleevent();
		makeConnection();
		rs=st.executeQuery("Select * from buydetails");
		rs.first();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	public void makeConnection()
	{
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/electronic","root","");
			st=con.createStatement();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	
	}
	void constructui()
	{
	  	p1 = new JPanel();
		buy=new JButton("BUY");
		buy1=new JButton("BUY");
		buy2=new JButton("BUY");
		l1=new JLabel(new ImageIcon("bl1.jpg"));
		l2=new JLabel(new ImageIcon("bl2.jpg"));
		b1=new JLabel("No of Item:");
		b2=new JLabel("No of Item:");
		b3=new JLabel("No of Item:");
		t1 = new JTextField(10);
		t2 = new JTextField(10);
		t3 = new JTextField(10);
		t11 = new JTextField(10);
		t22 = new JTextField(10);
		t33 = new JTextField(10);
		l4=new JLabel("TOTAL PRICE:");
		l5=new JLabel("TOTAL PRICE:");
		l6=new JLabel("TOTAL PRICE:");
		
	}
	public void designUI()
	{
		getContentPane().add(buy,BorderLayout.CENTER);
		buy.setBounds(160,500,280,50);
		getContentPane().add(buy1,BorderLayout.CENTER);
		buy1.setBounds(640,500,280,50);
		getContentPane().add(buy2,BorderLayout.CENTER);
		buy2.setBounds(1100,500,280,50);
		getContentPane().add(l1,BorderLayout.CENTER);
		l1.setBounds(150,80,300,250);
		getContentPane().add(l2,BorderLayout.CENTER);
		l2.setBounds(630,80,300,250);
		getContentPane().add(l3,BorderLayout.CENTER);
		l3.setBounds(1090,80,300,250);
		getContentPane().add(b1,BorderLayout.CENTER);
		b1.setBounds(160,400,100,90);
		getContentPane().add(b2,BorderLayout.CENTER);
		b2.setBounds(640,400,100,90);
		getContentPane().add(b3,BorderLayout.CENTER);
		b3.setBounds(1100,400,100,90);
		getContentPane().add(l4,BorderLayout.CENTER);
		l4.setBounds(160,600,300,90);
		getContentPane().add(l5,BorderLayout.CENTER);
		l5.setBounds(640,600,300,90);
		getContentPane().add(l6,BorderLayout.CENTER);
		l6.setBounds(1100,600,300,90);	
		getContentPane().add(t1,BorderLayout.CENTER);
		t1.setBounds(330,410,100,50);
		getContentPane().add(t2,BorderLayout.CENTER);
		t2.setBounds(810,410,100,50);
		getContentPane().add(t3,BorderLayout.CENTER);
		t3.setBounds(1270,410,100,50);
		getContentPane().add(t11,BorderLayout.CENTER);
		t11.setBounds(330,610,100,50);
		getContentPane().add(t22,BorderLayout.CENTER);
		t22.setBounds(810,610,100,50);
		getContentPane().add(t33,BorderLayout.CENTER);
		t33.setBounds(1270,610,100,50);
                 b1.setFont(new Font("Cooper",Font.BOLD,15));
		 b2.setFont(new Font("Cooper",Font.BOLD,15));
		 b3.setFont(new Font("Cooper",Font.BOLD,15));
                 l4.setFont(new Font("Cooper",Font.BOLD,15));
                 l5.setFont(new Font("Cooper",Font.BOLD,15));
                 l6.setFont(new Font("Cooper",Font.BOLD,15));       
		add(p1);
	}
	public void handleevent()
	{
	buy.addActionListener(new ActionListener()
	{
		public void actionPerformed(ActionEvent ae)
		{
		try{
				int p= Integer.parseInt(t1.getText());
				p*=40000;
				t11.setText(p+"");
				String x =t11.getText();
				String y =t1.getText();
				String q = "HP";
				st.executeUpdate("Insert into buydetails values('"+q+"','"+x+"','"+y+"')");

				JOptionPane.showMessageDialog(null,"Purchased Successfully!");
				  Thankyou f1=new Thankyou();
		
		}
				catch(Exception e)
		{
			System.out.println(e);
		}
		
				
	}});
	buy1.addActionListener(new ActionListener()
	{
		public void actionPerformed(ActionEvent ae)
		{
		try{
				int p = Integer.parseInt(t2.getText());
				p*=37000;
				t22.setText(p+"");
				String x =t22.getText();
				String y =t2.getText();
				String q = "SAMSUNG";
				st.executeUpdate("Insert into buydetails values('"+q+"','"+x+"','"+y+"')");
				JOptionPane.showMessageDialog(null,"Purchased Successfully!");
				Thankyou f1=new Thankyou();
		}
				catch(Exception e)
		{
			System.out.println(e);
		}
		
				
	}});
	buy2.addActionListener(new ActionListener()
	{
		public void actionPerformed(ActionEvent ae)
		{
		try{
				int p = Integer.parseInt(t3.getText());
				p*=43000;
				t33.setText(p+"");
				String x =t33.getText();
				String y =t3.getText();
				String q = "DELL";
				st.executeUpdate("Insert into buydetails values('"+q+"','"+x+"','"+y+"')");
				JOptionPane.showMessageDialog(null,"Purchased Successfully!");
				Thankyou f1=new Thankyou();
		}
				catch(Exception e)
		{
			System.out.println(e);
		}
		
				
	}});
	}
}
class Led extends JFrame
{	
	JPanel p1,p2,p3;
	JButton buy,buy1,buy2;
	JLabel l1,l2,l3,l4,l5,l6;
	JLabel b1,b2,b3;
	JTextField t1,t2,t3,t11,t22,t33;
	Connection con;
	Statement st;
	ResultSet rs;
	Led()
	{ 	try
		{
		setSize(500,500);
		setVisible(true);
		setTitle("ELECTRICAL STORE");
		constructui();
		designUI();
		handleevent();
		makeConnection();
		rs=st.executeQuery("Select * from buydetails");
		rs.first();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	public void makeConnection()
	{
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/electronic","root","");
			st=con.createStatement();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	
	}
	void constructui()
	{
	  	p1 = new JPanel();
		buy=new JButton("BUY");
		buy1=new JButton("BUY");
		buy2=new JButton("BUY");
		l1=new JLabel(new ImageIcon("l.jpg"));
		l2=new JLabel(new ImageIcon("l2.jpg"));
		l3=new JLabel(new ImageIcon("l3.jpg"));
		t1 = new JTextField(10);
		t2 = new JTextField(10);
		t3 = new JTextField(10);
		t11 = new JTextField(10);
		t22 = new JTextField(10);
		t33 = new JTextField(10);
		b1=new JLabel("No of Item:");
		b2=new JLabel("No of Item:");
		b3=new JLabel("No of Item:");
		l4=new JLabel("TOTAL PRICE:");
		l5=new JLabel("TOTAL PRICE:");
		l6=new JLabel("TOTAL PRICE:");
		
	}
	public void designUI()
	{
		getContentPane().add(buy,BorderLayout.CENTER);
		buy.setBounds(160,500,280,50);
		getContentPane().add(buy1,BorderLayout.CENTER);
		buy1.setBounds(640,500,280,50);
		getContentPane().add(buy2,BorderLayout.CENTER);
		buy2.setBounds(1100,500,280,50);
		getContentPane().add(l1,BorderLayout.CENTER);
		l1.setBounds(150,80,300,250);
		getContentPane().add(l2,BorderLayout.CENTER);
		l2.setBounds(630,80,300,250);
		getContentPane().add(l3,BorderLayout.CENTER);
		l3.setBounds(1090,80,300,250);
		getContentPane().add(b1,BorderLayout.CENTER);
		b1.setBounds(160,400,100,90);
		getContentPane().add(b2,BorderLayout.CENTER);
		b2.setBounds(640,400,100,90);
		getContentPane().add(b3,BorderLayout.CENTER);
		b3.setBounds(1100,400,100,90);
		getContentPane().add(l4,BorderLayout.CENTER);
		l4.setBounds(160,600,300,90);
		getContentPane().add(l5,BorderLayout.CENTER);
		l5.setBounds(640,600,300,90);
		getContentPane().add(l6,BorderLayout.CENTER);
		l6.setBounds(1100,600,300,90);	
		getContentPane().add(t1,BorderLayout.CENTER);
		t1.setBounds(330,410,100,50);
		getContentPane().add(t2,BorderLayout.CENTER);
		t2.setBounds(810,410,100,50);
		getContentPane().add(t3,BorderLayout.CENTER);
		t3.setBounds(1270,410,100,50);
		getContentPane().add(t11,BorderLayout.CENTER);
		t11.setBounds(330,610,100,50);
		getContentPane().add(t22,BorderLayout.CENTER);
		t22.setBounds(810,610,100,50);
		getContentPane().add(t33,BorderLayout.CENTER);
		t33.setBounds(1270,610,100,50);
                 b1.setFont(new Font("Cooper",Font.BOLD,15));
		 b2.setFont(new Font("Cooper",Font.BOLD,15));
		 b3.setFont(new Font("Cooper",Font.BOLD,15));
                 l4.setFont(new Font("Cooper",Font.BOLD,15));
                 l5.setFont(new Font("Cooper",Font.BOLD,15));
                 l6.setFont(new Font("Cooper",Font.BOLD,15));       
		add(p1);
	}
	public void handleevent()
	{
	buy.addActionListener(new ActionListener()
	{
		public void actionPerformed(ActionEvent ae)
		{
		try{
				int p= Integer.parseInt(t1.getText());
				p*=1000;
				t11.setText(p+"");
				String x =t11.getText();
				String y =t1.getText();
				String q = "PHILIPS LED";
				st.executeUpdate("Insert into buydetails values('"+q+"','"+x+"','"+y+"')");
				JOptionPane.showMessageDialog(null,"Purchased Successfully!");
				Thankyou f1=new Thankyou();
		}
				catch(Exception e)
		{
			System.out.println(e);
		}
		
				
	}});
	buy1.addActionListener(new ActionListener()
	{
		public void actionPerformed(ActionEvent ae)
		{
		try{
				int p = Integer.parseInt(t2.getText());
				p*=800;
				t22.setText(p+"");
				String x =t22.getText();
				String y =t2.getText();
				String q = "ASANTA LED";
				st.executeUpdate("Insert into buydetails values('"+q+"','"+x+"','"+y+"')");
				JOptionPane.showMessageDialog(null,"Purchased Successfully!");
				Thankyou f1=new Thankyou();
		}
				catch(Exception e)
		{
			System.out.println(e);
		}
		
				
	}});
	buy2.addActionListener(new ActionListener()
	{
		public void actionPerformed(ActionEvent ae)
		{
		try{
				int p = Integer.parseInt(t3.getText());
				p*=900;
				t33.setText(p+"");
				String x =t33.getText();
				String y =t3.getText();
				String q = "LED PAIR";
				st.executeUpdate("Insert into buydetails values('"+q+"','"+x+"','"+y+"')");
				JOptionPane.showMessageDialog(null,"Purchased Successfully!");
				Thankyou f1=new Thankyou();
		}
				catch(Exception e)
		{
			System.out.println(e);
		}
		
				
	}});
	}
}
class Tube extends JFrame
{	
	JPanel p1,p2,p3;
	JButton buy,buy1,buy2;
	JLabel l1,l2,l3,l4,l5,l6;
	JLabel b1,b2,b3;
	JTextField t1,t2,t3,t11,t22,t33;
	Connection con;
	Statement st;
	ResultSet rs;
	Tube()
	{ 	try
		{
		setSize(500,500);
		setVisible(true);
		setTitle("ELECTRICAL STORE");
		constructui();
		designUI();
		handleevent();
		makeConnection();
		rs=st.executeQuery("Select * from buydetails");
		rs.first();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	public void makeConnection()
	{
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/electronic","root","");
			st=con.createStatement();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	
	}
	void constructui()
	{
	  	p1 = new JPanel();
		buy=new JButton("BUY");
		buy1=new JButton("BUY");
		buy2=new JButton("BUY");
		l1=new JLabel(new ImageIcon("t.jpg"));
		l2=new JLabel(new ImageIcon("t2.jpg"));
		l3=new JLabel(new ImageIcon("t3.jpg"));
		t1 = new JTextField(10);
		t2 = new JTextField(10);
		t3 = new JTextField(10);
		t11 = new JTextField(10);
		t22 = new JTextField(10);
		t33 = new JTextField(10);
		b1=new JLabel("No of Item:");
		b2=new JLabel("No of Item:");
		b3=new JLabel("No of Item:");
		l4=new JLabel("TOTAL PRICE:");
		l5=new JLabel("TOTAL PRICE:");
		l6=new JLabel("TOTAL PRICE:");
		
	}
	public void designUI()
	{
		getContentPane().add(buy,BorderLayout.CENTER);
		buy.setBounds(160,500,280,50);
		getContentPane().add(buy1,BorderLayout.CENTER);
		buy1.setBounds(640,500,280,50);
		getContentPane().add(buy2,BorderLayout.CENTER);
		buy2.setBounds(1100,500,280,50);
		getContentPane().add(l1,BorderLayout.CENTER);
		l1.setBounds(150,80,300,250);
		getContentPane().add(l2,BorderLayout.CENTER);
		l2.setBounds(630,80,300,250);
		getContentPane().add(l3,BorderLayout.CENTER);
		l3.setBounds(1090,80,300,250);
		getContentPane().add(b1,BorderLayout.CENTER);
		b1.setBounds(160,400,100,90);
		getContentPane().add(b2,BorderLayout.CENTER);
		b2.setBounds(640,400,100,90);
		getContentPane().add(b3,BorderLayout.CENTER);
		b3.setBounds(1100,400,100,90);
		getContentPane().add(l4,BorderLayout.CENTER);
		l4.setBounds(160,600,300,90);
		getContentPane().add(l5,BorderLayout.CENTER);
		l5.setBounds(640,600,300,90);
		getContentPane().add(l6,BorderLayout.CENTER);
		l6.setBounds(1100,600,300,90);	
		getContentPane().add(t1,BorderLayout.CENTER);
		t1.setBounds(330,410,100,50);
		getContentPane().add(t2,BorderLayout.CENTER);
		t2.setBounds(810,410,100,50);
		getContentPane().add(t3,BorderLayout.CENTER);
		t3.setBounds(1270,410,100,50);
		getContentPane().add(t11,BorderLayout.CENTER);
		t11.setBounds(330,610,100,50);
		getContentPane().add(t22,BorderLayout.CENTER);
		t22.setBounds(810,610,100,50);
		getContentPane().add(t33,BorderLayout.CENTER);
		t33.setBounds(1270,610,100,50);
                 b1.setFont(new Font("Cooper",Font.BOLD,15));
		 b2.setFont(new Font("Cooper",Font.BOLD,15));
		 b3.setFont(new Font("Cooper",Font.BOLD,15));
                 l4.setFont(new Font("Cooper",Font.BOLD,15));
                 l5.setFont(new Font("Cooper",Font.BOLD,15));
                 l6.setFont(new Font("Cooper",Font.BOLD,15));       
		add(p1);
	}
	public void handleevent()
	{
	buy.addActionListener(new ActionListener()
	{
		public void actionPerformed(ActionEvent ae)
		{
		try{
				int p= Integer.parseInt(t1.getText());
				p*=1200;
				t11.setText(p+"");
				String x =t11.getText();
				String y =t1.getText();
				String q = "PHILIPS TUBE";
				st.executeUpdate("Insert into buydetails values('"+q+"','"+x+"','"+y+"')");

				JOptionPane.showMessageDialog(null,"Purchased Successfully!");
				  Thankyou f1=new Thankyou();
		
		}
				catch(Exception e)
		{
			System.out.println(e);
		}
		
				
	}});
	buy1.addActionListener(new ActionListener()
	{
		public void actionPerformed(ActionEvent ae)
		{
		try{
				int p = Integer.parseInt(t2.getText());
				p*=1500;
				t22.setText(p+"");
				String x =t22.getText();
				String y =t2.getText();
				String q = "NORMAL TUBE";
				st.executeUpdate("Insert into buydetails values('"+q+"','"+x+"','"+y+"')");
				JOptionPane.showMessageDialog(null,"Purchased Successfully!");
				Thankyou f1=new Thankyou();
		}
				catch(Exception e)
		{
			System.out.println(e);
		}
		
				
	}});
	buy2.addActionListener(new ActionListener()
	{
		public void actionPerformed(ActionEvent ae)
		{
		try{
				int p = Integer.parseInt(t3.getText());
				p*=1700;
				t33.setText(p+"");
				String x =t33.getText();
				String y =t3.getText();
				String q = "TUBELIGHT";
				st.executeUpdate("Insert into buydetails values('"+q+"','"+x+"','"+y+"')");

				JOptionPane.showMessageDialog(null,"Purchased Successfully!");

				  Thankyou f1=new Thankyou();	
		}
				catch(Exception e)
		{
			System.out.println(e);
		}
		
				
	}});
	}
}
class Fan extends JFrame
{	
	JPanel p1,p2,p3;
	JButton buy,buy1,buy2;
	JLabel l1,l2,l3,l4,l5,l6;
	JLabel b1,b2,b3;
	JTextField t1,t2,t3,t11,t22,t33;
	Connection con;
	Statement st;
	ResultSet rs;
	Fan()
	{ 	try
		{
		setSize(500,500);
		setVisible(true);
		setTitle("ELECTRICAL STORE");
		constructui();
		designUI();
		handleevent();
		makeConnection();
		rs=st.executeQuery("Select * from buydetails");
		rs.first();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	public void makeConnection()
	{
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/electronic","root","");
			st=con.createStatement();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	
	}
	void constructui()
	{
	  	p1 = new JPanel();
		buy=new JButton("BUY");
		buy1=new JButton("BUY");
		buy2=new JButton("BUY");
		l1=new JLabel(new ImageIcon("gl.jpg"));
		t1 = new JTextField(10);
		t2 = new JTextField(10);
		t3 = new JTextField(10);
		t11 = new JTextField(10);
		t22 = new JTextField(10);
		t33 = new JTextField(10);
		l1=new JLabel(new ImageIcon("f.jpg"));
		l2=new JLabel(new ImageIcon("f2.jpg"));
		l3=new JLabel(new ImageIcon("f3.jpg"));
		b1=new JLabel("No of Item:");
		b2=new JLabel("No of Item:");
		b3=new JLabel("No of Item:");
		l4=new JLabel("TOTAL PRICE:");
		l5=new JLabel("TOTAL PRICE:");
		l6=new JLabel("TOTAL PRICE:");
	}
	public void designUI()
	{
		getContentPane().add(buy,BorderLayout.CENTER);
		buy.setBounds(160,500,280,50);
		getContentPane().add(buy1,BorderLayout.CENTER);
		buy1.setBounds(640,500,280,50);
		getContentPane().add(buy2,BorderLayout.CENTER);
		buy2.setBounds(1100,500,280,50);
		getContentPane().add(l1,BorderLayout.CENTER);
		l1.setBounds(150,80,300,250);
		getContentPane().add(l2,BorderLayout.CENTER);
		l2.setBounds(630,80,300,250);
		getContentPane().add(l3,BorderLayout.CENTER);
		l3.setBounds(1090,80,300,250);
		getContentPane().add(b1,BorderLayout.CENTER);
		b1.setBounds(160,400,100,90);
		getContentPane().add(b2,BorderLayout.CENTER);
		b2.setBounds(640,400,100,90);
		getContentPane().add(b3,BorderLayout.CENTER);
		b3.setBounds(1100,400,100,90);
		getContentPane().add(l4,BorderLayout.CENTER);
		l4.setBounds(160,600,300,90);
		getContentPane().add(l5,BorderLayout.CENTER);
		l5.setBounds(640,600,300,90);
		getContentPane().add(l6,BorderLayout.CENTER);
		l6.setBounds(1100,600,300,90);	
		getContentPane().add(t1,BorderLayout.CENTER);
		t1.setBounds(330,410,100,50);
		getContentPane().add(t2,BorderLayout.CENTER);
		t2.setBounds(810,410,100,50);
		getContentPane().add(t3,BorderLayout.CENTER);
		t3.setBounds(1270,410,100,50);
		getContentPane().add(t11,BorderLayout.CENTER);
		t11.setBounds(330,610,100,50);
		getContentPane().add(t22,BorderLayout.CENTER);
		t22.setBounds(810,610,100,50);
		getContentPane().add(t33,BorderLayout.CENTER);
		t33.setBounds(1270,610,100,50);
                 b1.setFont(new Font("Cooper",Font.BOLD,15));
		 b2.setFont(new Font("Cooper",Font.BOLD,15));
		 b3.setFont(new Font("Cooper",Font.BOLD,15));
                 l4.setFont(new Font("Cooper",Font.BOLD,15));
                 l5.setFont(new Font("Cooper",Font.BOLD,15));
                 l6.setFont(new Font("Cooper",Font.BOLD,15));       
		add(p1);
	}
	public void handleevent()
	{
	buy.addActionListener(new ActionListener()
	{
		public void actionPerformed(ActionEvent ae)
		{
		try{
				int p= Integer.parseInt(t1.getText());
				p*=800;
				t11.setText(p+"");
				String x =t11.getText();
				String y =t1.getText();
				String q = "CROMPTON FAN";
				st.executeUpdate("Insert into buydetails values('"+q+"','"+x+"','"+y+"')");
				JOptionPane.showMessageDialog(null,"Purchased Successfully!");
				Thankyou f1=new Thankyou();
		}
				catch(Exception e)
		{
			System.out.println(e);
		}
		
				
	}});
	buy1.addActionListener(new ActionListener()
	{
		public void actionPerformed(ActionEvent ae)
		{
		try{
				int p = Integer.parseInt(t2.getText());
				p*=700;
				t22.setText(p+"");
				String x =t22.getText();
				String y =t2.getText();
				String q = "PHILIPS FAN";
				st.executeUpdate("Insert into buydetails values('"+q+"','"+x+"','"+y+"')");
				JOptionPane.showMessageDialog(null,"Purchased Successfully!");
				Thankyou f1=new Thankyou();
		}
				catch(Exception e)
		{
			System.out.println(e);
		}
		
				
	}});
	buy2.addActionListener(new ActionListener()
	{
		public void actionPerformed(ActionEvent ae)
		{
		try{
				int p = Integer.parseInt(t3.getText());
				p*=1200;
				t33.setText(p+"");
				String x =t33.getText();
				String y =t3.getText();
				String q = "USHA FAN";
				st.executeUpdate("Insert into buydetails values('"+q+"','"+x+"','"+y+"')");
				JOptionPane.showMessageDialog(null,"Purchased Successfully!");
				  Thankyou f1=new Thankyou();
		}
				catch(Exception e)
		{
			System.out.println(e);
		}
		
				
	}});
	}
}
class Ac extends JFrame
{	
	JPanel p1,p2,p3;
	JButton buy,buy1,buy2;
	JLabel l1,l2,l3,l4,l5,l6;
	JLabel b1,b2,b3;
	JTextField t1,t2,t3,t11,t22,t33;
	Connection con;
	Statement st;
	ResultSet rs;
	Ac()
	{ 	try
		{
		setSize(500,500);
		setVisible(true);
		setTitle("ELECTRICAL STORE");
		constructui();
		designUI();
                handleevent();
		makeConnection();
		rs=st.executeQuery("Select * from buydetails");
		rs.first();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	public void makeConnection()
	{
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/electronic","root","");
			st=con.createStatement();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	
	}
	void constructui()
	{
	  	p1 = new JPanel();
		buy=new JButton("BUY");
		buy1=new JButton("BUY");
		buy2=new JButton("BUY");
		l1=new JLabel(new ImageIcon("ac.jpg"));
		l2=new JLabel(new ImageIcon("ac2.jpg"));
		l3=new JLabel(new ImageIcon("ac3.jpg"));
		t1 = new JTextField(10);
		t2 = new JTextField(10);
		t3 = new JTextField(10);
		t11 = new JTextField(10);
		t22 = new JTextField(10);
		t33 = new JTextField(10);
		b1=new JLabel("No of Item:");
		b2=new JLabel("No of Item:");
		b3=new JLabel("No of Item:");
	        l4=new JLabel("TOTAL PRICE:");
		l5=new JLabel("TOTAL PRICE:");
		l6=new JLabel("TOTAL PRICE:");
	}
	public void designUI()
	{
		getContentPane().add(buy,BorderLayout.CENTER);
		buy.setBounds(160,500,280,50);
		getContentPane().add(buy1,BorderLayout.CENTER);
		buy1.setBounds(640,500,280,50);
		getContentPane().add(buy2,BorderLayout.CENTER);
		buy2.setBounds(1100,500,280,50);
		getContentPane().add(l1,BorderLayout.CENTER);
		l1.setBounds(150,80,300,250);
		getContentPane().add(l2,BorderLayout.CENTER);
		l2.setBounds(630,80,300,250);
		getContentPane().add(l3,BorderLayout.CENTER);
		l3.setBounds(1090,80,300,250);
		getContentPane().add(b1,BorderLayout.CENTER);
		b1.setBounds(160,400,100,90);
		getContentPane().add(b2,BorderLayout.CENTER);
		b2.setBounds(640,400,100,90);
		getContentPane().add(b3,BorderLayout.CENTER);
		b3.setBounds(1100,400,100,90);
		getContentPane().add(l4,BorderLayout.CENTER);
		l4.setBounds(160,600,300,90);
		getContentPane().add(l5,BorderLayout.CENTER);
		l5.setBounds(640,600,300,90);
		getContentPane().add(l6,BorderLayout.CENTER);
		l6.setBounds(1100,600,300,90);	
		getContentPane().add(t1,BorderLayout.CENTER);
		t1.setBounds(330,410,100,50);
		getContentPane().add(t2,BorderLayout.CENTER);
		t2.setBounds(810,410,100,50);
		getContentPane().add(t3,BorderLayout.CENTER);
		t3.setBounds(1270,410,100,50);
		getContentPane().add(t11,BorderLayout.CENTER);
		t11.setBounds(330,610,100,50);
		getContentPane().add(t22,BorderLayout.CENTER);
		t22.setBounds(810,610,100,50);
		getContentPane().add(t33,BorderLayout.CENTER);
		t33.setBounds(1270,610,100,50);
                 b1.setFont(new Font("Cooper",Font.BOLD,15));
		 b2.setFont(new Font("Cooper",Font.BOLD,15));
		 b3.setFont(new Font("Cooper",Font.BOLD,15));
                 l4.setFont(new Font("Cooper",Font.BOLD,15));
                 l5.setFont(new Font("Cooper",Font.BOLD,15));
                 l6.setFont(new Font("Cooper",Font.BOLD,15));       
		add(p1);
	}
	public void handleevent()
	{
	buy.addActionListener(new ActionListener()
	{
		public void actionPerformed(ActionEvent ae)
		{
		try{
				int p= Integer.parseInt(t1.getText());
				p*=35000;
				t11.setText(p+"");
				String x =t11.getText();
				String y =t1.getText();
				String q = "CROMPTON AC";
				st.executeUpdate("Insert into buydetails values('"+q+"','"+x+"','"+y+"')");
				JOptionPane.showMessageDialog(null,"Purchased Successfully!");
				  Thankyou f1=new Thankyou();
		}
				catch(Exception e)
		{
			System.out.println(e);
		}
		
				
	}});
	buy1.addActionListener(new ActionListener()
	{
		public void actionPerformed(ActionEvent ae)
		{
		try{
				int p = Integer.parseInt(t2.getText());
				p*=32000;
				t22.setText(p+"");
				String x =t22.getText();
				String y =t2.getText();
				String q = "USHA AC";
				st.executeUpdate("Insert into buydetails values('"+q+"','"+x+"','"+y+"')");
				JOptionPane.showMessageDialog(null,"Purchased Successfully!");
				Thankyou f1=new Thankyou();
		}
				catch(Exception e)
		{
			System.out.println(e);
		}
		
				
	}});
	buy2.addActionListener(new ActionListener()
	{
		public void actionPerformed(ActionEvent ae)
		{
		try{
				int p = Integer.parseInt(t3.getText());
				p*=29000;
				t33.setText(p+"");
				String x =t33.getText();
				String y =t3.getText();
				String q = "GEORGE AC";
				st.executeUpdate("Insert into buydetails values('"+q+"','"+x+"','"+y+"')");
				JOptionPane.showMessageDialog(null,"Purchased Successfully!");
				Thankyou f1=new Thankyou();
		}
				catch(Exception e)
		{
			System.out.println(e);
		}
		
				
	}});
	}
}
class Fridge extends JFrame
{	
	JPanel p1,p2,p3;
	JButton buy,buy1,buy2;
	JLabel l1,l2,l3,l4,l5,l6;
	JLabel b1,b2,b3;
	JTextField t1,t2,t3,t11,t22,t33;
	Connection con;
	Statement st;
	ResultSet rs;
	Fridge()
	{ 	try
		{
		setSize(500,500);
		setVisible(true);
		setTitle("ELECTRICAL STORE");
		constructui();
		designUI();
		handleevent();
		makeConnection();
		rs=st.executeQuery("Select * from buydetails");
		rs.first();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	public void makeConnection()
	{
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/electronic","root","");
			st=con.createStatement();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	
	}
	void constructui()
	{
	  	p1 = new JPanel();
		buy=new JButton("BUY");
		buy1=new JButton("BUY");
		buy2=new JButton("BUY");
		l1=new JLabel(new ImageIcon("fr.jpg"));
		l2=new JLabel(new ImageIcon("fr2.jpg"));
		l3=new JLabel(new ImageIcon("fr3.jpg"));
		t1 = new JTextField(10);
		t2 = new JTextField(10);
		t3 = new JTextField(10);
		t11 = new JTextField(10);
		t22 = new JTextField(10);
		t33 = new JTextField(10);
		b1=new JLabel("No of Item:");
		b2=new JLabel("No of Item:");
		b3=new JLabel("No of Item:");
	        l4=new JLabel("TOTAL PRICE:");
		l5=new JLabel("TOTAL PRICE:");
		l6=new JLabel("TOTAL PRICE:");
	}
	public void designUI()
	{
		getContentPane().add(buy,BorderLayout.CENTER);
		buy.setBounds(160,500,280,50);
		getContentPane().add(buy1,BorderLayout.CENTER);
		buy1.setBounds(640,500,280,50);
		getContentPane().add(buy2,BorderLayout.CENTER);
		buy2.setBounds(1100,500,280,50);
		getContentPane().add(l1,BorderLayout.CENTER);
		l1.setBounds(150,80,300,250);
		getContentPane().add(l2,BorderLayout.CENTER);
		l2.setBounds(630,80,300,250);
		getContentPane().add(l3,BorderLayout.CENTER);
		l3.setBounds(1090,80,300,250);
		getContentPane().add(b1,BorderLayout.CENTER);
		b1.setBounds(160,400,100,90);
		getContentPane().add(b2,BorderLayout.CENTER);
		b2.setBounds(640,400,100,90);
		getContentPane().add(b3,BorderLayout.CENTER);
		b3.setBounds(1100,400,100,90);
		getContentPane().add(l4,BorderLayout.CENTER);
		l4.setBounds(160,600,300,90);
		getContentPane().add(l5,BorderLayout.CENTER);
		l5.setBounds(640,600,300,90);
		getContentPane().add(l6,BorderLayout.CENTER);
		l6.setBounds(1100,600,300,90);	
		getContentPane().add(t1,BorderLayout.CENTER);
		t1.setBounds(330,410,100,50);
		getContentPane().add(t2,BorderLayout.CENTER);
		t2.setBounds(810,410,100,50);
		getContentPane().add(t3,BorderLayout.CENTER);
		t3.setBounds(1270,410,100,50);
		getContentPane().add(t11,BorderLayout.CENTER);
		t11.setBounds(330,610,100,50);
		getContentPane().add(t22,BorderLayout.CENTER);
		t22.setBounds(810,610,100,50);
		getContentPane().add(t33,BorderLayout.CENTER);
		t33.setBounds(1270,610,100,50);
                 b1.setFont(new Font("Cooper",Font.BOLD,15));
		 b2.setFont(new Font("Cooper",Font.BOLD,15));
		 b3.setFont(new Font("Cooper",Font.BOLD,15));
                 l4.setFont(new Font("Cooper",Font.BOLD,15));
                 l5.setFont(new Font("Cooper",Font.BOLD,15));
                 l6.setFont(new Font("Cooper",Font.BOLD,15));       
		add(p1);
	}
	public void handleevent()
	{
	buy.addActionListener(new ActionListener()
	{
		public void actionPerformed(ActionEvent ae)
		{
		try{
				int p= Integer.parseInt(t1.getText());
				p*=27000;
				t11.setText(p+"");
				String x =t11.getText();
				String y =t1.getText();
				String q = "SAMSUNG FRIDGE";
				st.executeUpdate("Insert into buydetails values('"+q+"','"+x+"','"+y+"')");
				JOptionPane.showMessageDialog(null,"Purchased Successfully!");
				  Thankyou f1=new Thankyou();
		}
				catch(Exception e)
		{
			System.out.println(e);
		}
		
				
	}});
	buy1.addActionListener(new ActionListener()
	{
		public void actionPerformed(ActionEvent ae)
		{
		try{
				int p = Integer.parseInt(t2.getText());
				p*=22000;
				t22.setText(p+"");
				String x =t22.getText();
				String y =t2.getText();
				String q = "PHILIPS FRIDGE";
				st.executeUpdate("Insert into buydetails values('"+q+"','"+x+"','"+y+"')");
				JOptionPane.showMessageDialog(null,"Purchased Successfully!");
				Thankyou f1=new Thankyou();
		}
				catch(Exception e)
		{
			System.out.println(e);
		}
		
				
	}});
	buy2.addActionListener(new ActionListener()
	{
		public void actionPerformed(ActionEvent ae)
		{
		try{
				int p = Integer.parseInt(t3.getText());
				p*=24000;
				t33.setText(p+"");
				String x =t33.getText();
				String y =t3.getText();
				String q = "SONY FRIDGE";
				st.executeUpdate("Insert into buydetails values('"+q+"','"+x+"','"+y+"')");
				JOptionPane.showMessageDialog(null,"Purchased Successfully!");
				  Thankyou f1=new Thankyou();
		}
				catch(Exception e)
		{
			System.out.println(e);
		}
		
				
	}});
	}
}
class Wm extends JFrame
{	
	JPanel p1,p2,p3;
	JButton buy,buy1,buy2;
	JLabel l1,l2,l3,l4,l5,l6;
	JLabel b1,b2,b3;
	JTextField t1,t2,t3,t11,t22,t33;
	Connection con;
	Statement st;
	ResultSet rs;
	Wm()
	{ 	try
		{
		setSize(500,500);
		setVisible(true);
		setTitle("ELECTRICAL STORE");
		constructui();
		designUI();
		handleevent();
		makeConnection();
		rs=st.executeQuery("Select * from buydetails");
		rs.first();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	public void makeConnection()
	{
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/electronic","root","");
			st=con.createStatement();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	
	}
	void constructui()
	{
	  	p1 = new JPanel();
		buy=new JButton("BUY");
		buy1=new JButton("BUY");
		buy2=new JButton("BUY");
		l1=new JLabel(new ImageIcon("gl.jpg"));
		t1 = new JTextField(10);
		t2 = new JTextField(10);
		t3 = new JTextField(10);
		t11 = new JTextField(10);
		t22 = new JTextField(10);
		t33 = new JTextField(10);
		l1=new JLabel(new ImageIcon("wm.jpg"));
		l2=new JLabel(new ImageIcon("wm2.jpg"));
		l3=new JLabel(new ImageIcon("wm3.jpg"));
		b1=new JLabel("No of Item:");
		b2=new JLabel("No of Item:");
		b3=new JLabel("No of Item:");
	        l4=new JLabel("TOTAL PRICE:");
		l5=new JLabel("TOTAL PRICE:");
		l6=new JLabel("TOTAL PRICE:");
	}
	public void designUI()
	{
		getContentPane().add(buy,BorderLayout.CENTER);
		buy.setBounds(160,500,280,50);
		getContentPane().add(buy1,BorderLayout.CENTER);
		buy1.setBounds(640,500,280,50);
		getContentPane().add(buy2,BorderLayout.CENTER);
		buy2.setBounds(1100,500,280,50);
		getContentPane().add(l1,BorderLayout.CENTER);
		l1.setBounds(150,80,300,250);
		getContentPane().add(l2,BorderLayout.CENTER);
		l2.setBounds(630,80,300,250);
		getContentPane().add(l3,BorderLayout.CENTER);
		l3.setBounds(1090,80,300,250);
		getContentPane().add(b1,BorderLayout.CENTER);
		b1.setBounds(160,400,100,90);
		getContentPane().add(b2,BorderLayout.CENTER);
		b2.setBounds(640,400,100,90);
		getContentPane().add(b3,BorderLayout.CENTER);
		b3.setBounds(1100,400,100,90);
		getContentPane().add(l4,BorderLayout.CENTER);
		l4.setBounds(160,600,300,90);
		getContentPane().add(l5,BorderLayout.CENTER);
		l5.setBounds(640,600,300,90);
		getContentPane().add(l6,BorderLayout.CENTER);
		l6.setBounds(1100,600,300,90);	
		getContentPane().add(t1,BorderLayout.CENTER);
		t1.setBounds(330,410,100,50);
		getContentPane().add(t2,BorderLayout.CENTER);
		t2.setBounds(810,410,100,50);
		getContentPane().add(t3,BorderLayout.CENTER);
		t3.setBounds(1270,410,100,50);
		getContentPane().add(t11,BorderLayout.CENTER);
		t11.setBounds(330,610,100,50);
		getContentPane().add(t22,BorderLayout.CENTER);
		t22.setBounds(810,610,100,50);
		getContentPane().add(t33,BorderLayout.CENTER);
		t33.setBounds(1270,610,100,50);
                 b1.setFont(new Font("Cooper",Font.BOLD,15));
		 b2.setFont(new Font("Cooper",Font.BOLD,15));
		 b3.setFont(new Font("Cooper",Font.BOLD,15));
                 l4.setFont(new Font("Cooper",Font.BOLD,15));
                 l5.setFont(new Font("Cooper",Font.BOLD,15));
                 l6.setFont(new Font("Cooper",Font.BOLD,15));       
		add(p1);
	}
	public void handleevent()
	{
	buy.addActionListener(new ActionListener()
	{
		public void actionPerformed(ActionEvent ae)
		{
		try{
				int p= Integer.parseInt(t1.getText());
				p*=10000;
				t11.setText(p+"");
				String x =t11.getText();
				String y =t1.getText();
				String q = "CROMPTON WM";
				st.executeUpdate("Insert into buydetails values('"+q+"','"+x+"','"+y+"')");
				JOptionPane.showMessageDialog(null,"Purchased Successfully!");
				  Thankyou f1=new Thankyou();
		}
				catch(Exception e)
		{
			System.out.println(e);
		}
		
				
	}});
	buy1.addActionListener(new ActionListener()
	{
		public void actionPerformed(ActionEvent ae)
		{
		try{
				int p = Integer.parseInt(t2.getText());
				p*=120;
				t22.setText(p+"");
				String x =t22.getText();
				String y =t2.getText();
				String q = "PHILIPS WM";
				st.executeUpdate("Insert into buydetails values('"+q+"','"+x+"','"+y+"')");
				JOptionPane.showMessageDialog(null,"Purchased Successfully!");
				Thankyou f1=new Thankyou();
		}
				catch(Exception e)
		{
			System.out.println(e);
		}
		
				
	}});
	buy2.addActionListener(new ActionListener()
	{
		public void actionPerformed(ActionEvent ae)
		{
		try{
				int p = Integer.parseInt(t3.getText());
				p*=120;
				t33.setText(p+"");
				String x =t33.getText();
				String y =t3.getText();
				String q = "SONY WM";
				st.executeUpdate("Insert into buydetails values('"+q+"','"+x+"','"+y+"')");
				JOptionPane.showMessageDialog(null,"Purchased Successfully!");
				Thankyou f1=new Thankyou();
		}
				catch(Exception e)
		{
			System.out.println(e);
		}
		
				
	}});
	}
}
 class Thankyou extends JFrame
 {
    JLabel l;
    JPanel p1;
     public Thankyou()
     {
                setVisible(true);
		setTitle("ELECTRONICS STORE ");
		setSize(10000,10000);
		constructUI();
		designUI();
     }
     public void constructUI()
     {
         l = new JLabel("THANKYOU FOR PURCHASING!");
          l1 = new JLabel("..ENJOY HOLIDAYS..");
         p1=new JPanel();
     }
    
     public void designUI()
     {
        getContentPane().add(l,BorderLayout.CENTER);
         l.setBounds(300,200,1000,150);
        l.setFont(new Font("SHOWCARD GOTHIC",Font.BOLD,65));
        l.setForeground(Color.WHITE);
        p1.add(l);
        getContentPane().add(l,BorderLayout.CENTER);
         l1.setBounds(300,400,1000,150);
        l1.setFont(new Font("SHOWCARD GOTHIC",Font.BOLD,35));
        l1.setForeground(Color.WHITE);
        p1.add(l1);
	 p1.setBackground(Color.BLACK);
        add(p1);
     }

}}










