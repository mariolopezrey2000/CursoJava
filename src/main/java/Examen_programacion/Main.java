package Examen_programacion;

public class Main {
    public static void main(String[] args){
        Productos p = new ProductoPerecedero("1", 1,"patata", 3);
        System.out.println(p.CalcularPrecio(p));
    }
}
