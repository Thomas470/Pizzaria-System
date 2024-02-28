
public class Pizza {
	private String tamanho;
	private Double preco;
	private String sabor;
	
	public Pizza(String tamanho, Double preco, String sabor) {
		this.sabor = sabor;
		this.preco = preco;
		this.tamanho = tamanho;
	}

	public String getTamanho() {return tamanho;
	}

	public void setTamanho(String tamanho) {this.tamanho = tamanho;
	}

	public void setPreco(Double preco) {this.preco = preco;
	}

	public Double getPreco() {return preco;
	}

	public void setSabor(String sabor) {this.sabor = sabor;
	}

	public String getSabor() {return sabor;
	}
	
}
