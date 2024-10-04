class Phone{
	public Phone(String person, int number){
		this.nome = person;
		this.numero = number;
	}
	public void setNome(String nome){
		this.nome=nome;
	}
	public void setNumero(int numero){
		this.numero=numero;
	}
	public String getNome(){
		return nome;
	}
	public int getNumero(){
		return numero;
	}
	
	private String nome;
	private int numero;
}