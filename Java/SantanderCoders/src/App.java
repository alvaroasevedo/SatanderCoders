import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.TextStyle;
import java.util.Locale;

public class App {
    public static void main(String[] args) throws Exception {
        /* 

        //Introdução

        String nome = "Alvaro";
        System.out.println("Hello, World!");
        System.out.println("Eu sou o " + nome + ". :)");



        // Váriaveis


        int a;
        int b = 2;
        a=3;
        
        int soma = a + b;
        int subtracao = a -b;
        int multiplicacao = a * b;
        float divisao = (float) a / b;

        System.out.println(soma);
        System.out.println(subtracao);
        System.out.println(multiplicacao);
        System.out.println(divisao);


        //Booleans
        //Algoritimo para ir a praia
        //Condições: fazer sol e ser fim de semana

        boolean fimDeSemana = false;
        boolean fazSol = false;
        boolean vamosAPraia = fimDeSemana && fazSol ;
        
        // Tabela verdade
        // Operador && (AND)
        // true && true = true
        // false && false = false
        // true && false  ou false && true = false

        // Operador || (OR (PIPE PIPE))
        // true || true = true
        // true || false ou false || true = true
        // false || false = false


        System.out.println(vamosAPraia);
        String mensagem = fimDeSemana ? "É fim de semana" : "Não é fim de semana";
        System.out.println(mensagem);



        // Estuturas condicionais

       

        // se nota maior ou igual a 70, aprovado se não reprovado
        // if-else

        int nota = 65;
        String graduacao;

        if(nota >= 70){
            System.out.print("Aprovado");
        }else{
            System.out.println("Reprovado");
        }

        // A >= 80, B 70, C 60, D 0
        
        if (nota >= 80){
            System.out.println("Graduação A");
        }else if (nota < 80 && nota >= 70){
            System.out.println("Graduação B");
        }else if (nota < 70 && nota >= 60){
            System.out.println("Graduação C");
        }else if (nota < 60 && nota >= 0 ){
            System.out.println("Graduação D");
        }else {
            System.out.println("Nota inválida");
        }
        

        if (nota >= 80){
            System.out.println(graduacao = "A");
        }else if (nota < 80 && nota >= 70){
            System.out.println(graduacao = "B");
        }else if (nota < 70 && nota >= 60){
            System.out.println(graduacao = "C");
        }else if (nota < 60 && nota >= 0 ){
            System.out.println(graduacao = "D");
        }else {
            System.out.println(graduacao = " ");
        }

        switch (graduacao) {
            case "A":
            case "B":
            System.out.println("Aluno aprovado");
            break;

            case "C":
            System.out.println("Aluno em recuperação");
            break;
            case "D":
            System.out.println("Aluno reprovado");
            break;
            default:
            System.out.println("Graduação inválida");
        }

        


        // Manipulação de Strings e Datas

        //Olá, {nome}, hoje é {dia-da-semana}, BOM DIA.

        String nome = "Alvaro";


        // ISO 8601
        LocalDateTime agora = LocalDateTime.now();
        LocalDate hoje = LocalDate.now();
        Locale brasil = new Locale("pt", "BR");

        System.out.println(hoje.getDayOfWeek().getDisplayName(TextStyle.FULL, brasil));
        String diaSemana = hoje.getDayOfWeek().getDisplayName(TextStyle.FULL, brasil);
        String saudacao;

        if (agora.getHour() >= 0 && agora.getHour() < 12 ) {
            saudacao = "Bom dia";

        } else if (agora.getHour() >= 12 && agora.getHour() < 18) {
            saudacao = "Boa tarde";
        } else if (agora.getHour() >= 18 && agora.getHour() < 24) {
            saudacao = "Boa noite";
        }else{
            saudacao = "Olá";
        }

        System.out.printf("Olá, %s. Hoje é %s, %s.%n", nome, diaSemana, saudacao.toLowerCase());


        

        //Laços numéricos
        // Exibir os numéros de 1 a 10 um abaixo do outro
        // Para uma variável que inicia em 1 e vai até até 10 mudando um por um faça: (Imprimir em tela)
        
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
        

        // Vetore e Array
        // Tudo dentro do Array precisa ser do mesmo tipo obrigatóriamente,  diferentes tipos não interagem dentro de uma mesma Array

        
        int[] numeros = new int[5];
        // [], i0 [], i1 [], i2 [], i3 [] i4
        // Indice sempre começa no 0

        numeros[0] = 1;
        numeros[1] = 2;
        numeros[2] = 3;
        numeros[3] = 4;
        numeros[4] = 5;
        
        for(int i=0; i < numeros.length; i++){
            System.out.println(numeros[i]);
        }


        String[] letras = new String[5];
        // [], i0 [], i1 [], i2 [], i3 [] i4
        // Indice sempre começa no 0

        letras[0] = "1A";
        letras[1] = "2B";
        letras[2] = "3C";
        letras[3] = "4D";
        letras[4] = "5E";
        
        for(int i=0; i < letras.length; i++){
            System.out.println(letras[i]);
        }

        


        String [] letras = { "A", "B", "C", "D", "E"};
        for(int i=0; i < letras.length; i++){
            System.out.println(letras[i]);
        }

        */



        //Funções

        int resultado = soma(2, 3);
        System.out.println("Resultado da soma: "+resultado);

    }
    public static int soma(int a, int b) {
        return a + b;
        
    }
    

}
