package ex030317;

import java.util.ArrayList;

import tools.easyIO;

public class Main {
	static easyIO io = new easyIO();
	public static void main(String[] args) {
		
		//new ex21();
		
		ArrayList<Aluno> alunos = new ArrayList<>();
		alunos.add(new Aluno("Claudio", 15, "963852741"));
		alunos.add(new Aluno("Filipa", 18, "935796236"));
		alunos.add(new Aluno("Antonio", 8, "915536354"));
		alunos.add(new Aluno("Sara", 10, "969638524"));
		alunos.add(new Aluno("Rodolfo", 12, "n/d"));
	
		sort_alunos(alunos);
		
	}
	
	public static ArrayList<Aluno> sort_alunos(ArrayList<Aluno> alunos) {
		ArrayList<Aluno> res = alunos;
		
		for (int i=0; i<5; i++) {
			for (int j=i+1; j<5; j++) {
				if (res.get(j).getNota()<res.get(i).getNota()) {
					Aluno aux = res.get(i);
					res.set(i, res.get(j));
					res.set(j, aux);
				}
			}
		}
		
		return res;
	}

}
