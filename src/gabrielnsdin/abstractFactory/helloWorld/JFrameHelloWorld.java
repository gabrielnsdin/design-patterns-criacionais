package gabrielnsdin.abstractFactory.helloWorld;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class JFrameHelloWorld implements HelloWorld{

	@Override
	public void print() {
		JFrame jframe = new JFrame("Output");
		jframe.add(new JLabel("Hello World"));
		jframe.pack();
		jframe.setLocationRelativeTo(null);
		jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jframe.setVisible(true);
	}
	
}
