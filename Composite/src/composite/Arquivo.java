package composite;

public class Arquivo extends SistemaArquivos {
	
	public Arquivo(String nome, int size) {
		this.nome = nome;
		this.size = size;
	}
	
	public int getSize(){
		return this.size;
	}
}
