package pe.edu.cibertec.DSWII_T3_GIRON_ALBERTO.model.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class UsuarioSeguridadDTO {
    private Integer idusuario;
    private String nomusuario;
    private String token;
}
