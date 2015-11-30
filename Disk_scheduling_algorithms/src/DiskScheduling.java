import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DiskScheduling {

	private JFrame frame;
	private JComboBox Box;
	private JTextField Text;
	private JTextField head;
	private JTextField Text2;
	private JTextField Text4;

	/**
	 * Launch the application.
	 */
	public static void DS() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DiskScheduling window = new DiskScheduling();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public DiskScheduling() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		Box = new JComboBox();
		Box.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
		///	String X=String.valueOf(Box.getSelectedItem());
			//	Text.setText(X);
				if((String)Box.getSelectedItem()=="FCFS")
				{   		
						head.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent arg0) {
								String h=head.getText();
							}
						});
						Text.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent e) {
						      String Val,S="",v="";
								Val = Text.getText();
								convert z = new convert(Val);
								int[] L= z.method1();
								int h = Integer.parseInt(head.getText());
								 FCFS a1= new FCFS(h,L);
								 int[] r = a1.method();
								 int y = a1.method3();
								  v= v+""+y;
								 Graph G = new Graph(r,r.length);
								G.test(r,r.length);
								   for(int i=0;i<r.length;i++)
							    	{ 
							    	S = S + " " + r[i];
							    	
							    	}
							  Text2.setText(S);
							  Text4.setText(v);
								//Text2.setText(""+r.length);
								 
							}
						});
				}

				else if((String)Box.getSelectedItem()=="SSTF")
				{   		
						head.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent arg0) {
								String h=head.getText();
							}
						});
						Text.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent e) {
								//System.out.println("sTSAUD");
							      String Val,S="",v="";
								Val = Text.getText();
								convert z = new convert(Val);
								int[] L= z.method1();
								int h = Integer.parseInt(head.getText());
								 SSTF a1= new SSTF(h,L);
								 int[] r = a1.method();
								 int y= a1.method3();
								//a1.Get(L,L.length);
								 v=v+""+y;
								 Graph G = new Graph(r,r.length);
								  G.test(r,r.length);
								   for(int i=0;i<r.length;i++)
							    	{ 
							    	S = S + " " + r[i];
							    	
							    	}
							  Text2.setText(S);
							  Text4.setText(v);
								//Text2.setText(""+r.length);
								 
							}
						});
				}
				else if((String)Box.getSelectedItem()=="SCAN")
				{   		
						head.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent arg0) {
								String h=head.getText();
							}
						});
						Text.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent e) {
								//System.out.println("sTSAUD");
							      String Val,S="",v="";
								Val = Text.getText();
								convert z = new convert(Val);
								int[] L= z.method1();
								int h = Integer.parseInt(head.getText());
								 Scan a1= new Scan(h,L);
								 int[] r = a1.method();
								 int y= a1.method3();
								 v=v+""+y;
								//a1.Get(L,L.length);
								 Graph G = new Graph(r,r.length);
								  G.test(r,r.length);
								   for(int i=0;i<r.length;i++)
							    	{ 
							    	S = S + " " + r[i];
							    	
							    	}
							  Text2.setText(S);
							  Text4.setText(v);
								//Text2.setText(""+r.length);
								 
							}
						});
				}
				else if((String)Box.getSelectedItem()=="CSCAN")
				{   		
						head.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent arg0) {
								String h=head.getText();
							}
						});
						Text.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent e) {
								//System.out.println("sTSAUD");
							      String Val,S="",v="";
								Val = Text.getText();
								convert z = new convert(Val);
								int[] L= z.method1();
								int h = Integer.parseInt(head.getText());
								 Cscan a1= new Cscan(h,L);
								 int[] r = a1.method();
								 int y =a1.method3();
								 v=v+""+y;
								//a1.Get(L,L.length);
								 Graph G = new Graph(r,r.length);
								  G.test(r,r.length);
								   for(int i=0;i<r.length;i++)
							    	{ 
							    	S = S + " " + r[i];
							    	
							    	}
							  Text2.setText(S);
							  Text4.setText(v);
								//Text2.setText(""+r.length);
								 
							}
						});
				}
				else if((String)Box.getSelectedItem()=="CLOOK")
				{   		
						head.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent arg0) {
								String h=head.getText();
							}
						});
						Text.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent e) {
								//System.out.println("sTSAUD");
							      String Val,S="",v="";
								Val = Text.getText();
								convert z = new convert(Val);
								int[] L= z.method1();
								int h = Integer.parseInt(head.getText());
								 Clook a1= new Clook(h,L);
								 int[] r = a1.method();
								 int y= a1.method3();
								 v=v+""+y;
								//a1.Get(L,L.length);
								 Graph G = new Graph(r,r.length);
								  G.test(r,r.length);
								   for(int i=0;i<r.length;i++)
							    	{ 
							    	S = S + " " + r[i];
							    	//System.out.println(r[i]);
							    	}
							  Text2.setText(S);
							  Text4.setText(v);
								//Text2.setText(""+r.length);
								 
							}
						});
				}
				
			}
		});
		Box.setBounds(44, 58, 94, 28);
		frame.getContentPane().add(Box);
		Box.addItem(".....");
		Box.addItem("FCFS");
		Box.addItem("SSTF");
		Box.addItem("SCAN");
		Box.addItem("CSCAN");
		Box.addItem("CLOOK");
		JLabel lblDiskSchedulingAlgorithms = new JLabel("Disk Scheduling Algorithms");
		lblDiskSchedulingAlgorithms.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblDiskSchedulingAlgorithms.setBounds(87, 11, 251, 28);
		frame.getContentPane().add(lblDiskSchedulingAlgorithms);
		
		Text = new JTextField();
		
		Text.setBounds(190, 129, 202, 28);
		frame.getContentPane().add(Text);
		Text.setColumns(10);
		
		head = new JTextField();
		head.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		head.setColumns(10);
		head.setBounds(281, 82, 102, 28);
		frame.getContentPane().add(head);
		
		Text2 = new JTextField();
		Text2.setColumns(10);
		Text2.setBounds(190, 207, 202, 28);
		frame.getContentPane().add(Text2);
		
		JLabel lblHead = new JLabel("Head :");
		lblHead.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblHead.setBounds(195, 89, 63, 14);
		frame.getContentPane().add(lblHead);
		
		JLabel lblInput = new JLabel("Input :");
		lblInput.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblInput.setBounds(98, 136, 63, 14);
		frame.getContentPane().add(lblInput);
		
		JLabel lblNewLabel = new JLabel("Output:");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setBounds(98, 214, 63, 14);
		frame.getContentPane().add(lblNewLabel);
		
		Text4 = new JTextField();
		Text4.setBounds(244, 168, 94, 28);
		frame.getContentPane().add(Text4);
		Text4.setColumns(10);
		
		JLabel lblHeadMovement = new JLabel("Head Movement:");
		lblHeadMovement.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblHeadMovement.setBounds(98, 168, 128, 21);
		frame.getContentPane().add(lblHeadMovement);
		
		

	}
}
