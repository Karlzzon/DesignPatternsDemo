package Composite;

import java.util.ArrayList;
import java.util.List;

public class Folder implements SystemComponent {
    private String name;
    private List<SystemComponent> children;

    public Folder(String name) {
        this.name = name;
        this.children = new ArrayList<>();
    }

    public void add(SystemComponent component) {
        children.add(component);
    }

    public void remove(SystemComponent component) {
        children.remove(component);
    }

    public void display() {
        System.out.println("Folder: " + name);
        for (SystemComponent component : children) {
            component.display();
        }
    }

}
