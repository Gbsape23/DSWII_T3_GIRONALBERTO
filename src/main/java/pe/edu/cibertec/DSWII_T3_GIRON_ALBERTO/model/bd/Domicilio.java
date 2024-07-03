package pe.edu.cibertec.DSWII_T3_GIRON_ALBERTO.model.bd;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Domicilio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int idDomicilio;
    private String descDomicilio;
    private int nroDomicilio;
    private String refDomicilio;

}
