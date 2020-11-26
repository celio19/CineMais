import java.util.*;

public class Cinema {
    private String nomeCinema;

    private Data data;
    private ArrayList<Salas> minhasSalas = new ArrayList<Salas>();
    private ArrayList<Filme> meusFilmes = new ArrayList<Filme>();
    private ArrayList<Sessoes> minhasSessoes = new ArrayList<Sessoes>();

    // BEGIN Métodos
    // BEGIN Adicionar
    public void addSalas (Salas novaSala) {
        minhasSalas.add(novaSala);
    }
    
    public void addFilmes (Filme novoFilme) {
        meusFilmes.add(novoFilme);
    }
    
    public void addSessoes (Sessoes novaSessao) {
        minhasSessoes.add(novaSessao);
    }
    //END Adicionar
    // END Métodos  
    
    //GETs
    
    public String getNome () {
        return this.nomeCinema;
    }
    
    //SETs
    
    public void setNome (String novoNome) {
        this.nomeCinema = novoNome;
    }
}

