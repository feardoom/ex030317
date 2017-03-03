package ex030317;

import java.util.ArrayList;
import java.util.Scanner;

public class ex21 {
	ArrayList<Object> ar = new ArrayList<>();
	
	public ex21() {
		ar.add('b');
		ar.add(3);
		ar.add("Carruagens");
		ar.add(8.56);
		ar.add("caixas de armazenamento");
		show();
		Object val = new Scanner(System.in).nextLine();
		addValue(val);
		show();
	}
		
	public void show() {
		for (Object o:ar) {
			System.out.println(o.getClass().getSimpleName() + " " + o);
		}	
	}
	
	public void addValue(Object obj) {
		ar.add(obj);
	}
}
