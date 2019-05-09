package br.gov.serpro.carrinhodecompras;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoCompras {
	private List<Produto> itens = new ArrayList<Produto>();
	private List<ObservadorCarrinho> observadores = new ArrayList<ObservadorCarrinho>();
	
	public void adicionaProduto(Produto p) {
		itens.add(p);
		for(ObservadorCarrinho observador : observadores) {
			try {
				observador.produtoAdicionado(p.getNome(), p.getValor());
			}catch (Exception e) {}
		}
	}
	
	public int total() {
		int total = 0;
		for(Produto p : itens) {
			total += p.getValor();
		}
		return total;
	}

	public void adicionarObservador(ObservadorCarrinho observador) {
		observadores.add(observador);
		
	}
}
