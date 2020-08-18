
public class UsoEmpleado {
    public static void main(String[] args) {
        Jefatura jefePersonal =new Jefatura("12654", "Diego Perez", 1000);
        Administrativo admin1 = new Administrativo("5698","Tania Aguirre",450,4);
        Administrativo admin2 = new Administrativo("1452","Marlene Soto",550,6);
        Empleado[] empleados=new Empleado[7];
        empleados[0] = new Empleado("12345","Pedro Rodriguez",200);
        empleados[1] = new Empleado("69857","David Lopez",500);
        empleados[2] = new Empleado("45872","Hector Armas",600);
        empleados[3] = jefePersonal;
        empleados[4] = new Jefatura("68547","Monica Cortez",1200);
        Jefatura jefeAdministrativo = (Jefatura)empleados[4];
        empleados[5]= admin1;
        empleados[6]= admin2;
        for(Empleado e: empleados){
            e.subirSueldo(10);
        }
        jefePersonal.setBono(500);
        jefeAdministrativo.setBono(1000);
        for(Empleado e: empleados){
            System.out.println(e.getCedula()+" "+e.getNombres()+" "+e.getSueldo());
        }
    }
}
