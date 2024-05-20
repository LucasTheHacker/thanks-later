package lucas.application;

import java.util.Date;

import lucas.entities.Department;
import lucas.entities.Seller;

public class Program {

    public static void main(String[] args) {
        
        Department department = new Department(1, "Livros");

        Seller seller = new Seller(1, "Fulana", "fulana@gmail.com", new Date(), 3700.00, department);

        System.out.println(department);

        System.out.println(seller);

    }

}
