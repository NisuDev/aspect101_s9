public class CuotaArriendo {

    private int numCuota;
    private int valorCuota;
    private boolean pagado;

    public CuotaArriendo(int numCuota, int valorCuota, boolean pagado) {
        this.numCuota = numCuota;
        this.valorCuota = valorCuota;
        this.pagado = pagado;
    }

    public int getNumCuota() {
        return numCuota;
    }

    public void setNumCuota(int numCuota) {
        this.numCuota = numCuota;
    }

    public int getValorCuota() {
        return valorCuota;
    }

    public void setValorCuota(int valorCuota) {
        this.valorCuota = valorCuota;
    }

    public boolean isPagado() {
        return pagado;
    }

    public void setPagado(boolean pagado) {
        this.pagado = pagado;
    }

    @Override
    public String toString() {
        return "CuotaArriendo [numCuota=" + numCuota + ", pagado=" + pagado + ", valorCuota=" + valorCuota + "]";
    }

}
