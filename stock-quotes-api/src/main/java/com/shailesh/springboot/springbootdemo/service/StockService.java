package com.shailesh.springboot.springbootdemo.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

import com.shailesh.springboot.springbootdemo.bean.Stock;
import com.shailesh.springboot.springbootdemo.bean.StockBean;

@Service
public class StockService {
	
	private static List<Stock> listStock = new ArrayList<>();
	private static StockBean stb = new StockBean();
	

	public StockBean getStocks(){
		return stb;
	}
	
	
	  public StockBean getStock(List<String> stocks) {
		  List<Stock> listStocks = new ArrayList<>();
		  StockBean stockBean = new StockBean();
		  for(int i=0; i<stocks.size(); i++) {
			  
			  for(Stock stockList : listStock) {
				  if(stockList.getStockQuote().equalsIgnoreCase(stocks.get(i))) {
					  listStocks.add(stockList);
					  stockBean.setStocks(listStocks);
				  }
			  }
		  }
		  return stockBean;
	  }
	 
	
	public StockBean addStocks(String stockQuote, String company, String price, String currency) {
		listStock.add(new Stock(stockQuote,company, new Date(),price, currency));
		stb.setStocks(listStock);
		return stb;
	}
}
