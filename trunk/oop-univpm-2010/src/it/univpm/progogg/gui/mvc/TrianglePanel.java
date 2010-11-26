package it.univpm.progogg.gui.mvc;

import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TrianglePanel extends JPanel implements Observer {

	private static final long serialVersionUID = 1L;
	
	private JTextField base = new JTextField();
	private JTextField height = new JTextField();
	private JTextField hypothenuse = new JTextField();
	
	public TrianglePanel(RightTriangle model) {
		setLayout(new GridLayout(3, 2));
		add(new JLabel("base:"));
		base.setActionCommand("base");
		add(base);
		add(new JLabel("height:"));
		height.setActionCommand("height");
		add(height);
		add(new JLabel("hypothenuse:"));
		hypothenuse.setEditable(false);
		add(hypothenuse);
		
		model.addObserver(this);
		update(model, null);
	}
	
	public void setBaseActionListener(ActionListener l) {
		base.addActionListener(l);		
	}
	
	public void setHeightActionListener(ActionListener l) {
		height.addActionListener(l);		
	}

	public float base() {
		return Float.parseFloat(base.getText());
	}
	
	public float height() {
		return Float.parseFloat(height.getText());
	}

	@Override
	public void update(Observable source, Object o) {
		RightTriangle model = (RightTriangle)source;
		base.setText(String.valueOf(model.base()));
		height.setText(String.valueOf(model.height()));
		hypothenuse.setText(String.valueOf(model.hypothenuse()));
	}
}
