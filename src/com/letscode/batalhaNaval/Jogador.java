package com.letscode.batalhaNaval;

import com.letscode.Tabuleiro;

public class Jogador {
    private String nome;
    private Tabuleiro tabuleiro;
    private int qtdeMaximaDeNavios;
    private int naviosRestantes;
    private boolean isBot;

    public Jogador(int[][] matriz, int qtdeMaximaDeNavios, String nome, boolean isBot) {
        this.nome = nome;
        this.tabuleiro = new Tabuleiro(matriz);
        this.qtdeMaximaDeNavios = qtdeMaximaDeNavios;
        this.naviosRestantes = qtdeMaximaDeNavios;
        this.isBot = isBot;
    }

    public Tabuleiro getTabuleiro() {
        return tabuleiro;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setTabuleiro(Tabuleiro tabuleiro) {
        this.tabuleiro = tabuleiro;
    }

    public int getQtdeMaximaDeNavios() { return qtdeMaximaDeNavios; }

    public void setQtdeMaximaDeNavios(int qtdeMaximaDeNavios) {
        this.qtdeMaximaDeNavios = qtdeMaximaDeNavios;
    }

    public int getNaviosRestantes() { return naviosRestantes; }

    public void setNaviosRestantes(int naviosRestantes) { this.naviosRestantes = naviosRestantes; }

    public boolean isBot() {
        return isBot;
    }
}