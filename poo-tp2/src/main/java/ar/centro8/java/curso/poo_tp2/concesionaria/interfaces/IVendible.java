package ar.centro8.java.curso.poo_tp2.concesionaria.interfaces;

public interface IVendible {
      void vender(); 
      //Define un contrato en este caso "vender" 
      //El objetivo principal es la capacidad de vender. 
      //Este metodo cumple la funcíón de establecer un contrato estricto que obliga a cualquier 
      //clase que implemente esta interfaz a definir una acción especifica 
      //Las interfaces que lo implementan son Vehiculo (clase padre) junto a sus clases hijas Auto y Moto (herencia).

}
