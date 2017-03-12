package aula.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;
import java.util.TreeSet;

import model.Exemplo1;
import model.Exemplo2;
import model.Exemplo3;

public enum AulasCollectionEnum {
	COLLECTIONS("Collections"){
		@Override
		public void apresentar() {
			System.out.println("Métodos úteis da classe Collecitons");
			ArrayList<Exemplo1> arrayList = new ArrayList<Exemplo1>(21);
			arrayList.addAll(Arrays.asList(VET_EXEMPLO_1));
			arrayList.addAll(Arrays.asList(VET_EXEMPLO_2));
			arrayList.addAll(Arrays.asList(VET_EXEMPLO_3));
			
			System.out.println("Posso organizar os elementos com o Collections.sort() (Obs: vai ordenar de acordo com a implementação do Comparable)");
			Collections.sort(arrayList);
			System.out.println(arrayList);
			System.out.println();
			
			System.out.println("Posso também inverter a ordem da lista com o Collections.reverse()");
			Collections.reverse(arrayList);
			System.out.println(arrayList);
			System.out.println();
			
			System.out.println("Posso também embaralhar a lista com o Collections.shuffle()");
			Collections.shuffle(arrayList);
			System.out.println(arrayList);
			System.out.println();
			
			System.out.println("Posso pegar o maior valor da lista com o Collections.max() (Obs: compara baseado no compareTo() do objeto!)");
			System.out.println(Collections.max(arrayList));
			System.out.println();
			
//			System.out.println("Posso remover elementos de acordo com uma condição com o removeIf() (JAVA 8)");
//			arrayList.removeIf((e) -> e.equals(new Exemplo1(2)));
//			System.out.println(arrayList);
//			System.out.println();
			
			System.out.println("Posso remover todos os elementos que conteham em determinada lista baseado no hashCode() e equals().");
			arrayList.removeAll(Arrays.asList(VET_EXEMPLO_1));
			System.out.println(arrayList);
			System.out.println();
			
			System.out.println("Posso remover um elemento por objeto baseado no hashCode() e equals()");
			arrayList.remove(new Exemplo1(2));
			System.out.println(arrayList);
			System.out.println();
			
			System.out.println("Posso ver se a coleção contém um objeto ou uma outra coleção");
			System.out.println(arrayList.contains(Arrays.asList(VET_EXEMPLO_1)));
			System.out.println();
			
			System.out.println("Posso deixar apenas os elementos de uma determinada lista.");
			arrayList.retainAll(Arrays.asList(VET_EXEMPLO_1));
			System.out.println(arrayList);
			System.out.println();
		}
	},
	ARRAY_LIST("Array List"){
		@Override
		public void apresentar() {
			System.out.println("ArrayList:");
			System.out.println("Sua performance para adicionar e remover elementos é inferior ao LinkedList");
			System.out.println("Pois ele tem que copiar os arrays internos do objeto para fazer essas operações");
			System.out.println("Porém para pegar um elemento da lista, sua perforance é superior ao LinkedList");
			System.out.println("Pois ele pega o elemento pelo seu indice no array interno ( Ex: array[1] )");
			
			ArrayList<Exemplo1> arrayList = new ArrayList<Exemplo1>(21);
			arrayList.addAll(Arrays.asList(VET_EXEMPLO_1));
			arrayList.addAll(Arrays.asList(VET_EXEMPLO_2));
			arrayList.addAll(Arrays.asList(VET_EXEMPLO_3));
			
			System.out.println(arrayList);
			System.out.println();
		}
	},
	LINKED_LIST("Linked List"){
		@Override
		public void apresentar() {
			System.out.println("LinkedList:");
			System.out.println("Lista baseada em ponteiros. Essa lista tem os elementos da lista um apontando para o proximo até o último.");
			System.out.println("Por se basear em ponteiros ela adiciona e remove elementos mais performaticamente pois não tem de copiar arrays para faze-lo.");
			System.out.println("Por outro lado, a performance para pegar um determinado elemento elemento n ele tem uma performance bem inferior ao ArrayList.");
			System.out.println("Pois tem que percorrer o array de ponteiros até achar o elemento n desde o começo do array.");
			LinkedList<Exemplo1> linkedList = new LinkedList<Exemplo1>();
			linkedList.addAll(Arrays.asList(VET_EXEMPLO_1));
			linkedList.addAll(Arrays.asList(VET_EXEMPLO_2));
			linkedList.addAll(Arrays.asList(VET_EXEMPLO_3));
			
			System.out.println("Pegar o primeiro elemento da lista com o peekFirst()");
			System.out.println(linkedList.peekFirst());
			System.out.println();
			
			System.out.println("Pegar o ultimo elemento da lista peekLast()");
			System.out.println(linkedList.peekLast());
			System.out.println();
			
			System.out.println("Posso adicionar elementos no começo da lista com o addFirst()");
			linkedList.addFirst(new Exemplo1(2));
			System.out.println(linkedList);
			System.out.println();
			
			System.out.println("Posso pegar o primeiro elemento e retirar da lista com o poolFirst()");
			System.out.println(linkedList.pollFirst());
			System.out.println();
			
			System.out.println("A mesma coisa com o ultimo com o poolLast()");
			System.out.println(linkedList.pollLast());
			System.out.println();
		}
	},
	VECTOR("Vector"){
		@Override
		public void apresentar() {
			System.out.println("Vector:");
			System.out.println("O mesmo que o ArrayList porém é utilizado para aplicações que utilizem ambiente multi-thread.");
			System.out.println("Ele sincroniza automaticamente com as threads que o utilizem.");
			System.out.println();
		}
	},
	HASH_SET("Hash Set"){
		@Override
		public void apresentar() {
			conceitoSet();
			conceitoHashEquals();
			System.out.println("HashSet ordena os elementos de acordo com o hashCode()");
			HashSet<Exemplo1> hashSet = new HashSet<Exemplo1>();
			hashSet.addAll(Arrays.asList(VET_EXEMPLO_1));
			hashSet.addAll(Arrays.asList(VET_EXEMPLO_2));
			hashSet.addAll(Arrays.asList(VET_EXEMPLO_3));
			
			System.out.println(hashSet);
		}
	},
	LINKED_SET("Linked Set"){
		@Override
		public void apresentar() {
			conceitoSet();
			conceitoHashEquals();
			System.out.println("LinkedSet ordena os elementos de acordo com a ordem que foram adicionados");
			LinkedHashSet<Exemplo1> linkedSet = new LinkedHashSet<Exemplo1>();
			linkedSet.addAll(Arrays.asList(VET_EXEMPLO_1));
			linkedSet.addAll(Arrays.asList(VET_EXEMPLO_2));
			linkedSet.addAll(Arrays.asList(VET_EXEMPLO_3));
			
			System.out.println(linkedSet);
		}
	},
	TREE_SET("Tree Set"){
		@Override
		public void apresentar() {
			conceitoSet();
			conceitoHashEquals();
			cuidadoSorted();
			System.out.println("TreeSet ordena os elementos de acordo com o compareTo do objeto");
			TreeSet<Exemplo1> treeSet = new TreeSet<Exemplo1>();
			treeSet.addAll(Arrays.asList(VET_EXEMPLO_1));
			treeSet.addAll(Arrays.asList(VET_EXEMPLO_2));
			treeSet.addAll(Arrays.asList(VET_EXEMPLO_3));
			
			System.out.println(treeSet);
			System.out.println();
			
			System.out.println("Posso pegar o próximo elemento que seja maior que um elemento baseado no compareTo");
			System.out.println(treeSet.higher(new Exemplo1(2)));
			System.out.println();
			
			System.out.println("Posso pegar o próximo elemento que seja menor que um elemento baseado no compareTo");
			System.out.println(treeSet.lower(new Exemplo1(2)));
			System.out.println();
			
			System.out.println("Posso pegar os elementos filhos de um determinado nó");
			System.out.println(treeSet.tailSet(new Exemplo1(2),true));
			System.out.println();
			
			System.out.println("Posso pegar um range de elementos");
			System.out.println(treeSet.subSet(new Exemplo1(2),new Exemplo1(6)));
			System.out.println();
		}
	},
	HASH_MAP("Hash Map"){
		@Override
		public void apresentar() {
			conceitoMap();
			conceitoHashEquals();
			System.out.println("Hash Map: Ordena os elementos de acordo com o hashCode() do objeto utilizado como chave.");
			HashMap<Exemplo1, String> hashMap = new HashMap<Exemplo1, String>();
			
			for(Exemplo1 exemplo : Arrays.asList(VET_EXEMPLO_1)){
				hashMap.put(exemplo, exemplo.getClass().getSimpleName());
			}
			for(Exemplo1 exemplo : Arrays.asList(VET_EXEMPLO_2)){
				hashMap.put(exemplo, exemplo.getClass().getSimpleName());
			}
			for(Exemplo1 exemplo : Arrays.asList(VET_EXEMPLO_3)){
				hashMap.put(exemplo, exemplo.getClass().getSimpleName());
			}
			
			for (Entry<Exemplo1, String> entry : hashMap.entrySet()) {
				System.out.println(entry);
			}
		}
	},
	LINKED_HASH_MAP("Linked Hash Map"){
		@Override
		public void apresentar() {
			conceitoMap();
			conceitoHashEquals();
			System.out.println("Linked HashMap: Ordena os elementos de acordo como foram adicionados.");
			LinkedHashMap<Exemplo1, String> linkedMap = new LinkedHashMap<Exemplo1, String>();
			
			for(Exemplo1 exemplo : Arrays.asList(VET_EXEMPLO_1)){
				linkedMap.put(exemplo, exemplo.getClass().getSimpleName());
			}
			for(Exemplo1 exemplo : Arrays.asList(VET_EXEMPLO_2)){
				linkedMap.put(exemplo, exemplo.getClass().getSimpleName());
			}
			for(Exemplo1 exemplo : Arrays.asList(VET_EXEMPLO_3)){
				linkedMap.put(exemplo, exemplo.getClass().getSimpleName());
			}
			
			for (Entry<Exemplo1, String> entry : linkedMap.entrySet()) {
				System.out.println(entry);
			}
		}
	},
	TREE_MAP("Tree Map"){
		@Override
		public void apresentar() {
			conceitoMap();
			conceitoHashEquals();
			cuidadoSorted();
			System.out.println("Tree Map: Ordena os elementos de acordo com o compareTo() do objeto usado como chave.");
			TreeMap<Exemplo1, String> treeMap = new TreeMap<Exemplo1, String>();
			
			for(Exemplo1 exemplo : Arrays.asList(VET_EXEMPLO_1)){
				treeMap.put(exemplo, exemplo.getClass().getSimpleName());
			}
			for(Exemplo1 exemplo : Arrays.asList(VET_EXEMPLO_2)){
				treeMap.put(exemplo, exemplo.getClass().getSimpleName());
			}
			for(Exemplo1 exemplo : Arrays.asList(VET_EXEMPLO_3)){
				treeMap.put(exemplo, exemplo.getClass().getSimpleName());
			}
			
			for (Entry<Exemplo1, String> entry : treeMap.entrySet()) {
				System.out.println(entry);
			}
		}
	};
	
	private static final Exemplo1[] VET_EXEMPLO_1 = Exemplo1.getExemploArray();
	private static final Exemplo2[] VET_EXEMPLO_2 = Exemplo2.getExemploArray();
	private static final Exemplo3[] VET_EXEMPLO_3 = Exemplo3.getExemploArray();
	
	private String nome;
	
	public abstract void apresentar();
	
	private AulasCollectionEnum(String nome){
		this.nome = nome;
	}
	
	public String nome(){
		return this.nome;
	}
	
	public static Map<Integer,AulasCollectionEnum> map(){
		Map<Integer,AulasCollectionEnum> map = new HashMap<Integer,AulasCollectionEnum>();
		for(AulasCollectionEnum aula : AulasCollectionEnum.values()){
			map.put(aula.ordinal()+1,aula);
		}
		return map;
	}
	
	private static void conceitoSet(){
		System.out.println("Set: Adiciona elementos em uma lista garantindo que eles sejam únicos (retorno false do método equals)");
	}
	
	private static void conceitoHashEquals(){
		System.out.println("Equals se baseia no hashCode() para determinar se um elemento é igual ou não ao outro");
		System.out.println("Hash codes iguais = elementos iguais\n");
	}
	
	private static void conceitoMap() {
		System.out.println("Map: É uma lista em que cada elemento da lista possui uma chave que o referencia");
		System.out.println("O Map não permite chaves repetidas (de acordo com o método equals())");
		System.out.println("O Map também utiliza o método equals() para pegar os elementos de sua lista");
	}
	
	private static void cuidadoSorted(){
		System.out.println("CUIDADO: Em implementações de SortedSet ou SortedMap a comparação de elementos iguais passa a ser o retorno do compareTo() ser igual a 0!");
	}
}
