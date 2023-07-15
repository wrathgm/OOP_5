package app.presenter;

import app.model.Person;

public interface TreePresenter {
    void addPerson(Person person);

    void getChildren(Person person);
    // Другие методы презентера
}
