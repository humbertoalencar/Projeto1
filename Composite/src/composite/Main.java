package composite;

public class Main {
	public static void main(String[] args) {
		SistemaArquivos sis = new Pasta("root");
		
		Arquivo arq1 = new Arquivo("arq1", 120);
		Arquivo arq2 = new Arquivo("arq2", 50);
		Arquivo arq3 = new Arquivo("arq3", 20);
		Arquivo arq4 = new Arquivo("arq4", 3000);
		Arquivo arq5 = new Arquivo("arq5", 500);
		
		Pasta p1 = new Pasta("p1");
		Pasta p2 = new Pasta("p2");
		Pasta p3 = new Pasta("p3");
		
		p1.add(arq1);
		p1.add(arq4);
		
		p2.add(arq2);
		p2.add(arq3);
		
		sis.add(p1);
		sis.add(p2);
		sis.add(p3);
		sis.add(arq5);
		
		System.out.println("Pasta root: " + sis.getSize());
		System.out.println("Pasta p1:" + p1.getSize());
		System.out.println("Pasta p2:" + p2.getSize());
		System.out.println("Pasta p3:" + p3.getSize());
		
	}
}
