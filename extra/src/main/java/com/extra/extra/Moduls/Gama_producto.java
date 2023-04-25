package com.extra.extra.Moduls;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "gama_producto")
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class Gama_producto {

    @Id
    private String gama  ;
    private String descripcion_texto;
    private String descripcion_html;
    private String imagen;


}
