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
        List<Customer> listKeys = new ArrayList<>(map.keySet());
        ListIterator<Customer> iterator = listKeys.listIterator(listKeys.size());
        Customer res = iterator.previous();
        map.remove(res);
        return res;
    }
}
