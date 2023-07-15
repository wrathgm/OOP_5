package app.view;

import app.model.Person;

public interface TreeView {
    void display();

    void displayChildren(List<Person> children);
    // Другие методы представления
}
