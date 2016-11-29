/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.arsw.msgbroker;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author ASUS
 */

@RestController
@RequestMapping("/proyectoArem")
public class RestBonita {
    @Autowired
    ManejadorDiseños md = null;
    
    @RequestMapping(value = "/estado/{nombre}", method = RequestMethod.GET)
    public ResponseEntity<?> consultadEstadoDiseñoXX(@PathVariable("nombre") String nombre) {
        try {            
            return new ResponseEntity<>(md.consultarRespuesta(nombre), HttpStatus.ACCEPTED);
        } catch (Exception ex) {
            Logger.getLogger(RestBonita.class.getName()).log(Level.SEVERE, null, ex);
            return new ResponseEntity<>("Diseño no encontrado", HttpStatus.NOT_FOUND);
        }
    }
    
    @RequestMapping(value = "/addDiseño", method = RequestMethod.PUT)
    public synchronized @ResponseBody
    ResponseEntity<?> putDiseño(@RequestBody Diseno dis) {
        try {
            md.insertarDiseno(dis);
            return new ResponseEntity<>("Diseño agregado correctamente", HttpStatus.ACCEPTED);
        } catch (Exception e) {
            return new ResponseEntity<>("Eror al agregar diseño", HttpStatus.ACCEPTED);

        }
    }
}
