import java.awt.*;
import javax.swing.*;

public class jogodacobrinhacompleto {
	public static void main(String[] args) {
		SwingUtilities.invokeLater(jogodacobrinhacompleto::criarMenu);
	}

	private static void criarMenu() {
		JFrame janela = new JFrame("Jogo da cobrinha");
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.setSize(400, 300);
		janela.setLocationRelativeTo(null);

		JPanel painel = new JPanel(new GridBagLayout());
		painel.setBackground(Color.DARK_GRAY);

		JLabel titulo = new JLabel("JOGO DA COBRINHA ");
		titulo.setForeground(Color.CYAN);
		titulo.setFont(new Font("Arial", Font.BOLD, 24));

		JButton iniciar = new JButton("Iniciar jogo");
		JButton instrucoes = new JButton("Instruções");
		JButton creditos = new JButton("Créditos");
		JButton sair = new JButton("Sair?");

		iniciar.addActionListener(e ->
				JOptionPane.showMessageDialog(janela, "Ate parece que tem jogo!"));
		instrucoes.addActionListener(e ->
				JOptionPane.showMessageDialog(janela,
						"Use as setas do teclado para movimentar a cobrinha."));
		creditos.addActionListener(e ->
				JOptionPane.showMessageDialog(janela, "Obrigado por testar meu prototipo, por enquanto é só"));
		sair.addActionListener(e ->
			JOptionPane.showMessageDialog(janela, "Não sabe sair de um simples prototipo? KKKKKKKKKKKJ"));

		GridBagConstraints gbc = new GridBagConstraints();
		gbc.gridx = 0;
		gbc.insets = new Insets(10, 10, 10, 10);
		gbc.fill = GridBagConstraints.HORIZONTAL;

		gbc.gridy = 0;
		painel.add(titulo, gbc);
		gbc.gridy = 1;
		painel.add(iniciar, gbc);
		gbc.gridy = 2;
		painel.add(instrucoes, gbc);
		gbc.gridy = 3;
		painel.add(creditos, gbc);
		gbc.gridy = 4;
		painel.add(sair, gbc);

		janela.add(painel);
		janela.setVisible(true);
	}

}