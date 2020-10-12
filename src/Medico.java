import java.util.Date;

public class Medico extends Persona{
    private String codMedico;
    private String servicios;
    private String hospital;

    public Medico(String nombre, String primerApellido, String segundoApellido, String DNI, Date fechaNacimiento, String codMedico, String servicios, String hospital) {
        super(nombre, primerApellido, segundoApellido, DNI, fechaNacimiento);

        this.setCodMedico(codMedico);
        this.setServicios(servicios);
        this.setHospital(hospital);

    }

    public String getCodMedico() {
        return codMedico;
    }

    public void setCodMedico(String codMedico) {
        this.codMedico = codMedico;
    }

    public String getServicios() {
        return servicios;
    }

    public void setServicios(String servicios) {
        this.servicios = servicios;
    }

    public String getHospital() {
        return hospital;
    }

    public void setHospital(String hospital) {
        this.hospital = hospital;
    }
}
