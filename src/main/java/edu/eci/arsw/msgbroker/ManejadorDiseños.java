/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.arsw.msgbroker;

import java.util.concurrent.ConcurrentHashMap;
import org.springframework.stereotype.Service;

/**
 *
 * @author ASUS
 */
@Service
public class ManejadorDiseños {
     private final ConcurrentHashMap<String, Diseno> diseños = new ConcurrentHashMap<>();
    
        public boolean consultarRespuesta(String ds){
            
            return diseños.get(ds).evaluación();
        }
        
        public void insertarDiseno(Diseno ds){
            diseños.put(ds.getNombre(), ds);
        }
        
        public Diseno consultarDiseño(String nombre){
            return diseños.get(nombre);
        }
}
