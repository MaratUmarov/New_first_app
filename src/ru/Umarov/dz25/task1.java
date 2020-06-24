package ru.Umarov.dz25;
public class task1 {
    public static void main(String[] args) {
        Shop shop=new Shop();
        shop.addProduct("Кроссовки",2);
        shop.addProduct("Часы",3);
        shop.addProduct("JBL",1);
              shop.getProducts();
              shop.getProductQuantity("Товары");
              shop.updateProductQuantity("Кроссовки",3);
              shop.removeProduct("Часы");
              shop.clear();


    }
}
