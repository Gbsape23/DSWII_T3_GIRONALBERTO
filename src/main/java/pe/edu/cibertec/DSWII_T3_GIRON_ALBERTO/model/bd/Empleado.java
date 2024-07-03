package pe.edu.cibertec.DSWII_T3_GIRON_ALBERTO.model.bd;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Empleado {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idEmpleado;
    private String nombre;
    private String apellido;
    private String fechaContrat;
    @ManyToOne
    @JoinColumn(name = "idDomicilio", nullable = false)
    private Domicilio domicilio;


}
