package Taller;
import  java.util.Scanner;
class sueldo {
	private Scanner sc;
	String nombre;
	double sueldo;
	
	
	public sueldo() {
		sc=new Scanner(System.in);
		System.out.print("registre el nombre del empleado: ");
		nombre=sc.nextLine();
		System.out.print("Ingrese su sueldo: ");
		sueldo=sc.nextDouble();
	}
	public void Impuestos() {
		if(sueldo>1500000) {
			System.out.println("se aplicara impuestos.");
		}else {
			System.out.println("No se le aplicara impuestos.");
		}
	}
	
	public void datos() {
		for(int i=0;i<5;i++) {
			System.out.println();
		}
		System.out.println("los datos del empleado son: ");
		System.out.println("el nombre del empleado es: "+ nombre);
		System.out.println("su sueldo es de: " +sueldo);
		System.out.println();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sueldo empleado1;
		empleado1=new sueldo();
		empleado1.datos();
		empleado1.Impuestos();
		
	}

}
