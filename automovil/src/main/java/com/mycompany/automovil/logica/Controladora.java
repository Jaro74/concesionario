/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.automovil.logica;

import com.mycompany.automovil.persistencia.ControladoraPersistencia;
import java.util.List;

/**
 *
 * @author emili
 */
public class Controladora {
    
    //creamos una isntancia de controladora de la persistencia, para poder utilizar 
    ControladoraPersistencia controlPersis = new ControladoraPersistencia();

    public void agregarAutomovil(String modelo, String marca, String motor, 
            String color, String matricula, int cantPuertas) {
        //creo instancia de automóvil
        Automovil auto = new Automovil();
        // setter
        auto.setModelo(modelo);
        auto.setMarca(marca);
        auto.setMotor(motor);
        auto.setColor(color);
        auto.setMatricula(matricula);
        auto.setCantPuertas(cantPuertas);
        //llamamos a la controladora de persistencia
        //tenemos el objeto y lo mandamos crear en la persistencia, por eso tenemos el auto
        controlPersis.agregarAutomovil (auto);
    }

    public List<Automovil> traerAutos() {
        //pasamanos lo hace la persistencia no se hace aquí para tener el modelo 3 capas
        // método return porque nos tiene que devolver una lista
        return controlPersis.traerAutos();
        
    }

    public void borraAuto(int idAuto) {
        // pedir id a la persistencia
        controlPersis.borrarAuto(idAuto);
    }

    public Automovil traerAuto(int idAuto) {
        //pasamanos llevamos a la persistencia
        return controlPersis.traerAutos(idAuto);
    }

    public void modificarAuto(Automovil auto, String modelo, String marca, String motor, String color, String matricula, int cantPuertas) {
        //no podemos tocar la id setear 
        auto.setModelo(modelo);
        auto.setMarca(marca);
        auto.setMotor(motor);
        auto.setColor(color);
        auto.setMatricula(matricula);
        auto.setCantPuertas(cantPuertas);
        
        //pido a la persistencia que lo modique
        controlPersis.modificarAuto(auto);
    }
    
}
