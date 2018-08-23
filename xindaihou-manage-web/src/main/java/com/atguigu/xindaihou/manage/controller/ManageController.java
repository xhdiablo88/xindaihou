package com.atguigu.xindaihou.manage.controller;


import com.alibaba.dubbo.config.annotation.Reference;
import com.atguigu.xindaihou.ManageService;
import com.atguigu.xindaihou.bean.NplmLoanContract;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class ManageController {

    @Reference
    private ManageService manageService;

    @RequestMapping(value = "smp" )
    public String index(){
        return "smp";
    }


    // 左侧菜单栏中放款列表控制器
    @RequestMapping("fangkuanliebiao")
    public String getfangkuanliebiaoPage(){
        /*attrListPage.html*/


        return "fangkuanliebiao";
    }

    // 左侧菜单栏中合同列表控制器
    @RequestMapping("hetongliebiao")
    public String gethetongliebiaoPage(HttpServletRequest request){
        List<NplmLoanContract> hetongallContract = manageService.selectNplmLoanContractList();
        request.setAttribute("hetongallContract",hetongallContract);
        return "hetongliebiao";
    }


    // 左侧菜单栏中前期费用查询控制器
    @RequestMapping("qianqifeiyongchaxun")
    public String getqianqifeiyongchaxunPage(){
        /*attrListPage.html*/
        return "qianqifeiyongchaxun";
    }

    //zhengchangdaihuankuan
    // 左侧菜单栏中正常待还款控制器
    @RequestMapping("zhengchangdaihuankuan")
    public String getzhengchangdaihuankuanPage(){
        /*attrListPage.html*/
        return "zhengchangdaihuankuan";
    }


    // 左侧菜单栏中逾期列表控制器
    @RequestMapping("yuqiliebiao")
    public String getyuqiliebiaoPage(){
        /*attrListPage.html*/
        return "yuqiliebiao";
    }


    // 左侧菜单栏中已还款列表控制器
    @RequestMapping("yihuankuanliebiao")
    public String getyihuankuanliebiaoPage(){
        /*attrListPage.html*/
        return "yihuankuanliebiao";
    }


    // 左侧菜单栏中扣款结果查询控制器
    @RequestMapping("koukuanjieguochaxun")
    public String getkoukuanjieguochaxunnPage(){
        /*attrListPage.html*/
        return "koukuanjieguochaxun";
    }

    // 左侧菜单栏中信托扣款明细查询控制器
    @RequestMapping("xintuokoukuanmingxichaxun")
    public String getxintuokoukuanmingxichaxunPage(){
        /*attrListPage.html*/
        return "xintuokoukuanmingxichaxun";
    }

    // 左侧菜单栏中已还款列表控制器
    @RequestMapping("VLhetongguanli/成长企业贷合同管理")
    public String getchengzhangqiyedaihetongnPage(){
        /*attrListPage.html*/
        return "VLhetongguanli/成长企业贷合同管理";
    }

    // 左侧菜单栏中已还款列表控制器
    @RequestMapping("VLhetongguanli/成长企业贷合同审核列表")
    public String getchengzhangqiyedaihetongshenheliebiaoPage(){
        /*attrListPage.html*/
        return "VLhetongguanli/成长企业贷合同审核列表";
    }



}
