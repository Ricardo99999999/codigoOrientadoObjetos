package clasesOsiris;

public class clasePrincipalPruebas3 implements claseInterfaces{
    @Override
    public void metodoInterfaz1() {
        System.out.println("Entra en una de las interfaces");
    }

    @Override
    public int metodoInterfaz2() {
        return 200;
    }

    @Override
    public int metodoInterfaz3() {
        return 333;
    }
}

//Te obliga a crear y utilizar los 3 métodos
