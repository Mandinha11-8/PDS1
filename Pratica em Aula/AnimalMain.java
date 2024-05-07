package aula;

public class AnimalMain {
	
	public static void main(String[] args) {

        Cachorro c = new Cachorro();
        c.setcomprimento( 1111.11);
        c.setcor("Frajola");
        c.setnome("Richard Parker11");

        Gato g = new Gato();
        g.setmia( "MIAAUUU Felps11");
        g.setcor("Murisco");
        g.setnome("Eric lindo gatinho");

    System.out.println("Comprimentos do cachorro: "+c.getcomprimento());
    System.out.println("Cor do cachorro: "+c.getcor());
    System.out.println("Nome do cachorro: "+c.getnome());

    System.out.println("****************");

    System.out.println("Qual som o gato faz: "+g.getmia());
    System.out.println("Qual a cor do gato: "+g.getcor());
    System.out.println("Nome do gato: "+g.getnome());

    }

}