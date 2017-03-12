package model;

public final class Exemplo3 extends Exemplo1 {
	
	public Exemplo3(){}
	public Exemplo3(Integer codigo){
		super(codigo);
	}
	
	private String tipo;

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public static Exemplo3[] getExemploArray(){
		return new Exemplo3[]{new Exemplo3(7),new Exemplo3(6),new Exemplo3(5),new Exemplo3(4),new Exemplo3(3),new Exemplo3(2),new Exemplo3(1)};
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((tipo == null) ? 0 : tipo.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Exemplo3 other = (Exemplo3) obj;
		if (tipo == null) {
			if (other.tipo != null)
				return false;
		} else if (!tipo.equals(other.tipo))
			return false;
		return true;
	}
	
}
