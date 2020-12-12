package Controlador.FinalizarPedido;
import Hibernate.GestorHibernate;
import Hibernate.HibernateUtil;
import Hibernate.GestorHibernate;
import Hibernate.HibernateUtil;
import static Hibernate.HibernateUtil.getSession;
import Modelos.FinalizarPedido.DetallePedido;
import static Hibernate.HibernateUtil.getSession;
import Util.UtilJtable;
import java.util.*;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTable;
import org.hibernate.Criteria;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import Notificaciones.FinalizarPedido.PushNotifictionHelper;
import javax.swing.table.DefaultTableModel;
import org.hibernate.Session;
import Modelos.FinalizarPedido.DetallePedido;
import javax.swing.JDesktopPane;
import javax.swing.ListSelectionModel;
import javax.swing.table.TableModel;

public class GestorFinalizarPedido extends  GestorHibernate{
    private DetallePedido  model;  //Detalle o pedido VER
    PushNotifictionHelper pushNot = new PushNotifictionHelper();
    GestorHibernate gestorHibernate = new GestorHibernate();
  //  private GestorFinalizarPedido gestorFinalizarPedido = new GestorFinalizarPedido();
 //   private GestorVistaFinalizarPedido gestorVistaFinalizarPedido = new GestorVistaFinalizarPedido();
   
   
     
    public List<DetallePedido> listar() {
        return this.listarClase(DetallePedido.class);
    }
    
      public List <DetallePedido> listar(DetallePedido detalle_pedido){   
          Criteria crit = getSession().createCriteria(DetallePedido.class)
                   .add (Restrictions.eq("nombre_producto",detalle_pedido))  ;
                  //.add (Restrictions.eq("estado",0));
        return crit.list();
    }
 
    public DetallePedido  getModel() {
        return model;
    }

    public void setModel(DetallePedido  model) {
        this.model = model;
    }

//    public GestorFinalizarPedido getGestorFinalizarPedido() {
//        return gestorFinalizarPedido;
//    }
//
//    public void setGestorFinalizarPedido(GestorFinalizarPedido gestorFinalizarPedido) {
//        this.gestorFinalizarPedido = gestorFinalizarPedido;
//    }

  
    // Getter y Setter Objeto principal
//    public String getCodigo() {
//        return String.valueOf(this.getModel().getCodigo());
//    }
   
//    public String getDenominacion() {
//        return this.getModel().getDenominacion();
//    }
//
//    public void setDenominacion(String denominacion) {
//        this.getModel().setDenominacion(denominacion);
//    }
//
//    public int getEstado() {
//        return this.getModel().getEstado();
//    }

//    public void setEstado(int estado) {
//        this.getModel().setEstado(estado);
//    }
//     
//    public TipoProyecto getTipoProyecto() {
//        return this.getModel().getTipoProyecto();
//    }

//    public void setTipoProyecto(TipoProyecto tipoProyecto) {
//        this.getModel().setTipoProyecto(tipoProyecto);
//    }
  
//    public void setDetalle(JTable tbl) {
//        this.setDetalle(UtilJtable.convertToSet(tbl));
//    }
//
//    public Set<ItemProyecto> getDetalle() {
//        return this.getModel().getItems();
//    }
//
//    public void setDetalle(Set<ItemProyecto> detalle) {
//        this.getModel().setItems(detalle);
//    }
    
     public DefaultTableModel obtenerTablaPedidos() {
        DefaultTableModel modelo = new DefaultTableModel();
        JTable tabla = new JTable (modelo);

        ArrayList<DetallePedido> lista_pedidos = buscarObjetoPedido();

        modelo.addColumn("Nombre producto");
        modelo.addColumn("Nombre menú");
        modelo.addColumn("Cantidad");
        modelo.addColumn("ID Detalle");
        modelo.addColumn("Estado");
       
       
       //http://www.chuidiang.org/java/tablas/tablamodelo/tablamodelo.php

        for (int i = 0; i < lista_pedidos.size(); i++) {
//            if(lista_pedidos.get(i).getEstado().getIdEstado()== 1){
//           
//            }
    
            
            Object[] fila = new Object[5];
            fila[0] = lista_pedidos.get(i).getNombre_producto();
            fila[1] = lista_pedidos.get(i).getNombre_menu();
            fila[2] = lista_pedidos.get(i).getCantidad();
            fila[3] = lista_pedidos.get(i).getId();
            fila[4] = lista_pedidos.get(i).getEstado().getIdEstado();

            modelo.addRow(fila);
        }
        return modelo;
    }

    public ArrayList<DetallePedido> buscarObjetoPedido() {
        Session s = gestorHibernate.getSession();
        Criteria crit = s.createCriteria(DetallePedido.class);
        ArrayList<DetallePedido> detalle_pedido = (ArrayList<DetallePedido>) crit.list();

        return detalle_pedido;
    }
      
   

   ///////////////////////////////////////////////////////////////
       
    // Altas, bajas y modificaciones 
    public void newModel() {
         this.setModel(new DetallePedido());
    }
//
//   
//    private void newCodigo() {
//        this.getModel().setCodigo(this.getUltimoCodigo()+1);
//    }
//     
    public void saveModel(int opcABM) {
        switch (opcABM){
          case 0:
            this.guardarObjeto();
            break;
          case 1:
            this.actualizarObjeto();
            break;   
          case 2:
            this.guardarObjeto();
            break;
        
        }
    }
    
    public void guardarObjeto(){
       // this.newCodigo();
        this.guardarObjeto(this.getModel());
    } 
   
    public void actualizarObjeto() {
        this.actualizarObjeto(this.getModel());
    }
  
  
   // busquedas, iteradores y otras 
    
    
   
        
    
  
    
    public DefaultComboBoxModel getComboModel() {      
        DefaultComboBoxModel auxModel= new DefaultComboBoxModel();
        auxModel.addElement("");
        for (DetallePedido auxTipo : this.listar()) {
            auxModel.addElement(auxTipo);
        }
         return auxModel;
    }  
    
    public DefaultComboBoxModel getComboModel(DetallePedido detalle_pedido) {      
        DefaultComboBoxModel auxModel= new DefaultComboBoxModel();
        auxModel.addElement("");
        for (DetallePedido auxTipo : this.listar()) {
 
              
                auxModel.addElement(auxTipo); 
    
        }
         return auxModel;
    }
    
     public int getUltimoCodigo(){
          try {
           DetallePedido auxModel= (DetallePedido) this.listarUltimo(DetallePedido.class).get(0);
           return auxModel.getCodigo();
        }
        catch(Exception e){
           return 0;
        }

    }
//Posiblemente no se use
    public DetallePedido buscarCodigo(String codigo) {
        return this.buscarCodigo(Integer.valueOf(codigo));
    }
   
    public DetallePedido buscarCodigo(int codigo) {
       DetallePedido  auxModel=null;
       try {
          auxModel= (DetallePedido) this.listarClaseCodigo(DetallePedido.class, codigo).get(0);
          return auxModel;}
       catch(Exception e){
          return auxModel;
       }
    }

//    public DefaultComboBoxModel getComboModelFinalizarPedido() {
//       return this.getGestorFinalizarPedido().getComboModel();
//    }

//////////////////////Metodos propios de CU
    
    
    public void finalizar() throws Exception{
        //this.getModel().finalizar();  //metodo en el modelo que finaliza el pedido
        //this.actualizarObjeto();
       
        //this.getModel().notificado();  //cambia al notificado
       
      
      PushNotifictionHelper.pushFCMNotification("cGOrtlJwPWQ:APA91bH6DpNbjyDn76_DOuq56G7YqNyUooUOtZvGIr7mCdEmJEj58KcdBTrAR1zOCm50Igo6L7yOY7iiZjHHJNZvdzE0nWpUuphbGXcQ2e6itsTN6sLka27_sw2tx8XoBRZgC0HL2-cB"," 2"," Coca Cola con Hamburgesa");
    //    int[] seleccionados = tblPedido.getSelectedRows(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
    // Esto lo saqué de internet. https://es.stackoverflow.com/questions/46227/seleccionar-varias-filas-alternas-en-una-jtable
        
    }
    public void notificado (){
         this.actualizarObjeto();
    }

    private void mostrarPantalla() {
     //  this.gestorVistaFinalizarPedido.abrirPrincipal();
    }

    private void enviarNotificacion() {
       // cGOrtlJwPWQ:APA91bH6DpNbjyDn76_DOuq56G7YqNyUooUOtZvGIr7mCdEmJEj58KcdBTrAR1zOCm50Igo6L7yOY7iiZjHHJNZvdzE0nWpUuphbGXcQ2e6itsTN6sLka27_sw2tx8XoBRZgC0HL2-cB
       
    }
    
//    public JTable getjTblPedido() {
//        return tblPedido;
//    }
//    
//    private javax.swing.JTable tblPedido;

    public void openFormulario(JDesktopPane pantalla) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
