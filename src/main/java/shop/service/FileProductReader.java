package shop.service;

import shop.model.Product;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class FileProductReader {

    public List<Product> getProducts(String fileName) {

        List<Product> result = new ArrayList<>();

        ClassLoader loader = getClass().getClassLoader();
        try(BufferedReader reader = new BufferedReader(new InputStreamReader(Objects.requireNonNull(loader.getResourceAsStream(fileName))))){
            String line = "";
            while ((line = reader.readLine())!=null) {
                String[] arr = line.split(" = ");
                result.add(new Product(arr[0], Double.parseDouble(arr[1])));
            }
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
        return result;
    }
}
