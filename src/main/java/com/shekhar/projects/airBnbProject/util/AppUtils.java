package com.shekhar.projects.airBnbProject.util;


import com.shekhar.projects.airBnbProject.Entity.User;
import org.springframework.security.core.context.SecurityContextHolder;

public class AppUtils {

    public static User getCurrentUser() {
        return (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
    }
}
