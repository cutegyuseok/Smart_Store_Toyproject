package Customer_Data;

public class Customer {
    private static int customerNum= 0;
    private int serialNO;
    private String customerName;
    private String customerID;
    private int customerSpentTime;
    private int customerPayment;

    public Customer(){};


    public Customer(String customerName, String customerID, int customerSpentTime, int customerPayment){
        this.customerName = customerName;
        this.customerID = customerID;
        this.customerSpentTime = customerSpentTime;
        this.customerPayment = customerPayment;
        customerNum++;
        serialNO = customerNum;
    }

    public String getCustomerName() {
        return customerName;
    }
    public int getCustomerNameByCharToSmall(){
        if (customerName==null) {
            return 0;
        }else {
            int i = (int) customerName.charAt(0);
            if (i < 97) {
                i += 32;
            }
            return i;
        }
    }
    public int getCustomerNameByCharToOrigin(){
        if (customerName==null){
            return 0;
        }else {
            return (int) customerName.charAt(0);
        }
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerID() {
        return customerID;
    }

    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }

    public int getCustomerSpentTime() {
        return customerSpentTime;
    }
    public Integer getCustomerSpentTimeAsInteger(){ return this.customerSpentTime; }

    public void setCustomerSpentTime(int customerSpentTime) {
        this.customerSpentTime = customerSpentTime;
    }

    public int getCustomerPayment() {
        return customerPayment;
    }
    public Integer getCustomerPaymentAsInteger(){ return this.customerPayment; }


    public void setCustomerPayment(int customerPayment) {
        this.customerPayment = customerPayment;
    }

    public int getSerialNO() {
        return serialNO;
    }
    public String showCustomerInfo(){
        String info = "serialNO:"+serialNO+", ?????? ??????: "+customerName+", ?????? ?????????: "+customerID+", ?????? ?????? ??????: "+customerSpentTime+"??????, ?????? ?????? ??????: "
                +customerPayment+"??? ?????????.";
        return info;
    }



}
