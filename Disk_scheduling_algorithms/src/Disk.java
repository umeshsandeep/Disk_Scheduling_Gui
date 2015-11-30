import java.awt.EventQueue;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Font;

public class Disk {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Disk window = new Disk();
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
	public Disk() {
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
		//imageIcon a = new imageIcon('a.jpg');
		//JButton Disk = new JButton();
		Icon warnIcon = new ImageIcon("a.jpg");	
		JButton Disk = new JButton(warnIcon);
		Disk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				DiskScheduling x = new DiskScheduling();
				x.DS();
				frame.setVisible(false);
				
			}
		});
		Disk.setBounds(122, 38, 154, 125);
		frame.getContentPane().add(Disk);
		
		JLabel lblDiskSchedulingAlgorithms = new JLabel("Disk Scheduling Algorithms");
		lblDiskSchedulingAlgorithms.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblDiskSchedulingAlgorithms.setBounds(101, 174, 222, 30);
		frame.getContentPane().add(lblDiskSchedulingAlgorithms);
	}
}
