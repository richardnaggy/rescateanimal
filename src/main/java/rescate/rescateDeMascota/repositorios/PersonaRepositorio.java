package rescate.rescateDeMascota.repositorios;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import rescate.rescateDeMascota.entidades.Persona;

@Repository
public interface PersonaRepositorio extends CrudRepository<Persona, Long> {

}
