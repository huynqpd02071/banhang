package modal;
// Generated Feb 27, 2018 1:00:25 PM by Hibernate Tools 4.3.1


import java.util.Date;


/**
 * Bill generated by hbm2java
 */
public class Bill   {

   

    public Bill() {
    }

    public Bill(Integer billId, Khachhang khachhang, double total, String payment, String address, String date) {
        this.billId = billId;
        this.khachhang = khachhang;
        this.total = total;
        this.payment = payment;
        this.address = address;
        this.date = date;
    }

    public Integer getBillId() {
        return billId;
    }

    public void setBillId(Integer billId) {
        this.billId = billId;
    }

    public Khachhang getKhachhang() {
        return khachhang;
    }

    public void setKhachhang(Khachhang khachhang) {
        this.khachhang = khachhang;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public String getPayment() {
        return payment;
    }

    public void setPayment(String payment) {
        this.payment = payment;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }


     private Integer billId;
     private Khachhang khachhang;
     private double total;
     private String payment;
     private String address;
     private String date;


   


}

