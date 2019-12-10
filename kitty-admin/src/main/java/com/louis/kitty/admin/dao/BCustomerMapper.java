package com.louis.kitty.admin.dao;

import com.louis.kitty.admin.model.BCustomer;

import java.util.List;
public interface BCustomerMapper {
    List<BCustomer> findPage();
    List<BCustomer> query();
}
