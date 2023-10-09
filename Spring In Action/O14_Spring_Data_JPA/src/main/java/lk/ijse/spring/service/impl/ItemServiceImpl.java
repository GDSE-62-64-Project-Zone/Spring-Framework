package lk.ijse.spring.service.impl;

import lk.ijse.spring.repo.ItemRepo;
import lk.ijse.spring.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional // manage all the transactions here // AOP
public class ItemServiceImpl implements ItemService {

    @Autowired
    ItemRepo itemRepo;

    public ItemServiceImpl() {
        System.out.println("ItemServiceImpl Instantiated");
    }
}
