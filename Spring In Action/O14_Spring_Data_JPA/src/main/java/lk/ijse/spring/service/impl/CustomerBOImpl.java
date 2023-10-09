package lk.ijse.spring.service.impl;

import lk.ijse.spring.service.CustomerBO;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional// AOP
public class CustomerBOImpl implements CustomerBO {
}
