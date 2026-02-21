package com.market.bean;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Date;

@Entity
@Table(name="STALL_BOOKING_TBL")
public class StallBookingBean {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)   // ✅ AUTO ID
    @Column(name="BOOKING_ID")
    private int bookingID;

    @Column(name="VENDOR_ID")
    private String vendorID;

    @Column(name="MARKET_DATE")
    private Date marketDate;

    @Column(name="STALL_NO")
    private String stallNo;

    private String zone;

    @Column(name="TIME_SLOT")
    private String timeSlot;

    @Column(name="BOOKING_DATE")
    private Date bookingDate;

    @Column(name="STALL_FEE")
    private BigDecimal stallFee;

    @Column(name="PAYMENT_STATUS")
    private String paymentStatus;

    @Column(name="BOOKING_STATUS")
    private String bookingStatus;

    @Column(name="TOTAL_SALES_VALUE")
    private BigDecimal totalSalesValue;

    @Column(name="SALES_NOTES")
    private String salesNotes;

    // ======= GETTERS AND SETTERS =======

    public int getBookingID() {
        return bookingID;
    }

    public void setBookingID(int bookingID) {
        this.bookingID = bookingID;
    }

    public String getVendorID() {
        return vendorID;
    }

    public void setVendorID(String vendorID) {
        this.vendorID = vendorID;
    }

    public Date getMarketDate() {
        return marketDate;
    }

    public void setMarketDate(Date marketDate) {
        this.marketDate = marketDate;
    }

    public String getStallNo() {
        return stallNo;
    }

    public void setStallNo(String stallNo) {
        this.stallNo = stallNo;
    }

    public String getZone() {
        return zone;
    }

    public void setZone(String zone) {
        this.zone = zone;
    }

    public String getTimeSlot() {
        return timeSlot;
    }

    public void setTimeSlot(String timeSlot) {
        this.timeSlot = timeSlot;
    }

    public Date getBookingDate() {
        return bookingDate;
    }

    public void setBookingDate(Date bookingDate) {
        this.bookingDate = bookingDate;
    }

    public BigDecimal getStallFee() {
        return stallFee;
    }

    public void setStallFee(BigDecimal stallFee) {
        this.stallFee = stallFee;
    }

    public String getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(String paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    public String getBookingStatus() {
        return bookingStatus;
    }

    public void setBookingStatus(String bookingStatus) {
        this.bookingStatus = bookingStatus;
    }

    public BigDecimal getTotalSalesValue() {
        return totalSalesValue;
    }

    public void setTotalSalesValue(BigDecimal totalSalesValue) {
        this.totalSalesValue = totalSalesValue;
    }

    public String getSalesNotes() {
        return salesNotes;
    }

    public void setSalesNotes(String salesNotes) {
        this.salesNotes = salesNotes;
    }
}