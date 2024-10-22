package formularioprofessor;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FormularioProfessor extends Frame implements ActionListener{

	protected Dimension dQuadro, dRotulo, dCaixaTexto, dBotao;
	protected Button bCadastrarProfessor, bSair;
	protected TextField tfNome, tfIdade;
	protected Label lNome, lIdade;
	
	Professor professorUm = new Professor();
	
	public FormularioProfessor() {
		
		Dimension dQuadro = new Dimension(335, 260);
		Dimension dRotulo = new Dimension(45, 25);
		Dimension dCaixaTexto = new Dimension(180, 25);
		Dimension dBotao = new Dimension(130, 25);
		
		setTitle("Cadastrar Professor");
		setResizable(false);
		setSize(dQuadro);
		setLocation(650, 350);
		setLayout(null);
		
		lNome = new Label("Nome");
		lNome.setSize(dRotulo);
		lNome.setLocation(25, 50);
		
		lIdade = new Label("Idade");
		lIdade.setSize(dRotulo);
		lIdade.setLocation(25, 100);
		
		tfNome = new TextField();
		tfNome.setSize(dCaixaTexto);
		tfNome.setLocation(80, 50);
		
		tfIdade = new TextField();
		tfIdade.setSize(dCaixaTexto);
		tfIdade.setLocation(80, 100);
		
		bCadastrarProfessor = new Button("Cadastrar Professor");
		bCadastrarProfessor.setSize(dBotao);
		bCadastrarProfessor.setLocation(25, 150);
		bCadastrarProfessor.addActionListener(this);
		
		bSair = new Button("Sair");
		bSair.setSize(dBotao);
		bSair.setLocation(180, 150);
		bSair.addActionListener(this);
		
		add(lNome);
		add(lIdade);
		add(tfNome);
		add(tfIdade);
		add(bCadastrarProfessor);
		add(bSair);
		
	}
	
	public void actionPerformed(ActionEvent evento) {
		if (evento.getSource() == bCadastrarProfessor) {
			professorUm.validarUsuario(tfNome.getText(), tfIdade.getText());
		}
		
		if (evento.getSource() == bSair) {
			System.out.println("Fim do aplicativo. Obrigado!");
			System.exit(0);
		}
	}
	
}
