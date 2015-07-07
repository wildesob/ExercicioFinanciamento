package br.edu.iftm.financiamento;

public class ProgFinanciamento {
	
		
	public static void main(String[] args) {
		veiculo V1 = new veiculo(30000,10000,2,48,3000);
			System.out.println("O valor do veículo é:" + V1.getValorveiculo());
			System.out.println("O valor da entrada é: "+ V1.getEntrada());
			System.out.println("O valor da taxa de juros é:"+ V1.getTaxa());
			System.out.println("O numero de prestações é :"+ V1.getPrestacoes());
			System.out.println("A renda do cliente é : R$ "+ V1.getRenda());
			
			V1.financiamento();
			
			System.out.println("O valor da parcela será: R$" + V1.getValorprestacoes());
			
			System.out.println("O valor total das prestações será: R$" + V1.valortotal);
		}
	
	
			
		
		

	}


