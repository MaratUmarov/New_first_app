package ru.Umarov.dz25;

import java.util.ArrayList;
import java.util.List;

public interface Bascket {
    void addProduct(String product, int quantity);

    void removeProduct(String product);

    void updateProductQuantity(String product, int quantity);

    void clear();

    List<String> getProducts();

    ArrayList<Integer> getProductQuantity(String product);
}

