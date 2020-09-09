package thesis;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class FrameYo extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4204073782036226072L;

	public FrameYo()
	{
		 super("Titel");
	        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        this.setSize(400, 400);

	        //Creating the MenuBar and adding components
	        JMenuBar mb = new JMenuBar();
	        JMenu m1 = new JMenu("FILE");
	        JMenu m2 = new JMenu("Help");
	        mb.add(m1);
	        mb.add(m2);
	        JMenuItem m11 = new JMenuItem("Open");
	        JMenuItem m22 = new JMenuItem("Save as");
	        m1.add(m11);
	        m1.add(m22);

	        //Creating the panel at bottom and adding components
	        JPanel panel = new JPanel(); // the panel is not visible in output
	        JLabel enter = new JLabel("Enter Text");
	        
	        JTextField tf = new JTextField(10); // accepts upto 10 characters
	        tf.setName("entertext");

	        
	        JButton send = new JButton("Send");
	        send.setName("sendbutton");

	        JButton reset = new JButton("Reset");

	        panel.add(enter); // Components Added using Flow Layout
	        panel.add(tf);
	        panel.add(send);
	        panel.add(reset);

	        // Text Area at the Center
	        JTextArea ta = new JTextArea();
	        ta.setName("textarea");
	        send.addActionListener(new ActionListener() { 
	        	  public void actionPerformed(ActionEvent e) { 
	        		   ta.setText(tf.getText());
	        		  } 
	        		} );
	        
	        //Adding Components to the frame.
	        this.getContentPane().add(BorderLayout.SOUTH, panel);
	        this.getContentPane().add(BorderLayout.NORTH, mb);
	        this.getContentPane().add(BorderLayout.CENTER, ta);
	        this.setVisible(true);
	}
}
