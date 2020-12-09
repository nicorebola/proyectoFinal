package Controlador.FinalizarPedido;
import Hibernate.GestorHibernate;
import Modelos.FinalizarPedido.detalle_pedido;
import static Hibernate.HibernateUtil.getSession;
import Util.UtilJtable;
import java.util.*;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTable;
import org.hibernate.Criteria;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import Notificaciones.FinalizarPedido.PushNotifictionHelper;

public class GestorFinalizarPedido extends  GestorHibernate{
    private detalle_pedido  model;  //Detalle o pedido VER
    PushNotifictionHelper pushNot = new PushNotifictionHelper();
  //  private GestorFinalizarPedido gestorFinalizarPedido = new GestorFinalizarPedido();
 //   private GestorVistaFinalizarPedido gestorVistaFinalizarPedido = new GestorVistaFinalizarPedido();
   
   
    
 
    public detalle_pedido  getModel() {
        return model;
    }

    public void setModel(detalle_pedido  model) {
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
//
//    public void setTipoProyecto(TipoProyecto tipoProyecto) {
//        this.getModel().setTipoProyecto(tipoProyecto);
//    }
//  
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
    
   ///////////////////////////////////////////////////////////////
       
    // Altas, bajas y modificaciones 
    public void newModel() {
         this.setModel(new detalle_pedido());
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
    
    
    public List <detalle_pedido> listar(){   
        return this.listarClase(detalle_pedido.class,"codigo",0);
    }
        
    
        public List <detalle_pedido> listar(detalle_pedido detalle_pedido){   
          Criteria crit = getSession().createCriteria(detalle_pedido.class)
                   .add (Restrictions.eq("tipoProyecto",detalle_pedido))  
                  .add (Restrictions.eq("estado",0));
        return crit.list();
    }
    
    public DefaultComboBoxModel getComboModel() {      
        DefaultComboBoxModel auxModel= new DefaultComboBoxModel();
        auxModel.addElement("");
        for (detalle_pedido auxTipo : this.listar()) {
            auxModel.addElement(auxTipo);
        }
         return auxModel;
    }  
    
    public DefaultComboBoxModel getComboModel(detalle_pedido detalle_pedido) {      
        DefaultComboBoxModel auxModel= new DefaultComboBoxModel();
        auxModel.addElement("");
        for (detalle_pedido auxTipo : this.listar()) {
 
              
                auxModel.addElement(auxTipo); 
    
        }
         return auxModel;
    }
    
     public int getUltimoCodigo(){
          try {
           detalle_pedido auxModel= (detalle_pedido) this.listarUltimo(detalle_pedido.class).get(0);
           return auxModel.getCodigo();
        }
        catch(Exception e){
           return 0;
        }

    }
//Posiblemente no se use
    public detalle_pedido buscarCodigo(String codigo) {
        return this.buscarCodigo(Integer.valueOf(codigo));
    }
   
    public detalle_pedido buscarCodigo(int codigo) {
       detalle_pedido  auxModel=null;
       try {
          auxModel= (detalle_pedido) this.listarClaseCodigo(detalle_pedido.class, codigo).get(0);
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
    ;
        
        
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
}
