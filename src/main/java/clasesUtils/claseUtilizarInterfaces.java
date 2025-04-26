package clasesUtils;

public class claseUtilizarInterfaces implements claseInterfaces{
    @Override
    public void metodoInterfaz1() {
        System.out.println("Entra en el primer método de las interfaces");
    }

    @Override
    public int metodoInterfaz2() {
        return 200;
    }

    @Override
    public int metodoInterfaz3() {
        return 333;
    }

    //Método añadido que no se tiene implementado en la interfaz
    public String metodoInterfaz4(){return "111";}
}

//Te obliga a crear y utilizar los 3 métodos, aunque puedes añadir más métodos que no se encuentren en la interfaz
