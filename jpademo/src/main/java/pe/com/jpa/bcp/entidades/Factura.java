package pe.com.jpa.bcp.entidades;

import jakarta.persistence.*;
import lombok.*;

import javax.print.attribute.standard.MediaSize;
import java.io.Serializable;


@Entity
@Table(name = "factura")
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Factura  implements Serializable {

    private static final long serialVersionUID =1l;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "fecha")
    private String fechaCompra;

    @Column(name = "numPedido")
    private int numero;

    @Column(name = "total")
    private int total;

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "fk_cliente")
    private Cliente cliente;


    public Factura(String fechaCompra, int numero, int total) {
        this.fechaCompra = fechaCompra;
        this.numero = numero;
        this.total = total;
    }

    public Factura(String fechaCompra, int numero, int total, Cliente cliente) {
        this.fechaCompra = fechaCompra;
        this.numero = numero;
        this.total = total;
        this.cliente = cliente;
    }
}
