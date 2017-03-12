package model;

public class Exemplo1 implements Comparable<Exemplo1>{
	
	private Integer codigo;
	private String nome;
	
	public Exemplo1(){}
	
	public Exemplo1(Integer codigo){
		this.codigo = codigo;
	}
	
	protected Exemplo1(Integer codigo, String nome){
		this.codigo = codigo;
		this.nome = nome;
	}
	
	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public final String metodoExemplo(){
		return "xpto";
	}
	
	public static Exemplo1[] getExemploArray(){
		return new Exemplo1[]{new Exemplo1(7),new Exemplo1(6),new Exemplo1(5),new Exemplo1(4),new Exemplo1(3),new Exemplo1(2),new Exemplo1(1)};
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codigo == null) ? 0 : codigo.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Exemplo1 other = (Exemplo1) obj;
		if (codigo == null) {
			if (other.codigo != null)
				return false;
		} else if (!codigo.equals(other.codigo))
			return false;
		return true;
	}

	@Override
	public int compareTo(Exemplo1 arg0) {
		return this.codigo.compareTo(arg0.codigo);
	}
	
	@Override
	public String toString() {
		return String.format("{%s : %d}", this.getClass().getSimpleName(), this.codigo);
	}
}
