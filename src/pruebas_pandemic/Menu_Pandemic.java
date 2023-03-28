package pruebas_pandemic;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Menu_Pandemic extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menu_Pandemic frame = new Menu_Pandemic();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Menu_Pandemic() {
		super("Menú");

		JMenuBar menuBar = new JMenuBar();

		JMenu juegoMenu = new JMenu("Juego");
		JMenuItem nuevaPartidaItem = new JMenuItem("Nueva Partida");
		JMenuItem cargarPartidaItem = new JMenuItem("Cargar Partida");
		JMenuItem salirItem = new JMenuItem("Salir");
		juegoMenu.add(nuevaPartidaItem);
		juegoMenu.add(cargarPartidaItem);
		juegoMenu.addSeparator();
		juegoMenu.add(salirItem);

		JMenu ayudaMenu = new JMenu("Ayuda");
		JMenuItem informacionItem = new JMenuItem("Información");
		JMenuItem resumenPuntuacionesItem = new JMenuItem("Resumen de puntuaciones");
		JMenuItem autoresItem = new JMenuItem("Autores");
		JMenuItem versionItem = new JMenuItem("Versión");
		ayudaMenu.add(informacionItem);
		ayudaMenu.add(resumenPuntuacionesItem);
		ayudaMenu.add(autoresItem);
		ayudaMenu.add(versionItem);

		menuBar.add(juegoMenu);
		menuBar.add(ayudaMenu);

		setJMenuBar(menuBar);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(400, 300);
		setVisible(true);

	}

}
