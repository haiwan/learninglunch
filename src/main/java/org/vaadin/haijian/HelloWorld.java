package org.vaadin.haijian;

import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.polymertemplate.EventHandler;
import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.HtmlImport;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * A Designer generated component for the hello-world.html template.
 * <p>
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("hello-world")
@HtmlImport("src/hello-world.html")
public class HelloWorld extends PolymerTemplate<HelloWorld.HelloWorldModel> {

    /**
     * Creates a new HelloWorld.
     */
    public HelloWorld() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between HelloWorld and hello-world.html
     */
    public interface HelloWorldModel extends TemplateModel {
        // Add setters and getters for template properties here.
        int getCount();

        void setCount(int count);
    }

    @EventHandler
    private void sayHello() {
        getModel().setCount(getModel().getCount()+1);
        LoggerFactory.getLogger(HelloWorld.class).info("I'm server, and I got notified");
        //UI.getCurrent().getPage().executeJavaScript(String.format("alert(%d)", getModel().getCount()));
        getElement().callFunction("showMessage", getModel().getCount());
    }
}
