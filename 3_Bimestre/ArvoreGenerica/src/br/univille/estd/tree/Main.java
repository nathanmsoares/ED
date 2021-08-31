package br.univille.estd.tree;

public class Main {

  public static void main(String[] args){

    Tree<Diretorio> tree = new Tree<>();
    Diretorio c = new Diretorio("C");
    Position<Diretorio> root = tree.addRoot(c);

    Diretorio windows = new Diretorio("Windows");
    Diretorio fotos = new Diretorio("Fotos");
    Diretorio videos = new Diretorio("Videos");
    Diretorio programFiles = new Diretorio("Program Files");
    Diretorio esd = new Diretorio("ESD");

    Arquivo foto_praia = new Arquivo("foto_praia.png", 5430, fotos);
    Arquivo foto_campo = new Arquivo("foto_campo.png", 3450, fotos);
    Arquivo filme = new Arquivo("filme.M2TS ", 4000000, videos);
    Arquivo executavel = new Arquivo("executavel.exe", 9999999, windows);

    Position<Diretorio> filhoWindows = tree.addChild(tree.root(), windows);
    Position<Diretorio> filhoProgramFiles = tree.addChild(tree.root(), programFiles);
    Position<Diretorio> filhoFotos = tree.addChild(filhoProgramFiles, fotos);
    Position<Diretorio> filhoVideos = tree.addChild(filhoProgramFiles, videos);
    Position<Diretorio> filhoESD = tree.addChild(tree.root(), esd);

    System.out.println("Diretório C: " + TreeUtils.espaco(tree, root) +"KBs");
    System.out.println("Diretório Windows: " + TreeUtils.espaco(tree, filhoWindows) +"KBs");
    System.out.println("Diretório Program Files: " + TreeUtils.espaco(tree, filhoProgramFiles) +"KBs");
    System.out.println("Diretório Videos: " + TreeUtils.espaco(tree, filhoVideos) +"KBs");
    System.out.println("Diretório Fotos: " + TreeUtils.espaco(tree, filhoFotos) +"KBs");
    System.out.println("Diretório ESD: " + TreeUtils.espaco(tree, filhoESD) +"KBs");
    
    }

}