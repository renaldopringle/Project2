package Project2;


/**
 * Write a description of class Bank here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bank extends Organization
{
    private int numCustomer;
    private int numEmployee;
    private double assetValue;
    
    public Bank(int regNum, String name, String type, int numCustomer, int numEmployee, double assetValue) 
    {
        super(regNum,name,type);
        this.numCustomer = numCustomer;
        this.numEmployee = numEmployee;
        this.assetValue = assetValue;
    }
    
    public String toString() {
        return (super.toString() + "\nNumber of customers: " + numCustomer + "\nNumber of employee: " + numEmployee + "\nAsset value: " + assetValue + getBranches());
    }
}
