package rescate.rescateDeMascota.servicios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import rescate.rescateDeMascota.repositorios.PersonaRepositorio;

@Service
public class PersonaServicio {

    @Autowired
    PersonaRepositorio personaRepositorio;

}
