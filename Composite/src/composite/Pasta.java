package composite;

import java.util.ArrayList;
import java.util.List;

public class Pasta extends SistemaArquivos {
	private List<SistemaArquivos> elementos;
	
	public Pasta(String nome) {
		this.nome = nome;
		elementos = new ArrayList<SistemaArquivos>();
	}
	
	@Override
	public int getSize() {
		int size = 0;
		for(SistemaArquivos sis : elementos) {
			size = size + sis.getSize();
		}
		
		return size;
	}
	
	public void add(SistemaArquivos arq) {
		this.elementos.add(arq);
	}
	
	public void remove(SistemaArquivos arq) {
		this.elementos.remove(arq);
		for(SistemaArquivos sis : elementos) {
			if(sis.getNome().equals(arq.getNome())) {
				this.elementos.remove(sis);
				break;
			}
		}
	}
}