package PruebaJSON;

public class DetalleVenta {

    /*CLASS ATTRIBUTES*/

    private String producto;
    private Double importe;
    private Double precioUnitario;
    private Integer cantidad;

    /*CLASS CONSTRUCTOR*/

    public DetalleVenta(String producto, Double importe, Double precioUnitario, Integer cantidad) {
        setProducto(producto);
        setImporte(importe);
        setPrecioUnitario(precioUnitario);
        setCantidad(cantidad);
    }

    /*GETTER & SETTER*/

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public Double getImporte() {
        return importe;
    }

    public void setImporte(Double importe) {
        this.importe = importe;
    }

    public Double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(Double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    /*TO STRING*/

    @Override
    public String toString() {
        return "DetalleVenta{" +
                "producto='" + producto + '\'' +
                ", importe=" + importe +
                ", precioUnitario=" + precioUnitario +
                ", cantidad=" + cantidad +
                '}';
    }
}
