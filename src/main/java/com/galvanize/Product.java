package com.galvanize;

import java.text.DecimalFormat;

import static java.lang.String.valueOf;

class Product {
    Product(String name, int valueInCents) {
        this.name = name;
        this.valueInCents = valueInCents;
    }

    private String name;
    private int valueInCents;

    public String getName() {
        return name;
    }

    public int getValueInCents() {
        return valueInCents;
    }

    public Currency getCurrency(){
        return new Currency(this);
    }

    //declare your class here
    static class Currency{
        private Product product;

        public Currency(Product product){
            this.product = product;
        }

        public String getUSD(){
            float d = (float) product.getValueInCents() / 100;
            return "$" + String.format("%.2f", d);
        }

    }
}