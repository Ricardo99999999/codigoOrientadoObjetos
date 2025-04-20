package org.example;
import clasesOsiris.clasePrincipaPruebas;
import clasesOsiris.clasePrincipalPruebas3;
import clasesOsiris.clasePrincipalEnum;
import clasesOsiris.getANDset;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;




//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws IOException {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("i = " + i);

        }

        //Esta clase al ser estática me permite llamarla directamente, pero dentro de la clase correspondiente.
        clasePrincipaPruebas.devolverNumero3();
        clasePrincipaPruebas.devolverNumero4();
        clasePrincipaPruebas.consultasVarias();
        clasePrincipalPruebas3 objetoInterfaz = new clasePrincipalPruebas3();

        /*Esta es la utilización de una interfaz*/
        objetoInterfaz.metodoInterfaz1();

        /*Esta es la forma de instanciar una propiedad si quieres utilizarla*/
        System.setProperty("variableOsirisProperty", "valorOsirisProperty");
        System.out.println("El valor de la propiedad es " + System.getProperty("variableOsirisProperty"));

        /*Utilización e instanciación de la clase Enum*/
        clasePrincipalEnum valorEnum1 = clasePrincipalEnum.miValorEnum1;
        clasePrincipalEnum valorEnum2 = clasePrincipalEnum.miValorEnum2;
        System.out.println("Los valores de los enums son: "+valorEnum1+ " y "+valorEnum2);

        /*Utilización de getters y setters*/
        getANDset objectGetandSet = new getANDset("Saco");
        objectGetandSet.setNombregetANDset1("Sasori");
        //Finalmente ponemos uno que esté OK
        objectGetandSet.setNombregetANDset1("Paco");

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
