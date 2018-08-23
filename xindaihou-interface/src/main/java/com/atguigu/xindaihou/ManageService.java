package com.atguigu.xindaihou;

import com.atguigu.xindaihou.bean.NplmLoanContract;

import java.util.List;

public interface ManageService {
    //三表查询
    List<NplmLoanContract> getAllContract();

    List<NplmLoanContract> selectNplmLoanContractList();



}
