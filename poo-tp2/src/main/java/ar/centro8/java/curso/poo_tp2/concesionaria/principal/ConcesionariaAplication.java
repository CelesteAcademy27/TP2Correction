package ar.centro8.java.curso.poo_tp2.concesionaria.principal; 

import ar.centro8.java.curso.poo_tp2.concesionaria.servicios.TestConsecionaria; 
import org.springframework.boot.CommandLineRunner; 
import org.springframework.boot.SpringApplication; 
import org.springframework.boot.autoconfigure.SpringBootApplication; 
import org.springframework.context.annotation.ComponentScan; 

@SpringBootApplication //Etiqueta principal para el arranque de la aplicación Spring Boot.
//Configura los paquetes base para que Spring busque componentes, servicios,controladores y repositorios 
//Para registrarlos en el contenedor.
@ComponentScan(basePackages = "ar.centro8.java.curso.poo_tp2.concesionaria") 

//Aqui se ejecuta el reporte de vehiculos (el codigo) de manera rapida.
public class ConcesionariaAplication implements CommandLineRunner { 
    //Conectan la clase principal con la clase TestConsecionaria.
    private final TestConsecionaria concesionaria; 
    public ConcesionariaAplication(TestConsecionaria concesionaria) { 
        this.concesionaria = concesionaria;
    } 
 
    //Puerta de entrada principal que pone en marcha todo el servidor y el entorno de Spring Boot.
    public static void main(String[] args) { 
        SpringApplication.run(ConcesionariaAplication.class, args);
    }

    //Orden obligatoria que trae CommandLineRunner, esto permite ejecutar la linea clave una vez que el sistema arranca.
    @Override  
    public void run(String... args) throws Exception { 
        //Impresión de consola donde se imprimen los resultados de la concesionaria.
        concesionaria.ejecutarReporte(); 
    }

}
