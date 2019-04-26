import javax.swing.*;
public class JFrameWindows {
	
	static JFrame win;
	
	public static void main(String[] args) {
		win = new JFrame();
		JMenuBar menubar = new JMenuBar();
		JMenu menu1 = new JMenu("File");
		JMenu menu2 = new JMenu("Record");
		JMenu menu3 = new JMenu("asdf");
		JMenu menu4 = new JMenu("keep going");
		JMenu menu5 = new JMenu("are you lost?");
		JMenuItem m1 = new JMenuItem("New");
		JMenuItem m2 = new JMenuItem("ABC");
		JMenuItem m3 = new JMenuItem("Entry");
		JMenuItem m4 = new JMenuItem("View");
		JMenuItem m5 = new JMenuItem("What is happening?");
		JMenuItem m6 = new JMenuItem("View");
		
		menu1.add(m1);
		menu1.add(m2);
		menu1.add(menu2);
		menu2.add(m3);
		menu2.add(m4);
		menu2.add(menu3);
		menu3.add(menu4);
		menu3.add(menu5);
		menu4.add(m5);
		menu5.add(m6);
		
		menubar.add(menu1);
		
		win.setJMenuBar(menubar);
		
		win.setSize(400, 400);
		win.setVisible(true);
		
		JButton b1 = new JButton("How?");
		
		m6.addActionListener(new ActionListener() {
			win.add(b1);
		});
	}
}
