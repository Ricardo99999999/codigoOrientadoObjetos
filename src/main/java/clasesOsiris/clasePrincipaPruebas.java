package clasesOsiris;
import clasesOsiris.clasePrincipalPruebas2;

public class clasePrincipaPruebas {

    public static void devolverNumero3() {
        System.out.println("Devuelveme el numero 3");
    }
    public static void devolverNumero4(){
        System.out.println("Devuleveme el numero 4");
        clasePrincipalPruebas2 objetoCPP2 = new clasePrincipalPruebas2();
        objetoCPP2.devuelveme100();
    }
    public static void operacionesNumeros(){
        clasePrincipalPruebas2 objetoGeneral = new clasePrincipalPruebas2();
        System.out.println("La multiplicación tiene el valor " + objetoGeneral.multiplicador(2,4));

    }
    public static void consultasVarias(){
        clasePrincipalPruebas2 objetoCPP2 = new clasePrincipalPruebas2();
        objetoCPP2.llamadas();
        objetoCPP2.operacionesArrays();
    }

}
