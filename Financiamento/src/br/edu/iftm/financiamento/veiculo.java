package br.edu.iftm.financiamento;

public class veiculo extends Cliente {
	double valorveiculo,taxa,valortotal,entrada,pv,valorprestacoes; 
	public double getValorprestacoes() {
		return valorprestacoes;
	}
	public void setValorprestacoes(double valorprestacoes) {
		this.valorprestacoes = valorprestacoes;
	}

	int prestacoes;
	public double getValorveiculo() {
		return valorveiculo;
	}
	public void setValorveiculo(double valorveiculo) {
		this.valorveiculo = valorveiculo;
	}
	public double getTaxa() {
		return taxa;
	}
	public void setTaxa(double taxa) {
		this.taxa = taxa;
	}
	public double getValortotal() {
		return valortotal;
	}
	public void setValortotal(double valortotal) {
		this.valortotal = valortotal;
	}
	public double getEntrada() {
		return entrada;
	}
	public void setEntrada(double entrada) {
		this.entrada = entrada;
	}
	public double getPv() {
		return pv;
	}
	public void setPv(double pv) {
		this.pv = pv;
	}
	public int getPrestacoes() {
		return prestacoes;
	}
	public void setPrestacoes(int prestacoes) {
		this.prestacoes = prestacoes;
	}
	public veiculo() {
		
	}
	public veiculo(double valorveiculo, double entrada,double taxa, int prestacoes, double renda) {
		super (renda);
		this.valorveiculo = valorveiculo;
		this.taxa=taxa/100; 
		taxa=(1+taxa); 
		this.entrada = entrada;
		this.pv = valorveiculo - entrada;
		this.prestacoes = prestacoes;
		}

	
	public double financiamento() {
		this.valorprestacoes = ((this.pv)* this.taxa)/(1-(1/Math.pow(1+taxa,prestacoes)));
		this.valortotal = this.valorprestacoes * this.prestacoes;
		if(this.valorprestacoes < (super.getRenda() * 0.4)){
			System.out.println("Financiamento liberado");
			
					
		}else
		{
			System.out.println("Financiamento não liberado valor da prestação ultapassa 40% da renda");
		}
		return valorprestacoes;
	}
		
		
			
		}
		
	

	
	
	
	


