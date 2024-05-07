package ifsc;

public class Pessoa {
	
	public String nome;
	public String CPF;
	
	public String getCPF() {
		return CPF;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setCPF(String CPF) {
		this.CPF = CPF;
	}
}