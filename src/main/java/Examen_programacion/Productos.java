package Examen_programacion;

import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class Productos {
    private String numeroReferencia;
    private String nombre;
    private float precioCompra;
    private int stock;

    public Productos(String numeroReferencia, float precioCompra, String nombre, int stock) {
        this.numeroReferencia = numeroReferencia;
        this.precioCompra = precioCompra;
        this.nombre = nombre;
        this.stock = stock;
    }

    public float CalcularPrecio(Productos p){
        float preciofinal=0;
        if(p instanceof ProductoPerecedero) {
            LocalDate fechaActual = LocalDate.now();
            LocalDate fechaDeCaducidad = ((ProductoPerecedero) p).getFechaDeCaducidad().toInstant()
                    .atZone(ZoneId.systemDefault())
                    .toLocalDate();
            // Calcular los días restantes hasta la fecha de caducidad
            long dias = ChronoUnit.DAYS.between(fechaActual, fechaDeCaducidad);
            //si la fecha de caducidad es de mas de 5 dias se aplica un 50% de descuento
            if(dias>5){
                preciofinal = p.precioCompra*2;
            }
            else if(dias<=5 && dias>=3){
                preciofinal = p.precioCompra+(p.precioCompra*0.5f);
            }else if(dias < 3 && dias >= 0){
                preciofinal = p.precioCompra;
            } else if (dias < 0) {
                preciofinal = 0;
            }
        }
        return preciofinal;
    }
}
