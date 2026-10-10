package utils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Random;

public class GestionCartes {
	
	public static <T> T extraireV1 (List<T> liste){
		Random random = new Random();
		int indice = random.nextInt(liste.size());
		
		return liste.remove(indice);
	}
	
	public static <T> T extraireV2 (List<T> liste){
		Random random = new Random();
		int indice = random.nextInt(liste.size());
		ListIterator<T> iter = liste.listIterator();
		
		for(int i = 0;i < indice; i++) {
			iter.next();
		}
		T element = iter.previous();
		iter.remove();
		
		return element;
	}
	
	public static <T> List<T> melanger (List<T> liste){
		List<T> res = new ArrayList<>();
		
		while(!liste.isEmpty()) {
			res.add(extraireV1(liste));
		}
		return res;
	}
	
	public static <T> boolean verifierMelange (List<T> liste1, List<T> liste2){
		for(Iterator<T> iter = liste1.iterator(); iter.hasNext();) {
			T element = iter.next();
			if (Collections.frequency(liste2, element) != (Collections.frequency(liste1, element))){
				return false;
			}
		}
		return true;
	}

	public static <T> List<T> rassembler(List<T> liste){
		List<T> res = new ArrayList<>();
		List<T> elementConnu = new ArrayList<>();
		
		for(Iterator<T> iter = liste.iterator(); iter.hasNext();) {
			//System.out.println(elementConnu);
			T element = iter.next();
			if (!elementConnu.contains(element)) {
				elementConnu.add(element);
				int nbOccurence = Collections.frequency(liste, element);
				for (int i = 0; i<nbOccurence; i++) {
					res.add(element);
				}
			}
			
		}
		
		return res;
		
	}
	
	public static <T> boolean verifierRassemblement(List<T> liste) {
		
		for(ListIterator<T> iter1 = liste.listIterator(); iter1.hasNext();) {
			T element1 = iter1.next();
			T element2 = iter1.next();
			
			if(!element1.equals(element2)) {
				for(ListIterator<T> iter2 = liste.listIterator(iter1.previousIndex()); iter2.hasNext();) {
					T element = iter2.next();
					if(element.equals(element1)) {
						return false;
					}
				}
			}
			
			
		}
		return true;
	}
	
}








