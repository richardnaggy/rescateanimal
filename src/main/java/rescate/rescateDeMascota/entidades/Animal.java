package rescate.rescateDeMascota.entidades;

import javax.persistence.*;
import lombok.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
@Table(name = "animal")
public class Animal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id_animal;

    private String estado;

    private String edad;

    private String tamanio;

    private String ubicacion;

}
