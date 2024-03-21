package view;

import javax.swing.*;
import java.awt.*;

public class FooterPanel extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7508920029287635621L;

	public FooterPanel() {

		// Elemente
		JLabel centerSouth = new JLabel("� 2024 Martin Klestil");
		JLabel versionDate = new JLabel ("Version 3.0 vom 06.03.2024");

		//Hinzufügen
		this.setLayout(new BorderLayout());
		this.add(versionDate, BorderLayout.EAST);
		this.add(centerSouth, BorderLayout.WEST);
		this.setBackground(Color.white);
		this.setOpaque(false);

	}

}
