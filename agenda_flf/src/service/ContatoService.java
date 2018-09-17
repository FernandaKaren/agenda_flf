package service;

import java.util.ArrayList;

import modelo.Contato;

public class ContatoService {
	//atributos
	ArrayList<Contato> listaContatos = new ArrayList();
	
	public ArrayList<Contato> getListaContato(){
		return this.listaContatos;
	}
	
	
	// CRUD

	// Criar Contato
	public void addContato(String nome, String tel){
		Contato c = new Contato(nome,tel);
		listaContatos.add(c);
	}
	// Pesquisar
	public Contato buscarContato(String nome){
		for (Contato contato : listaContatos) {
			if(contato.getNome()==nome) {
				return contato;
			}
		}
		System.out.println("contato não encontrado... :(");
		return null;
	}
	// Atualizar Contato
	// Deletar Contato
}
