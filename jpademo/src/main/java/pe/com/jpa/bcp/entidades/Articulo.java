package pe.com.jpa.bcp.entidades;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;

@Entity
@Table(name = "articulo")
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Articulo implements Serializable {


    private static final long serialVersionUID =1l;

    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private  Long id;

    private int cantidad;

    private String denominacion;

    private int precio;
}
