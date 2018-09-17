package teste;

import modelo.Contato;

public class Programa {

	public static void main(String[] args) {
		
		System.out.println("Agenda de Contatos 2018\n");
		Contato c1 = new Contato("Diego","3216548");
		Contato c2 = new Contato("Jose","65498731");
		Contato c3 = new Contato("Maria","98765431");
		
		//array de Contatos
		Contato[] listaDeContatos = new Contato[3];
		listaDeContatos[0] = c1;
		listaDeContatos[1] = c2;
		listaDeContatos[2] = c3;

		for (Contato contato : listaDeContatos) {
			contato.mostraContato();
		}

	}

}
