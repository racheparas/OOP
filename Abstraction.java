/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Rachelle
 */

    abstract class Item {
    protected String name;
    protected double price;

    public Item(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public abstract double CalculateTotalSales();
    public abstract String GetDetails();
}

class Phone extends Item {
    private int quantitysold;

    public Phone(String name, double price, int quantitysold) {
        super(name, price);
        this.quantitysold = quantitysold;
    }

    @Override
    public double CalculateTotalSales() {
        return price * quantitysold;
    }

    @Override
    public String GetDetails() {
        return name + " - Price: $" + price + " Quantity Sold: " + quantitysold;
    }
}

class Repair extends Item {
    private int HoursWorked;

    public Repair(String name, double price, int hoursWorked) {
        super(name, price);
        this.HoursWorked = hoursWorked;
    }

    @Override
    public double CalculateTotalSales() {
        return price * HoursWorked;
    }

    @Override
    public String GetDetails() {
        return name + " - Price: $" + price + " Hours Worked: " + HoursWorked;
    }
}

// Main class to test the implementation
public class Abstraction {
    public static void main(String[] args) {
        Phone phone = new Phone("Samsung", 500.0, 10);
       Repair repair = new Repair("Screen Fix", 50.0, 5);

        System.out.println(phone.GetDetails());
        System.out.println("Total Sales: ₱" + phone.CalculateTotalSales());

        System.out.println(repair.GetDetails());
        System.out.println("Total Sales: ₱" + repair.CalculateTotalSales());
    }
} 