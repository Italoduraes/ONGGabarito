import java.util.ArrayList;

public class Principal {
	
	public static void main(String[] args){
		
		// Instanciar o BDSimulado
		BDSimulado bds= new BDSimulado();
		
	//Instanciar a lista de ONG e Posto
		
		ArrayList<ONG> ONG = bds.getONG();
		ArrayList<Posto> Posto= bds.getPosto();
		
		
		// 2 QUEST�O
		   //System.out.println(bds.getInfoONG("Coma bem"));
	
		// 3 QUESTA�
		  // System.out.println(bds.getNumONGPorEstado("DF"));
		
	   // 4 QUEST�O
          ArrayList<Posto> PostosPorCapacidade = bds.getPostoPorCapacidade(1000);
		
		for (int i = 0; i < PostosPorCapacidade.size(); i++) {
			//System.out.println(PostosPorCapacidade.get(i).getCodigo());
		}
		
		// 5 QUEST�O
		
		ArrayList<Integer> PostosVegetarianos = bds.getPostosVegetarianos();
		
		for (int i = 0; i < PostosVegetarianos.size(); i++) {
			//System.out.println(PostosVegetarianos.get(i));
		} 
		
		// 1.1 QUEST�O
		
			//System.out.println(bds.getONGQueAtende(900));
		
		// 1.2 QUEST�O
		
		ArrayList<Posto> ONGQueAtendeGeral =bds.getONGQueAtendeGeral(1, 5, 0);
		
		for (int i = 0; i <ONGQueAtendeGeral.size(); i++) {
			System.out.println(ONGQueAtendeGeral.get(i).getOng().getNome());
		}
		 
		
		
		
		
		
		
	}
}
