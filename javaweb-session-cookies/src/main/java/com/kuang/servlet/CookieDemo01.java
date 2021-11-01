package com.kuang.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

public class CookieDemo01 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        Cookie

        req.setCharacterEncoding("utf-8");
        resp.setCharacterEncoding("utf-8");

        PrintWriter out = resp.getWriter();

        Cookie[] cookies = req.getCookies();

        if(cookies!=null) {
            out.write("上一次访问的时间：");
            for (int i = 0; i < cookies.length; i++) {
                Cookie cookie = cookies[i];
                if(cookie.getName().equals("lastLoginTime")) {
                    String value = cookie.getValue();
                    long lastLoginTime = Long.parseLong(value);
                    Date date = new Date(lastLoginTime);
                    out.write(date.toLocaleString());

                }

            }
        } else {
            out.write("first times");
        }

        Cookie cookie = new Cookie("lastLoginTime", System.currentTimeMillis()+"");
        cookie.setMaxAge(24*60*60);
        resp.addCookie(cookie);

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
