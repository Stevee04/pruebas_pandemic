import java.awt.EventQueue;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.geom.RoundRectangle2D;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;
import java.awt.Font;
import javax.swing.JProgressBar;
import javax.swing.DebugGraphics;
import java.awt.Cursor;
import java.awt.ComponentOrientation;
import javax.swing.SwingConstants;
import java.awt.Dimension;
import javax.swing.border.MatteBorder;
import java.awt.Component;
import javax.swing.JTextArea;

public class Prueba1 extends JFrame {

	boolean ver = false;
	LeerParametros P = new LeerParametros();

	private JPanel contentPanel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Prueba1 frame = new Prueba1();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	// es una clase para poder redondear el boton
	public class RoundedButton extends JButton {

		public RoundedButton(String label) {
			super(label);

			// Asegurarse de que el botón sea completamente opaco
			setContentAreaFilled(false);
		}

		// Anular el método paintComponent() para dibujar el botón personalizado
		protected void paintComponent(Graphics g) {
			Graphics2D g2 = (Graphics2D) g;

			// Dibujar un rectángulo redondeado
			RoundRectangle2D rect = new RoundRectangle2D.Float(0, 0, getWidth() - 1, getHeight() - 1, 26, 26);

			// Establecer un color de fondo redondeado utilizando GradientPaint
			GradientPaint gradient = new GradientPaint(0, 0, new Color(255, 179, 238), 0, getHeight(),
					new Color(255, 179, 238));
			g2.setPaint(gradient);

			g2.fill(rect);

			// Dibujar el texto
			super.paintComponent(g);
		}

		// Anular el método paintBorder() para eliminar el borde predeterminado del
		// botón
		protected void paintBorder(Graphics g) {
			// No hacer nada
		}
	}

	/**
	 * Create the frame.
	 */
	public Prueba1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1182, 588);
		contentPanel = new JPanel();
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPanel);
		contentPanel.setLayout(null);

		JPanel panel_general = new JPanel();
		panel_general.setBackground(Color.LIGHT_GRAY);
		panel_general.setBounds(0, 0, 1166, 549);
		contentPanel.add(panel_general);
		panel_general.setLayout(null);

		// ==============================================================================================================================================================================================================================================================================
		// ==============================================================================================================================================================================================================================================================================

		JPanel panelInt = new JPanel();
		panelInt.setVisible(ver);
		panelInt.setBackground(new Color(0, 0, 0));
		panelInt.setBounds(331, 5, 834, 540);
		panel_general.add(panelInt);
		panelInt.setLayout(null);

		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBackground(new Color(255, 255, 255));
		lblNewLabel.setBounds(256, -24, 273, 273);
		panelInt.add(lblNewLabel);

		RoundedButton btnFacil = new RoundedButton("");
		btnFacil.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				lblNewLabel.setIcon(new ImageIcon(Prueba1.class.getResource("/btn_level/Easy.png")));

			}

			public void mouseClicked(MouseEvent e) {
				P.editar(1);
			}
		});
		btnFacil.setIcon(new ImageIcon(Prueba1.class.getResource("/btn_level/faciltext.png")));
		btnFacil.setBounds(51, 220, 312, 151);
		panelInt.add(btnFacil);
		btnFacil.setBackground(new Color(255, 179, 238));

		RoundedButton btnNormal = new RoundedButton("");
		btnNormal.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				lblNewLabel.setIcon(new ImageIcon(Prueba1.class.getResource("/btn_level/Normal.png")));
			}

			public void mouseClicked(MouseEvent e) {
				P.editar(2);
			}
		});
		btnNormal.setIcon(new ImageIcon(Prueba1.class.getResource("/btn_level/normaltext.png")));
		btnNormal.setBounds(424, 220, 388, 151);
		panelInt.add(btnNormal);
		btnNormal.setBackground(null);

		RoundedButton btnDificil = new RoundedButton("");
		btnDificil.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				lblNewLabel.setIcon(new ImageIcon(Prueba1.class.getResource("/btn_level/Hard.png")));

			}

			public void mouseClicked(MouseEvent e) {
				P.editar(3);
			}
		});
		btnDificil.setIcon(new ImageIcon(Prueba1.class.getResource("/btn_level/Difiicltext.png")));
		btnDificil.setBounds(199, 376, 388, 159);
		panelInt.add(btnDificil);
		btnDificil.setBackground(null);

		// ==============================================================================================================================================================================================================================================================================
		// ==============================================================================================================================================================================================================================================================================

		JPanel panelAutores = new JPanel();
		panelAutores.setVisible(ver);
		panelAutores.setBackground(new Color(0, 0, 0));
		panelAutores.setBounds(331, 5, 834, 540);
		panel_general.add(panelAutores);
		panelAutores.setLayout(null);

		JLabel lblLabelAutores = new JLabel("");
		lblLabelAutores.setIcon(new ImageIcon(Prueba1.class.getResource("/autores/chiquito.png")));
		lblLabelAutores.setForeground(new Color(0, 0, 0));
		lblLabelAutores.setBackground(new Color(0, 0, 0));
		lblLabelAutores.setBounds(104, 24, 251, 312);
		panelAutores.add(lblLabelAutores);

		JLabel lblLabelAutores_1 = new JLabel("");
		lblLabelAutores_1.setIcon(new ImageIcon(Prueba1.class.getResource("/autores/Oriol.png")));
		lblLabelAutores_1.setForeground(new Color(0, 0, 0));
		lblLabelAutores_1.setBackground(new Color(0, 0, 0));
		lblLabelAutores_1.setBounds(501, 24, 251, 312);
		panelAutores.add(lblLabelAutores_1);

		JTextPane txtpnEdgarChiquillo = new JTextPane();
		txtpnEdgarChiquillo.setForeground(new Color(255, 255, 0));
		txtpnEdgarChiquillo.setBackground(new Color(49, 49, 49));
		txtpnEdgarChiquillo.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		txtpnEdgarChiquillo.setText("\r\n     Edgar Chiquillo");
		txtpnEdgarChiquillo.setBounds(93, 358, 273, 108);
		panelAutores.add(txtpnEdgarChiquillo);

		JTextPane txtpnOriolEsteve = new JTextPane();
		txtpnOriolEsteve.setText("\r\n        Oriol Esteve");
		txtpnOriolEsteve.setForeground(Color.YELLOW);
		txtpnOriolEsteve.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		txtpnOriolEsteve.setBackground(new Color(49, 49, 49));
		txtpnOriolEsteve.setBounds(493, 358, 273, 108);
		panelAutores.add(txtpnOriolEsteve);
		
				// ==============================================================================================================================================================================================================================================================================
				// ==============================================================================================================================================================================================================================================================================
		
				JPanel panelVersion = new JPanel();
				panelVersion.setVisible(ver);
				panelVersion.setBackground(new Color(0, 0, 0));
				panelVersion.setBounds(331, 5, 834, 540);
				panel_general.add(panelVersion);
				panelVersion.setLayout(null);
				
				JTextArea txtrVersion = new JTextArea();
				txtrVersion.setBackground(new Color(66, 66, 66));
				txtrVersion.setForeground(new Color(255, 255, 0));
				txtrVersion.setFont(new Font("Times New Roman", Font.PLAIN, 22));
				txtrVersion.setText("\r\n                VERSION: 1.0");
				txtrVersion.setBounds(266, 230, 310, 85);
				panelVersion.add(txtrVersion);

		// ==============================================================================================================================================================================================================================================================================
		// ==============================================================================================================================================================================================================================================================================

		JPanel panel_botones = new JPanel();
		panel_botones.setBackground(Color.BLACK);
		panel_botones.setBounds(7, 7, 314, 535);
		panel_general.add(panel_botones);
		panel_botones.setLayout(null);

		// como hacer visible y imbisible el panel

		JButton btnNuevaPartida = new JButton("");
		btnNuevaPartida.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelAutores.setVisible(false);
				panelVersion.setVisible(false);
				panelInt.setVisible(!panelInt.isVisible());
				;
			}
		});
		btnNuevaPartida.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btnNuevaPartida
						.setIcon(new ImageIcon(Prueba1.class.getResource("/segundobtn/btn_nueva_partida_pequeño.png")));
			}

			@Override
			public void mouseExited(MouseEvent e) {
				btnNuevaPartida
						.setIcon(new ImageIcon(Prueba1.class.getResource("/primerbtn/btn_nueva_partida_pequeño.png")));
			}

			@Override
			public void mouseClicked(MouseEvent e) {
				btnNuevaPartida
						.setIcon(new ImageIcon(Prueba1.class.getResource("/tercerbtn/btn_nueva_partida_pequeño.png")));
			}
		});
		btnNuevaPartida.setIcon(new ImageIcon(Prueba1.class.getResource("/primerbtn/btn_nueva_partida_pequeño.png")));
		btnNuevaPartida.setBackground(new Color(0, 0, 0));
		btnNuevaPartida.setBounds(-9, -2, 343, 77);
		panel_botones.add(btnNuevaPartida);

		JButton btnCargarPartida = new JButton("");
		btnCargarPartida.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btnCargarPartida.setIcon(
						new ImageIcon(Prueba1.class.getResource("/segundobtn/btn_cargar_partida_pequeño.png")));
			}

			@Override
			public void mouseExited(MouseEvent e) {
				btnCargarPartida
						.setIcon(new ImageIcon(Prueba1.class.getResource("/primerbtn/btn_cargar_partida_pequeño.png")));
			}

			public void mouseClicked(MouseEvent e) {
				btnCargarPartida
						.setIcon(new ImageIcon(Prueba1.class.getResource("/tercerbtn/btn_cargar_partida_pequeño.png")));
			}
		});
		btnCargarPartida.setIcon(new ImageIcon(Prueba1.class.getResource("/primerbtn/btn_cargar_partida_pequeño.png")));
		btnCargarPartida.setBackground(Color.BLACK);
		btnCargarPartida.setBounds(-9, 75, 343, 77);
		panel_botones.add(btnCargarPartida);

		JButton btnInfo = new JButton("");
		btnInfo.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btnInfo.setIcon(new ImageIcon(Prueba1.class.getResource("/segundobtn/btn_info_pequeño.png")));
			}

			@Override
			public void mouseExited(MouseEvent e) {
				btnInfo.setIcon(new ImageIcon(Prueba1.class.getResource("/primerbtn/btn_info_pequeño.png")));
			}

			public void mouseClicked(MouseEvent e) {
				btnInfo.setIcon(new ImageIcon(Prueba1.class.getResource("/tercerbtn/btn_info_pequeño.png")));
			}
		});
		btnInfo.setIcon(new ImageIcon(Prueba1.class.getResource("/primerbtn/btn_info_pequeño.png")));
		btnInfo.setBackground(Color.BLACK);
		btnInfo.setBounds(-9, 152, 343, 77);
		panel_botones.add(btnInfo);

		JButton btnResumenPuntuaciones = new JButton("");
		btnResumenPuntuaciones.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btnResumenPuntuaciones
						.setIcon(new ImageIcon(Prueba1.class.getResource("/segundobtn/btn_resumen_pequeño.png")));
			}

			@Override
			public void mouseExited(MouseEvent e) {
				btnResumenPuntuaciones
						.setIcon(new ImageIcon(Prueba1.class.getResource("/primerbtn/btn_resumen_pequeño.png")));
			}

			public void mouseClicked(MouseEvent e) {
				btnResumenPuntuaciones
						.setIcon(new ImageIcon(Prueba1.class.getResource("/tercerbtn/btn_resumen_pequeño.png")));
			}
		});
		btnResumenPuntuaciones.setIcon(new ImageIcon(Prueba1.class.getResource("/primerbtn/btn_resumen_pequeño.png")));
		btnResumenPuntuaciones.setBackground(Color.BLACK);
		btnResumenPuntuaciones.setBounds(-9, 229, 343, 77);
		panel_botones.add(btnResumenPuntuaciones);

		JButton btnAutores = new JButton("");
		btnAutores.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelInt.setVisible(false);
				panelVersion.setVisible(false);
				panelAutores.setVisible(!panelVersion.isVisible());
			}
		});
		btnAutores.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btnAutores.setIcon(new ImageIcon(Prueba1.class.getResource("/segundobtn/btn_autores_pequeño.png")));
			}

			@Override
			public void mouseExited(MouseEvent e) {
				btnAutores.setIcon(new ImageIcon(Prueba1.class.getResource("/primerbtn/btn_autores_pequeño.png")));
			}

			public void mouseClicked(MouseEvent e) {
				btnAutores.setIcon(new ImageIcon(Prueba1.class.getResource("/tercerbtn/btn_autores_pequeño.png")));
			}
		});
		btnAutores.setIcon(new ImageIcon(Prueba1.class.getResource("/primerbtn/btn_autores_pequeño.png")));
		btnAutores.setBackground(Color.BLACK);
		btnAutores.setBounds(-9, 306, 343, 77);
		panel_botones.add(btnAutores);

		JButton btnVersion = new JButton("");
		btnVersion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelInt.setVisible(false);
				panelAutores.setVisible(false);
				panelVersion.setVisible(!panelVersion.isVisible());
			}
		});
		btnVersion.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btnVersion.setIcon(new ImageIcon(Prueba1.class.getResource("/segundobtn/btn_version_pequeño.png")));
			}

			@Override
			public void mouseExited(MouseEvent e) {
				btnVersion.setIcon(new ImageIcon(Prueba1.class.getResource("/primerbtn/btn_version_pequeño.png")));
			}

			public void mouseClicked(MouseEvent e) {
				btnVersion.setIcon(new ImageIcon(Prueba1.class.getResource("/tercerbtn/btn_version_pequeño.png")));
			}
		});
		btnVersion.setIcon(new ImageIcon(Prueba1.class.getResource("/primerbtn/btn_version_pequeño.png")));
		btnVersion.setBackground(Color.BLACK);
		btnVersion.setBounds(-9, 383, 343, 77);
		panel_botones.add(btnVersion);

		JButton btnSalir = new JButton("");
		btnSalir.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btnSalir.setIcon(new ImageIcon(Prueba1.class.getResource("/segundobtn/btn_salida_pequeño.png")));
			}

			@Override
			public void mouseExited(MouseEvent e) {
				btnSalir.setIcon(new ImageIcon(Prueba1.class.getResource("/primerbtn/btn_salida_pequeño.png")));
			}

			public void mouseClicked(MouseEvent e) {
				btnSalir.setIcon(new ImageIcon(Prueba1.class.getResource("/tercerbtn/btn_salida_pequeño.png")));
				System.exit(0);
			}
		});
		btnSalir.setForeground(Color.BLACK);
		btnSalir.setIcon(new ImageIcon(Prueba1.class.getResource("/primerbtn/btn_salida_pequeño.png")));
		btnSalir.setBackground(Color.BLACK);
		btnSalir.setBounds(-9, 459, 343, 77);
		panel_botones.add(btnSalir);

		JLabel LabelMapImage = new JLabel("");
		LabelMapImage.setIcon(new ImageIcon(Prueba1.class.getResource("/image/mapamenu_pequeño.png")));
		LabelMapImage.setBounds(0, 0, 1175, 549);
		panel_general.add(LabelMapImage);
	}
}
