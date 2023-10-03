package Vista;

import Modelo.CuentaBancaria;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.JSplitPane;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.border.TitledBorder;

import Excepciones.InvalidDepoException;
import Excepciones.InvalidExtractionException;

import javax.swing.border.EtchedBorder;
import javax.swing.BoxLayout;
import java.awt.CardLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Component;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.UIManager;

public class Ventana extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JPanel TitularPanel;
	private JPanel InfoPanel;
	private JPanel SaldoPanel;
	private JPanel OperationsPanel;
	private JLabel SaldoInfo;
	private JLabel TitularInfo;
	private JPanel ExtractionPanel;
	private JPanel DepoPanel;
	private JPanel DatosExtraccion;
	private JPanel Btnpanel;
	private JLabel lblNewLabel;
	private JTextField MontoExtraer;
	private JButton btnExtraer;
	private JPanel MontoExtraerPanel;
	private JPanel DatosDepo;
	private JPanel btnDepoPanel;
	private JLabel lblNewLabel_1;
	private JTextField MontoDepositar;
	private JPanel MontoDepoPanel;
	private JButton btnNewButton;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ventana frame = new Ventana();
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
	public Ventana() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 717, 433);
		this.contentPane = new JPanel();
		this.contentPane.setBackground(new Color(255, 255, 255));
		this.contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(this.contentPane);
		this.contentPane.setLayout(new BorderLayout(0, 5));
		
		this.TitularPanel = new JPanel();
		this.TitularPanel.setBackground(new Color(0, 255, 128));
		this.contentPane.add(this.TitularPanel, BorderLayout.NORTH);
		this.TitularPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		this.TitularInfo = new JLabel(CuentaBancaria.getCuenta().getTitular());
		this.TitularInfo.setBackground(new Color(0, 255, 0));
		this.TitularInfo.setFont(new Font("Verdana", Font.PLAIN, 24));
		this.TitularPanel.add(this.TitularInfo);
		
		this.InfoPanel = new JPanel();
		this.InfoPanel.setBackground(new Color(255, 255, 255));
		this.contentPane.add(this.InfoPanel, BorderLayout.CENTER);
		this.InfoPanel.setLayout(new BorderLayout(0, 10));
		
		this.SaldoPanel = new JPanel();
		this.SaldoPanel.setBackground(new Color(255, 255, 255));
		this.SaldoPanel.setPreferredSize(new Dimension(57, 60));
		this.InfoPanel.add(this.SaldoPanel, BorderLayout.NORTH);
		this.SaldoPanel.setLayout(new BorderLayout(0, 0));
		
		this.SaldoInfo = new JLabel("$"+String.valueOf( CuentaBancaria.getCuenta().getSaldo() ) ) ;
		this.SaldoInfo.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 32));
		this.SaldoInfo.setHorizontalAlignment(SwingConstants.CENTER);
		this.SaldoPanel.add(this.SaldoInfo, BorderLayout.NORTH);
		
		this.OperationsPanel = new JPanel();
		this.OperationsPanel.setBackground(new Color(255, 255, 255));
		this.InfoPanel.add(this.OperationsPanel, BorderLayout.CENTER);
		this.OperationsPanel.setLayout(new GridLayout(0, 2, 5, 0));
		
		this.ExtractionPanel = new JPanel();
		this.ExtractionPanel.setBackground(new Color(255, 255, 255));
		this.ExtractionPanel.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Extraer", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		this.OperationsPanel.add(this.ExtractionPanel);
		this.ExtractionPanel.setLayout(new GridLayout(2, 0, 0, 10));
		
		this.DatosExtraccion = new JPanel();
		this.DatosExtraccion.setBorder(null);
		this.DatosExtraccion.setBackground(new Color(255, 255, 255));
		this.ExtractionPanel.add(this.DatosExtraccion);
		this.DatosExtraccion.setLayout(new GridLayout(0, 1, 5, 5));
		
		this.lblNewLabel = new JLabel("Ingrese el monto a extraer :");
		this.lblNewLabel.setBackground(new Color(255, 255, 255));
		this.lblNewLabel.setFont(new Font("Leelawadee UI Semilight", Font.PLAIN, 16));
		this.lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		this.DatosExtraccion.add(this.lblNewLabel);
		
		this.MontoExtraerPanel = new JPanel();
		this.MontoExtraerPanel.setBorder(null);
		this.MontoExtraerPanel.setBackground(new Color(255, 255, 255));
		this.DatosExtraccion.add(this.MontoExtraerPanel);
		this.MontoExtraerPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		this.MontoExtraer = new JTextField();
		this.MontoExtraerPanel.add(this.MontoExtraer);
		this.MontoExtraer.setColumns(15);
		
		this.Btnpanel = new JPanel();
		this.Btnpanel.setBackground(new Color(255, 255, 255));
		this.ExtractionPanel.add(this.Btnpanel);
		this.Btnpanel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		this.btnExtraer = new JButton("Confirmar extraccion");
		this.btnExtraer.setActionCommand("Extraer");
		this.btnExtraer.addActionListener(this);
		this.btnExtraer.setForeground(new Color(0, 0, 0));
		this.btnExtraer.setBackground(UIManager.getColor("Button.background"));
		this.Btnpanel.add(this.btnExtraer);
		
		this.DepoPanel = new JPanel();
		this.DepoPanel.setBorder(new TitledBorder(null, "Depositos", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		this.DepoPanel.setBackground(new Color(255, 255, 255));
		this.OperationsPanel.add(this.DepoPanel);
		this.DepoPanel.setLayout(new GridLayout(2, 1, 10, 10));
		
		this.DatosDepo = new JPanel();
		this.DatosDepo.setBorder(null);
		this.DatosDepo.setBackground(new Color(255, 255, 255));
		this.DepoPanel.add(this.DatosDepo);
		this.DatosDepo.setLayout(new GridLayout(2, 1, 0, 5));
		
		this.lblNewLabel_1 = new JLabel("Ingrese el monto a depositar :");
		this.lblNewLabel_1.setFont(new Font("Leelawadee UI Semilight", Font.PLAIN, 16));
		this.lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		this.DatosDepo.add(this.lblNewLabel_1);
		
		this.MontoDepoPanel = new JPanel();
		this.MontoDepoPanel.setBorder(null);
		this.MontoDepoPanel.setBackground(new Color(255, 255, 255));
		this.DatosDepo.add(this.MontoDepoPanel);
		
		this.MontoDepositar = new JTextField();
		this.MontoDepoPanel.add(this.MontoDepositar);
		this.MontoDepositar.setColumns(15);
		
		this.btnDepoPanel = new JPanel();
		this.btnDepoPanel.setBackground(new Color(255, 255, 255));
		this.DepoPanel.add(this.btnDepoPanel);
		
		this.btnNewButton = new JButton("Confirmar deposito");
		this.btnNewButton.setActionCommand("Depositar");
		this.btnNewButton.addActionListener(this);
		this.btnDepoPanel.add(this.btnNewButton);
	}

	
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand().equals("Depositar"))this.Depositar();
		else if(e.getActionCommand().equals("Extraer"))this.Extraer();
		
		this.actualizarSaldo();
	}

	private void actualizarSaldo() {
		this.SaldoInfo.setText("$ "+CuentaBancaria.getCuenta().getSaldo());		
	}

	private void Extraer() {
		double monto = Double.parseDouble(this.MontoExtraer.getText());
		
		try {
			CuentaBancaria.getCuenta().extraer(monto);
		} catch (InvalidExtractionException e) {
			JOptionPane.showMessageDialog(this, e.getMessage());
			
		}
		
	}

	private void Depositar() {
		double monto = Double.parseDouble(this.MontoDepositar.getText());
		
		try {
			CuentaBancaria.getCuenta().depositar(monto);
		} catch (InvalidDepoException e) {
			JOptionPane.showMessageDialog(this, e.getMessage());
			
		}
		
	}
}
