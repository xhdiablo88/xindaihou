package com.atguigu.xindaihou.bean;


import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

public class NplmRepaymentRecord implements Serializable {

  @Id
  @Column
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;
  @Column
  private long businessRequestId;
  @Column
  private long loanContractNum;
  @Column
  private java.sql.Date repaymentDate;
  @Column
  private long overdueDays;
  @Column
  private long overdueAmount;
  @Column
  private long repaymentAmount;
  @Column
  private long successAmount;
  @Column
  private String status;
  @Column
  private String remark;
  @Column
  private String specialCode;
  @Column
  private long sort;
  @Column
  private String dataCreateType;
  @Column
  private java.sql.Timestamp reserveTime;
  @Column
  private String creator;
  @Column
  private java.sql.Timestamp createTime;
  @Column
  private String updater;
  @Column
  private java.sql.Timestamp updateTime;
  @Column
  private String accountName;
  @Column
  private String acctIdenType;
  @Column
  private String acctIdenNum;
  @Column
  private String accountNo;
  @Column
  private String accountType;
  @Column
  private String accountBankid;
  @Column
  private String accountBranchNo;
  @Column
  private String accountBankName;
  @Column
  private String publicPrivate;
  @Column
  private String actProvince;
  @Column
  private String accountCity;
  @Column
  private String updateType;



  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public long getBusinessRequestId() {
    return businessRequestId;
  }

  public void setBusinessRequestId(long businessRequestId) {
    this.businessRequestId = businessRequestId;
  }


  public long getLoanContractNum() {
    return loanContractNum;
  }

  public void setLoanContractNum(long loanContractNum) {
    this.loanContractNum = loanContractNum;
  }


  public java.sql.Date getRepaymentDate() {
    return repaymentDate;
  }

  public void setRepaymentDate(java.sql.Date repaymentDate) {
    this.repaymentDate = repaymentDate;
  }


  public long getOverdueDays() {
    return overdueDays;
  }

  public void setOverdueDays(long overdueDays) {
    this.overdueDays = overdueDays;
  }


  public long getOverdueAmount() {
    return overdueAmount;
  }

  public void setOverdueAmount(long overdueAmount) {
    this.overdueAmount = overdueAmount;
  }


  public long getRepaymentAmount() {
    return repaymentAmount;
  }

  public void setRepaymentAmount(long repaymentAmount) {
    this.repaymentAmount = repaymentAmount;
  }


  public long getSuccessAmount() {
    return successAmount;
  }

  public void setSuccessAmount(long successAmount) {
    this.successAmount = successAmount;
  }


  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }


  public String getRemark() {
    return remark;
  }

  public void setRemark(String remark) {
    this.remark = remark;
  }


  public String getSpecialCode() {
    return specialCode;
  }

  public void setSpecialCode(String specialCode) {
    this.specialCode = specialCode;
  }


  public long getSort() {
    return sort;
  }

  public void setSort(long sort) {
    this.sort = sort;
  }


  public String getDataCreateType() {
    return dataCreateType;
  }

  public void setDataCreateType(String dataCreateType) {
    this.dataCreateType = dataCreateType;
  }


  public java.sql.Timestamp getReserveTime() {
    return reserveTime;
  }

  public void setReserveTime(java.sql.Timestamp reserveTime) {
    this.reserveTime = reserveTime;
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


  public String getAccountName() {
    return accountName;
  }

  public void setAccountName(String accountName) {
    this.accountName = accountName;
  }


  public String getAcctIdenType() {
    return acctIdenType;
  }

  public void setAcctIdenType(String acctIdenType) {
    this.acctIdenType = acctIdenType;
  }


  public String getAcctIdenNum() {
    return acctIdenNum;
  }

  public void setAcctIdenNum(String acctIdenNum) {
    this.acctIdenNum = acctIdenNum;
  }


  public String getAccountNo() {
    return accountNo;
  }

  public void setAccountNo(String accountNo) {
    this.accountNo = accountNo;
  }


  public String getAccountType() {
    return accountType;
  }

  public void setAccountType(String accountType) {
    this.accountType = accountType;
  }


  public String getAccountBankid() {
    return accountBankid;
  }

  public void setAccountBankid(String accountBankid) {
    this.accountBankid = accountBankid;
  }


  public String getAccountBranchNo() {
    return accountBranchNo;
  }

  public void setAccountBranchNo(String accountBranchNo) {
    this.accountBranchNo = accountBranchNo;
  }


  public String getAccountBankName() {
    return accountBankName;
  }

  public void setAccountBankName(String accountBankName) {
    this.accountBankName = accountBankName;
  }


  public String getPublicPrivate() {
    return publicPrivate;
  }

  public void setPublicPrivate(String publicPrivate) {
    this.publicPrivate = publicPrivate;
  }


  public String getActProvince() {
    return actProvince;
  }

  public void setActProvince(String actProvince) {
    this.actProvince = actProvince;
  }


  public String getAccountCity() {
    return accountCity;
  }

  public void setAccountCity(String accountCity) {
    this.accountCity = accountCity;
  }


  public String getUpdateType() {
    return updateType;
  }

  public void setUpdateType(String updateType) {
    this.updateType = updateType;
  }

  @Override
  public String toString() {
    return "NplmRepaymentRecord{" +
            "id=" + id +
            ", businessRequestId=" + businessRequestId +
            ", loanContractNum=" + loanContractNum +
            ", repaymentDate=" + repaymentDate +
            ", overdueDays=" + overdueDays +
            ", overdueAmount=" + overdueAmount +
            ", repaymentAmount=" + repaymentAmount +
            ", successAmount=" + successAmount +
            ", status='" + status + '\'' +
            ", remark='" + remark + '\'' +
            ", specialCode='" + specialCode + '\'' +
            ", sort=" + sort +
            ", dataCreateType='" + dataCreateType + '\'' +
            ", reserveTime=" + reserveTime +
            ", creator='" + creator + '\'' +
            ", createTime=" + createTime +
            ", updater='" + updater + '\'' +
            ", updateTime=" + updateTime +
            ", accountName='" + accountName + '\'' +
            ", acctIdenType='" + acctIdenType + '\'' +
            ", acctIdenNum='" + acctIdenNum + '\'' +
            ", accountNo='" + accountNo + '\'' +
            ", accountType='" + accountType + '\'' +
            ", accountBankid='" + accountBankid + '\'' +
            ", accountBranchNo='" + accountBranchNo + '\'' +
            ", accountBankName='" + accountBankName + '\'' +
            ", publicPrivate='" + publicPrivate + '\'' +
            ", actProvince='" + actProvince + '\'' +
            ", accountCity='" + accountCity + '\'' +
            ", updateType='" + updateType + '\'' +
            '}';
  }
}
