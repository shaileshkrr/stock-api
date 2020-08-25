package com.shailesh.springboot.springbootdemo.controller;

import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.Max;
import javax.validation.constraints.Size;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.shailesh.springboot.springbootdemo.bean.Stock;
import com.shailesh.springboot.springbootdemo.bean.StockBean;
import com.shailesh.springboot.springbootdemo.service.StockService;

@Controller
public class StocksController {
	
	@Autowired
	StockService stockService;
	
	
	@GetMapping(path="/getStocks")
	@ResponseBody
	public StockBean getStocks( @RequestParam List<String> stock) {
		return stockService.getStock(stock);
	}
	
	@RequestMapping(value="/addStocks" ,method=RequestMethod.GET)
	public String showStocksPage(ModelMap model) {
		return "addStock" ;
	}
	
	
	@RequestMapping(value="/addStocks" ,method=RequestMethod.POST)
	@ResponseBody
	public StockBean addStock(ModelMap model, Stock stock) {
		return stockService.addStocks(stock.getStockQuote(), stock.getCompanyName(), stock.getPrice(), stock.getCurrency());
	}
}
