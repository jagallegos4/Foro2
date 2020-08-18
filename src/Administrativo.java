
public class Administrativo extends Empleado{
    private int numeroAn;

    public Administrativo(String cedula, String nombres, double sueldo, int numeroAn) {
        super(cedula, nombres, sueldo);
        this.numeroAn = numeroAn;
    }

    public int getNumeroAn() {
        return numeroAn;
    }
    
    @Override
    public double getSueldo(){
        double sueldoA=super.getSueldo();
        
        for(int i=0;i<numeroAn;i++){
            sueldoA=sueldoA*0.05+sueldoA;            
        }
        return sueldoA;
    }
    
}
