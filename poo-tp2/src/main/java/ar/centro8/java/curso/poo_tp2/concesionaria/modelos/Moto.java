package ar.centro8.java.curso.poo_tp2.concesionaria.modelos;

import lombok.EqualsAndHashCode;
import lombok.Getter;


@Getter 
@EqualsAndHashCode(callSuper = true)
public class Moto extends Vehiculo {
  private final String cilindrada;
  
  //Constructor que recibe todo (atributos de la clase padre y los propios en este caso cilindrada).
  public Moto(String marca, String modelo, double precio, String cilindrada) {
    super(marca, modelo, precio); //Inicializa marca, modelo y precio de la clase padre
    this.cilindrada = cilindrada; //Inicializa el atributo propio de la clase moto
  }

   //Metodo desarrollado por la interfaz IVendible.
    @Override
  public void vender() {
    System.out.println("vendiendo moto:" + getMarca() + "" + getModelo());
  } 

  //Metodo toString() para cumplir con el formato de salida por consola mostrando la marca, modelo,cilindrada y el precio con el formato correcto.
  @Override 
  public String toString() { 
    return "Marca: " + getMarca() + " // Modelo: " + getModelo() +  " // Cilindrada: " + cilindrada + " // Precio: $ " + String.format("%,.2f", getPrecio());
  }

 

  

  
}
