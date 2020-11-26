import java.until.*;

public class Cinema {
    private String nomeCinema;

    private Data data;
    private ArayList<Salas> minhasSalas = new ArayList<Salas>();
    private ArayList<Filme> meusFilmes = new ArayList<Filme>();
    private ArayList<Sessoes> minhasSessoes = new ArayList<Sessoes>();

    // Construtor da classe Cinema
    public Cinema (String nomeCinema) {
        this.nomeCinema = nomeCinema;
    }
    
    // BEGIN Adicionar
    public void addSalas (Salas novaSala) {
        minhasSalas.forEach (int i: minhasSalas) {
            if (minhasSalas[i] == null) {
                minhasSalas = novaSala;
                break;
            }  
        }   
    }
    
    public void addFilmes (Filme novoFilme) {
        meusFilmes.forEach (int i: meusFilmes) {
            if (meusFilmes[i] == null) {
                meusFilmes = novoFilme;
                break;
            }
        }
    }
    
    public void addSessoes (Sessoes novaSessao) {
        minhasSessoes.forEach (int i: minhasSessoes) {
            if (minhasSessoes[i] == null) {
                minhasSessoes = novaSessao;
                break;
            }
        }
    }
    
    //GETs
    
    public String getNome () {
        return this.nomeCinema;
    }
    
    //SETs
    
    public void setNome (String novoNome) {
        this.nomeCinema = novoNome;
    }
}

