package it.univpm.progogg.gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JTextPane;

public class TextEditor extends JFrame {

	private static final long serialVersionUID = 1L;

	private JMenuBar menuBar = new JMenuBar();
	private JMenu fileMenu = new JMenu("File");
	private JMenuItem openFile = new JMenuItem("Open...", KeyEvent.VK_O);
	private JMenuItem saveFile = new JMenuItem("Save...", KeyEvent.VK_S);
	private JFileChooser fileChooser = new JFileChooser();

	private JTextPane editor = new JTextPane();

	public TextEditor() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(400, 300);

		openFile.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (fileChooser.showOpenDialog(TextEditor.this) == JFileChooser.APPROVE_OPTION) {
					BufferedReader file;
					try {
						file = new BufferedReader(new FileReader(fileChooser
								.getSelectedFile()));
						StringBuilder builder = new StringBuilder();
						String line;
						while ((line = file.readLine()) != null) {
							builder.append(line);
							builder.append('\n');
						}
						editor.setText(builder.toString());
					} catch (FileNotFoundException ex) {
						JOptionPane.showMessageDialog(TextEditor.this,
								"File not found", "Error",
								JOptionPane.ERROR_MESSAGE);
					} catch (IOException ex) {
						JOptionPane.showMessageDialog(TextEditor.this,
								"Error opening the file", "Error",
								JOptionPane.ERROR_MESSAGE);
					}
				}
			}
		});
		fileMenu.add(openFile);

		saveFile.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (fileChooser.showSaveDialog(TextEditor.this) == JFileChooser.APPROVE_OPTION) {
					BufferedWriter file = null;
					try {
						file = new BufferedWriter(new FileWriter(
								fileChooser.getSelectedFile()));
						file.write(editor.getText());
						file.close();
					} catch (IOException e1) {
						JOptionPane.showMessageDialog(TextEditor.this,
								"Error saving the file", "Error",
								JOptionPane.ERROR_MESSAGE);
					}					
				}
			}
		});
		fileMenu.add(saveFile);

		menuBar.add(fileMenu);
		setJMenuBar(menuBar);

		add(editor);
		setVisible(true);
	}

	public static void main(String[] args) {
		new TextEditor();
	}

}
