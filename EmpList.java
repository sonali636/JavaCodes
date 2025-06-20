// File: EmpList.java
package code;

import java.util.ArrayList;

public class EmpList {
    public static void main(String[] args) {
        ArrayList<Emp> empList = new ArrayList<>();

        Emp em1 = new Emp(1, "Jon", "Sales", 200000);
        Emp em2 = new Emp(2, "Tom", "IT", 200000);
        Emp em3 = new Emp(3, "Jerry", "Management", 200000);
        Emp em4 = new Emp(4, "Raj", "Marketing", 200000);
        Emp em5 = new Emp(5, "Dav", "Finance", 200000);
        Emp em6 = new Emp(6, "Sunny", "Legal", 200000);

        empList.add(em1);
        empList.add(em2);
        empList.add(em3);
        empList.add(em4);
        empList.add(em5);
        empList.add(em6);

        for (Emp emp : empList) {
            System.out.println(emp);
        }
    }
}
