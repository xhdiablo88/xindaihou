package com.atguigu.xindaihou.manage.mapper;

import com.atguigu.xindaihou.bean.NplmLoanContract;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface ControllerMapper extends Mapper<NplmLoanContract> {
    // 三表查询所有属性值数据
    List<NplmLoanContract> getAllContract();

    List<NplmLoanContract> selectNplmLoanContractList();
}
