public abstract class Salas {
    protected String numeroSala;
    protected int capacidade;

    public Salas (String numeroSala, int capacidade) {
        this.numeroSala = numeroSala;
        this.capacidade = capacidade;
    }

    // GETs
    
    public String getNumeroSala () {
        return this.numeroSala;
    }
    
    public int getCapacidade () {
        return this.capacidade;
    }
    
    //SETs
    
    public void setNumeroSala (String novoNumeroSala) {
        this.numeroSala = novoNumeroSala;
    }
    
    public void setCapacidade (int novaCapacidade) {
        this.capacidade = novaCapacidade;
    }
}

