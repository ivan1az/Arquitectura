package mx.edu.uacm.sistemapoliza.model;

import jakarta.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
public class Cliente {
    @Id
    private String curp;

    private String nombres;
    private String primerApellido;
    private String segundoApellido;
    private String direccion;
    private LocalDate fechaNacimiento;

    @OneToMany(mappedBy = "cliente", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Poliza> polizas;

    // Getters y Setters
}
