public abstract class Ingresso {
    protected Sessoes sessao;
    protected float valorIngresso;

    public Ingresso (Sessoes sessao, float valorIngresso) {
        this.valorIngresso = valorIngresso;
    }
    
    public abstract void cancelarIngresso ();
    
    public abstract void calcularIngresso ();
    
    public abstract void alterarIngresso ();

    public abstract void imprimirTicket ();

}