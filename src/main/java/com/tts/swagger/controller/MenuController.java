package com.tts.swagger.controller;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.cache.spi.support.AbstractReadWriteAccess.Item;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.ApiOperation;

@RestController
public class MenuController {
	@ApiOperation(value = "Get all menu items", response = Item.class, responseContainer = "List")
	@GetMapping("/items")
	public ResponseEntity<List<Item>> getItems() {
	    return new ResponseEntity<>(new ArrayList<Item>(), HttpStatus.OK);
	}
}
