package com.atguigu.xindaihou.bean;


import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

public class NplmOverdueContract implements Serializable {

  @Id
  @Column
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private String id;
  @Column
  private String loanContractNum;
  @Column
  private String overdueStatus;
  @Column
  private long overdueDays;
  @Column
  private long instalmentCnt;
  @Column
  private long allDays;
  @Column
  private long allInstalmentCnt;
  @Column
  private long allNumber;
  @Column
  private long principalInterest;
  @Column
  private long allForfeit;
  @Column
  private long allAmerce;
  @Column
  private long allShould;
  @Column
  private long allIndeed;
  @Column
  private long currentRepay;
  @Column
  private long allRepaymentAmount;
  @Column
  private String firstDate;
  @Column
  private String startDate;
  @Column
  private String serialStartDate;
  @Column
  private String overdueHistory;
  @Column
  private String computeDate;
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



  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }


  public String getLoanContractNum() {
    return loanContractNum;
  }

  public void setLoanContractNum(String loanContractNum) {
    this.loanContractNum = loanContractNum;
  }


  public String getOverdueStatus() {
    return overdueStatus;
  }

  public void setOverdueStatus(String overdueStatus) {
    this.overdueStatus = overdueStatus;
  }


  public long getOverdueDays() {
    return overdueDays;
  }

  public void setOverdueDays(long overdueDays) {
    this.overdueDays = overdueDays;
  }


  public long getInstalmentCnt() {
    return instalmentCnt;
  }

  public void setInstalmentCnt(long instalmentCnt) {
    this.instalmentCnt = instalmentCnt;
  }


  public long getAllDays() {
    return allDays;
  }

  public void setAllDays(long allDays) {
    this.allDays = allDays;
  }


  public long getAllInstalmentCnt() {
    return allInstalmentCnt;
  }

  public void setAllInstalmentCnt(long allInstalmentCnt) {
    this.allInstalmentCnt = allInstalmentCnt;
  }


  public long getAllNumber() {
    return allNumber;
  }

  public void setAllNumber(long allNumber) {
    this.allNumber = allNumber;
  }


  public long getPrincipalInterest() {
    return principalInterest;
  }

  public void setPrincipalInterest(long principalInterest) {
    this.principalInterest = principalInterest;
  }


  public long getAllForfeit() {
    return allForfeit;
  }

  public void setAllForfeit(long allForfeit) {
    this.allForfeit = allForfeit;
  }


  public long getAllAmerce() {
    return allAmerce;
  }

  public void setAllAmerce(long allAmerce) {
    this.allAmerce = allAmerce;
  }


  public long getAllShould() {
    return allShould;
  }

  public void setAllShould(long allShould) {
    this.allShould = allShould;
  }


  public long getAllIndeed() {
    return allIndeed;
  }

  public void setAllIndeed(long allIndeed) {
    this.allIndeed = allIndeed;
  }


  public long getCurrentRepay() {
    return currentRepay;
  }

  public void setCurrentRepay(long currentRepay) {
    this.currentRepay = currentRepay;
  }


  public long getAllRepaymentAmount() {
    return allRepaymentAmount;
  }

  public void setAllRepaymentAmount(long allRepaymentAmount) {
    this.allRepaymentAmount = allRepaymentAmount;
  }


  public String getFirstDate() {
    return firstDate;
  }

  public void setFirstDate(String firstDate) {
    this.firstDate = firstDate;
  }


  public String getStartDate() {
    return startDate;
  }

  public void setStartDate(String startDate) {
    this.startDate = startDate;
  }


  public String getSerialStartDate() {
    return serialStartDate;
  }

  public void setSerialStartDate(String serialStartDate) {
    this.serialStartDate = serialStartDate;
  }


  public String getOverdueHistory() {
    return overdueHistory;
  }

  public void setOverdueHistory(String overdueHistory) {
    this.overdueHistory = overdueHistory;
  }


  public String getComputeDate() {
    return computeDate;
  }

  public void setComputeDate(String computeDate) {
    this.computeDate = computeDate;
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

  @Override
  public String toString() {
    return "NplmOverdueContract{" +
            "id='" + id + '\'' +
            ", loanContractNum='" + loanContractNum + '\'' +
            ", overdueStatus='" + overdueStatus + '\'' +
            ", overdueDays=" + overdueDays +
            ", instalmentCnt=" + instalmentCnt +
            ", allDays=" + allDays +
            ", allInstalmentCnt=" + allInstalmentCnt +
            ", allNumber=" + allNumber +
            ", principalInterest=" + principalInterest +
            ", allForfeit=" + allForfeit +
            ", allAmerce=" + allAmerce +
            ", allShould=" + allShould +
            ", allIndeed=" + allIndeed +
            ", currentRepay=" + currentRepay +
            ", allRepaymentAmount=" + allRepaymentAmount +
            ", firstDate='" + firstDate + '\'' +
            ", startDate='" + startDate + '\'' +
            ", serialStartDate='" + serialStartDate + '\'' +
            ", overdueHistory='" + overdueHistory + '\'' +
            ", computeDate='" + computeDate + '\'' +
            ", creator='" + creator + '\'' +
            ", createTime=" + createTime +
            ", updater='" + updater + '\'' +
            ", updateTime=" + updateTime +
            ", updateType='" + updateType + '\'' +
            '}';
  }
}
