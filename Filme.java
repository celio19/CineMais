public class Filme {
    private String titulo;
    private String diretor;
    private String atorPrincipal;
    private String categoria;
    private int duracaoFilme;
    private int classificacaoEtaria;
 
    // GETs
    
    public String getTitulo () {
        return this.titulo;
    }
    
    public String getDiretor () {
        return this.diretor;
    }
    
    public String getAtorPrincipal () {
        return this.atorPrincipal;
    }
    
    public String getCategoria () {
        return this.categoria;
    }
    
    public int getDuracaoFilme () {
        return this.duracaoFilme;
    }
    
    public int getClassificacaoEtaria () {
        return this.classificacaoEtaria;
    }
    
    
    //SETs
    
    public void setTitulo (String novoTitulo) {
        this.titulo = novoTitulo;
    }
    
    public void setDiretor (String novoDiretor) {
        this.diretor = novoDiretor;
    }
    
    public void setAtorPrincipal (String novoAtorPrincipal) {
        this.atorPrincipal = novoAtorPrincipal;
    }
    
    public void setCategoria (String novaCategoria) {
        this.categoria = novaCategoria;
    }
    
    public void setDuracaoFilme (int novaDuracaoFilme) {
        this.duracaoFilme = novaDuracaoFilme;
    }
    
    public void setClassificacaoEtaria (int novaClassificacaoEtaria) {
        this.classificacaoEtaria = novaClassificacaoEtaria;
    }
}