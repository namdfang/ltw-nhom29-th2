package com.nhom29.th2.controller;

import com.nhom29.th2.data.product;
import com.nhom29.th2.data.productIO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;


import java.sql.SQLException;
import java.util.List;

@Controller
public class productController {

    @GetMapping("/products")
    public String products(Model model) throws SQLException {
        List<product> list = productIO.getAllProduct();
        model.addAttribute("products", list);
        return "products";
    }

    @GetMapping("/addProduct")
    public String loadAddPage() {
        return "addProduct";
    }

//    @PostMapping("/add-product")
//    public String addProduct() {
//        
//        return "redirect:/products";
//    }

}
