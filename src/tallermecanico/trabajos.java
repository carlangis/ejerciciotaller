
package tallermecanico;


public class trabajos {
    
    int identificador;
    int numerohoras;
    double preciomaterial;

    public trabajos(int identificador, int numerohoras, double preciomaterial) {
        this.identificador = identificador;
        this.numerohoras = numerohoras;
        this.preciomaterial = preciomaterial;
    }

    public int getIdentificador() {
        return identificador;
    }

    public int getNumerohoras() {
        return numerohoras;
    }

    public double getPreciomaterial() {
        return preciomaterial;
    }

    public void setNumerohoras(int numerohoras) {
        this.numerohoras = numerohoras;
    }

    public void setPreciomaterial(double preciomaterial) {
        this.preciomaterial = preciomaterial;
    }
    
    
    
    
    
}
