package com.survey.survey.auth.infrastructure.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.survey.survey.auth.application.services.IRoleService;
import com.survey.survey.auth.domain.entities.Role;

@RestController
@RequestMapping("/role")
public class RoleController {

    @Autowired
    private IRoleService iRoleService;

    @GetMapping
    public List<Role> listRoles(){
        return iRoleService.getAll();
    }

    @GetMapping("/{id}")
    public Optional<Role> showRole(@PathVariable Long id){
        return iRoleService.findById(id);
    }
}
