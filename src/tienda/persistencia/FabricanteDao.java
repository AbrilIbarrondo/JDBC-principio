
package tienda.persistencia;

import tienda.entidades.Fabricante;



public final class FabricanteDao extends DAO {
    
    public void ingresarFabricante(Fabricante fabricante) throws Exception{
        
        try {
            
            if (fabricante == null){
                
                throw new Exception ("No ha ingresado ningún fabricante");
                
            }
            
            String sql = "IMSERT INTO Fabricante (codigo, nombre)1"+"VALUES ( '"+ fabricante.getCodigo()+"' , '"+ fabricante.getNombre()+");";
            
            insertarModificarEliminar(sql);
            
        } catch (Exception e) {
            
            throw e;
        }
    }
}
