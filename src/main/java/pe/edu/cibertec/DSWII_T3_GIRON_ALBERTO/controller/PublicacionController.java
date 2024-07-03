package pe.edu.cibertec.DSWII_T3_GIRON_ALBERTO.controller;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.edu.cibertec.DSWII_T3_GIRON_ALBERTO.model.bd.Publicacion;
import pe.edu.cibertec.DSWII_T3_GIRON_ALBERTO.model.dto.PublicacionDto;
import pe.edu.cibertec.DSWII_T3_GIRON_ALBERTO.service.IPublicacionService;
import pe.edu.cibertec.DSWII_T3_GIRON_ALBERTO.util.DtoUtil;


import java.util.List;
import java.util.stream.Collectors;

@AllArgsConstructor
@RestController
@RequestMapping("pubs-dto")
public class PublicacionController {
    private final IPublicacionService publicacionService;
    private final DtoUtil dtoUtil;

    @PreAuthorize("hasRole('COORDINADOR')")
    @GetMapping
    public ResponseEntity<List<Publicacion>> listarPublicaciones() {
        List<Publicacion> publicacionList = publicacionService.obtenerPublicaciones();
        if (publicacionList.isEmpty())
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        return new ResponseEntity<>(publicacionList, HttpStatus.OK);
    }

    @GetMapping("/dto")
    public ResponseEntity<List<PublicacionDto>> listarPublicacionesDto() {
        List<PublicacionDto> publicacionDtoList = publicacionService.obtenerPublicaciones()
                .stream()
                .map(publicacion -> (PublicacionDto) dtoUtil.convertirADto(publicacion, new PublicacionDto()))
                .collect(Collectors.toList());
        if (publicacionDtoList.isEmpty())
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        return new ResponseEntity<>(publicacionDtoList, HttpStatus.OK);
    }
}