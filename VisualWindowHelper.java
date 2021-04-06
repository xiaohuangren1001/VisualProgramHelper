import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class VisualWindowHelper extends JFrame {
	private static final long serialVersionUID = 1L;
	public JLabel pos = new JLabel();
	public VisualWindowHelper() {
		initialize();
	}
	private void initialize() {
		setSize(1400, 1000);
		setTitle("可视化编程辅助");
		setLayout(new BorderLayout());
		setVisible(true);
		setDefaultCloseOperation(3);
		add(pos, BorderLayout.CENTER);
		addMouseMotionListener(new MouseMotionListener() {
			public void mouseDragged(MouseEvent e) {
			}
			public void mouseMoved(MouseEvent e) {
				int x = e.getX();
				int y = e.getY();
				String s = x + ", " + y;
				pos.setText(s);
			}
		});
	}
	public static void main(String args[]) {
		new VisualWindowHelper();
	}
}
