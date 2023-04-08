//Faça um Programa que peça um número e então mostre a mensagem O número informado foi [número].

import java.util.Scanner;

class exercicio2 {
  public static void main(String[] args) {

    //variaveis
double numero;

    //passo 1: informar o numero que vai ser repetido
   System.out.println("escolha um numéro");
    
   Scanner teclado = new Scanner(System.in);
  numero = teclado.nextDouble();
  teclado.close();

    //passo 2 mostrar a mensagem pro usuario
    System.out.println("o numero informado foi");
    System.out.println(numero);

  
  }
}