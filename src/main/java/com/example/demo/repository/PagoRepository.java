package com.example.demo.repository;

import java.sql.Date;

import java.util.List;

import com.example.demo.model.Pago;
import com.example.demo.model.Vuelo;

import org.springframework.data.jpa.repository.JpaRepository;


public interface PagoRepository extends JpaRepository <Vuelo, Integer>{ 
    
   
    // Listar todos los pagos de un usuario
    List<Pago> findByIdUsuario(int idUsuario);

    // Buscar pagos por estado (pagado, pendiente, etc)
    List<Pago> findByEstado(String estado);

    // Buscar pagos realizados en un rango de fechas
    List<Pago> findByFechaPagoBetween(Date inicio, Date fin);
    
    


}
