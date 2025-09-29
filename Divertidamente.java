import java.util.Scanner;

public class Divertidamente {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int alegria = 0;
        int tristeza = 0;

        // 1) Amizades
        System.out.print("Quantas amizades Riley fez na nova cidade? ");
        int amizades = sc.nextInt();
        if (amizades > 0) {
            alegria += amizades * 10; // 10 pontos por amizade
        } else {
            tristeza += 30; // se nenhuma amizade, tristeza recebe 30 pontos
        }

        // 2) Provas da universidade (A1, A2, A3)
        System.out.println("Digite as notas das 3 provas (A1, A2, A3) - cada nota de 0 a 10:");
        System.out.print("A1: ");
        double a1 = sc.nextDouble();
        System.out.print("A2: ");
        double a2 = sc.nextDouble();
        System.out.print("A3: ");
        double a3 = sc.nextDouble();

        double media = (a1 + a2 + a3) / 3.0;
        if (media >= 7.0) {
            alegria += 50; // aprovada => alegria +50
        } else {
            tristeza += 50; // não alcançou => tristeza +50
        }

        // 3) Algoritmos (10 exercícios)
        System.out.print("Quantos dos 10 algoritmos Riley conseguiu resolver? ");
        int resolvidos = sc.nextInt();
        if (resolvidos < 0) resolvidos = 0;
        if (resolvidos > 10) resolvidos = 10;

        alegria += resolvidos * 10;         // +10 por exercício feito
        tristeza += (10 - resolvidos) * 10; // +10 para tristeza por cada não realizado

        // Exibir pontuações
        System.out.println("\n--- Resultado ---");
        System.out.println("Pontos de Alegria: " + alegria);
        System.out.println("Pontos de Tristeza: " + tristeza);
        System.out.printf("Média das provas: %.2f\n", media);

        // Comparar e mostrar mensagem final
        if (alegria > tristeza) {
            System.out.println("\nA mudança para a nova cidade foi uma experiência incrível para a Riley.");
        } else if (tristeza > alegria) {
            System.out.println("\nA mudança para a nova cidade foi uma experiência desagradável para a Riley.");
        } else {
            System.out.println("\nEmpate: as emoções de Riley estão equilibradas entre Alegria e Tristeza.");
        }

        sc.close();
    }
}