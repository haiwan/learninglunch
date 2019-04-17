package org.vaadin.haijian;

import com.vaadin.flow.component.ComponentEvent;
import com.vaadin.flow.component.DomEvent;
import com.vaadin.flow.component.EventData;

@DomEvent("extensive-click")
public class ExtensiveClickEvent extends ComponentEvent<HelloWorld> {
    private int count;
    public ExtensiveClickEvent(HelloWorld source, boolean fromClient, @EventData("event.detail.count") int count) {
        super(source, fromClient);
        this.count = count;
    }

    public int getCount() {
        return count;
    }


}
