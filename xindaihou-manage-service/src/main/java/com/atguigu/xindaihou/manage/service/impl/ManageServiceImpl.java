package com.atguigu.xindaihou.manage.service.impl;

        import com.alibaba.dubbo.config.annotation.Service;
        import com.atguigu.xindaihou.ManageService;
        import com.atguigu.xindaihou.bean.NplmLoanContract;
        import com.atguigu.xindaihou.manage.mapper.ControllerMapper;
        import org.springframework.beans.factory.annotation.Autowired;

        import java.util.List;

@Service
public class ManageServiceImpl implements ManageService{
    @Autowired
    private ControllerMapper controllerMapper;

    @Override
    public List<NplmLoanContract> getAllContract() {
        return controllerMapper.getAllContract();
    }

    @Override
    public List<NplmLoanContract> selectNplmLoanContractList() {

        return controllerMapper.selectNplmLoanContractList();
    }
}
