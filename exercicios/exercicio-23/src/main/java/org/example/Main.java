package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i, N;
        String jogador1, jogador2;

        N = sc.nextInt();

        for(i = 0; i < N; i++){
            jogador1 = sc.next();
            jogador2 = sc.next();

            if(jogador1.equalsIgnoreCase("ataque") && jogador2.equalsIgnoreCase("ataque")) System.out.println("Aniquilacao mutua");
            if(jogador1.equalsIgnoreCase("papel") && jogador2.equalsIgnoreCase("papel")) System.out.println("Ambos venceram");
            if(jogador1.equalsIgnoreCase("pedra") && jogador2.equalsIgnoreCase("pedra")) System.out.println("Sem ganhador");
            if(jogador1.equalsIgnoreCase("ataque") && jogador2.equalsIgnoreCase("pedra")) System.out.println("Jogador 1 venceu");
            if(jogador1.equalsIgnoreCase("pedra") && jogador2.equalsIgnoreCase("ataque")) System.out.println("Jogador 2 venceu");
            if(jogador1.equalsIgnoreCase("pedra") && jogador2.equalsIgnoreCase("papel")) System.out.println("Jogador 1 venceu");
            if(jogador1.equalsIgnoreCase("papel") && jogador2.equalsIgnoreCase("pedra")) System.out.println("Jogador 2 venceu");
            if(jogador1.equalsIgnoreCase("ataque") && jogador2.equalsIgnoreCase("papel")) System.out.println("Jogador 1 venceu");
            if(jogador1.equalsIgnoreCase("papel") && jogador2.equalsIgnoreCase("ataque")) System.out.println("Jogador 2 venceu");
        }

        sc.close();
    }
}