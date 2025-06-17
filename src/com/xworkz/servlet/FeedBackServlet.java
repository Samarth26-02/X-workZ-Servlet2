package com.xworkz.servlet;

import com.xworkz.dto.FeedBackDTO;
import com.xworkz.service.FeedBackService;
import com.xworkz.service.FeedBackServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/feedback",loadOnStartup = 1)
public class FeedBackServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException, IOException {
        String name = req.getParameter("name");
        String email = req.getParameter("email");
        String subject = req.getParameter("subject");
        String message = req.getParameter("message");
        String city = req.getParameter("city");
        String state = req.getParameter("state");
        int rating = Integer.parseInt(req.getParameter("rating"));
        boolean recommend = req.getParameter("recommend") != null;

        FeedBackDTO dto = new FeedBackDTO(name, email, subject, message, city, state, rating, recommend);
        System.out.println("dto:"+dto);

        FeedBackService feedBackService1=new FeedBackServiceImpl();
        feedBackService1.feedbackValidate(dto);


        }
    }

