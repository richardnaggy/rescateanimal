package rescate.rescateDeMascota.entidades;

import javax.persistence.*;
import javax.validation.constraints.*;
import lombok.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
@Table(name = "persona")
public class Persona {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id_persona;

    @Size(max = 80, message = "Nombre demasiado largo")
    private String nombre;

    private String telefono;

    private String mail;

}
