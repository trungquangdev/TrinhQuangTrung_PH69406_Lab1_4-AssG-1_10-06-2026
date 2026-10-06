package com.example.repository;

import com.example.entity.ChiTietSp;
import com.example.util.Hibernate;
import org.hibernate.Session;

import java.util.List;

public class ChiTietSpRepository {
    private static Object ChiTietSp;
    public List<ChiTietSp>getAll(){
        try(Session s = Hibernate.getFactory().openSession()){
            return s.createQuery("from ChiTietSp ",ChiTietSp.class).list();
        }
    }

    public static void main(String[] args) {
        System.out.println("aaaaaa");
    }
}
