package mx.com.gm.ventas;

public class Producto {
   
   //Atributos 
   private final int idProducto; //Se puede asignar como final ya que una vez asignado ya no se va a modificar
   private String nombre;
   private double precio;
   private static int contadorProductos;
   
   //Constructores
   private Producto(){
       this.idProducto = ++Producto.contadorProductos; //Como es estatica se pone el nombre de la clase
   }
   
   public Producto(String nombre, double precio){
       this(); //Llamada al constructor vacio para inicializar idProducto
       this.nombre = nombre; //Inicializa atributo
       this.precio = precio; //Inicializa atributo
   }
   
   public int getIdProducto(){
       return idProducto;
   }
   
   public String getNombre(){
       return nombre;
   }
   
   public void setNombre(String nombre){
       this.nombre = nombre;
   }
   
   public double isPrecio(){
       return precio;
   }
   
   public void setPrecio(double precio){
       this.precio = precio;
   }

    @Override
    public String toString() {
        return "Producto{" + "idProducto=" + idProducto + ", nombre=" + nombre + ", precio=" + precio + '}';
    }

}
