public class Data {
    private String diaSemana;

    public Data (String diaSemana) {
        this.diaSemana = diaSemana;
    }
    
    //BEGIN GETs
    
    public String getDiaSemana () {
        return this.diaSemana;
    }
    
    //END GETs
    
    //BEGIN SETs
    
    public void setDiaSemana (String novoDia) {
        this.diaSemana = novoDia;
    }
    
    //END SETs
}