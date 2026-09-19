package com.task_service.task_service.controller;

import com.task_service.task_service.dto.RoleDTO;
import com.task_service.task_service.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/roles")
public class RoleController {

    @Autowired
    private RoleService service;

    @PostMapping("add")
    public ResponseEntity<RoleDTO> addRole(@RequestBody RoleDTO roleDTO){
        return new ResponseEntity<>(service.createRole(roleDTO), HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<RoleDTO>> getRoles(){
        return new ResponseEntity<>(service.getRoles(), HttpStatus.OK);
    }

}
