package model;

public final class Exemplo2 extends Exemplo1{
	
	public Exemplo2(){}
	public Exemplo2(Integer codigo){
		super(codigo);
	}
	
	public static Exemplo2[] getExemploArray(){
		return new Exemplo2[]{new Exemplo2(7),new Exemplo2(6),new Exemplo2(5),new Exemplo2(4),new Exemplo2(3),new Exemplo2(2),new Exemplo2(1)};
	}
}
