package pe.com.jpa.bcp.entidades;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;

@Entity
@Table(name = "categoria")
@Setter
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Categoria implements Serializable {

    private static final long serialVersionUID = 1l;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String denominacion;

}