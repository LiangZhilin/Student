package com.blackbriar.service.impl;

import org.springframework.stereotype.Service;

import com.blackbriar.model.Flower;
import com.blackbriar.service.FlowerDemoService;
import com.blackbriar.util.HbHelper;
@Service("FlowerDemoService")
public class FlowerDemoServiceImpl implements FlowerDemoService{
	public FlowerDemoServiceImpl(){
	}
	public boolean addFlower(Flower flower) {
		return HbHelper.addDate(flower);
		
	}

	public void delFlower() {
		// TODO Auto-generated method stub
		
	}
  
}
