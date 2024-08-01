package vn.hoidanit.laptopshop.controller.admin;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import vn.hoidanit.laptopshop.domain.Products;

@Controller
public class ProductController {
    @GetMapping("/admin/product")
    public String getProduct() {
        return "admin/product/show";
    }

    @RequestMapping("/admin/product/create")
    public String createNewUserPage(Model model) {
        model.addAttribute("newProduct", new Products());
        return "admin/product/create";
    }
}
