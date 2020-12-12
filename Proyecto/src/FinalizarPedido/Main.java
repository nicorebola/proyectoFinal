package FinalizarPedido;
import Controlador.FinalizarPedido.GestorProyecto;
import Modelos.FinalizarPedido.Proyecto;
import Hibernate.HibernateUtil;
import Controlador.FinalizarPedido.GestorTipoProyecto;
import Modelos.FinalizarPedido.TipoProyecto;
import Vistas.MenuPrincipal.GestorVistaPrincipal;
import javax.swing.JFrame;

public class Main {

   public static void main(String[] args) {
        HibernateUtil.inicializar();
        GestorVistaPrincipal gestorVista = new GestorVistaPrincipal();
        gestorVista.abrirPrincipal();
        
//        initializeTipoProyectos();
//        initializeProyectos();
        
    }
   
    
  
    private static void initializeProyectos() {
        Proyecto grupo;
    

        GestorProyecto gestor= new GestorProyecto();
        
        grupo= new Proyecto(1,"a");
        gestor.guardarObjeto(grupo);

        grupo= new Proyecto(2,"b");
        gestor.guardarObjeto(grupo);

        grupo= new Proyecto(3,"c");
        gestor.guardarObjeto(grupo);
    
    }
    
    private static void initializeTipoProyectos(){
    
    TipoProyecto grupo;

        GestorTipoProyecto gestor= new GestorTipoProyecto();
        grupo= new TipoProyecto(1,"Tipo1");
        gestor.guardarObjeto(grupo);

        grupo= new TipoProyecto(2,"Tipo2");
        gestor.guardarObjeto(grupo);

        grupo= new TipoProyecto(3,"Tipo3");
        gestor.guardarObjeto(grupo);
    
    }
    
    
   
     

}
