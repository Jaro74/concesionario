/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.automovil;

import com.mycompany.automovil.igu.Principal;



/**
 *
 * @author emili
 */
public class Automovil {

    public static void main(String[] args) {
        
        //Llamamos ya hacemos visible a nuestra igu
        /*Principal princ = new Principal ();
        princ.setVisible(true);
        princ.setLocation(0, 0);*/
        /*crear un JFrame y añadir el JPanel) es la forma correcta y estándar de trabajar en Swing. 
        Así te aseguras de que la interfaz gráfica se muestre de manera apropiada 
        y se gestione correctamente la ventana*/
        
        javax.swing.JFrame ventana = new javax.swing.JFrame("Automóviles");
        // Creamos la instancia del panel que contiene la interfaz
        Principal princ = new Principal();
        // Establecemos el panel como contenido de la ventana
        ventana.setContentPane(princ);
        // Configuramos la operación de cierre para que la aplicación finalice
        ventana.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
        // Ajusta el tamaño de la ventana según el contenido del panel
        ventana.pack(); // Ajusta el tamaño según el contenido
        ventana.setLocationRelativeTo(null); // Centrar en pantalla
        ventana.setVisible(true); // Ajusta el tamaño de la ventana según el contenido del panel
    }
        
        
}

