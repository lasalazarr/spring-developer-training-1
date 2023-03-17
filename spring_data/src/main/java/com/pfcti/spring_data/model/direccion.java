package com.pfcti.spring_data.model;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class direccion {
    @Id
    private int id;
    private String direccion;
    private String nomenclatura;
    @ManyToOne
    @JoinColumn(name="cliente_id",referencedColumnName = "id")
    private Cliente cliente;

}
