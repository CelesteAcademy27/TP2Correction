package ar.centro8.java.curso.poo_tp2.concesionaria.servicios; 

import ar.centro8.java.curso.poo_tp2.concesionaria.modelos.Vehiculo; 
import ar.centro8.java.curso.poo_tp2.concesionaria.modelos.Moto; 
import ar.centro8.java.curso.poo_tp2.concesionaria.modelos.Auto;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


import org.springframework.stereotype.Service; 

// Indíca que esta clase es un componente de servicio que contiene la lógica del negocio principal 
// al agregarla le estoy dando la información a Spring boot en el cual desarrollara el arranque para 
// escanear el proyecto para anotaciones como esta creando una instancia de Consecionaria 
// automaticamente en este contenedor administrandola.
@Service 
public class TestConsecionaria { 
    public static void main(String[] args) { 
        //Crea la concesionaria y ejecuta el reporte
        new TestConsecionaria().ejecutarReporte(); 
    } 
        //Separa la lógica de negocio (cargar los vehículos e imprimir los resultados) de la configuración de arranque de Spring Boot
        public void ejecutarReporte() { 
             //Lista de Vehiculos 
        List<Vehiculo> vehiculos = new ArrayList<>(); 
        vehiculos.add(new Auto("Peugeot", "206",200000, 4)); 
        vehiculos.add(new Moto("Honda", "Titan", 60000, "125c")); 
        vehiculos.add(new Auto("Peugeot","208",250000,5)); 
        vehiculos.add(new Moto("Yamaha", "YBR", 80500.50, "160c"));  
        
        vehiculos.forEach(System.out::println);

        System.out.println("\n=================================================\n");

        //Mostrar el vehiculo más caro   
         
        vehiculos 
                 .stream() 
                 .max(Comparator.comparing(Vehiculo::getPrecio))
                 .ifPresent(vehiculo -> System.out.println("Vehiculo más caro: " + vehiculo.getMarca() + " " + vehiculo.getModelo())); 

        //Muestrar el vehiculo más barato. 
        
        vehiculos 
                 .stream() 
                 .min(Comparator.comparing(Vehiculo::getPrecio)) 
                 .ifPresent(vehiculo -> System.out.println("Vehiculo más barato: " + vehiculo.getMarca() + " " + vehiculo.getModelo()));  
                 

        //Muestra el Vehiculo que contiene en el modelo la letra "Y". 
       
        vehiculos 
                 .stream()
                 .filter(vehiculo -> vehiculo.getModelo().toUpperCase().contains("Y")) 
                 .findFirst() 
                 .ifPresent(vehiculo -> System.out.println("Vehiculo que contiene en el modelo la letra 'Y':" + vehiculo.getMarca() + " " + vehiculo.getModelo() + " $" + vehiculo.getPrecio()));


        System.out.println("\n=================================================\n"); 

        //Vehiculos ordenados por precio de mayor a menor.
        
        vehiculos 
                 .stream() 
                 .sorted(Comparator.comparing(Vehiculo::getPrecio).reversed())  
                 .map(vehiculo -> vehiculo.getMarca() + " " +vehiculo. getModelo()) 
                 .forEach(System.out::println);

        
        System.out.println("\n=======================================\n"); 

        //Vehiculos ordenados por orden natural (marca, modelo y precio).
        System.out.println("\nVehiculos ordenados por orden natural(marca, modelo y precio):"); 
        //Utilizo sort para ordenar elementos de forma ascendente e incluyo Collections dado a que estoy trabajando con una lista. 
        //El objetivo de Collection.sort(Vehiculos) es para que Java recorra la lista aplicando el orden natural de los atributos 
        //establecidos por el método compareTo dado a la clase Vehiculo que implementa la interfaz.
        Collections.sort(vehiculos);
        vehiculos.forEach(System.out::println);   
        
    }

        }
    
    


