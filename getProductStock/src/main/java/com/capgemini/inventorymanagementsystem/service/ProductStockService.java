package com.capgemini.inventorymanagementsystem.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.capgemini.inventorymanagementsystem.dao.ProductStockDAO;
import com.capgemini.inventorymanagementsystem.dto.ProductStock;
@Service
public class ProductStockService {
	@Autowired
    ProductStockDAO psdao;
	public void setpsdao(ProductStockDAO psdao) { this.psdao=psdao;}
	@Transactional(readOnly=true)
	public Optional<ProductStock> getOrder(int orderId)
	{
		return psdao.findById(orderId);
	}
	

}
