package Exam;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Visit extends Customer{
    private Customer customer;
    Date date;
    private double serviceExpense;
    private double productExpense;

    public Visit(Customer customer, Date date) {
        this.customer = customer;
        this.date = new Date();

    }

    public String getName() {
        return customer.getName();
    }

    public double getServiceExpense() {
        return serviceExpense;
    }

    public void setServiceExpense(double serviceExpense) {
        this.serviceExpense = this.serviceExpense + serviceExpense;
    }

    public double getProductExpense() {
        return productExpense;
    }

    public void setProductExpense(double productExpense) {
        this.productExpense = this.productExpense + productExpense;
    }

    public double getTotalExpense() {
        return  (serviceExpense - (serviceExpense * DiscountRate.getServiceDiscountRate(customer.getMemberType()))) +
                (productExpense - (productExpense * DiscountRate.getProductDiscountRate(customer.getMemberType())));

    }

    @Override
    public String toString() {
        return "Visit{" +
                "customer name=" + customer.getName() +
                ", customer member=" + customer.isMember() +
                ", customer member type=" + customer.getMemberType() +
                ", date=" + date +
                ", serviceExpense=" + serviceExpense +
                ", productExpense=" + productExpense +
                '}';
    }

    public static void main(String[] args) {
        Customer customer = new Customer("Murodali",true,null);

        Visit visit = new Visit(customer, new Date());
        System.out.println(visit);
    }
}
