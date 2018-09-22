package Taller;
import java.util.*;
class operaciones {
	private Scanner teclado;
	int dato1,dato2;
	
	
	public operaciones() {
		teclado=new Scanner(System.in);
		System.out.println("Ingrese el dato 1:");
		dato1=teclado.nextInt();
		System.out.println("Ingrese el dato 2:");
		dato2=teclado.nextInt();
	}
	
	public void suma() {
		int suma;
		suma=dato1+dato2;
		System.out.println(dato1+" + "+dato2+" = "+suma);
	}

	public void resta() {
		int resta;
		resta=dato1-dato2;
		System.out.println(dato1+" - "+dato2+" = "+resta);
	}

	public void multiplicar() {
		int m;
		m=dato1*dato2;
		System.out.println(dato1+" x "+dato2+" = "+m);
	}

	public void dividir() {
		int dividir;
		dividir=dato1/dato2;
		if(dato1==0 | dato2==0) {
			System.out.println("error no ingrese 0 (cero).");
		}else {
			System.out.println(dato1+" / "+dato2+" = "+dividir);
		}
	}
		
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		operaciones oper=new operaciones();
		oper.suma();
		oper.resta();
		oper.multiplicar();
		oper.dividir();
	}

}
