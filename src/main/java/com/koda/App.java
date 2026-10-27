package com.koda;

public class App {
    public static void main(String[] args) {
        System.out.println("=============================");
        System.out.println("        KODA ENTERPRISE      ");
        System.out.println("=============================");

        Employee permanetEmployee = new PermanentEmployee("EMP001", "Andi Pratama", "Backend Developer", "IT", 5000000);
        EmployeeService permanentService = new EmployeeService(permanetEmployee);

        System.out.println();
        System.out.println("Permanent Employee");
        permanentService.showEmployee();
        permanentService.giveRaise(1000000);
        System.out.println();
        System.out.println("=========================================");

        Employee contractEmployee = new ContractEmployee("EMP002", "Budi Santoso", "Frontend Developer", "IT", 5000000);
        EmployeeService contractService = new EmployeeService(contractEmployee);

        System.out.println();
        System.out.println("Contract Employee");
        contractService.showEmployee();
        contractService.giveRaise(300000);

        System.out.println();
        contractService.giveRaise(1000000);

        System.out.println();
        contractService.giveRaise(-500000);
        System.out.println();
        System.out.println("=========================================");

        // PhysicalProduct keyboard = new PhysicalProduct("PHY-001", "keyboard", 500000,
        // 10);

        // DigitalProduct ebook = new DigitalProduct("DIG-001", "ebook", 50000);

        // keyboard.showInfo();
        // keyboard.addStock(5);
        // System.out.println();
        // ebook.showInfo();
        // // Stock tidak akan di update karena class DigitalProduct tidak memiliki
        // atribut
        // // stock, walaupun sudah mewarisi dari parent
        // ebook.addStock(3);

    }
}
