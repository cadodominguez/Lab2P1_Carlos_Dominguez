
package lab2p1_carlosdominguez;

import java.util.Scanner;
        
public class Lab2P1_CarlosDominguez {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("A cual ejercicio desea entrar (1,2,3)");
        int opcion = leer.nextInt();
        
        if (opcion == 1){ // inicio de op
            
            char respuesta1 = 's';
                    
            while (respuesta1 == 's'){
                System.out.println("Dibujando triangulos");
                
                System.out.println("Ingrese el primer numero: ");
                int num1 = leer.nextInt();
                System.out.println("Ingrese el segundo numero: ");
                int num2 = leer.nextInt();
                System.out.println("Ingrese el tercer numero: ");
                int num3 = leer.nextInt();
                    if (num1 > 0 && num2 > 0 && num3 > 0){
                        if (num1 < num2 + num3 && num2 < num1 + num3 && num3 < num1 + num2 ){
                            System.out.println("Si es triangulo");
                        }else{
                            System.out.println("No es un triangulo");
                        }
                    }else{
                        System.out.println("Porfavor ingrese valores positivos");   
                    }
                    System.out.println("Desea continuar (N/S) : ");
                    respuesta1 = leer.next().charAt(0);
            }// fin while 1
            //fin de opcion 1        
        }else if (opcion == 2){ //inicio de op 2
            
            char respuesta2 = 's';
            
            while (respuesta2 == 's'){
                System.out.println("Area de Figuras");
                
                System.out.println("Cual area desea calcular (1 = rectangulo, 2 = Triangulo o 3 = Circulo");
                int opcion2 = leer.nextInt();
                if (opcion2 == 1){
                    System.out.println("Ingrese la base del rectangulo :");
                    double baseR = leer.nextDouble();
                    System.out.println("Ingrese la altura del rectagulo :");
                    double alturaR = leer.nextDouble();
                    double areaR;
                    areaR = alturaR * baseR;
                    System.out.println("El area del Rectangulo es :" + areaR);
                }else if (opcion2 == 2 ){
                    System.out.println("Ingrese la base del Triangulo: ");
                    double baseT = leer.nextDouble();
                    System.out.println("Ingrese la altura del Triangulo: ");
                    double alturaT = leer.nextDouble();
                    double areaT;
                    areaT = 1/2*baseT*alturaT;
                    System.out.println("El area del Triangulo es :" + areaT);
                }else if (opcion2 == 3){
                    System.out.println("Ingrese el radio del circulo :");
                    double radioC = leer.nextDouble();
                    double areaC = Math.PI*radioC*radioC;
                    System.out.println("El area del circulo es :" + areaC);
                }// fin de opciones
                System.out.println("Desea continuar (n/s) : ");
                respuesta2 = leer.next().charAt(0);       
            }// fin while2
            
        }else if(opcion == 3){
            System.out.println("Evaluando Numeros");
            int division=0;
            System.out.println("Ingrese el numero que desea evaluar : ");
            //primo parte
            int numeroEvaluado = leer.nextInt();
            int contadordev;
            contadordev = 0;
            int contadordiv;
            contadordiv = 0;
            while (contadordev <= numeroEvaluado){
                contadordev = 1 + contadordev;
                division = numeroEvaluado % contadordev;
            }
            boolean primo;
            if (division == 2){
                primo = true;
            }else{
                primo = false;
            }
            //primo parte final
            //par o impar parte
            boolean tipoparoimpar;
            int division2;
            division2 = numeroEvaluado % 2;
            if (division2 == 0){
                tipoparoimpar = true;
            }else{
                tipoparoimpar = false;
            }
            if (primo == true && tipoparoimpar == true){
                System.out.println("El numero es par y primo");
            }else if (primo == false && tipoparoimpar == false){
                System.out.println("El numero es impar");
            }else if (primo == true && tipoparoimpar == false){
                System.out.println("El numero es primo y impar");
            }else if (primo == false && tipoparoimpar == true){
                System.out.println("El numero es par");
            }
        }else {
            System.out.println("Porfavor ingrese 1,2 o 3");
        }
    }
}
            
    
   