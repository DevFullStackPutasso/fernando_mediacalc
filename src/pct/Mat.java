/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pct;

import java.util.Scanner;

/**
 *
 * @author B1-08
 */
public class Mat {
    public static void main(String[] args) {
        //Declaração de variáveis
        int op;
        
        //Objeto de entrada
        Scanner entrada = new Scanner(System.in);
        
        
        do{
            //Apresentação
            System.out.println("\n\t\t\t -- Sistema Matemático --\n");

            //Menu
            System.out.println("[1]. Fatorial");
            System.out.println("[2]. Média");
            System.out.println("[3]. Sair");

            //Opção do usuário
            System.out.print("Opção: ");
            op = entrada.nextInt();


            switch(op){
                case 1:
                    //Declaração de variáveis
                    int n;
                    double fat = 1;
                    
                    //Fatorial                                        
                    System.out.println("\n\t\t\t Fatorial\n");
                                        
                    //Entrada
                    System.out.print("\n\t Informe um número: ");
                    n = entrada.nextInt();
                    
                    //Processamento
                    for(int i = n; i >= 1; i--){
                        fat *= i;
                        //fat = fat * i;
                    }
                    
                    //Saída
                    System.out.printf("\n\n %d! = %f\n\n", n, fat);                    
                    break;
                case 2:
                    //Declaração de váriaveis 
                    int[] x = new int [4];
                    double soma = 0, media;
                    
                    //Média
                    
                    System.out.println("\n\t\t\t Média\n");
                    
                    //Entrada
                    System.out.print("Informe x1: ");
                    x[0]= entrada.nextInt();
                    System.out.print("Informe x2: ");
                    x[1]= entrada.nextInt();
                     System.out.print("Informe x3");
                    x[2]= entrada.nextInt();
                     System.out.print("Informe x4");
                    x[3]= entrada.nextInt();
                    
                    
                    //Processamento
                    soma = x[0] +  x[1] + x[2] + x[3];
                    media =  soma/4;
                    
                    System.out.printf("\n A média de  %d e %d e %d e %d é  %.2f.\n\n\n ", x[0], x[1], x[3], media);
                    
                    
                    break;
                case 3:
                    //Sair
                    System.out.println("Forte abraço!");
                    break;
                default:
                    System.out.println("Opção " + op + " incorreta!");
            }
            
        }while(op != 3);
        
    }
    
}
