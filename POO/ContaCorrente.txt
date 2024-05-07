package pratica;

public class ContaCorrente {

	public String nomeTitular;
	public long cpf;
	public long numeroDaconta;  // long numero comprido
	public Double saldo;
	
	
	public Double sacar(Double valorSaque) {
		
		double retornoSaque = 0;
		if(valorSaque > saldo) {
			System.out.println("Saldo insuficiente");
		} else {
			saldo = saldo - valorSaque;
			retornoSaque = valorSaque;
		}
		return retornoSaque;
	}
	
	public void depositar (Double valorDeposito) {
		
		saldo = saldo + valorDeposito;
	
	}
	
	public void mostrarDados() {
		
		System.out.println("Nome:"+nomeTitular);
		System.out.println("CPF:"+cpf);
		System.out.println("Numero da conta:"+numeroDaconta);
		System.out.println("Saldo:"+saldo);
		
		
	}
	
}