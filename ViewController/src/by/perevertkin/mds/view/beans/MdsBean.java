package by.perevertkin.mds.view.beans;

import java.io.IOException;

import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;

public class MdsBean {
    public MdsBean() {
    }

    public void logout(ActionEvent actionEvent) {
          FacesContext fctx = FacesContext.getCurrentInstance();
          ExternalContext ectx = fctx.getExternalContext();
          String url = ectx.getRequestContextPath() + 
                     "/adfAuthentication?logout=true&end_url=/faces/index.jspx";     
          try {
            ectx.redirect(url);
          } catch (IOException e) {
            e.printStackTrace();
          }
          fctx.responseComplete();
    }
}
