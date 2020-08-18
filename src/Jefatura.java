
public class Jefatura extends Empleado{
    private double bono;

    public Jefatura(String cedula, String nombres, double sueldo) {
        super(cedula, nombres, sueldo);
    }

    public double getBono() {
        return bono;
    }

    public void setBono(double bono) {
        this.bono = bono;
    }
    
    @Override
    public double getSueldo(){
        double sueldoj = super.getSueldo()+bono;
        return sueldoj;
    }
}
