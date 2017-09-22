import java.lang.reflect.Array;
import java.util.ArrayList;

public class BDSimulado {
	
	//Atributos
	
	private ArrayList<ONG> ONG;
	private ArrayList<Posto> Posto;
	
	//Metodos construtor
	
	public BDSimulado (){
		//criar a lista de ONGs 
		 this.ONG = new ArrayList<ONG>();
		
		 //Preencher a lista de ONGs
		 
		 ONG o1 = new ONG("Alimeta mais", "João da Silva" , "DF");
		 ONG o2 = new ONG("Coma bem", "Maria Josefina","RJ");
		 ONG o3 = new ONG("Casa do Pão de Queijo","Zezinho", "MG");
		 ONG o4 = new ONG("Boi Gordo","Xororó","GO");
		 ONG o5 = new ONG("Viva Comendo", "Udislal", "SP");
		
		//add na lista 
		 
		 this.ONG.add(o1);
		 this.ONG.add(o2);
		 this.ONG.add(o3);
		 this.ONG.add(o4);
		 this.ONG.add(o5);
		 
		 //Criar a lista de Postos 
		 
		this.Posto = new ArrayList<Posto>();
		 
		 //Preencher a lista de Postos 
		
		Posto p1= new Posto(1, 100, false, false, false);
		Posto p2= new Posto(234, 2345, true, true, true); 
		Posto p3= new Posto(678, 2378, false, false, true);
		Posto p4= new Posto(123, 123, true, true, false);
		Posto p5= new Posto(987, 987, false, true, true);
		Posto p6= new Posto(456, 785452, false, false, false);
		
		//informar a ONG dos Posto
		p1.setOng(o1);
		p2.setOng(o2);
		p3.setOng(o3);
		p4.setOng(o4);
		p5.setOng(o5);
		p6.setOng(o1);
		
		
		
		//add na lista 
		
		this.Posto.add(p1);
		this.Posto.add(p2);
		this.Posto.add(p3);
		this.Posto.add(p4);
		this.Posto.add(p5);
		this.Posto.add(p6);
			 
	}

	public ArrayList<ONG> getONG() {
		return ONG;
	}

	public ArrayList<Posto> getPosto() {
		return Posto;
	}
	
	
	// 2) metodo q retorna todas as informaçoes de uma ONG de acordo com o nome da ONG
	
	public String getInfoONG(String nomeONG){
		
		String resultado = "";
		
		// Preencher a lista de ONGs buscando pelo nome
		for (int i = 0; i < this.ONG.size(); i++) {
			if(this.ONG.get(i).getNome().equals(nomeONG)) {
				resultado = "Nome: " + this.ONG.get(i).getNome()
						+ "\n" +
						"Responsável: " + this.ONG.get(i).getResponsavel()
						+ "\n" + 
						"Estado: " + this.ONG.get(i).getEstado();
			}
		}		
		return resultado;
	}
	
	// 3) metodo que retorna o numero de ONGs por estado
	
	public int getNumONGPorEstado(String estado){
		
		int resultado = 0;
		
		//percorrer o a lista de ONGs
		for (int i = 0; i < this.ONG.size(); i++) {
			if(this.ONG.get(i).getEstado().equals(estado)){
				resultado++;
			}
		}
		return resultado;
		
	}
	
	// 4) metodo q retorna a lista de todos postos q possuem capacidade
	
	public ArrayList<Posto> getPostoPorCapacidade(int x){
		
		ArrayList<Posto> resultado = new ArrayList<Posto>();
		
		// Percorrer a lista de Posto
		
		for (int i = 0; i <this.Posto.size(); i++) {
			if (this.Posto.get(i).getCapacidade() > x){
				resultado.add(this.Posto.get(i));
			}
		}		
		return resultado;
	}
	
	// 5) metodo que retorna o codigo dos postos vegetarianos
	
	 public ArrayList<Integer> getPostosVegetarianos(){
		
		ArrayList<Integer> resultado = new ArrayList<Integer>();
		
		//Pecorrer a lista de Posto
		 for (int i = 0; i <this.Posto.size(); i++) {
			if(this.Posto.get(i).isVegetariano()){
				resultado.add(this.Posto.get(i).getCodigo());
			}
		}
		return resultado;
	}
	
	 // 1.1) metodo que retorna o nome da ONG que vai atender a caravana por numero de pessoas 
	 
	 public String getONGQueAtende(int qtdePessoas){
		 
		 String resultado= "";
		 
		 double qtdeComida = qtdePessoas * 0.5;
		 
		 //Percorrer a lista de Posto
		 for (int i = 0; i <this.Posto.size(); i++) {
			if (this.Posto.get(i).getCapacidade() >= qtdeComida) {
				resultado = this.Posto.get(i).getOng().getNome();
			}
		 }	 
		 return resultado;
	 }
	 
	 
	 
	 




}
