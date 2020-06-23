package com.flamexander.cloud.client.feign;

import com.flamexander.cloud.client.Role;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@FeignClient("geek-spring-cloud-eureka-client")
public interface RoleClient {
    @RequestMapping("/role")
    List<Role> role();
}
