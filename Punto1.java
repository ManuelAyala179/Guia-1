import java.util.Scanner;
/**
 * Programa que realiza varias operaciones matemáticas entre números
 * 
 * @author (Leonardo Ayala)  
 * @version (version 1.0)
 */
public class Punto1
{
   public static void main (String[] args)
   {
    Scanner sc = new Scanner(System.in); //lee desde el teclado
    int num1, num2, suma, sust, prod, cosi, resi, pot;
    System.out.println("digite el primer número");
    num1 = sc.nextInt();  // se guarda el primer número directamente con nextint()
    System.out.println("digite el segundo número");
    num2 = sc.nextInt();  // se guarda el primer número directamente con nextint()
    suma = num1+num2; //Almacena el resultado de la suma
    sust = num1-num2; //Almacena el resultado de la resta    
    prod = num1*num2; //Almacena el resultado del producto
    cosi = num1/num2; //Almacena el resultado del cociente
    resi = num1%num2; //Almacena el resultado del residuo
    pot  = (int) Math.pow(num1,num2); //Almacena el resultado de la potencia
    System.out.println("La suma de "+num1+"+"+num2+" es: "+suma);
    System.out.println("La resta de "+num1+"-"+num2+" es: "+sust);
    System.out.println("El producto de "+num1+"*"+num2+" es: "+prod);
    System.out.println("El cociente de "+num1+"/"+num2+" es: "+cosi);
    System.out.println("El residuo de "+num1+"/"+num2+" es: "+resi);
    System.out.println("El logaritmo de "+num1+" es: " + Math.log(num1));
    System.out.println("El potencia de "+num1+" elevado a la "+num2+" es: "+pot); 
   }
}  