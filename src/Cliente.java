import java.util.List;

public class Cliente {

    private String cedula;
    private String nombre;
    private boolean vigente;
    private List<Arriendo> arriendos;

    public Cliente(String cedula, String nombre, boolean vigente, List<Arriendo> arriendos) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.vigente = vigente;
        this.arriendos = arriendos;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public boolean isVigente() {
        return vigente;
    }

    public void setVigente(boolean vigente) {
        this.vigente = vigente;
    }

    public List<Arriendo> getArriendos() {
        return arriendos;
    }

    public void setArriendos(List<Arriendo> arriendos) {
        this.arriendos = arriendos;
    }

    @Override
    public String toString() {
        return "Cliente [arriendos=" + arriendos + ", cedula=" + cedula + ", nombre=" + nombre + ", vigente=" + vigente
                + "]";
    }



}
