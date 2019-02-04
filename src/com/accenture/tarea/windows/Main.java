package com.accenture.tarea.windows;

import java.awt.EventQueue;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class Main {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main window = new Main();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Main() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 637, 524);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel jlabelTittle = new JLabel("Tittle");
		jlabelTittle.setFont(new Font("Tahoma", Font.PLAIN, 31));
		jlabelTittle.setBounds(251, 16, 108, 72);
		panel.add(jlabelTittle);
		jlabelTittle.setForeground(Color.BLACK);
		jlabelTittle.setBackground(Color.WHITE);
		jlabelTittle.setHorizontalAlignment(SwingConstants.CENTER);
		
		JButton botonPrueba2 = new JButton("Mover");
		botonPrueba2.setFont(new Font("Tahoma", Font.PLAIN, 24));
		botonPrueba2.setBounds(224, 104, 168, 62);
		panel.add(botonPrueba2);
		botonPrueba2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		botonPrueba2.setMinimumSize(new Dimension(100, 100));
		botonPrueba2.setMaximumSize(new Dimension(150, 100));
		botonPrueba2.setPreferredSize(new Dimension(120,30));
		
		
		
		
	}

}
