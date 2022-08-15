package mx.com.gm.ventas;

public class Orden {
    private int idOrden;
    private Producto productos[]; //Plural, solo lo declaro, se inicializa en el constructor
    private static int contadorOrdenes; //Saber cuantos objetos de tipo producto se han creado y asignar idorden
    private int contadorProductos; //Saber cuantos productos se agregaron, no es static por que no se relaciona con la clase si no con productos
    private final static int MAX_PRODUCTOS = 10;
    
    public Orden(){
        this.idOrden = ++Orden.contadorOrdenes; //Preincremento para que ya tenga 1
        this.productos = new Producto[Orden.MAX_PRODUCTOS];
    }

    public void agregarProducto(Producto producto){
        if(this.contadorProductos < Orden.MAX_PRODUCTOS){
            this.productos[this.contadorProductos++] = producto;
        } else {
            System.out.println("Se ha superado el máximo de productos" + Orden.MAX_PRODUCTOS);
        }
    }
}
