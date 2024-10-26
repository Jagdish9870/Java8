package MethodAndConstructorReference;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Employees{
    private String name;
   
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Employees(String name) {
        this.name = name;
    }
    @Override
    public String toString() {
        return "Employees [name=" + name + "]";
    }

}

public class ConstructorReference {
    public static void main(String[] args) {

        List<String> names =Arrays.asList("jack","john","stim");
       List<Employees> employees= names.stream().map(Employees::new).collect(Collectors.toList());
       System.out.println(employees);

    }
    
}
