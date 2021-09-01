/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo_claseabstract;

import Modelo.Enfermero;
import Modelo.Medico;
import Modelo.Personal;


public class Ejemplo_ClaseAbstract {

 
    public static void main(String[] args) {
        
    //Instanciamos las Clases Médico y Enfermero con los Métodos Heredados de la Clase Abstract
    
        Personal med = new Medico("MD3345", "Mario", "Lopez", 70.000);
        Personal enf = new Enfermero("CC2436", "Carlos", "Guemez", 40.000);
        med.datosCompletos();
        med.sueldo();
        enf.datosCompletos();
        enf.sueldo();
       
    }
    
}
