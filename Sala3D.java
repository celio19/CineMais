import java.util.*;

public class Sala3D extends Salas {
    private ArrayList<Equipamentos> meusEquipamentos = new ArrayList<Equipamentos>();
    
    public Sala3D (String numeroSala, int capacidade, Equipamentos equipamentos) {
    	super (numeroSala, capacidade);
    }	
    
    // BEGIN Metodos
    
    public void addEquipamentos (Equipamentos novoEquipamento) {
    	meusEquipamentos.add(novoEquipamento);	
    }
    
    //END Metodos
}