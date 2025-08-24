/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.automovil.persistencia;

import com.mycompany.automovil.logica.Automovil;
import com.mycompany.automovil.persistencia.exceptions.NonexistentEntityException;
import java.util.List;

/**
 *
 * @author emili
 */
public class ControladoraPersistencia {
    
    //creamos una instancia 
    AutomovilJpaController autoJpa = new AutomovilJpaController ();


    public void agregarAutomovil(Automovil auto) {
        // ver los metodos en AutomovilJpaController
        autoJpa.create(auto);
        
    }

    public List<Automovil> traerAutos() {
        // persistencia le pida a la BD lo que necesitamos JPA controller
        // findAutomovilEntities nos trae todos los registros
        //devuelvo una lista por tanto con return
        return autoJpa.findAutomovilEntities();
    }

    public void borrarAuto(int idAuto) {
        try {
            //persistencia pido a la BD necesitamos Jpa controller con el metodo destroy
            //nos lanza warnig hay que hacerlo con try catch, un id no existe arrojaría un error por eso hacer excepción
            autoJpa.destroy(idAuto);
        } catch (NonexistentEntityException ex) {
            System.getLogger(ControladoraPersistencia.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        }
        
    }

    public Automovil traerAutos(int idAuto) {
        //con Jpa controller pedimos a la BD que traiga el auto y hay que retornarlo con return
        return autoJpa.findAutomovil(idAuto);
    }

    public void modificarAuto(Automovil auto) {
        try {
            //pasamos a Jpa controller, necesita la excepción para que no se pare el sistema
            autoJpa.edit(auto);
        } catch (Exception ex) {
            System.getLogger(ControladoraPersistencia.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        }
    }
    
}
