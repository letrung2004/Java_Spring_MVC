package vn.hoidanit.laptopshop.controller.admin;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import jakarta.validation.Valid;
import vn.hoidanit.laptopshop.domain.Products;
import vn.hoidanit.laptopshop.domain.User;
import vn.hoidanit.laptopshop.service.ProductService;
import vn.hoidanit.laptopshop.service.UploadService;

import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ProductController {
    private final ProductService productService;
    private final UploadService uploadService;

    public ProductController(ProductService productService, UploadService uploadService) {
        this.productService = productService;
        this.uploadService = uploadService;
    }

    @RequestMapping("/admin/product")
    public String getUserPage(Model model) {
        List<Products> products = this.productService.getAllProduct();
        model.addAttribute("product1", products);
        return "admin/product/show";
    }

    @RequestMapping(value = "/admin/product/create")
    public String createNewProductPage(Model model) {
        model.addAttribute("newProduct", new Products());
        return "admin/product/create";
    }

    @PostMapping("/admin/product/create")
    public String postMethodName(Model model, @ModelAttribute("newProduct") @Valid Products data,
            BindingResult newProductBindingResult,
            @RequestParam("productFile") MultipartFile file) {
        String imgProduct = this.uploadService.handleSaveUploadFile(file, "product");
        data.setProImage(imgProduct);

        // validate
        List<FieldError> errors = newProductBindingResult.getFieldErrors();
        for (FieldError error : errors) {
            System.out.println(error.getField() + " - " + error.getDefaultMessage());
        }
        // validate
        if (newProductBindingResult.hasErrors()) {
            return "admin/product/create";
        }

        System.out.println("run here" + data);
        this.productService.handleSaveProduct(data);
        return "redirect:/admin/product";
    }

}
