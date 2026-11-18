package ar.centro8.java.curso.poo_tp2.concesionaria.modelos;  

import lombok.EqualsAndHashCode; 
import lombok.Getter; 


@Getter 


@EqualsAndHashCode(callSuper = true)
public class  Auto  extends Vehiculo {
  private final int puertas; 

  //Constructor que recibe todo (atributos de la clase padre y los propios en este caso puertas).
  public Auto(String marca, String modelo, double precio, int puertas) { 
    super(marca, modelo, precio); // Inicializa marca, modelo y precio de la clase padre
    this.puertas = puertas; //Inicializa el atributo propio del auto
  } 
   
  //Método desarrollado por la interfaz IVendible 
   @Override
  public void vender() {
    System.out.println("vendiendo auto:" + getMarca() + "" + getModelo());
  }



  //Metodo toString() para cumplir con el formato de salida por consola mostrando la marca , modelo, puertas y el precio 
  @Override 
  public String toString() { 
     return "Marca: " + getMarca() + "// Modelo: " + getModelo() + " // Puertas: " + puertas + " // Precio: $ " + String.format("%,.2f", getPrecio());
  }

 
}