package com.todo.dao.impl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

/**
 * Created by Administrator on 2017/5/18.
 */
public class BaseDao extends HibernateDaoSupport {

    @Autowired
    public void setSessionLocalFactory(SessionFactory sessionFactory) {
        super.setSessionFactory(sessionFactory);
    }

    /**
     * 新增实体对象
     * @param object
     */
    public void saveEntity(Object object) {
        Session session = this.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.save(object);
        transaction.commit();
        session.close();
    }

    /**
     * 更新实体
     * @param object
     */
    public void updateEntity(Object object) {
        Session session = this.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.update(object);
        transaction.commit();
        session.close();
    }

    /**
     * 删除实体
     * @param object
     */
    public void deleteEntity(Object object) {
        Session session = this.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.delete(object);
        transaction.commit();
        session.close();
    }
}
