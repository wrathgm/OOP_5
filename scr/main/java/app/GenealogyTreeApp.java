package app;

import app.utils.FileHandler;
import app.utils.FileHandlerImpl;

public class GenealogyTreeApp {
    public static void main(String[] args) {
        FileHandler fileHandler = new FileHandlerImpl();
        Application app = new Application(fileHandler);
        app.run();
    }
}
