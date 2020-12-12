package Vistas.FinalizarPedido;
import Modelos.FinalizarPedido.Proyecto;
import Controlador.FinalizarPedido.GestorFinalizarPedido;
import Hibernate.GestorHibernate;

import Modelos.FinalizarPedido.ItemProyecto;
import javax.swing.*;
import Vistas.GestorVista;
import Vistas.MenuPrincipal.FrmPrincipal;
import javax.swing.table.DefaultTableModel;
import javax.swing.JFrame;
import javax.swing.WindowConstants;
import Modelos.FinalizarPedido.DetallePedido;
import java.util.List;

public class GestorVistaFinalizarPedido  extends GestorVista {
    GestorHibernate oper;
    FrmFinalizarPedido form;  
    DetallePedido detalle;
    GestorFinalizarPedido gestor= new GestorFinalizarPedido();                  
  List<DetallePedido> detalle_pedido;
 //Definicion de getter y setter de variables, objetos y gestores   
  
  
  
  
    public DetallePedido getModel() {
        return this.gestor.getModel();
    }

    public void setModel(JComboBox cmb) {
    //    this.setModel((detalle_pedido) cmb.getSelectedItem());
    }

    private void setModel(DetallePedido model) {
        this.getGestor().setModel(model);
    }

    public GestorFinalizarPedido getGestor() {
        return gestor;
    }

    public void setGestor(GestorFinalizarPedido gestor) {
        this.gestor = gestor;
    }

    public FrmFinalizarPedido getForm() {
        return form;
    }

    public void setForm(FrmFinalizarPedido form) {
        this.form = form;
    }
    
    public DetallePedido getComercio() {
        return detalle;
    }

    public void setDetalle(DetallePedido comercio) {
        this.detalle = comercio;
    }
    
        public GestorHibernate getOper() {
        if (oper == null) {
            synchronized (GestorHibernate.class) {
                oper = new GestorHibernate();

            }
        }
        return oper; 
    }

    public void setOper(GestorHibernate oper) {
        this.oper = oper;
    }

//    public getForm() {
//        return form;
//    }
//
//    public void setForm(form) {
//        this.form = form;
//    }
    
    
     //////////////////////////////ESTO AGREGUE YOOOOO//////////////////////////////////
     public FrmFinalizarPedido frmPrincipal1;

   
    public void abrirPrincipal() {
        FrmFinalizarPedido frmPrincipal1 = new FrmFinalizarPedido(this);
        frmPrincipal1.setVisible(true);
    }

        
    public void abrirProyecto(JDesktopPane escritorio ) {
        GestorVistaFinalizarPedido gestor= new GestorVistaFinalizarPedido();
        gestor.openFormulario(escritorio);
    }

    public  void abrirTipoProyecto(JDesktopPane escritorio) {
        GestorVistaTipoProyecto gestor= new GestorVistaTipoProyecto();
        gestor.openFormulario(escritorio); 
    }
    
    //////////////////////////////HASTA ACA//////////////////////////////////
  
     public void initializeTabla(JTable tblPedido) {
        String[] titulo={"Mesa","Producto", "Estado"};
        String[] ancho ={};
        this.newModelTable(tblPedido,titulo,ancho);  
    } 
    
    
    @Override
    public void newModel() {
        this.gestor.newModel();
        this.setModoNuevo();
    } 

    @Override
    public void cancelarView() {
        
    }

    @Override
    public void deleteView() {
        
         //this.getGestor().eliminar();
         this.getForm().viewEliminar();
    }
    
    @Override
    public int setModel() { 
        if (this.isDatosValidos()) {
//            this.getGestor().setDenominacion(this.getForm().getTxtDenominacion().getText());     
//            this.getGestor().setTipoProyecto((TipoProyecto) this.getForm().getCmbTipoProyecto().getSelectedItem());
//            this.getGestor().setDetalle(this.getForm().getTbl());
            return 0;}
        else {
            return 1;
        } 
    }
    
    @Override
    public void saveView() {
        int err;
        err= this.setModel();
        if (err ==0){ 
           this.getGestor().saveModel(this.getOpcABM());
           this.actualizarView();
        }
    }
    
    @Override
    public boolean isDatosValidos() {
//        if (this.isEmpty(this.getForm().getTxtDenominacion())) 
//           { JOptionPane.showMessageDialog(null, "Falta ingresar la descripción del Proyecto");
//            this.getForm().getTxtDenominacion().grabFocus();
//            return false; 
//           } 
//    
//        if (this.isEmpty(this.getForm().getTbl())) 
//           { JOptionPane.showMessageDialog(null, "Falta ingresar el item de Proyecto");
//            this.getForm().getCmbTipoProyecto().grabFocus();
//            return false; 
//           } 
//    
//    
//         if (this.isEmpty(this.getForm().getCmbTipoProyecto())) 
//           { JOptionPane.showMessageDialog(null, "Falta ingresar la tipo de Proyecto");
//            this.getForm().getCmbTipoProyecto().grabFocus();
//            return false; 
//           } 
        return true;
    }

//    @Override
//    public boolean getModelXCodigo(String codigo) {
//        Proyecto auxModel;
//        auxModel=this.gestor.buscarCodigo(codigo);
//        if (auxModel!=null) {
//           this.setModel(auxModel);
//           return true;  }
//        else {
//            return false;
//        }
//    }

    public void setModelProyecto(JComboBox cmb) {
        cmb.setModel(gestor.getComboModel());
    }
 
    @Override
    public void openFormulario(JDesktopPane pantalla) {
        this.setEscritorio(pantalla);
        this.setForm(new FrmFinalizarPedido(this));
        this.setTitulo(this.getForm().getTitle());
        this.getEscritorio().add(this.getForm());
        this.getForm().setVisible(true);
    }
      
    @Override
    public void getView() {
//        this.getForm().getTxtCodigo().setText(this.getGestor().getCodigo());
//        this.getForm().getTxtDenominacion().setText(this.getGestor().getDenominacion());
//        this.getForm().getCmbTipoProyecto().setSelectedItem(this.getGestor().getTipoProyecto());
//        this.setItems(this.getForm().getTbl());
    }
    
    @Override
    public void actualizarView() {
//        this.getForm().viewGuardar();
//        if (this.getOpcABM()==0) {
//            this.getForm().getTxtCodigo().setText(this.getGestor().getCodigo());
//            this.getGestor().setDetalle(this.getForm().getTbl());
//        }
   
    } 

    public void setModelTipoProyecto(JComboBox cmb) {
//        cmb.setModel(gestor.getComboModelTipoProyecto());
   }
    
    
//    private void setItems(JTable tbl) {
//        this.initializeTabla(tbl);
//        DefaultTableModel modeloTabla= (DefaultTableModel) tbl.getModel();
//        for (ItemProyecto item : this.getGestor().getDetalle()) {
//             Object[] fila = {item, item.getDenominacion()}; 
//             modeloTabla.addRow(fila);
//        }
//    }
    
    public void addItem() {
//        if (this.isItemValidos()) {
//            DefaultTableModel modeloTabla  = (DefaultTableModel) this.getForm().getTbl().getModel(); 
//            ItemProyecto item  = new  ItemProyecto(this.getForm().getTxtItemDenominacion().getText());  
//          
//            Object[] fila = {item, item.getDenominacion() }; 
//            modeloTabla.addRow(fila); 
//            this.getForm().clearItemView();
//        }    
    }

    private boolean isItemValidos() {
        return true;
    }

    public void removeItem() {
//       if (this.isItemTablaSelected(this.getForm().getTbl())){
//           this.removeItemTabla(this.getForm().getTbl());
//        }
    }

   public void imprimir() {

        this.abrirListado(this.pathReportes+"ListadoTipoDominio.jasper");
        this.agregarParametroListado("titulo", "Proyecto");
         this.agregarParametroListado("usuario", "Yo");
        this.agregarDatosListado(this.gestor.listar());
        this.imprimirListado();
    }

    void openFormularioTipo(DefaultComboBoxModel model) {
         GestorVistaTipoProyecto gestorVistaTipoGasto =new GestorVistaTipoProyecto();
        gestorVistaTipoGasto.openFormulario(model,this.getEscritorio());
    }
    
    // DESDE ACA
    public void finalizarPedido() throws Exception{
      this.gestor.finalizar();
   
    }
    //public class cerrarVentana{
        public void cerrarVentana(){
            JFrame frame = new JFrame("Window Tittle");
            //frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            //frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            System.exit(1);
            frame.setVisible(false);
            frame.dispose();
           
        }
        
    //}
    
}
