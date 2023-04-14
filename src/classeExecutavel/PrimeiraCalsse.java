package classeExecutavel;

public class PrimeiraCalsse {
    public static void main(String[] args) {
/*
        int idade = 24;

        double nota1 = 90;
        double nota2 = 40;
        double nota3 = 10;
        double nota4 = 78;

        double mediaFinal = (nota1 + nota2 + nota3 + nota4) /4 ;

        char letraInicialMasculina = 'M';
        char letraInicialFeminina = 'F';

        if(letraInicialMasculina == 'F'){
            System.out.println("Feminino" );
        }else {
            System.out.println("Masculino" );
        }

        String cpf = "03522589009";
        String nome = "Teste Fabricio Albuquerque";
        String telefone = "+351 925133459";
        System.out.println("Seu CPF é = " + cpf + " seu nome é = " + nome + "seu telefone é = " + telefone + "e seua idade é = " + idade );
 */
/*
        //todo exercicios  de logicas de if e else
        double noteOne = 10;
        double noteTwo = 10;
        double notaThree = 60;
        double noteFor = 75;

        double mediaFinal = (noteOne + noteTwo + notaThree + noteFor) /4 ;

        if (mediaFinal >= 70){
            System.out.println("A media desse aluno é = " + mediaFinal + " Parabens esta passado!");
        }
        else if(mediaFinal >= 40 && mediaFinal <= 65){
            System.out.println("A media desse aluno é = " + mediaFinal + " Parabens conseguiu uma recuperação por pouco!");
        }
        else {
            System.out.println("A media desse aluno é = " + mediaFinal + " Parabens esta reprovado!");
        }

        //todo exercicios de ternarios
        String resultadMedia = mediaFinal >= 70 ? "Parabens esta passado!" : (mediaFinal >= 40 && mediaFinal <= 65) ?" Parabens conseguiu uma recuperação por pouco!" : "Parabens esta reprovado!";
        System.out.println(resultadMedia);
 */
/*
        // todo switch case

        int dia = 5;
        switch (dia){
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda-Feira");
                break;
            case 3:
                System.out.println("Terça-Feira");
                break;
            case 4:
                System.out.println("Quarta-Feira");
                break;
            case 5:
                System.out.println("Quinta-Feira");
                break;
            case 6:
                System.out.println("Sexta-Feira");
                break;
            case 7:
                System.out.println("Sabado");
                break;
            default:
                System.out.println("Outro dia qualquer");
                break;
        }
 */
/*
        //todo estrutura de repetiçao WHILE e DO WHILE

        //WHILE Primeiro Verifica e depois executa
        int numero = 0;

        while (numero <= 7){
            System.out.println("o numero atual é = " + numero);
            numero ++;
        }

        //DO WHILE Executa Primeiro e Verifica depois
        do{
           System.out.println("o numero atual é = " + numero);
            numero ++;
        }while(numero <= 7);

 */
/*
       //todo estrutura de repetição FOR

        for (int numero = 10; numero <=12; numero++){
            System.out.println("Numero atual é: " + numero);
       }

        //todo estrutura de repetição FOR com BREAK
        for (int numero = 0; numero <=9; numero ++){
            if(numero == 5){
                System.out.println("Achei o numero 7");
                break;
            }
        }

        //todo estrutura de repetição FOR com CONTINUE
        for (int numero = 0; numero <= 9; numero ++){
            if(numero == 5 || numero == 9){
                System.out.println("Achei o numero " + numero);
                continue;
            }
        }
 */
/*
        //TODO Pequeno programa de media
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a primeira nota do aluno: ");
        double noteOne = sc.nextDouble();

        System.out.println("Digite a segunda nota do aluno: ");
        double noteTwo = sc.nextDouble();

        System.out.println("Digite a terceira nota do aluno: ");
        double noteThree = sc.nextDouble();

        double media = (noteOne + noteTwo + noteThree) /3;

        if (media >= 70) {
            System.out.println("Aluno Passou Parabens! " + formaterCasasDecimais(media));
        }
        else if (media >= 40 && media <= 55){
            System.out.println("Aluno Esta em recuperação " + formaterCasasDecimais(media));
        }else {
            System.out.println("Aluno Esta Reprovado " + formaterCasasDecimais(media));
        }
        sc.close();
 */
    }
}
