import java.util.Scanner;
 
/*
* Calculadora de número, retorna se é par ou ímpar.
*/

public class ExercicioCalculo {
    
    public static void main(String[] args) {

        // declaração de variáveis
        int n1;
        int n2;
        int soma;
        int subtracao;
        int multiplicacao;
        int divisao;
        int operacao;
        int resto;
        String tipo;
        
        //inicia a classe que faz a solicitação de entrada de dados 
        Scanner sc = new Scanner(System.in);

        //comando que funcionará em loop e será executado enquanto o usuário não encerrar 
        do {
            System.out.println("Selecione uma operação: ");//mostra na tela o texto e quebra a linha
            System.out.println("1 - Soma | 2 - Subtração | 3 - Multiplicação | 4 - Divisão | 5 - Sair");//mostra na tela o texto
            System.out.println("");
            //faz a leitura da entrada dos dados (do tipo inteiro)
            operacao = sc.nextInt();
                
            switch(operacao){
            //vai executar somente a opção que foi selecionada e encerrar o bloco    
            case 1:
                System.out.print("Digite o primeiro número: "); //mostra na tela o texto
                n1 = sc.nextInt(); //espaço onde insere o número solicitado
                System.out.print("Digite o segundo número: ");//mostra na tela o texto
                n2 = sc.nextInt();//espaço onde insere o número solicitado

                soma = n1 + n2;
                resto = (soma %2); //realiza a divisão do número por 2 e se possui resto
                tipo = resto == 1 ? "ímpar" : "par"; //se divisão possui resto, resulta em ímpar
                System.out.println("Resultado da soma: " + soma + " e o número é " + tipo +"."); //mostra na tela o texto
            break; //pára de executar o bloco

            case 2:
                System.out.print("Digite o primeiro número: ");
                n1 = sc.nextInt();
                System.out.print("Digite o segundo número: ");
                n2 = sc.nextInt();

                subtracao = n1 - n2;
                resto = (subtracao %2);
                tipo = resto == 1 ? "ímpar" : "par";
                System.out.println("Resultado da subtração: " + subtracao + " e o número é " + tipo +".");
            break;

            case 3:
                System.out.print("Digite o primeiro número: ");
                n1 = sc.nextInt();
                System.out.print("Digite o segundo número: ");
                n2 = sc.nextInt();

                multiplicacao = n1 * n2;
                resto = (multiplicacao %2);
                tipo = resto == 1 ? "ímpar" : "par";
                System.out.println("Resultado da multiplicação: " + multiplicacao + " e o número é " + tipo +".");
            break;

            case 4:
                System.out.print("Digite o primeiro número: ");
                n1 = sc.nextInt();
                System.out.print("Digite o segundo número: ");
                n2 = sc.nextInt();

                divisao = n1 / n2;
                resto = (divisao %2);
                tipo = resto == 1 ? "ímpar" : "par";
                System.out.println("Resultado da divisão: " + divisao + " e o número é " + tipo +".");
            break;

            case 5:
                System.out.println("Fechando aplicativo.");
            break;   
            }  
        } while (operacao != 5); //enquanto a opção digitada pelo usuário for diferente de 5, app continua executando
        //encerra a função Scanner
        sc.close();
        
    }
}