package mx.edu.uacm.sistemapoliza.model;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class Poliza {
    @Id
    private String clave;

    private Integer tipo;
    private Double monto;
    private String descripcion;

    @ManyToOne
    @JoinColumn(name = "curp_cliente")
    private Cliente cliente;

    @OneToMany(mappedBy = "poliza", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Beneficiario> beneficiarios;

    // Getters y Setters
}
