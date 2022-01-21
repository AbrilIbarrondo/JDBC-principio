
package tienda.servicios;

import java.util.Scanner;
import tienda.entidades.Fabricante;
import tienda.entidades.Producto;
import tienda.persistencia.FabricanteDao;
import tienda.persistencia.ProductoDao;

public class ServicioProducto {
    
    Producto producto = new Producto();
    Fabricante fabricante = new Fabricante();
    Scanner leer = new Scanner(System.in);
    ProductoDao pd = new ProductoDao();
    FabricanteDao fd = new FabricanteDao();
    
    public void ingresar(){
        
        System.out.println("1) Lista el nombre de todos los productos que hay en la tabla producto. ");
        System.out.println("2) Lista los nombres y los precios de todos los productos de la tabla producto. ");
        System.out.println("3) Listar aquellos productos que su precio esté entre 120 y 202. ");
        System.out.println("4) Buscar y listar todos los Portátiles de la tabla producto. ");
        System.out.println("5) Listar el nombre y el precio del producto más barato. ");
        System.out.println("6) Ingresar un producto a la base de datos. ");
        System.out.println("7) Ingresar un fabricante a la base de datos. ");
        System.out.println("8) Editar un producto con datos a elección. ");
        
        try {
            int num = leer.nextInt();
        
        switch (num) {
            case 1:
                
                System.out.println(pd.buscarNombreProducto());
            case 2:
                
            case 3:
                
            case 4:
                
            case 5:
                
            case 6:
                System.out.println("Nombre del producto");
                System.out.print("- ");
                String nom = leer.next();
                producto.setNombre(nom);
                
                System.out.println("Código del producto");
                System.out.print("- ");
                int cod = leer.nextInt();
                producto.setCodigo(cod);
                
                System.out.println("Precio del producto");
                System.out.print("- ");
                double pre = leer.nextDouble();
                producto.setPrecio(pre);
                
                System.out.println("Código del fabricante");
                System.out.print("- ");
                int codf = leer.nextInt();
                producto.setCodigoFabricante(codf);
                
                pd.ingresarProducto(producto);
            case 7:
                
                System.out.println("Nombre del fabricante");
                System.out.println("- ");
                nom = leer.next();
                fabricante.setNombre(nom);
                
                System.out.println("Código del fabricante");
                System.out.println("- ");
                cod = leer.nextInt();
                fabricante.setCodigo(cod);
                
                fd.ingresarFabricante(fabricante);
            case 8:
                
                System.out.println("Ingrese el código del producto ha editar");
                System.out.println("- ");
                cod = leer.nextInt();
                producto.setCodigo(cod);
                
                System.out.println("Nombre");
                System.out.println("- ");
                nom = leer.next();
                producto.setNombre(nom);
                
                System.out.println("Precio");
                System.out.println("- ");
                pre = leer.nextDouble();
                producto.setPrecio(pre);
                
                pd.modificarProducto(producto);
               default:
                   
                   
        }
        } catch (Exception e) {
        }
    }
}
