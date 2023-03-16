package com.kbstar.test;

import com.kbstar.dto.TransactionDTO;
import com.kbstar.frame.CRUDService;
import com.kbstar.service.TransactionCRUDServiceImpl;

public class TransactionInsertTest {
    public static void main(String[] args) {
        CRUDService<String, TransactionDTO> service = new TransactionCRUDServiceImpl();
        //transaction insert test
        TransactionDTO tran = new TransactionDTO("394039403490", 10000, "입금", "모임회비", "김민수");
        try {
            service.register(tran);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
