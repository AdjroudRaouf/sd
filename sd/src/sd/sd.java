package sd;

import java.util.Scanner;

public class sd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String elem;
		int cn = 0;
		int cp = 0;
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in); 
		int tab[]= new int [10];
		for(int i=0;i<tab.length;i++){ 
			System.out.print("entrez l'élément numero:"+(i+1)+"\n");
			elem = input.nextLine(); 
			tab[i]= Integer.valueOf(elem);
		}
		for(int i = 0;i<tab.length;i++){
			if(tab[i]<0){cn++;}
			else{cp++;}
			System.out.print(tab[i]+"\n");
		}
		int pn = cn*100/10;
		int pp= cp*100/10;
		System.out.println("le pourcentage des nombres positif est : "+pp+"%");
		System.out.println("le pourcentage des nombres negatif est :"+pn+"%");
	}

}
