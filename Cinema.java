import java.util.*;

public class Cinema {
    private String nomeCinema;

    private Data diaSemana;
    private ArrayList<Salas> minhasSalas = new ArrayList<Salas>();
    private ArrayList<Filme> meusFilmes = new ArrayList<Filme>();
    private ArrayList<Sessoes> minhasSessoes = new ArrayList<Sessoes>();
    
    public Cinema (String nomeCinema, Data diaSemana) {
        this.nomeCinema = nomeCinema;
    }
    
    //BEGIN Métodos
   
    public void addSalas (Salas novaSala) {
        minhasSalas.add(novaSala);
    }
    
    public void addFilmes (Filme novoFilme) {
        meusFilmes.add(novoFilme);
    }
    
    public void addSessoes (Sessoes novaSessao) {
        minhasSessoes.add(novaSessao);
    }
    
    public void addData () {
        String data;
        data = diaSemana.getDiaSemana ();
    }
    
    //END Métodos  
    
    //BEGIN GETs
    
    public String getNome () {
        return this.nomeCinema;
    }
    
    //END GETs
    
    //BEGIN SETs
    
    public void setNome (String novoNome) {
        this.nomeCinema = novoNome;
    }
    
    //END SETs
}

