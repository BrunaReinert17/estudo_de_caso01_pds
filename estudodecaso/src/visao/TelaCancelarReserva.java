package visao;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;

public class TelaCancelarReserva extends JFrame {

	private JPanel contentPane;
	private JTextField txtCpf;
	private JTextField txtNumeroDaReserva;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaCadastro frame = new TelaCadastro();
					frame.setExtendedState(MAXIMIZED_BOTH);
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
	public TelaCancelarReserva() {
		setTitle("Tela Cancelar Reserva");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1260, 991);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(135, 206, 250));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Tela Cancelar Reserva");
		lblNewLabel.setForeground(new Color(0, 0, 128));
		lblNewLabel.setFont(new Font("Source Serif Pro Semibold", Font.BOLD | Font.ITALIC, 26));
		lblNewLabel.setBounds(517, 56, 269, 23);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Cpf:");
		lblNewLabel_1.setFont(new Font("Source Serif Pro Semibold", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(568, 174, 46, 17);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Numero da Reserva:");
		lblNewLabel_2.setBackground(new Color(135, 206, 250));
		lblNewLabel_2.setFont(new Font("Source Serif Pro Semibold", Font.PLAIN, 20));
		lblNewLabel_2.setBounds(567, 335, 184, 21);
		contentPane.add(lblNewLabel_2);
		
		txtCpf = new JTextField();
		txtCpf.setBounds(568, 224, 156, 20);
		contentPane.add(txtCpf);
		txtCpf.setColumns(10);
		
		txtNumeroDaReserva = new JTextField();
		txtNumeroDaReserva.setBounds(568, 391, 86, 20);
		contentPane.add(txtNumeroDaReserva);
		txtNumeroDaReserva.setColumns(10);
		
		JButton btnCancelarReserva = new JButton("Cancelar Reserva");
		btnCancelarReserva.setFont(new Font("Source Serif Pro Semibold", Font.BOLD | Font.ITALIC, 18));
		btnCancelarReserva.setBounds(517, 583, 301, 41);
		contentPane.add(btnCancelarReserva);
	}

}
