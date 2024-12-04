import java.util.List;

public class Arriendo {

    private int numArriendo;
    private String fechaArr;
    private int diasArriendo;
    private Cliente cliente;
    private List<CuotaArriendo> cuotas;
    private List<Vehiculo> vehiculos;

    public Arriendo(int numArriendo, String fechaArr, int diasArriendo, Cliente cliente, List<CuotaArriendo> cuotas) {
        this.numArriendo = numArriendo;
        this.fechaArr = fechaArr;
        this.diasArriendo = diasArriendo;
        this.cliente = cliente;
        this.cuotas = cuotas;
 
    }

    public Arriendo(int numArriendo, String fechaArr, int diasArriendo, Cliente cliente, List<CuotaArriendo> cuotas, List<Vehiculo> vehiculos) {
        this.numArriendo = numArriendo;
        this.fechaArr = fechaArr;
        this.diasArriendo = diasArriendo;
        this.cliente = cliente;
        this.cuotas = cuotas;
        this.vehiculos = vehiculos;
    }

    public int getNumArriendo() {
        return numArriendo;
    }

    public void setNumArriendo(int numArriendo) {
        this.numArriendo = numArriendo;
    }

    public String getFechaArr() {
        return fechaArr;
    }

    public void setFechaArr(String fechaArr) {
        this.fechaArr = fechaArr;
    }

    public int getDiasArriendo() {
        return diasArriendo;
    }

    public void setDiasArriendo(int diasArriendo) {
        this.diasArriendo = diasArriendo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<CuotaArriendo> getCuotas() {
        return cuotas;
    }

    public void setCuotas(List<CuotaArriendo> cuotas) {
        this.cuotas = cuotas;
    }

    public List<Vehiculo> getVehiculos() {
        return vehiculos;
    }

    public void setVehiculos(List<Vehiculo> vehiculos) {
        this.vehiculos = vehiculos;
    }

    @Override
    public String toString() {
        return "Arriendo [cliente=" + cliente + ", cuotas=" + cuotas + ", diasArriendo=" + diasArriendo + ", fechaArr="
                + fechaArr + ", numArriendo=" + numArriendo + ", vehiculos=" + vehiculos + "]";
    }
}
