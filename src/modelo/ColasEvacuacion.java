package modelo;
import java.util.ArrayList;
import java.util.List;

public class ColasEvacuacion {
    
    private List<Evacuacion> listaEvacuaciones;

    public ColasEvacuacion() {
        this.listaEvacuaciones = new ArrayList<Evacuacion>();
    }

    public void agregarEvacuacion(Evacuacion nuevaEvacuacion) {
        listaEvacuaciones.add(nuevaEvacuacion);
        for (int i = 0; i < listaEvacuaciones.size() - 1; i++) {
            for (int j = i + 1; j < listaEvacuaciones.size(); j++) {
                if (listaEvacuaciones.get(i).getNivelPrioridad() < listaEvacuaciones.get(j).getNivelPrioridad()) {
                    Evacuacion temp = listaEvacuaciones.get(i);
                    listaEvacuaciones.set(i, listaEvacuaciones.get(j));
                    listaEvacuaciones.set(j, temp);
                }
            }
        }
    }

    public Evacuacion obtenerSiguienteEvacuacion(){
        if (listaEvacuaciones.size() > 0){
            Evacuacion primera = listaEvacuaciones.get(0);
            listaEvacuaciones.remove(0);
            return primera;
        }
        return null;
    }

    public List<Evacuacion> getListaEvacuaciones() {
        return listaEvacuaciones;
    }
}