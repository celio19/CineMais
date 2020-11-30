public class Shopping {
    private String nomeShopping;
    private Cinema cinema;

    public Shopping(String nomeShopping, Cinema cinema) {
        this.nomeShopping = nomeShopping;
    }
    
    //BEGIN GETs
    
    public String getNome () {
        return this.nomeShopping;
    }
    
    //END GETs
    
    //BEGIN SETs
    
    public void setNome (String novoNomeShopping) {
        this.nomeShopping = novoNomeShopping;
    }
    
    //END SETs
}