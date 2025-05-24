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
public class Alojamiento { 
    @Id
    @GeneratedValue(strategy = GenerationType. IDENTITY)
    private Integer idAlojamiento;
    
    @Column(unique=true, length = 13, nullable=false)
    private String tipoAlojamiento;
    
    @Column(nullable=false)
    private String provedor;
    
    @Column(nullable=false)
    private String direccion;
    
    @Column(nullable=true)
    private Date fechaInicio; 

    @Column(nullable=true)
    private Date fechaFin; 
    
    @Column(nullable=false)
    private int cantPersonas;

    

}
