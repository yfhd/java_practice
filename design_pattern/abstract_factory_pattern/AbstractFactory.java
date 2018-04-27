package abstract_factory_pattern;

import factory_pattern.*;

public abstract class AbstractFactory {
    abstract Color getColor(String color);
    abstract Shape getShape(String shape);
}
