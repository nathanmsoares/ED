package br.univille.estd.tree;

import java.util.ArrayList;

public class Diretorio {

  private String nome;
  private int tamanho;
  private ArrayList<Arquivo> arquivos;

  public Diretorio(String nome){
    this.nome = nome;
    this.tamanho = 1;
    this.arquivos = new ArrayList<Arquivo>();
  }

  public void addArquivo(Arquivo arquivo){
    this.arquivos.add(arquivo);
    this.tamanho += arquivo.getTamanho();
  }

  public void removeArquivo(Arquivo arquivo){
    this.arquivos.remove(arquivo);
    this.tamanho -= arquivo.getTamanho();
  }

  public int getTamanho() {
    return tamanho;
  }

  public void setTamanho(int tamanho) {
    this.tamanho = tamanho;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public ArrayList<Arquivo> getArquivos() {
    return arquivos;
  }

  public void setArquivos(ArrayList<Arquivo> arquivos) {
    this.arquivos = arquivos;
  }
}