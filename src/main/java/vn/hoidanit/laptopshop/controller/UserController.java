package vn.hoidanit.laptopshop.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import vn.hoidanit.laptopshop.domain.User;
import vn.hoidanit.laptopshop.service.UserService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping("/")
    public String getHomePage(Model model) {
        List<User> arrUsers = this.userService.getAllUserByEmail("lequoctrunggg@gmail.com");
        System.out.println(arrUsers);
        model.addAttribute("eric", "test"); // khi sd model là đang dùng dlieu với Spring
        model.addAttribute("hoidanit", "from controller with model");
        return "hello";
    }

    @RequestMapping("/admin/user/create")
    public String createNewUserPage(Model model) {
        model.addAttribute("newUser", new User());
        return "admin/user/create";
    }

    @RequestMapping(value = "/admin/user/create", method = RequestMethod.POST)
    public String createUserPage(Model model, @ModelAttribute("newUser") User data) {
        System.out.println("run here" + data);
        this.userService.handleSaveUser(data);
        return "redirect:/admin/user";
    }

    @RequestMapping("/admin/user")
    public String getUserPage(Model model) {
        List<User> users = this.userService.getAllUsers();
        model.addAttribute("user1", users);
        return "admin/user/table_user";
    }

    @RequestMapping("/admin/user/{id_User}")
    public String getUserDetailPage(Model model, @PathVariable long id_User) {
        User user = this.userService.getUserById(id_User);
        model.addAttribute("user", user);
        return "admin/user/show_user";
    }

    @RequestMapping("/admin/user/update/{id_User}")
    public String getUserUpdatePage(Model model, @PathVariable long id_User) {
        User currentUser = this.userService.getUserById(id_User);
        model.addAttribute("newUser", currentUser);
        return "admin/user/update_user";
    }

    @RequestMapping(value = "/admin/user/update", method = RequestMethod.POST)
    public String postUpdateUser(Model model, @ModelAttribute("newUser") User dataUpdate) {
        User currentUser = this.userService.getUserById(dataUpdate.getId());
        if (currentUser != null) {
            currentUser.setName(dataUpdate.getName());
            currentUser.setAddress(dataUpdate.getAddress());
            currentUser.setPhone(dataUpdate.getPhone());
            this.userService.handleSaveUser(currentUser);
        }
        return "redirect:/admin/user";
    }

}
