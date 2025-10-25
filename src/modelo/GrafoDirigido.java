package modelo;
import java.util.List;
import java.util.ArrayList;

public class GrafoDirigido {

    private List<Nodo> listaNodos;
    private List<Ruta> listaRutas;

    public GrafoDirigido(){
        this.listaNodos = new ArrayList<Nodo>();
        this.listaRutas = new ArrayList<Ruta>();
    }

    public void agregarNodo(Nodo nuevoNodo){
        listaNodos.add(nuevoNodo);
    }

    public void agregarRuta(Nodo origen, Nodo destino, double distancia){
        Ruta nuevaRuta = new Ruta(origen, destino, distancia);
        listaRutas.add(nuevaRuta);
    }
    
    public List<Nodo> getListaNodos() {
        return listaNodos;
    }

    public List<Ruta> getListaRutas() {
        return listaRutas;
    }
}
