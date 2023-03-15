package com.kbstar.test;

import java.util.List;

import com.kbstar.dto.Cart;
import com.kbstar.dto.Cust;
import com.kbstar.frame.ShopService;
import com.kbstar.service.ShopServiceImpl;

public class MyCartSelectAllTest {
    public static void main(String[] args) {
        ShopService<Cust, Cart> service = new ShopServiceImpl();
        List<Cart> myCartList = null;
        try {
            myCartList = service.myCart("더보이즈짱");
            for (Cart a : myCartList) {
                System.out.println(a);
            }
            System.out.println("조회 완료");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
