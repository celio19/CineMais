public class Equipamentos {
    private String tipoEquipamento;
    private String descricaoEquipamento;

    public Equipamentos (String tipoEquipamento, String descricaoEquipamento) {
        this.tipoEquipamento = tipoEquipamento;
        this.descricaoEquipamento = descricaoEquipamento;
    }

    // GETs
    
    public String getTipoEquipamento () {
        return this.tipoEquipamento;
    }
    
    public String getDescricaoEquipamento () {
        return this.descricaoEquipamento;
    }
    
    //SETs
    
    public void setTipoEquipamento (String novoTipoEquipamento) {
        this.tipoEquipamento = novoTipoEquipamento;
    }
    
    public void setDescricaoEquipamento (String novaDescricaoEquipamento) {
        this.descricaoEquipamento = novaDescricaoEquipamento;
    }
}