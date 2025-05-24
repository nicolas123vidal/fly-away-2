package com.example.demo.model;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data 
@AllArgsConstructor 
@NoArgsConstructor
public class Pago { 
    @Id
    @GeneratedValue(strategy = GenerationType. IDENTITY)
    private Integer idPago;
    
    @Column(unique=true, length = 13, nullable=false)
    private int idUsuario;
    
    @Column(nullable=false)
    private String metodoPago;
    
    @Column(nullable=true)
    private Date fechaPago;
    
    @Column(nullable=false)
    private String estado;

    @Column(nullable=false)
    private int monto; 

    @Column(nullable=false)
    private String moneda; 

    @Column(nullable=false)
    private String descripcion; 

    

}
