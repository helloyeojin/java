package com.kbstar.test;

import com.kbstar.dto.TransactionDTO;
import com.kbstar.frame.CRUDService;
import com.kbstar.service.TransactionCRUDServiceImpl;

import java.util.List;

public class TransactionSearchAllTest {
    public static void main(String[] args) {
        CRUDService<String, TransactionDTO> tranService = new TransactionCRUDServiceImpl();

        try {
            List<TransactionDTO> allTran = tranService.search("김민수");
            System.out.println(allTran);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
