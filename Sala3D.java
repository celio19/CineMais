public class Sala3D extends Salas {
    private ArayList<Equipamentos> meusEquipamentos = new ArayList<Equipamentos>();;
    
    public Sala3D (String numeroSala, int capacidade, Equipamentos equipamentos) {
    	super (numeroSala, capacidade);
    }	
    
    // BEGIN Adicionar
    public void addEquipamentos (Equipamentos novoEquipamento) {
    	meusEquipamentos.forEach (int i: meusEquipamentos) {
    		if (meusEquipamentos [i] == null) {
    			meusEquipamentos = novoEquipamento;
    			break;
    		}
    	}	
    }
    //END Adicionar
}