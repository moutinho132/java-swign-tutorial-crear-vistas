package com.mycompany.mavenproject1;

import com.mycompany.mavenproject1.util.JsfUtil;
import com.mycompany.mavenproject1.util.JsfUtil.PersistAction;

import java.io.Serializable;
import java.util.List;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.EJB;
import javax.ejb.EJBException;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

@Named("cargapedidosdespachoController")
@SessionScoped
public class CargapedidosdespachoController implements Serializable {

    @EJB
    private com.mycompany.mavenproject1.CargapedidosdespachoFacade ejbFacade;
    private List<Cargapedidosdespacho> items = null;
    private Cargapedidosdespacho selected;

    public CargapedidosdespachoController() {
    }

    public Cargapedidosdespacho getSelected() {
        return selected;
    }

    public void setSelected(Cargapedidosdespacho selected) {
        this.selected = selected;
    }

    protected void setEmbeddableKeys() {
    }

    protected void initializeEmbeddableKey() {
    }

    private CargapedidosdespachoFacade getFacade() {
        return ejbFacade;
    }

    public Cargapedidosdespacho prepareCreate() {
        selected = new Cargapedidosdespacho();
        initializeEmbeddableKey();
        return selected;
    }

    public void create() {
        persist(PersistAction.CREATE, ResourceBundle.getBundle("/Bundle").getString("CargapedidosdespachoCreated"));
        if (!JsfUtil.isValidationFailed()) {
            items = null;    // Invalidate list of items to trigger re-query.
        }
    }

    public void update() {
        persist(PersistAction.UPDATE, ResourceBundle.getBundle("/Bundle").getString("CargapedidosdespachoUpdated"));
    }

    public void destroy() {
        persist(PersistAction.DELETE, ResourceBundle.getBundle("/Bundle").getString("CargapedidosdespachoDeleted"));
        if (!JsfUtil.isValidationFailed()) {
            selected = null; // Remove selection
            items = null;    // Invalidate list of items to trigger re-query.
        }
    }

    public List<Cargapedidosdespacho> getItems() {
        if (items == null) {
            items = getFacade().findAll();
        }
        return items;
    }

    private void persist(PersistAction persistAction, String successMessage) {
        if (selected != null) {
            setEmbeddableKeys();
            try {
                if (persistAction != PersistAction.DELETE) {
                    getFacade().edit(selected);
                } else {
                    getFacade().remove(selected);
                }
                JsfUtil.addSuccessMessage(successMessage);
            } catch (EJBException ex) {
                String msg = "";
                Throwable cause = ex.getCause();
                if (cause != null) {
                    msg = cause.getLocalizedMessage();
                }
                if (msg.length() > 0) {
                    JsfUtil.addErrorMessage(msg);
                } else {
                    JsfUtil.addErrorMessage(ex, ResourceBundle.getBundle("/Bundle").getString("PersistenceErrorOccured"));
                }
            } catch (Exception ex) {
                Logger.getLogger(this.getClass().getName()).log(Level.SEVERE, null, ex);
                JsfUtil.addErrorMessage(ex, ResourceBundle.getBundle("/Bundle").getString("PersistenceErrorOccured"));
            }
        }
    }

    public Cargapedidosdespacho getCargapedidosdespacho(java.lang.Long id) {
        return getFacade().find(id);
    }

    public List<Cargapedidosdespacho> getItemsAvailableSelectMany() {
        return getFacade().findAll();
    }

    public List<Cargapedidosdespacho> getItemsAvailableSelectOne() {
        return getFacade().findAll();
    }

    @FacesConverter(forClass = Cargapedidosdespacho.class)
    public static class CargapedidosdespachoControllerConverter implements Converter {

        @Override
        public Object getAsObject(FacesContext facesContext, UIComponent component, String value) {
            if (value == null || value.length() == 0) {
                return null;
            }
            CargapedidosdespachoController controller = (CargapedidosdespachoController) facesContext.getApplication().getELResolver().
                    getValue(facesContext.getELContext(), null, "cargapedidosdespachoController");
            return controller.getCargapedidosdespacho(getKey(value));
        }

        java.lang.Long getKey(String value) {
            java.lang.Long key;
            key = Long.valueOf(value);
            return key;
        }

        String getStringKey(java.lang.Long value) {
            StringBuilder sb = new StringBuilder();
            sb.append(value);
            return sb.toString();
        }

        @Override
        public String getAsString(FacesContext facesContext, UIComponent component, Object object) {
            if (object == null) {
                return null;
            }
            if (object instanceof Cargapedidosdespacho) {
                Cargapedidosdespacho o = (Cargapedidosdespacho) object;
                return getStringKey(o.getId());
            } else {
                Logger.getLogger(this.getClass().getName()).log(Level.SEVERE, "object {0} is of type {1}; expected type: {2}", new Object[]{object, object.getClass().getName(), Cargapedidosdespacho.class.getName()});
                return null;
            }
        }

    }

}
