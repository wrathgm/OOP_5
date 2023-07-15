package app.utils;

import app.model.TreeModel;

public interface FileHandler {
    void saveToFile(TreeModel tree, String fileName);

    TreeModel loadFromFile(String fileName);
}
