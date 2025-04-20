package clasesOsiris;

public class getANDset {
    private String nombregetANDset1;
    private String nombregetANDset2;

    public getANDset (String nombregetANDset1){
        //Esto lo he añadido para cuando se instancia también aparezcan validaciones
        if (nombregetANDset1.contains("P")){
            this.nombregetANDset1=nombregetANDset1;
        } else {
            System.out.println("El nombre no contiene la letra P y no es correcto : " + nombregetANDset1);
        }
    }

    public String getNombregetANDset1(){return nombregetANDset1;}
    public void setNombregetANDset1(String nombregetANDset1){
        if (nombregetANDset1.contains("P")){
            this.nombregetANDset1=nombregetANDset1;
        } else {
            System.out.println("El nombre no contiene la letra P y no es correcto : " + nombregetANDset1);
        }
    }
}
