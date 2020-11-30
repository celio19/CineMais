public abstract class Ingresso {
    protected Sessoes sessao;
    protected float valorIngresso;
    
    //Constutor
    public Ingresso (Sessoes sessao, float valorIngresso) {
        this.valorIngresso = valorIngresso;
    }
    
    //BEGIN Metodos
    
    public abstract void cancelarIngresso ();
    
    public abstract void calcularIngresso ();
    
    public abstract void alterarIngresso ();

    public abstract void imprimirTicket ();
    
    //END Metodos
}