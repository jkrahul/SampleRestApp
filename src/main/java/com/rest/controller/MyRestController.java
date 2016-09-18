package com.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.rest.model.Data;
import com.rest.service.IRestService;

@Controller
public class MyRestController {

//	@RequestMapping(value = "/hello")
//	public @ResponseBody String getGreeting() {
//		return "Hello World !!";
//	}

	@Autowired
	IRestService restService;

	@RequestMapping(value = "/getData", method = RequestMethod.GET)
	public @ResponseBody List<Data> getData(@RequestParam("db") List<String> dbs) throws Exception {
		System.out.println("in controller");
		List<Data> models = restService.getDataFromDB(dbs);
		return models;
	}

	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	public @ResponseBody Data hello() throws Exception {
		return new Data("Hello World", "Simple Plan");
	}
}
