package mx.edu.uacm.sistemapoliza.model;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
public class Beneficiario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombres;
    private String primerApellido;
    private String segundoApellido;
    private LocalDate fechaNacimiento;
    private Double porcentaje;

    @ManyToOne
    @JoinColumn(name = "clave_poliza")
    private Poliza poliza;

    // Getters y Setters
}
