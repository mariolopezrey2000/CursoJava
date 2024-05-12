package sesion2;

public class Coche extends  Vehiculo{
    private String otroColorSoloEnCoche = "azul";

    public Coche(){
        super("nuevaMatricula Coche" ,"rosa");
    }
    public String getColor(){ return otroColorSoloEnCoche;}
}
