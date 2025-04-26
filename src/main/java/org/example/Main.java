package org.example;
import clasesUtils.*;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;




//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws IOException {
        //Escribir un print en consola
        System.out.println("Mi primer print!");
        System.out.println("****************************************");

        //Instanciación de una clase estandar a utilizar
        claseEstandar insClaseEstandar = new claseEstandar();
        insClaseEstandar.primerMetodoEstandar();
        System.out.println("****************************************");

        //Esta es la clase static la cual no necesita instanciacion
        claseStatic.primerMetodoClaseStatic();
        System.out.println("****************************************");

        //Instanciacion de una interfaz
        System.out.println("Se comienza con la utilización de la interfaz");
        claseUtilizarInterfaces objetoInterfaz = new claseUtilizarInterfaces();

        /*Utilización de una interfaz*/
        objetoInterfaz.metodoInterfaz1();
        System.out.println("Se muestra el valor del segundo metodo al llamarlo "+objetoInterfaz.metodoInterfaz2());
        System.out.println("Se muestra el valor del cuarto metodo, que no está como obligatorio en la interfaz "+objetoInterfaz.metodoInterfaz4());
        System.out.println("****************************************");

        /*Utilización e instanciación de la clase Enum*/
        clasePrincipalEnum valorEnum1 = clasePrincipalEnum.miValorEnum1;
        clasePrincipalEnum valorEnum2 = clasePrincipalEnum.miValorEnum2;
        System.out.println("Los valores de los enums son: "+valorEnum1+ " y "+valorEnum2);
        System.out.println("****************************************");

        /*Utilización de getters y setters*/
        System.out.println("Comienzo de getters and setters");
        getANDset objectGetandSet = new getANDset("Saco");
        objectGetandSet.setNombregetANDset1("Sasori");
        //Finalmente ponemos uno que esté OK
        objectGetandSet.setNombregetANDset1("Paco");
        System.out.println("****************************************");

        /*Esta es la forma de instanciar una propiedad si quieres utilizarla*/
        System.setProperty("variableOsirisProperty", "valorOsirisProperty");
        System.setProperty("variableProperty", "valorProperty");
        System.out.println("El valor de la propiedad es " + System.getProperty("variableProperty"));
        System.out.println("****************************************");

        /*Utilización de properties.
        * Crear un archivo .properties que debe de estar obligatoriamente en la carpeta del classpath
        * que al recogerlo de java.utils, debe de estar en src.main.resources*/
        Properties propiedades = new Properties();

        // Cargar el archivo properties desde el directorio resources
        try (InputStream input = Main.class.getClassLoader().getResourceAsStream("system.properties")) {
            if (input == null) {
                System.out.println("No se encontró el archivo de propiedades");
                return;
            }
            // Cargar las propiedades desde el archivo
            propiedades.load(input);

            // Acceder a las propiedades
            String username2 = propiedades.getProperty("archivo.usuario");

            // Imprimir las propiedades cargadas
            System.out.println("Variable propiedad username2: " + username2);

        } catch (Exception e) {
            e.printStackTrace();
        }

        /*Ahora quiero cargarlo pero utilizando set.properties, modificarle el valor de la variable
        * independientemente de lo que venga*/
        propiedades.setProperty("archivo.usuario","Nuevo valor set properties");
        String username3 = propiedades.getProperty("archivo.usuario");
        System.out.println("Variable propiedad username3: " + username3);
    }

    }
