package ru.Umarov.dz25;

import java.util.*;

public class Shop implements Bascket {
    Map<String, Integer> map = new HashMap<>();

    @Override
    public void addProduct(String product, int quantity) {
        map.put(product, quantity);
    }

    @Override
    public void removeProduct(String product) {
        map.remove(product);
        getProducts();
    }

    @Override
    public void updateProductQuantity(String product, int quantity) {
        map.replace(product,quantity);
                getProductQuantity("Кол-во");
    }

    @Override
    public void clear() {
        map.clear();
        getProducts();
    }

    @Override
    public List<String> getProducts() {
        var getProd = new ArrayList<>(map.keySet());
        for (String s : getProd) {
            System.out.println(s);
        }
        System.out.println("-------------------------");
        return getProd;
    }

    @Override
    public ArrayList<Integer> getProductQuantity(String product) {
        var quantitySet = new ArrayList<>(map.values());
        for (Integer integer : quantitySet) {
            System.out.println(integer);
        }
        System.out.println("===================");
        return quantitySet;
    }
}
