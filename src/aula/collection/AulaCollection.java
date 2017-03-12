package aula.collection;

import java.util.HashSet;
import java.util.Map;

import javax.swing.JOptionPane;

public class AulaCollection {

	public static void main(String[] args) {
		while(true){
			System.out.println("Aula de Collections:\n");
			System.out.println("Escolha as aulas (aulas separadas por virgula):\n");
			System.out.println("Ex: 1,4,5\n");
			System.out.println("0 - Todas");
			for (AulasCollectionEnum aula : AulasCollectionEnum.values()) {
				System.out.println(String.format("%d - %4s", aula.ordinal()+1, aula.nome()));
			}
			System.out.println();
			
			String[] inputs;
			try {
				inputs = JOptionPane.showInputDialog("Aulas:").split(",");
			} catch (NullPointerException e) {
				break;
			}
			
			HashSet<Integer> aulas = new HashSet<Integer>();
			try{
				for(String input : inputs){
					aulas.add(Integer.parseInt(input));
				}
			}catch(NumberFormatException e){
				System.out.println("Digite apenas numeros separados por virgula.");
				continue;
			}
			
			if (aulas.contains(0)) {
				for (AulasCollectionEnum aula : AulasCollectionEnum.values()) {
					aula.apresentar();
				}
			}else{
				Map<Integer,AulasCollectionEnum> map = AulasCollectionEnum.map();
				for (Integer codigo : aulas) {
					AulasCollectionEnum aula = map.get(codigo);
					if(aula != null){
						aula.apresentar();
					}
				}
			}
			
			break;
		}
		System.out.println("\n\n-------------------- FIM ---------------------");
	}
}
