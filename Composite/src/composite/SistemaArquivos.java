package composite;

public abstract class SistemaArquivos {
	protected String nome;
	protected int size;
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void add(SistemaArquivos arq) {
		
	}
	
	public void remove(SistemaArquivos arq) {
		
	}
	
	public abstract int getSize();
}
