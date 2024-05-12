package Examen_programacion;

import java.util.Date;

public class ProductoPerecedero extends Productos {

    public ProductoPerecedero(String numeroReferencia, float precioCompra, String nombre, int stock) {
        super(numeroReferencia, precioCompra, nombre, stock);
        setFechaDeCaducidad("01/05/2024");
    }

    private Date fechaDeCaducidad;

    public Date getFechaDeCaducidad() {
        return fechaDeCaducidad;
    }

    public void setFechaDeCaducidad(String fechaDeCaducidad) {
        this.fechaDeCaducidad = new Date(fechaDeCaducidad);
    }

    @Override
    public float CalcularPrecio(Productos p) {
        return super.CalcularPrecio(p);
    }
}
