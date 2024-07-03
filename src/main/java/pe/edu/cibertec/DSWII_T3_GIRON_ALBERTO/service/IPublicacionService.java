package pe.edu.cibertec.DSWII_T3_GIRON_ALBERTO.service;


import pe.edu.cibertec.DSWII_T3_GIRON_ALBERTO.model.bd.Publicacion;

import java.util.List;

public interface IPublicacionService {
    List<Publicacion> obtenerPublicaciones();
}
