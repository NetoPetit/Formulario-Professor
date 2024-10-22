package formularioprofessor;

import javax.swing.JOptionPane;

public class Professor {

	private String nome;
	private String idade;
	
	public void validarUsuario(String nome, String idade) {
		JOptionPane.showMessageDialog(null, "Nome " + nome + "\n Idade " + idade);
	}
	
	public String getNome() {
		return this.nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getIdade() {
		return this.idade;
	}
	public void setIdade(String idade) {
		this.idade = idade;
	}
	
	
}
