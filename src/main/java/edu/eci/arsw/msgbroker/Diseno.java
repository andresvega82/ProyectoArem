/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.arsw.msgbroker;

/**
 *
 * @author ASUS
 */
public class Diseno {
    private String nombre = "";
    private String empleado = "";
    private int costo = 0;
    private int recursos = 0;
    private int voltaje = 0;
    private String alcance = "";
    private boolean resultado = false;   

    public Diseno() {
    }
    
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmpleado() {
        return empleado;
    }

    public void setEmpleado(String empleado) {
        this.empleado = empleado;
    }

    public int getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }

    public int getRecursos() {
        return recursos;
    }

    public void setRecursos(int recursos) {
        this.recursos = recursos;
    }

    public int getVoltaje() {
        return voltaje;
    }

    public void setVoltaje(int voltaje) {
        this.voltaje = voltaje;
    }

    public String getAlcance() {
        return alcance;
    }

    public void setAlcance(String alcance) {
        this.alcance = alcance;
    }
    
    public boolean evaluación (){
        int puntaje = 0;
        if(costo > 300000){
            puntaje += 1;
        }else if(costo < 150000){
            puntaje += 5;
        }else{
            puntaje += 3;
        }
        
        if(recursos > 100){
            puntaje += 1;
        }else if(recursos < 25){
            puntaje += 5;
        }else{
            puntaje += 3;
        }
        
        if(voltaje > 25){
            puntaje += 1;
        }else if(costo < 10){
            puntaje += 5;
        }else{
            puntaje += 3;
        }
        
        if(alcance.equals("largo")){
            puntaje += 5;
        }else if(alcance.equals("mediano")){
            puntaje += 3;
        }else{
            puntaje += 1;
        }
        
        if(puntaje >= 12){
            resultado = true;
        }else{
            resultado = false;
        }
        
        return resultado;
    }
    
}
