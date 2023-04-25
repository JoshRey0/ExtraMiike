package com.extra.extra.Moduls;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "pago")
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class Pago {
    private String forma_pago ;
    private String id_transaccion;
    private String fecha_pago ;
    private double total ;
    @Id
    private  Long codigo_cliente;


}
