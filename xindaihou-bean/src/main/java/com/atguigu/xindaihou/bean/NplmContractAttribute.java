package com.atguigu.xindaihou.bean;


import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Date;

public class NplmContractAttribute implements Serializable {

  @Id
  @Column
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;
  @Column
  private long loanContractId;
  @Column
  private long loanContractNum;//合同编号
  @Column
  private String businessType;//业务模式
  @Column
  private String isExpedited;//是否加急
  @Column
  private java.sql.Timestamp signDate;
  @Column
  private long signType;//'签约方式 1：纸质  2：电子签约',
  @Column
  private String approveDate;
  @Column
  private String firstRepayDate;
  @Column
  private long feeFlag;
  @Column
  private String interestFlag;
  @Column
  private long interestType;
  @Column
  private long graceDays;
  @Column
  private long irr;
  @Column
  private long lnsRate;
  @Column
  private String channelCode;
  @Column
  private String channelName;
  @Column
  private String loanOfficerId;
  @Column
  private String cityId;
  @Column
  private String city;
  @Column
  private String isModify;
  @Column
  private String isSchemeModify;
  @Column
  private long recycleWay;
  @Column
  private String isRecycleLoad;//是否循环贷
  @Column
  private long recycleLoanCnt;//循环贷次数
  @Column
  private String oldContractNum;
  @Column
  private long settleAmount;
  @Column
  private String newContractNum;
  @Column
  private String isShorten;
  @Column
  private String isExtend;
  @Column
  private String isChangeProduce;
  @Column
  private String isOverdue;
  @Column
  private String isPayAhead;
  @Column
  private String isPayPart;
  @Column
  private String purpose;
  @Column
  private String purposeSon;
  @Column
  private String purposeDetail;
  @Column
  private String isDivAccount;
  @Column
  private String systemType;
  @Column
  private String highRisk;
  @Column
  private String isBuyout;
  @Column
  private String feeProcessType;
  @Column
  private String studentCorpName;
  @Column
  private String settleDate;//合同结清日期
  @Column
  private String habitTime;
  @Column
  private String repayDay;
  @Column
  private String applyId;
  @Column
  private String oldApplyId;
  @Column
  private String deptId;//营业部编号
  @Column
  private String deptName;//营业部名称
  @Column
  private String creator;
  @Column
  private java.sql.Timestamp createTime;
  @Column
  private String updater;
  @Column
  private java.sql.Timestamp updateTime;
  @Column
  private String updateType;
  @Column
  private long frontChargeDiscount;
  @Column
  private long monthMRate;
  @Column
  private long handleChargeRate;
  @Column
  private long loanTimes;
  @Column
  private String pawn;
  @Column
  private long handleCharge;
  @Column
  private long monthChargeDiscount;
  @Column
  private long guaranteeFee;
  @Column
  private String guaranteeCompany;
  @Column
  private String changeType;
  @Column
  private String changeMoney;
  @Column
  private String def3;
  @Column
  private String def4;
  @Column
  private String def5;
  @Column
  private String def6;
  @Column
  private String def7;
  @Column
  private String def8;
  @Column
  private String def9;
  @Column
  private String changeType0;



  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public long getLoanContractId() {
    return loanContractId;
  }

  public void setLoanContractId(long loanContractId) {
    this.loanContractId = loanContractId;
  }


  public long getLoanContractNum() {
    return loanContractNum;
  }

  public void setLoanContractNum(long loanContractNum) {
    this.loanContractNum = loanContractNum;
  }


  public String getBusinessType() {
    return businessType;
  }

  public void setBusinessType(String businessType) {
    this.businessType = businessType;
  }


  public String getIsExpedited() {
    return isExpedited;
  }

  public void setIsExpedited(String isExpedited) {
    this.isExpedited = isExpedited;
  }


  public java.sql.Timestamp getSignDate() {
    return signDate;
  }

  public void setSignDate(java.sql.Timestamp signDate) {
    this.signDate = signDate;
  }


  public long getSignType() {
    return signType;
  }

  public void setSignType(long signType) {
    this.signType = signType;
  }


  public String getApproveDate() {
    return approveDate;
  }

  public void setApproveDate(String approveDate) {
    this.approveDate = approveDate;
  }


  public String getFirstRepayDate() {
    return firstRepayDate;
  }

  public void setFirstRepayDate(String firstRepayDate) {
    this.firstRepayDate = firstRepayDate;
  }


  public long getFeeFlag() {
    return feeFlag;
  }

  public void setFeeFlag(long feeFlag) {
    this.feeFlag = feeFlag;
  }


  public String getInterestFlag() {
    return interestFlag;
  }

  public void setInterestFlag(String interestFlag) {
    this.interestFlag = interestFlag;
  }


  public long getInterestType() {
    return interestType;
  }

  public void setInterestType(long interestType) {
    this.interestType = interestType;
  }


  public long getGraceDays() {
    return graceDays;
  }

  public void setGraceDays(long graceDays) {
    this.graceDays = graceDays;
  }


  public long getIrr() {
    return irr;
  }

  public void setIrr(long irr) {
    this.irr = irr;
  }


  public long getLnsRate() {
    return lnsRate;
  }

  public void setLnsRate(long lnsRate) {
    this.lnsRate = lnsRate;
  }


  public String getChannelCode() {
    return channelCode;
  }

  public void setChannelCode(String channelCode) {
    this.channelCode = channelCode;
  }


  public String getChannelName() {
    return channelName;
  }

  public void setChannelName(String channelName) {
    this.channelName = channelName;
  }


  public String getLoanOfficerId() {
    return loanOfficerId;
  }

  public void setLoanOfficerId(String loanOfficerId) {
    this.loanOfficerId = loanOfficerId;
  }


  public String getCityId() {
    return cityId;
  }

  public void setCityId(String cityId) {
    this.cityId = cityId;
  }


  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }


  public String getIsModify() {
    return isModify;
  }

  public void setIsModify(String isModify) {
    this.isModify = isModify;
  }


  public String getIsSchemeModify() {
    return isSchemeModify;
  }

  public void setIsSchemeModify(String isSchemeModify) {
    this.isSchemeModify = isSchemeModify;
  }


  public long getRecycleWay() {
    return recycleWay;
  }

  public void setRecycleWay(long recycleWay) {
    this.recycleWay = recycleWay;
  }


  public String getIsRecycleLoad() {
    return isRecycleLoad;
  }

  public void setIsRecycleLoad(String isRecycleLoad) {
    this.isRecycleLoad = isRecycleLoad;
  }


  public long getRecycleLoanCnt() {
    return recycleLoanCnt;
  }

  public void setRecycleLoanCnt(long recycleLoanCnt) {
    this.recycleLoanCnt = recycleLoanCnt;
  }


  public String getOldContractNum() {
    return oldContractNum;
  }

  public void setOldContractNum(String oldContractNum) {
    this.oldContractNum = oldContractNum;
  }


  public long getSettleAmount() {
    return settleAmount;
  }

  public void setSettleAmount(long settleAmount) {
    this.settleAmount = settleAmount;
  }


  public String getNewContractNum() {
    return newContractNum;
  }

  public void setNewContractNum(String newContractNum) {
    this.newContractNum = newContractNum;
  }


  public String getIsShorten() {
    return isShorten;
  }

  public void setIsShorten(String isShorten) {
    this.isShorten = isShorten;
  }


  public String getIsExtend() {
    return isExtend;
  }

  public void setIsExtend(String isExtend) {
    this.isExtend = isExtend;
  }


  public String getIsChangeProduce() {
    return isChangeProduce;
  }

  public void setIsChangeProduce(String isChangeProduce) {
    this.isChangeProduce = isChangeProduce;
  }


  public String getIsOverdue() {
    return isOverdue;
  }

  public void setIsOverdue(String isOverdue) {
    this.isOverdue = isOverdue;
  }


  public String getIsPayAhead() {
    return isPayAhead;
  }

  public void setIsPayAhead(String isPayAhead) {
    this.isPayAhead = isPayAhead;
  }


  public String getIsPayPart() {
    return isPayPart;
  }

  public void setIsPayPart(String isPayPart) {
    this.isPayPart = isPayPart;
  }


  public String getPurpose() {
    return purpose;
  }

  public void setPurpose(String purpose) {
    this.purpose = purpose;
  }


  public String getPurposeSon() {
    return purposeSon;
  }

  public void setPurposeSon(String purposeSon) {
    this.purposeSon = purposeSon;
  }


  public String getPurposeDetail() {
    return purposeDetail;
  }

  public void setPurposeDetail(String purposeDetail) {
    this.purposeDetail = purposeDetail;
  }


  public String getIsDivAccount() {
    return isDivAccount;
  }

  public void setIsDivAccount(String isDivAccount) {
    this.isDivAccount = isDivAccount;
  }


  public String getSystemType() {
    return systemType;
  }

  public void setSystemType(String systemType) {
    this.systemType = systemType;
  }


  public String getHighRisk() {
    return highRisk;
  }

  public void setHighRisk(String highRisk) {
    this.highRisk = highRisk;
  }


  public String getIsBuyout() {
    return isBuyout;
  }

  public void setIsBuyout(String isBuyout) {
    this.isBuyout = isBuyout;
  }


  public String getFeeProcessType() {
    return feeProcessType;
  }

  public void setFeeProcessType(String feeProcessType) {
    this.feeProcessType = feeProcessType;
  }


  public String getStudentCorpName() {
    return studentCorpName;
  }

  public void setStudentCorpName(String studentCorpName) {
    this.studentCorpName = studentCorpName;
  }


  public String getSettleDate() {
    return settleDate;
  }

  public void setSettleDate(String settleDate) {
    this.settleDate = settleDate;
  }


  public String getHabitTime() {
    return habitTime;
  }

  public void setHabitTime(String habitTime) {
    this.habitTime = habitTime;
  }


  public String getRepayDay() {
    return repayDay;
  }

  public void setRepayDay(String repayDay) {
    this.repayDay = repayDay;
  }


  public String getApplyId() {
    return applyId;
  }

  public void setApplyId(String applyId) {
    this.applyId = applyId;
  }


  public String getOldApplyId() {
    return oldApplyId;
  }

  public void setOldApplyId(String oldApplyId) {
    this.oldApplyId = oldApplyId;
  }


  public String getDeptId() {
    return deptId;
  }

  public void setDeptId(String deptId) {
    this.deptId = deptId;
  }


  public String getDeptName() {
    return deptName;
  }

  public void setDeptName(String deptName) {
    this.deptName = deptName;
  }


  public String getCreator() {
    return creator;
  }

  public void setCreator(String creator) {
    this.creator = creator;
  }


  public java.sql.Timestamp getCreateTime() {
    return createTime;
  }

  public void setCreateTime(java.sql.Timestamp createTime) {
    this.createTime = createTime;
  }


  public String getUpdater() {
    return updater;
  }

  public void setUpdater(String updater) {
    this.updater = updater;
  }


  public java.sql.Timestamp getUpdateTime() {
    return updateTime;
  }

  public void setUpdateTime(java.sql.Timestamp updateTime) {
    this.updateTime = updateTime;
  }


  public String getUpdateType() {
    return updateType;
  }

  public void setUpdateType(String updateType) {
    this.updateType = updateType;
  }


  public long getFrontChargeDiscount() {
    return frontChargeDiscount;
  }

  public void setFrontChargeDiscount(long frontChargeDiscount) {
    this.frontChargeDiscount = frontChargeDiscount;
  }


  public long getMonthMRate() {
    return monthMRate;
  }

  public void setMonthMRate(long monthMRate) {
    this.monthMRate = monthMRate;
  }


  public long getHandleChargeRate() {
    return handleChargeRate;
  }

  public void setHandleChargeRate(long handleChargeRate) {
    this.handleChargeRate = handleChargeRate;
  }


  public long getLoanTimes() {
    return loanTimes;
  }

  public void setLoanTimes(long loanTimes) {
    this.loanTimes = loanTimes;
  }


  public String getPawn() {
    return pawn;
  }

  public void setPawn(String pawn) {
    this.pawn = pawn;
  }


  public long getHandleCharge() {
    return handleCharge;
  }

  public void setHandleCharge(long handleCharge) {
    this.handleCharge = handleCharge;
  }


  public long getMonthChargeDiscount() {
    return monthChargeDiscount;
  }

  public void setMonthChargeDiscount(long monthChargeDiscount) {
    this.monthChargeDiscount = monthChargeDiscount;
  }


  public long getGuaranteeFee() {
    return guaranteeFee;
  }

  public void setGuaranteeFee(long guaranteeFee) {
    this.guaranteeFee = guaranteeFee;
  }


  public String getGuaranteeCompany() {
    return guaranteeCompany;
  }

  public void setGuaranteeCompany(String guaranteeCompany) {
    this.guaranteeCompany = guaranteeCompany;
  }


  public String getchangeType() {
    return changeType;
  }

  public void setchangeType(String changeType) {
    this.changeType = changeType;
  }


  public String getchangeMoney() {
    return changeMoney;
  }

  public void setchangeMoney(String changeMoney) {
    this.changeMoney = changeMoney;
  }


  public String getDef3() {
    return def3;
  }

  public void setDef3(String def3) {
    this.def3 = def3;
  }


  public String getDef4() {
    return def4;
  }

  public void setDef4(String def4) {
    this.def4 = def4;
  }


  public String getDef5() {
    return def5;
  }

  public void setDef5(String def5) {
    this.def5 = def5;
  }


  public String getDef6() {
    return def6;
  }

  public void setDef6(String def6) {
    this.def6 = def6;
  }


  public String getDef7() {
    return def7;
  }

  public void setDef7(String def7) {
    this.def7 = def7;
  }


  public String getDef8() {
    return def8;
  }

  public void setDef8(String def8) {
    this.def8 = def8;
  }


  public String getDef9() {
    return def9;
  }

  public void setDef9(String def9) {
    this.def9 = def9;
  }


  public String getchangeType0() {
    return changeType0;
  }

  public void setchangeType0(String changeType0) {
    this.changeType0 = changeType0;
  }

  @Override
  public String toString() {
    return "NplmContractAttribute{" +
            "id=" + id +
            ", loanContractId=" + loanContractId +
            ", loanContractNum=" + loanContractNum +
            ", businessType='" + businessType + '\'' +
            ", isExpedited='" + isExpedited + '\'' +
            ", signDate=" + signDate +
            ", signType=" + signType +
            ", approveDate='" + approveDate + '\'' +
            ", firstRepayDate='" + firstRepayDate + '\'' +
            ", feeFlag=" + feeFlag +
            ", interestFlag='" + interestFlag + '\'' +
            ", interestType=" + interestType +
            ", graceDays=" + graceDays +
            ", irr=" + irr +
            ", lnsRate=" + lnsRate +
            ", channelCode='" + channelCode + '\'' +
            ", channelName='" + channelName + '\'' +
            ", loanOfficerId='" + loanOfficerId + '\'' +
            ", cityId='" + cityId + '\'' +
            ", city='" + city + '\'' +
            ", isModify='" + isModify + '\'' +
            ", isSchemeModify='" + isSchemeModify + '\'' +
            ", recycleWay=" + recycleWay +
            ", isRecycleLoad='" + isRecycleLoad + '\'' +
            ", recycleLoanCnt=" + recycleLoanCnt +
            ", oldContractNum='" + oldContractNum + '\'' +
            ", settleAmount=" + settleAmount +
            ", newContractNum='" + newContractNum + '\'' +
            ", isShorten='" + isShorten + '\'' +
            ", isExtend='" + isExtend + '\'' +
            ", isChangeProduce='" + isChangeProduce + '\'' +
            ", isOverdue='" + isOverdue + '\'' +
            ", isPayAhead='" + isPayAhead + '\'' +
            ", isPayPart='" + isPayPart + '\'' +
            ", purpose='" + purpose + '\'' +
            ", purposeSon='" + purposeSon + '\'' +
            ", purposeDetail='" + purposeDetail + '\'' +
            ", isDivAccount='" + isDivAccount + '\'' +
            ", systemType='" + systemType + '\'' +
            ", highRisk='" + highRisk + '\'' +
            ", isBuyout='" + isBuyout + '\'' +
            ", feeProcessType='" + feeProcessType + '\'' +
            ", studentCorpName='" + studentCorpName + '\'' +
            ", settleDate='" + settleDate + '\'' +
            ", habitTime='" + habitTime + '\'' +
            ", repayDay='" + repayDay + '\'' +
            ", applyId='" + applyId + '\'' +
            ", oldApplyId='" + oldApplyId + '\'' +
            ", deptId='" + deptId + '\'' +
            ", deptName='" + deptName + '\'' +
            ", creator='" + creator + '\'' +
            ", createTime=" + createTime +
            ", updater='" + updater + '\'' +
            ", updateTime=" + updateTime +
            ", updateType='" + updateType + '\'' +
            ", frontChargeDiscount=" + frontChargeDiscount +
            ", monthMRate=" + monthMRate +
            ", handleChargeRate=" + handleChargeRate +
            ", loanTimes=" + loanTimes +
            ", pawn='" + pawn + '\'' +
            ", handleCharge=" + handleCharge +
            ", monthChargeDiscount=" + monthChargeDiscount +
            ", guaranteeFee=" + guaranteeFee +
            ", guaranteeCompany='" + guaranteeCompany + '\'' +
            ", changeType='" + changeType + '\'' +
            ", changeMoney='" + changeMoney + '\'' +
            ", def3='" + def3 + '\'' +
            ", def4='" + def4 + '\'' +
            ", def5='" + def5 + '\'' +
            ", def6='" + def6 + '\'' +
            ", def7='" + def7 + '\'' +
            ", def8='" + def8 + '\'' +
            ", def9='" + def9 + '\'' +
            ", changeType0='" + changeType0 + '\'' +
            '}';
  }
}
