package sesion2;

public class Vehiculo {
    private String matricula;
    private String color = "rojo";

    public Vehiculo(String nuevaMatricula,String color){
        matricula=nuevaMatricula;
        setColor(color);
        System.out.println(getColor());
    }

    public String getColor(){ return color; }

    public void setColor(String color){this.color=color;}

}
