package vn.hoidanit.laptopshop.controller.client;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class ItemPageController {
    @GetMapping("/product")
    public String getHomePage() {
        return "/client/product/detail";
    }
    // @GetMapping("/product/{id}") để không lỗi hình ảnh nên để như này
    // Model model, @PathVariable long id
}
