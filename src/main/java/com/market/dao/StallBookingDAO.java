package com.market.dao;

import com.market.bean.StallBookingBean;
import com.market.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.math.BigDecimal;
import java.sql.Date;
import java.util.List;

public class StallBookingDAO {

    public int generateBookingID() {

        Session session = HibernateUtil.getSessionFactory().openSession();

        Integer maxId = (Integer) session.createQuery(
                "select max(bookingID) from StallBookingBean")
                .uniqueResult();

        session.close();

        return (maxId == null ? 880000 : maxId) + 1;
    }

    public boolean isStallAlreadyBooked(Date date, String stallNo, String slot) {

        Session session = HibernateUtil.getSessionFactory().openSession();

        Long count = (Long) session.createQuery(
                "select count(*) from StallBookingBean where marketDate=:d and stallNo=:s and timeSlot=:t")
                .setParameter("d", date)
                .setParameter("s", stallNo)
                .setParameter("t", slot)
                .uniqueResult();

        session.close();

        return count > 0;
    }

    public boolean insertBooking(StallBookingBean b) {

        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();

        session.save(b);

        tx.commit();
        session.close();
        return true;
    }

    public void updateSalesSummary(int id, BigDecimal sales, String notes, String status) {

        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();

        StallBookingBean b = session.get(StallBookingBean.class, id);
        if (b != null) {
            b.setTotalSalesValue(sales);
            b.setSalesNotes(notes);
            b.setBookingStatus(status);
            session.update(b);
        }

        tx.commit();
        session.close();
    }

    public List<StallBookingBean> findBookingsByVendor(String vendorID) {

        Session session = HibernateUtil.getSessionFactory().openSession();

        List<StallBookingBean> list = session.createQuery(
                "from StallBookingBean where vendorID=:v",
                StallBookingBean.class)
                .setParameter("v", vendorID)
                .list();

        session.close();
        return list;
    }

    public boolean hasActiveOrFutureBookings(String vendorID, Date today) {

        Session session = HibernateUtil.getSessionFactory().openSession();

        Long count = (Long) session.createQuery(
                "select count(*) from StallBookingBean where vendorID=:v and marketDate>=:d")
                .setParameter("v", vendorID)
                .setParameter("d", today)
                .uniqueResult();

        session.close();
        return count > 0;
    }
}
