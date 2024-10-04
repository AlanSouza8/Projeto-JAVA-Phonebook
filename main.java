import java.util.Scanner;
import java.util.ArrayList;

class Main{
	public static ArrayList<Phone> phone = new ArrayList<>();
		public static void adicionarNumero(){
			Scanner entrada = new Scanner(System.in);
			
			String p = entrada.next();
			int x = entrada.nextInt();
			phone.add(new Phone(p,x));
		}
		public static void exibirContatos(){
			for(Phone p : phone){
			System.out.println("Nome: " + p.getNome() + "Telefone: " + p.getNumero());
			}
		}
		public static void deletarNumero(){
			Scanner entrada = new Scanner(System.in);
			String d = entrada.next();
			for(int i=0;i<phone.size();i++){
				if(d.equals(phone.get(i).getNome())){
					phone.remove(i);
					break;
				}
			}
		}
    public static void sairPhonebook(){
      System.exit(0);
    }
		public static void main(String[] args){
			Scanner entrada = new Scanner(System.in);
			while(true){
				int j = entrada.nextInt();
			
        switch(j){
				  case 1:
					  adicionarNumero();
				  case 2:
					  deletarNumero();
				  case 3:
					  exibirContatos();
          case 4:
            sairPhonebook();  
			  }
			}
		}
}