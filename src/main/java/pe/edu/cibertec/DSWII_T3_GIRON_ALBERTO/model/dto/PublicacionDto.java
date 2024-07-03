package pe.edu.cibertec.DSWII_T3_GIRON_ALBERTO.model.dto;

import lombok.Data;

@Data
public class PublicacionDto implements DtoEntity{

    private int idPublicacion;
    private String titulo;
    private String resumen;
    private String fechPublicacion;
    private AutorDTO autor;

}
