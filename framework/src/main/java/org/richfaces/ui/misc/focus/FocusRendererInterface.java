package org.richfaces.ui.misc.focus;

import javax.faces.context.FacesContext;

public interface FocusRendererInterface {
    void postAddToView(FacesContext context, AbstractFocus component);
}
