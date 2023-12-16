package ejercico02;

import static org.junit.jupiter.api.Assertions.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import org.junit.jupiter.api.Test;

class testCommand {

	@Test
	void test() {
		JButton button=new JButton();
		button.addActionListener(new ActionListener() {

			//command
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}
			
		});
	}

}
