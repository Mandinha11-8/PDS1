package ifsc;
public class MainPessoa {

	public static void main(String[] args) {
		
		
			
			Aluno aluno = new Aluno();
			aluno.setCPF("111.111.11-11");
			aluno.setNome("Felps11");
			aluno.setMatricula (111222131);
			
			Professor pl = new Professor ();
			pl.setCPF("111.211.444");
			pl.setNome("Vanessa");
			pl.setSiape (112233441);
			
			System.out.println(" ___Dados do Aluno:___");
			System.out.println("CPF:"+aluno.getCPF());
			System.out.println("Nome:"+aluno.getNome());
			System.out.println("Matricula:"+aluno.getMatricula());
			
			System.out.println("___Dados do Professor:___");
			System.out.println("CPF:"+pl.getCPF());
			System.out.println("Nome:"+pl.getNome());
			System.out.println("Siape"+pl.getSiape());
			

		}

	


	}