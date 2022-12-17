package rescate.rescateDeMascota.entidades;

import javax.persistence.*;
import lombok.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
@Table(name = "especie")
public class Especie {

    private String tipo;

}
