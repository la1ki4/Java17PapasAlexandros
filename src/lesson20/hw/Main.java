package lesson20.hw;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Set<String> productsInShop = new HashSet<>();
        productsInShop.add("арбуз");
        productsInShop.add("банан");
        productsInShop.add("вишня");
        productsInShop.add("груша");
        productsInShop.add("дыня");
        productsInShop.add("ежевика");
        productsInShop.add("женьшень");
        productsInShop.add("земляника");
        productsInShop.add("ирис");
        productsInShop.add("картофель");
        productsInShop.add("арбуз");

        Collection<String> productsInFridge = new ArrayList<>(productsInShop);
        productsInFridge.add("дыня");
        productsInFridge.add("дыня");
        productsInFridge.add("ирис");
        productsInFridge = noDublicatesCollection(productsInFridge);
        System.out.println("Collection without duplicates: " + productsInFridge);
    }

    public static Collection<String> noDublicatesCollection(Collection<String> input){
        return new HashSet<>(input);
    }
}
