import jakarta.persistence.*;
import jakarta.validation.constraints.*;

import java.io.Serializable;

@Entity
@Table(name = "polizas")
public class Poliza implements Serializable {

    @Id
    @Column(length = 20, nullable = false, unique = true)
    private String clave; 

    @NotNull(message = "El tipo de póliza no puede ser nulo")
    @Min(value = 0, message = "Tipo de póliza inválido (0: Auto, 1: Vida, 2: Médico)")
    @Max(value = 2, message = "Tipo de póliza inválido (0: Auto, 1: Vida, 2: Médico)")
    private Integer tipo; 

    @NotBlank(message = "La descripción de la póliza es obligatoria")
    @Size(max = 255, message = "La descripción no puede exceder los 255 caracteres")
    private String descripcion; // Breve descripción del seguro

    @NotNull(message = "El monto asegurado es obligatorio")
    @Positive(message = "El monto asegurado debe ser mayor que cero")
    private Double monto; 

    @NotBlank(message = "El CURP del cliente asegurado es obligatorio")
    @Column(length = 18)
    private String curpCliente; // CURP del cliente que contrató la póliza

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public Integer getTipo() {
        return tipo;
    }

    public void setTipo(Integer tipo) {
        this.tipo = tipo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Double getMonto() {
        return monto;
    }

    public void setMonto(Double monto) {
        this.monto = monto;
    }

    public String getCurpCliente() {
        return curpCliente;
    }

    public void setCurpCliente(String curpCliente) {
        this.curpCliente = curpCliente;
    }

    public poliza(){
    }
    
}
