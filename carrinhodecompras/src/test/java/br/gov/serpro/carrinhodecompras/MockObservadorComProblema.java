package br.gov.serpro.carrinhodecompras;

public class MockObservadorComProblema implements ObservadorCarrinho{
	public void produtoAdicionado(String nome, int valor) {
			throw new RuntimeException("Problema simulado pelo mock");
	}
}

