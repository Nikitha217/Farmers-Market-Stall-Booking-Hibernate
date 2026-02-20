# 🌾 Local Farmers' Market Console Application (Hibernate)

A Java console-based application developed using **Hibernate ORM** to manage vendors, stall bookings, and sales summaries in a local farmers' market.

This project demonstrates:
- Object-Oriented Programming (OOP)
- Hibernate ORM
- Layered Architecture (Entity, DAO, Service)
- Console-based user interaction

---

## 🚀 Features

- Vendor Registration  
- Stall Booking  
- Sales Summary Entry  
- View Booking List  
- View Vendor List  
- Booking Conflict Detection (prevents double booking of stalls)

---

## 🏗 Project Structure

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

## ⚙ Technologies Used

* Java
* Hibernate ORM
* Oracle Database
* Maven
* Eclipse IDE

---

## 🗄 Database Tables

* Vendor
* StallBooking
* SalesSummary

---

## ▶ How to Run

1. Clone or download the project.
2. Open the project in Eclipse / IntelliJ IDE.
3. Configure database details in `hibernate.cfg.xml`.
4. Create the required tables in the database.
5. Run `MarketMain.java`.
6. Use the console menu to perform operations.

---

## 📚 Learning Outcomes

* Hibernate CRUD operations
* Entity mapping using annotations
* SessionFactory and Transactions
* Layered architecture (Entity → DAO → Service → Main)
* Console-based Java application design

---

## 🧾 Output

### 🔹 View Vendor Details
<img src="PASTE_YOUR_FIRST_SCREENSHOT_LINK_HERE" width="650"/>

<br>

---

### 🔹 Stall Booking & Sales Summary
<img width="1532" height="787" alt="image" src="https://github.com/user-attachments/assets/ac7cb36b-dab0-4eaa-9cdd-78024a79bcbf" />

---
## Student Details

* Name: Nikitha S
* Roll No: 717823P136

---

