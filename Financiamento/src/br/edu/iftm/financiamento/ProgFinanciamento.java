package br.edu.iftm.financiamento;

public class ProgFinanciamento {
	
		
	public static void main(String[] args) {
		veiculo V1 = new veiculo(30000,10000,2,48,3000);
			System.out.println("O valor do ve�culo �:" + V1.getValorveiculo());
			System.out.println("O valor da entrada �: "+ V1.getEntrada());
			System.out.println("O valor da taxa de juros �:"+ V1.getTaxa());
			System.out.println("O numero de presta��es � :"+ V1.getPrestacoes());
			System.out.println("A renda do cliente � : R$ "+ V1.getRenda());
			
			V1.financiamento();
			
			System.out.println("O valor da parcela ser�: R$" + V1.getValorprestacoes());
			
			System.out.println("O valor total das presta��es ser�: R$" + V1.valortotal);
		}
	
	
			
		
		

	}


