import java.util.*;

public abstract class Salas {
    protected String numeroSala;
    protected int capacidade;
    private Filme filmes;
    private Estoque estoque;

    public Salas (String numeroSala, int capacidade) {
        this.numeroSala = numeroSala;
        this.capacidade = capacidade;
    }

    //BEGIN GETs
    
    public String getNumeroSala () {
        return this.numeroSala;
    }
    
    public int getCapacidade () {
        return this.capacidade;
    }
    
    //END GETs
    
    //BEGIN SETs
    
    public void setNumeroSala (String novoNumeroSala) {
        this.numeroSala = novoNumeroSala;
    }
    
    public void setCapacidade (int novaCapacidade) {
        this.capacidade = novaCapacidade;
    }
    
    //END SETs
}

