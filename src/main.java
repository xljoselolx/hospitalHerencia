import java.sql.SQLOutput;
import java.util.Calendar;

public class main {
    public static void main (String[] args){
        Medico Jose = new Medico("jose","alcon","tarqui","8730776Cb", Calendar.getInstance().getTime(),"123321cc", "cardiologo","viedma");
        Jose.setNombre("Jose Luis");
        System.out.println(Jose.getNombre());
        System.out.println(Jose.getPrimerApellido());
        System.out.println(Jose.getSegundoApellido());
        System.out.println(Jose.getDNI());
        System.out.println();
        System.out.println("Datos  del Medico:");
        System.out.println("Nombre:");
        System.out.println(Jose.getNombre());
        System.out.println("DNI de Medico:");
        System.out.println(Jose.getCodMedico());
        System.out.println("Especialidad:");
        System.out.println(Jose.getServicios());
        System.out.println("Reside en el hospital:");
        System.out.println(Jose.getHospital());




    }
}
