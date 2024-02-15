import javax.swing.JFrame;

public class Window{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame window = new JFrame("Example");
		window.setVisible(true);
		window.setSize(600,600);
		window.setVisible(true);
		window.setLocation(100,100);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setResizable(false);
	}

}
