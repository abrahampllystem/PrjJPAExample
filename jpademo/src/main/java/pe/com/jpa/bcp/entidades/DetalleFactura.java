package pe.com.jpa.bcp.entidades;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "detalleFactura")
public class DetalleFactura  implements Serializable {


    private static final long serialVersionUID =1l;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private int cantidad;


    private  int subTotal;
}
