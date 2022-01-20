
package tienda.persistencia;

import tienda.entidades.Producto;


public final class ProductoDao extends DAO{
    
    public void ingresarProducto(Producto producto) throws Exception{
        
        try {
            
            if (producto == null){
                
                throw new Exception ("No ha ingresado ningún producto");
                
            }
            
            String sql = "IMSERT INTO Producto (codigo, nombre, precio, codigo_fabricante)1"+"VALUES ( '"+ producto.getCodigo()+"' , '"+ producto.getNombre()+"' , '"+ producto.getPrecio()+"' , '"+ producto.getCodigoFabricante()+");";
            
            insertarModificarEliminar(sql);
            
        } catch (Exception e) {
            
            throw e;
        }
    }
    
    public void modificarProducto(Producto producto) throws Exception{
        
        try {
            
            if (producto == null){
                
                throw new Exception ("No ah ingresado ningún producto para modificar");
                
            }
            
            String sql = "UPDATE Producto SET" + "nombre = '" + producto.getNombre() + " , precio = '" + producto.getPrecio() + "WHERE codigo = '" + producto.getCodigo();
            
            insertarModificarEliminar(sql);
            
        } catch (Exception e) {
            
            throw e;
        }
    }
}
