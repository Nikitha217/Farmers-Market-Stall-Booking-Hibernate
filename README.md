# Local Farmers' Market Console Application (Hibernate)

A Java console-based application developed using **Hibernate ORM** to manage vendors, stall bookings, and sales summaries in a local farmers' market.

This project demonstrates:
- Object-Oriented Programming (OOP)
- Hibernate ORM
- Layered Architecture (Entity, DAO, Service)
- Console-based user interaction

---

## Features

- Vendor Registration  
- Stall Booking  
- Sales Summary Entry  
- View Booking List  
- View Vendor List  
- Booking Conflict Detection (prevents double booking of stalls)

---

## Project Structure

```plaintext
LocalFarmersMarketApplication
│
├── com.market.app
│   └── MarketMain.java
│
├── com.market.entity
│   ├── Vendor.java
│   ├── StallBooking.java
│   └── SalesSummary.java
│
├── com.market.dao
│   ├── VendorDAO.java
│   ├── StallBookingDAO.java
│   └── SalesSummaryDAO.java
│
├── com.market.service
│   ├── VendorService.java
│   ├── BookingService.java
│   └── SalesService.java
│
├── com.market.util
│   └── HibernateUtil.java
│
└── hibernate.cfg.xml
````

---

## Technologies Used

* Java
* Hibernate ORM
* Oracle Database
* Maven
* Eclipse IDE

---

## Database Tables

* Vendor
* StallBooking
* SalesSummary

---

## How to Run

1. Clone or download the project.
2. Open the project in Eclipse / IntelliJ IDE.
3. Configure database details in `hibernate.cfg.xml`.
4. Create the required tables in the database.
5. Run `MarketMain.java`.
6. Use the console menu to perform operations.

---

## Learning Outcomes

* Hibernate CRUD operations
* Entity mapping using annotations
* SessionFactory and Transactions
* Layered architecture (Entity → DAO → Service → Main)
* Console-based Java application design

---

## Output

### View Vendor Details
<img width="1720" height="161" alt="image" src="https://github.com/user-attachments/assets/b49351ad-768f-454e-b7f0-f2729449fb42" />


<br>

---

### Stall Booking
<img width="1718" height="298" alt="image" src="https://github.com/user-attachments/assets/cbc97d62-a556-4b9a-9dd2-ab9539eb86ae" />


<br>

---
## Sales Summary
<img width="1727" height="158" alt="image" src="https://github.com/user-attachments/assets/c60acb71-9334-4800-81f3-c8232bd2f7bd" />



---
## Student Details

* Name: Nikitha S
* Roll No: 717823P136

---

