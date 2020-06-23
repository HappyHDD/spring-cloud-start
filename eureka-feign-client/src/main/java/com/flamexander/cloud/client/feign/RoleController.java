package com.flamexander.cloud.client.feign;

import com.flamexander.cloud.client.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class RoleController {
    private RoleClient roleClient;

    @Autowired
    public void setRoleClient(RoleClient roleClient) {
        this.roleClient = roleClient;
    }

    @RequestMapping("/get-role")
    public String greeting(Model model) {
        List<Role> roles = roleClient.role();
        model.addAttribute("roles" , roles);
        return "greeting-view";
    }
}
