
public class Empleado {
    private String cedula, nombres;
    private double sueldo;

    public Empleado(String cedula, String nombres, double sueldo) {
        this.cedula = cedula;
        this.nombres = nombres;
        this.sueldo = sueldo;
    }

    public String getCedula() {
        return cedula;
    }

    public String getNombres() {
        return nombres;
    }

    public double getSueldo() {
        return sueldo;
    }
    
    public void subirSueldo(double porcentaje){
        sueldo=sueldo*porcentaje/100+sueldo;
    }
}
