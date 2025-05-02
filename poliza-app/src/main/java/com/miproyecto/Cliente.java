import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import java.io.Serializable;
import java.time.LocalDate;

@Entity
@Table(name = "clientes")
public class Cliente implements Serializable {

    @Id
    @Column(length = 18, nullable = false, unique = true)
    @NotBlank(message = "El CURP es obligatorio")
    private String curp; // CURP como clave primaria

    @NotBlank(message = "El nombre es obligatorio")
    @Size(max = 100, message = "El nombre no puede exceder los 100 caracteres")
    private String nombres;

    @NotBlank(message = "El primer apellido es obligatorio")
    @Size(max = 100, message = "El primer apellido no puede exceder los 100 caracteres")
    private String primerApellido;

    @Size(max = 100, message = "El segundo apellido no puede exceder los 100 caracteres")
    private String segundoApellido;

    @NotBlank(message = "La dirección es obligatoria")
    @Size(max = 255, message = "La dirección no puede exceder los 255 caracteres")
    private String direccion;

    @NotNull(message = "La fecha de nacimiento es obligatoria")
    private LocalDate fechaNacimiento;

    // Getters y setters

    public String getCurp() {
        return curp;
    }

    public void setCurp(String curp) {
        this.curp = curp;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getPrimerApellido() {
        return primerApellido;
    }

    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }

    public String getSegundoApellido() {
        return segundoApellido;
    }

    public void setSegundoApellido(String segundoApellido) {
        this.segundoApellido = segundoApellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    public cliente(){
    
    }
    
}
