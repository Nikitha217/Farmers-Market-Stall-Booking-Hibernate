package com.market.app;

import com.market.bean.VendorBean;
import com.market.service.MarketService;
import com.market.util.*;

import java.math.BigDecimal;
import java.sql.Date;
import java.util.Scanner;

public class MarketMain {

    private static MarketService service = new MarketService();

    public static void main(String[] args) {
    	System.setProperty("org.jboss.logging.provider", "jdk");

    	java.util.logging.Logger.getLogger("org.hibernate")

    	        .setLevel(java.util.logging.Level.SEVERE);

        Scanner sc = new Scanner(System.in);
        System.out.println("Local Farmers' Market Console");

        try {
            System.out.print("Enter Vendor ID to View Details: ");
            String vendorId = sc.nextLine();

            VendorBean v = service.viewVendorDetails(vendorId);

            if (v != null) {
                System.out.println("Vendor Details:");
                System.out.println(v.getVendorID() + " | " +
                                   v.getVendorName() + " | " +
                                   v.getProductCategory() + " | " +
                                   v.getStatus());
            } else {
                System.out.println("Vendor not found");
            }
            System.out.println("\nStall Booking");

            System.out.print("Enter Vendor ID: ");
            String bookVendorId = sc.nextLine();

            System.out.print("Enter Market Date (yyyy-mm-dd): ");
            Date marketDate = Date.valueOf(sc.nextLine());

            System.out.print("Enter Stall No: ");
            String stallNo = sc.nextLine();

            System.out.print("Enter Location: ");
            String location = sc.nextLine();

            System.out.print("Enter Slot (FULL_DAY / HALF_DAY): ");
            String slot = sc.nextLine();

            Date bookingDate = new Date(System.currentTimeMillis());

            System.out.print("Enter Booking Amount: ");
            BigDecimal amount = new BigDecimal(sc.nextLine());

            System.out.print("Enter Payment Status (PAID / PENDING): ");
            String paymentStatus = sc.nextLine();

            boolean ok = service.bookStall(bookVendorId,marketDate,stallNo,location,slot,bookingDate,amount,paymentStatus);
            System.out.println(ok ? "STALL BOOKED SUCCESSFULLY" : "STALL BOOKING FAILED");
            System.out.println("\nRecord Sales Summary");

            System.out.print("Enter Booking ID: ");
            int bookingId = Integer.parseInt(sc.nextLine());

            System.out.print("Enter Total Sales Amount: ");
            BigDecimal totalSales = new BigDecimal(sc.nextLine());

            System.out.print("Enter Remarks: ");
            String remarks = sc.nextLine();

            service.recordSalesSummary(bookingId, totalSales, remarks);
            System.out.println("SALES SUMMARY UPDATED");
            System.out.println("\nView Bookings by Vendor");

            System.out.print("Enter Vendor ID: ");
            String listVendorId = sc.nextLine();

            service.listBookingsByVendor(listVendorId)
                   .forEach(b -> System.out.println(
                           b.getBookingID() + " | " +
                           b.getStallNo() + " | " +
                           b.getBookingStatus()
                   ));

        } catch (BookingConflictException e) {
            System.out.println("Booking Conflict: Stall already booked");
        } catch (ValidationException e) {
            System.out.println("Validation Error (Vendor inactive / invalid)");
        } catch (Exception e) {
            System.out.println("System Error: " + e.getMessage());
        }

        sc.close();
    }
}