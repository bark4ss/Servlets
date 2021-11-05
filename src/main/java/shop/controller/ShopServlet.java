package shop.controller;

import shop.model.Product;
import shop.service.FileProductReader;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/all")
public class ShopServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Product> result = new FileProductReader().getProducts("products.txt");
        req.setAttribute("products",result);
        getServletContext().getRequestDispatcher("/jsp/shop/all.jsp").forward(req,resp);
    }
}
