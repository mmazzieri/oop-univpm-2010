package it.univpm.progogg.gui.mvc;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * A controller registers itself as action listener within the view, reads view data and updates the model.
 * @author Mauro Mazzieri
 *
 */
public class TriangleController implements ActionListener {

	private RightTriangle model;
	private TrianglePanel view;

	public TriangleController(RightTriangle model, TrianglePanel view) {
		this.model = model;
		this.view = view;
		
		// the controller registers itself as action listener within the view
		view.setBaseActionListener(this);
		view.setHeightActionListener(this);
	}

	/**
	 * When something happens to the view, the controller updates the model
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand() == "base") {
			model.setBase(view.base());
		} else if (e.getActionCommand() == "height") {
			model.setHeight(view.height());
		}
	}

}
