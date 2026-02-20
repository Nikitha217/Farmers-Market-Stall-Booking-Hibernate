package com.market.dao;

import com.market.bean.VendorBean;
import com.market.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class VendorDAO {

    public boolean insertVendor(VendorBean v) {

        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();

        session.save(v);

        tx.commit();
        session.close();
        return true;
    }

    public VendorBean findVendor(String vendorID) {

        Session session = HibernateUtil.getSessionFactory().openSession();
        VendorBean v = session.get(VendorBean.class, vendorID);
        session.close();

        return v;
    }

    public void deleteVendor(String vendorID) {

        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();

        VendorBean v = session.get(VendorBean.class, vendorID);
        if (v != null)
            session.delete(v);

        tx.commit();
        session.close();
    }
}
