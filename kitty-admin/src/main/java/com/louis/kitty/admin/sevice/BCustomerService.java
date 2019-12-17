package com.louis.kitty.admin.sevice;

import com.louis.kitty.admin.model.BCustomer;
import com.louis.kitty.admin.model.CustomerParam;
import com.louis.kitty.core.service.CurdService;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 *
 */
@Service
public interface BCustomerService extends CurdService<BCustomer> {
    List<BCustomer> findByLable(String lable);
    List<BCustomer> query(CustomerParam customerParam);
}
