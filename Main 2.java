import java.util.*;
class Main {
  public static void main(String[] args) {

	Scanner in = new Scanner(System.in);
	int nota = 0, maior = 0, menor = 0;

	for(int x = 0; x < 5; x++){
		
		System.out.println("Insira sua nota:");
		nota = in.nextInt();
		
		if(x == 0){
			
			maior = nota;
			menor = nota;
		}
		
		if(nota > maior){
			
			maior = nota;
		}
		
		if(nota < menor){
			
			menor = nota;
		}
	}
	
	System.out.print("A maior nota: "+ maior +". A menor nota: "+ menor);

  }
}