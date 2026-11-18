package ar.centro8.java.curso.poo_tp2.concesionaria.modelos;

import ar.centro8.java.curso.poo_tp2.concesionaria.interfaces.IVendible;
import lombok.EqualsAndHashCode;
import lombok.Getter;


@Getter  
@EqualsAndHashCode 
public abstract class Vehiculo implements IVendible, Comparable<Vehiculo>{
     private final String marca; 
     private final String modelo; 
     private final double precio;  

     
     //Constructor  propio de la clase Vehiculo 
     public Vehiculo(String marca, String modelo, double precio) {
          this.marca = marca;
          this.modelo = modelo;
          this.precio = precio;
     }

     
     //Establece un orden natural entre objetos de una clase para verlos de manera ordenada 
     //y poder compararlos facilmente 
     @Override  
     public int compareTo(Vehiculo otroVehiculo) { 
          //Compara la marca y modelo como texto 
          String esteVehiculo = this.marca + "," + this.modelo; 
          String otro = otroVehiculo.marca + "," + otroVehiculo.modelo; 

          //Guarda el resultado en una variable llamada clasificación 
          int clasificacion =esteVehiculo.compareTo(otro); 

          // Evalua la condición entre marca modelo en el caso que sean distintos va retornar un resultado 
          if (clasificacion != 0) { 
               return clasificacion;
          }
          
          
          

          // Si la marca y modelo son iguales se comparan los precios numéricamente. 
          return Double.compare(this.precio, otroVehiculo.precio); 
} 

}
