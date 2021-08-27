package com.training.org;

public class Customer {
    private int custId;
    private  String custName;
    private String custAddress;
    private int custMobileNo;

    public Customer()
    {

    }

    public Customer(int custId, String custName, String custAddress, int custMobileNo) {
        this.custId = custId;
        this.custName = custName;
        this.custAddress = custAddress;
        this.custMobileNo = custMobileNo;
    }
    public void showCustomerDetails()
    {
        System.out.println("customer_id "+custId+" customer_name "+custName +" customer_address "+custAddress +" customer_no "+ custMobileNo);
    }

    public static void main(String[] args) {
        Customer c1=new Customer();
        c1.showCustomerDetails();
        Customer c2=new Customer(123,"alok","bangalore",567476);
        c2.showCustomerDetails();
    }
}
