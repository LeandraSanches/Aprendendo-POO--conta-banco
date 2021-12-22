package conta.bancaria;

public class ContaBanco {
	
		public int numConta;
		protected String tipo;
		private String dono;
		private float saldo;
		private boolean status;
		
		
		
		
		
		public void estadoAtual () {
			System.out.println("--------------");
			System.out.println("Conta: " + this.getNumConta());
			System.out.println("Tipo: " + this.getTipo());
			System.out.println("Dono: " + this.getDono());
			System.out.println("Saldo:" + this.getSaldo());
			System.out.println(" Status: " + this.getStatus());
			
		}
	
		
		public void abrirConta(String t) {
			this.setTipo (t);
			this.setStatus(true);
			if(t == "CC") {
			this.setSaldo(50);
				
		}else if(t == "CP") {
		this.setSaldo(150);
	}
			System.out.println("Conta aberta com sucesso");
		}
		
		
		public void fecharConta() {
			if(this.getSaldo()>0) {
				System.out.println("A conta tem dinheiro e não pode ser fechada");
			}
			 else if (this.getSaldo() <0 ) {
				System.out.println("A conta está em débito e não pode ser fechada");
				}
			else   {
				this.setStatus(false);
				System.out.println("Conta fechada com sucesso");
			}
		}

		public void depositar(float v) {
			if (this.getStatus ()) {
				this.setSaldo(this.getSaldo() + v);
				System.out.println("Depósito realizado com sucesso na conta de" + this.getDono());
				
			}else {System.out.println("Impossivel depositar");
					
				}
			
	}
		
		public void sacar(float v) {
			if (this.getStatus()) {
				if(this.getSaldo() >= v) {					
				this.setSaldo(this.getSaldo() - v);
				System.out.println("Saque realizado na conta de " + this.getDono());
				}else {
					System.out.println("saldo insuficiente");
				}
		
				} else {
					System.out.println("Impossivel sacar");	
			
						}
		}
		
		
		public void pagarMensalidade() {
			int v = 0;
					if(this.getTipo() == "CC") {
						v=12;
						
					}else if (this.getTipo() == "CP")
						v = 20;					
					
					
		if(this.getStatus ()) {
			this.setSaldo(this.getSaldo () - v);
			System.out.println("Mensalidade paga com sucesso por " + this.getDono());
					}else {
						System.out.println("Impossivel pagar uma conta fechada!");
					}
		}
		
		
		
		
	public ContaBanco() {
	
			this.setSaldo (0);
			this.setStatus (false);
		}
	


	public int getNumConta() {
		return this.numConta;
	}



	public void setNumConta(int n) {
		this.numConta = n;
	}



	public String getTipo() {
		return tipo;
	}



	public void setTipo(String t) {
		this.tipo = t;
	}



	public String getDono() {
		return dono;
	}



	public void setDono(String d) {
		this.dono = d;
	}



	public float getSaldo() {
		return saldo;
	}



	public void setSaldo(float s) {
		this.saldo = s;
	}



	public boolean getStatus() {
		return status;
	}



	public void setStatus(boolean status) {
		this.status = status;
	}
	

	
		
				
		
		
		
		
				
}
