package clasesOsiris;
import clasesOsiris.clasePrincipaPruebas;

public class clasePrincipalPruebas2 extends claseAbstractaOsiris{

    public void devuelveme100(){
        System.out.println("Devuelveme un 100");
    }
    public int multiplicador(int val1,int val2){
        System.out.println("El valor 1 es " + val1 + " y el valor 2 es " + val2);
        return val1*val2;

    }
    public void llamadas(){
        pruebaInterna objetoPruebaInterna = new pruebaInterna();
        objetoPruebaInterna.metodoPruebaInterna();
        /*La clase abstracta no necesita llamar antes a su clase, se llama directamente al método a utilizar*/
        llamadaAbstract1();
        llamadaAbstract2();
    }
    public class pruebaInterna{
        int variableInterna =0;
        public void metodoPruebaInterna(){
            System.out.println("Ha entrado dentro de la prueba interna");
        }
    }
    public void operacionesArrays(){
        int [] valArray = new int [5];
        int [] valArray2 = {1,2,3,4,5};
        for (int i=0;i<3;i++){
            valArray[i]=i;
            System.out.println("El valor del array introducido es " +i);
        }

    }

}

//Utilizacion de clases --> OK
//Herencia de clases --> OK
//Crear aqui dentro una clase para utilzarlo en las clases static, a ver si puedo. --> OK
//Crear y utilizar Arrays --> OK
//Creación y utilizacion de clase abstracta --> OK
//Revisar las interfaces y utilizarlas -->OK
//Hacer un poco de debug --> OK
//Revisar la utilización de las properties -->OK
//Mirar como se utiliza exactamente un enum --> OK
//Utilización del This y los getters y setters. --> OK
//Utilizacion de constructores. Cuando utilizarlos y para que sirven. --> OK. Se utilizan para instanciar los this. lo que sea
//Utilizar system properties
