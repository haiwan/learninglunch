package org.vaadin.haijian;

import com.vaadin.flow.component.*;
import com.vaadin.flow.shared.Registration;
import com.vaadin.flow.templatemodel.TemplateModel;
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
        ComponentUtil.addListener(this, ExtensiveClickEvent.class, extensiveClick -> {
            handleExtensiveClicks(extensiveClick.getCount()*2);
        });

    }

    private void handleExtensiveClicks(int count) {
        getLogger().info(String.format("User clicked %d times", count));
        getElement().callFunction("showMessage", "That's enough, please stop");
    }

    /**
     * This model binds properties between HelloWorld and hello-world.html
     */
    public interface HelloWorldModel extends TemplateModel {
        // Add setters and getters for template properties here.

    }

    private Logger getLogger() {
        return LoggerFactory.getLogger(HelloWorld.class);
    }

    @ClientCallable
    private void extensiveClicks(int count){
        handleExtensiveClicks(count);
    }

    Registration addExtensiveClickListener(ComponentEventListener<ExtensiveClickEvent> listener){
        return ComponentUtil.addListener(this, ExtensiveClickEvent.class, listener);
    }
}
