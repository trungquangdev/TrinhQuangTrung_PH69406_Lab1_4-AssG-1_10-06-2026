package com.example.controller;

import com.example.entity.ChiTietSp;
import com.example.repository.ChiTietSpRepository;
import com.example.util.Hibernate;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.hibernate.Session;

import java.io.IOException;

@WebServlet(urlPatterns = {
        "/chi-tiet-sp"
})
public class ChiTietSpController extends HttpServlet {

    ChiTietSpRepository ctr = new ChiTietSpRepository();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try(Session s = Hibernate.getFactory().openSession()){
            String uri = req.getRequestURI();
            if (uri.contains("/chi-tiet-sp")) {
                this.showCtSp(req, resp);
            }
        }
    }

    private void showCtSp(HttpServletRequest req, HttpServletResponse resp) throws IOException,ServletException {
        req.setAttribute("dssp", ctr.getAll());
        req.getRequestDispatcher("/chitietsp.jsp").forward(req,resp);
    }

}
