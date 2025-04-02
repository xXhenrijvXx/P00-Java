import java.util.*;

public class Main {
    public static void main(String[]args){
        var list1 = new ArrayList<Integer>();
        //var list2 = new ArrayList<String>();

        list1.add(1);
        list1.add(2);
        list1.add(2);
        list1.add(1);

        //list1.remove(2);
        //list1.clear();

        System.out.println("SIZE: " + list1.size());

        var elemento = obterPrimeiroElemento(list1);

        System.out.println(elemento);
        list1.forEach(value ->{
            System.out.println(value);
        });


    }
    private static <T> T obterPrimeiroElemento(List<T> lista){
        if(lista == null || lista.isEmpty()){
            throw new NoSuchElementException("Lista  está vazia");
        }
        return lista.get(0);
    }
}
