package com.mnd.gunreview.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.mnd.gunreview.dto.Shop;

@Mapper
public interface ShopDAO {
	public List<Shop> selectShop();
	public Shop selectShopById(String id);
	public int insertShop(Shop shop);
	public int updateShop(Shop shop);
	public int deleteShop(String id);
}
