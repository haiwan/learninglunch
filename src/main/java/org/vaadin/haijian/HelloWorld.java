package org.vaadin.haijian;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.HtmlImport;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;

/**
 * A Designer generated component for the hello-world.html template.
 *
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
    }
}
