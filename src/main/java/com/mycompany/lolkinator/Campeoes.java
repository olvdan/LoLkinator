/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lolkinator;

/**
 *
 * @author sp303lab
 */
public class Campeoes {
    public String nome;
    public String genero;
    public String posicao;
    public String especie;
    public String recurso;
    public String tipo_de_alcance;
    public String regiao;
    public String ano_de_lancamento;
    
    public Campeoes(String nome, String genero, String posicao, String especie, String recurso, String tipo_de_alcance, String regiao, String ano_de_lancamento) {
        this.nome = nome;
        this.genero = genero;
        this.posicao = posicao;
        this.especie = especie;
        this.recurso = recurso;
        this.tipo_de_alcance = tipo_de_alcance;
        this.regiao = regiao;
        this.ano_de_lancamento = ano_de_lancamento;
    }

    @Override
    public String toString() {
        return "Campeoes{" + "nome=" + nome + ", genero=" + genero + ", posicao=" + posicao + ", especie=" + especie + ", recurso=" + recurso + ", tipo_de_alcance=" + tipo_de_alcance + ", regiao=" + regiao + ", ano_de_lancamento=" + ano_de_lancamento + '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getPosicao() {
        return posicao;
    }

    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getRecurso() {
        return recurso;
    }

    public void setRecurso(String recurso) {
        this.recurso = recurso;
    }

    public String getTipo_de_alcance() {
        return tipo_de_alcance;
    }

    public void setTipo_de_alcance(String tipo_de_alcance) {
        this.tipo_de_alcance = tipo_de_alcance;
    }

    public String getRegiao() {
        return regiao;
    }

    public void setRegiao(String regiao) {
        this.regiao = regiao;
    }

    public String getAno_de_lancamento() {
        return ano_de_lancamento;
    }

    public void setAno_de_lancamento(String ano_de_lancamento) {
        this.ano_de_lancamento = ano_de_lancamento;
    }
    
    
    
}
