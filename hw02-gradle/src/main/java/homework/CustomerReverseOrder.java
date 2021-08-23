package homework;


import java.util.*;

public class CustomerReverseOrder {

    //todo: 2. надо реализовать методы этого класса
    //надо подобрать подходящую структуру данных, тогда решение будет в "две строчки"
    public LinkedHashMap<Customer, String> map = new LinkedHashMap<>();

    public void add(Customer customer) {
        map.put(customer, "data");
    }

    public Customer take() {
        ArrayDeque<Customer> listKeys = new ArrayDeque<>(map.keySet());
        Customer res= listKeys.getLast();
        map.remove(res);
        return res;
    }
}
