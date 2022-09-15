package view;

import javax.swing.*;
import model.Global;



import java.awt.*;

public class FooterPanel extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7508920029287635621L;

	public FooterPanel() {
		
		Global global = new Global();

		// Elemente
		JLabel centerSouth = new JLabel("© 2021 Martin Klestil");
		JLabel versionDate = new JLabel ("Version " + global.getVersion() +" vom "+ global.getVersionDate());

		//Hinzuf√ºgen
		this.setLayout(new BorderLayout());
		this.add(versionDate, BorderLayout.EAST);
		this.add(centerSouth, BorderLayout.WEST);
		this.setBackground(Color.white);
		this.setOpaque(false);

	}

}
