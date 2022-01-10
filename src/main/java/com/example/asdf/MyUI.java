package com.example.asdf;

import javax.servlet.annotation.WebServlet;

import com.vaadin.annotations.Theme;
import com.vaadin.annotations.VaadinServletConfiguration;
import com.vaadin.server.VaadinRequest;
import com.vaadin.server.VaadinServlet;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.Button;
import com.vaadin.ui.Label;
import com.vaadin.ui.TextArea;
import com.vaadin.ui.TextField;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;

/**
 * This UI is the application entry point. A UI may either represent a browser window 
 * (or tab) or some part of an HTML page where a Vaadin application is embedded.
 * <p>
 * The UI is initialized using {@link #init(VaadinRequest)}. This method is intended to be 
 * overridden to add component to the user interface and initialize non-component functionality.
 */
@Theme("mytheme")
public class MyUI extends UI {

    @Override
    protected void init(VaadinRequest vaadinRequest) {
        final VerticalLayout layout = new VerticalLayout();
        
        Label label = new Label("Korean to Vietnamese Phonetic Translator");
        label.setStyleName("myonestyle myotherstyle");
        
        TextArea area1 = new TextArea("Input Korean Text:");
        area1.setWordWrap(true); // The default
        area1.setWidthFull();
        area1.setHeightFull();
        area1.setValue("감사합니다");
        
        TextArea area2 = new TextArea("Vietnamese Text Output:");
        area2.setWordWrap(true); // The default
        area2.setWidthFull();
        area2.setHeightFull();
        area2.setValue("gam sa hab ni ta");

        Button button = new Button("Translate");
        button.addClickListener(e -> {
            area2.setValue(Koreaboo.translate(area1.getValue()));
        });
        

        layout.addComponents(label, area1, button, area2);
        layout.setComponentAlignment(button, Alignment.MIDDLE_CENTER);
        layout.setComponentAlignment(label, Alignment.MIDDLE_CENTER);
        layout.setHeightFull();
        layout.setExpandRatio(area1, 1);
        layout.setExpandRatio(area2, 1);

        
        setContent(layout);
    }

    @WebServlet(urlPatterns = "/*", name = "MyUIServlet", asyncSupported = true)
    @VaadinServletConfiguration(ui = MyUI.class, productionMode = false)
    public static class MyUIServlet extends VaadinServlet {
    }
}
