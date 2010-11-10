package it.univpm.progogg.gui.mvc;

import java.awt.Dimension;
import java.awt.Graphics;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JPanel;

public class TriangleGraph extends JPanel implements Observer {

	private static final long serialVersionUID = 1L;

	/**
	 * The size of the border around the triangle
	 */
	private static final int BORDER = 10;

	public RightTriangle model;

	public TriangleGraph(RightTriangle model) {
		this.model = model;
		setPreferredSize(new Dimension(BORDER * 12, BORDER * 12));
		model.addObserver(this);
		update(model, null);
	}

	@Override
	public void update(Observable source, Object o) {
		repaint();
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setColor(getForeground());
		double base = model.base();
		double height = model.height();
		double ratio = Math.min((getWidth() - 2 * BORDER) / base,
				(getHeight() - 2 * BORDER) / height);
		int baseX = BORDER + (int) Math.round(base * ratio);
		int baseY = BORDER + (int) Math.round(height * ratio);
		int top = BORDER + (int) Math.round(base * ratio / 2);
		g.drawLine(BORDER, baseY, baseX, baseY);
		g.drawLine(top, BORDER, BORDER, baseY);
		g.drawLine(top, BORDER, baseX, baseY);
	}

}
