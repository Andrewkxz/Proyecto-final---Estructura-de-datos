package modelo;
import java.util.Map;
import java.util.HashMap;

public class InventarioRecursos {
    
    private Map<String, Recurso> listaRecursos;

    public InventarioRecursos() {
        this.listaRecursos = new HashMap<String, Recurso>();
    }

    public void agregarRecurso(Recurso nuevoRecurso) {
        listaRecursos.put(nuevoRecurso.getTipo(), nuevoRecurso);
    }

    public Map<String, Recurso> getListaRecursos() {
        return listaRecursos;
    }
}
