package Examen_programacion;

public class ProductoNoPerecedero extends Productos {
    public ProductoNoPerecedero(String numeroReferencia, float precioCompra, String nombre, int stock) {
        super(numeroReferencia, precioCompra, nombre, stock);
    }
    private String tipo;

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public float CalcularPrecio(Productos p) {
        return super.CalcularPrecio(p);
    }
}
