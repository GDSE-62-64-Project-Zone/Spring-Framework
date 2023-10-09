package lk.ijse.spring.service.impl;

import lk.ijse.spring.service.ItemBO;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional // manage all the transactions here // AOP
public class ItemBOImpl implements ItemBO {
}
