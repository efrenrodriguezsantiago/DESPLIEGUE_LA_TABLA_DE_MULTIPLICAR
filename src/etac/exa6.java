package etac;
import java.util.Scanner; 
public class exa6 {
 //ngresar 10 n�meros enteros y mostrar los n�meros pares.
	public static void main(String args[]) { 
		Scanner dato=new Scanner(System.in);
		 int par[]=new int[10]; 
		int valor[]=new int[10];
		 int contador=0; 
		int i;
		 System.out.println("Ingrese los 10 n�meros a  evaluar"); 
		for( i=0;i<10;i++){
		 par[i]=dato.nextInt(); 
		if(par[i]%2==0) {
		 valor[contador]=par[i]; 
		contador++;
		 } 
		} 
		System.out.println("los numeros pares que ingresaste son : " );
		 for( i=0;i<contador;i++) { 
		     System.out.println(valor[i]); 
		} 
		} 
}
