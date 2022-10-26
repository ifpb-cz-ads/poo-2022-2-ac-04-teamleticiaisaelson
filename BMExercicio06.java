import java.util.Scanner;
public class BMExercicio06 {
    public static void main(String[] args){
    Scanner entrada = new Scanner(System.in);

    int n = 1;
    
    while(n !=0){



        System.out.println("Informe UM número: ");
        n = entrada.nextInt();
       
        switch (n){
       
            case 1:
                System.out.println("Segunda-Feira");
                break;
            case 2:
                System.out.println("Terça-Feira");
                break;
            case 3:
                System.out.println("Quarta-Feira");
                break;
            case 4:
                System.out.println("Quinta-Feira");
                break;
            case 5:
                System.out.println("Sexta-Feira");
                break;
            case 6:
                System.out.println("Sábado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
       
            default:
                System.out.println("Inválido");
       
            case 0:
                System.exit(n);
        }









    }
}
}





    


   


    