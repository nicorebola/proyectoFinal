package Vistas.MenuPrincipal;
import Vistas.GestorVista;
import Vistas.FinalizarPedido.GestorVistaFinalizarPedido;
import Vistas.FinalizarPedido.GestorVistaTipoProyecto;
import javax.swing.JDesktopPane;

public class GestorVistaPrincipal extends GestorVista{
    public FrmPrincipal frmPrincipal;

    ////////////////////////////////////////////////////////////////
    public void abrirPrincipal() {
        FrmPrincipal frmPrincipal = new FrmPrincipal(this);
        frmPrincipal.setVisible(true);
    }

        
    public void abrirProyecto(JDesktopPane escritorio ) {
        GestorVistaFinalizarPedido gestor= new GestorVistaFinalizarPedido();
        gestor.openFormulario(escritorio);
    }

    public  void abrirTipoProyecto(JDesktopPane escritorio) {
        GestorVistaTipoProyecto gestor= new GestorVistaTipoProyecto();
        gestor.openFormulario(escritorio); 
    }

}
