package com.atguigu.xindaihou.bean;


import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

public class NplmRepaymentDetail implements Serializable {

  @Id
  @Column
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;
  @Column
  private long repaymentPlanId;
  @Column
  private long repaymentRecordId;
  @Column
  private long businessRequestId;
  @Column
  private long loanContractNum;
  @Column
  private java.sql.Date repaymentDate;
  @Column
  private long instalment;
  @Column
  private long shouldCapital;
  @Column
  private long shouldInterest;
  @Column
  private long shouldInstFee;
  @Column
  private long shouldAmerce;
  @Column
  private long shouldForfeit;
  @Column
  private long shouldPenalty;
  @Column
  private long shouldChangeFee;
  @Column
  private long shouldOtherFee;
  @Column
  private long shouldAmount;
  @Column
  private long indeedCapital;
  @Column
  private long indeedInterest;
  @Column
  private long indeedInstFee;
  @Column
  private long indeedAmerce;
  @Column
  private long indeedForfeit;
  @Column
  private long indeedPenalty;
  @Column
  private long indeedChangeFee;
  @Column
  private long indeedOtherFee;
  @Column
  private long indeedAmount;
  @Column
  private String status;
  @Column
  private long reduceCapital;
  @Column
  private long reduceInterest;
  @Column
  private long reduceAmerce;
  @Column
  private long reduceForfeit;
  @Column
  private long reducePenalty;
  @Column
  private long reduceInstFee;
  @Column
  private long reducePreFee;
  @Column
  private long reduceOtherFee;
  @Column
  private String dataCreateType;
  @Column
  private String remark;
  @Column
  private String specialCode;
  @Column
  private long sort;
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


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public long getRepaymentPlanId() {
    return repaymentPlanId;
  }

  public void setRepaymentPlanId(long repaymentPlanId) {
    this.repaymentPlanId = repaymentPlanId;
  }


  public long getRepaymentRecordId() {
    return repaymentRecordId;
  }

  public void setRepaymentRecordId(long repaymentRecordId) {
    this.repaymentRecordId = repaymentRecordId;
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


  public long getInstalment() {
    return instalment;
  }

  public void setInstalment(long instalment) {
    this.instalment = instalment;
  }


  public long getShouldCapital() {
    return shouldCapital;
  }

  public void setShouldCapital(long shouldCapital) {
    this.shouldCapital = shouldCapital;
  }


  public long getShouldInterest() {
    return shouldInterest;
  }

  public void setShouldInterest(long shouldInterest) {
    this.shouldInterest = shouldInterest;
  }


  public long getShouldInstFee() {
    return shouldInstFee;
  }

  public void setShouldInstFee(long shouldInstFee) {
    this.shouldInstFee = shouldInstFee;
  }


  public long getShouldAmerce() {
    return shouldAmerce;
  }

  public void setShouldAmerce(long shouldAmerce) {
    this.shouldAmerce = shouldAmerce;
  }


  public long getShouldForfeit() {
    return shouldForfeit;
  }

  public void setShouldForfeit(long shouldForfeit) {
    this.shouldForfeit = shouldForfeit;
  }


  public long getShouldPenalty() {
    return shouldPenalty;
  }

  public void setShouldPenalty(long shouldPenalty) {
    this.shouldPenalty = shouldPenalty;
  }


  public long getShouldChangeFee() {
    return shouldChangeFee;
  }

  public void setShouldChangeFee(long shouldChangeFee) {
    this.shouldChangeFee = shouldChangeFee;
  }


  public long getShouldOtherFee() {
    return shouldOtherFee;
  }

  public void setShouldOtherFee(long shouldOtherFee) {
    this.shouldOtherFee = shouldOtherFee;
  }


  public long getShouldAmount() {
    return shouldAmount;
  }

  public void setShouldAmount(long shouldAmount) {
    this.shouldAmount = shouldAmount;
  }


  public long getIndeedCapital() {
    return indeedCapital;
  }

  public void setIndeedCapital(long indeedCapital) {
    this.indeedCapital = indeedCapital;
  }


  public long getIndeedInterest() {
    return indeedInterest;
  }

  public void setIndeedInterest(long indeedInterest) {
    this.indeedInterest = indeedInterest;
  }


  public long getIndeedInstFee() {
    return indeedInstFee;
  }

  public void setIndeedInstFee(long indeedInstFee) {
    this.indeedInstFee = indeedInstFee;
  }


  public long getIndeedAmerce() {
    return indeedAmerce;
  }

  public void setIndeedAmerce(long indeedAmerce) {
    this.indeedAmerce = indeedAmerce;
  }


  public long getIndeedForfeit() {
    return indeedForfeit;
  }

  public void setIndeedForfeit(long indeedForfeit) {
    this.indeedForfeit = indeedForfeit;
  }


  public long getIndeedPenalty() {
    return indeedPenalty;
  }

  public void setIndeedPenalty(long indeedPenalty) {
    this.indeedPenalty = indeedPenalty;
  }


  public long getIndeedChangeFee() {
    return indeedChangeFee;
  }

  public void setIndeedChangeFee(long indeedChangeFee) {
    this.indeedChangeFee = indeedChangeFee;
  }


  public long getIndeedOtherFee() {
    return indeedOtherFee;
  }

  public void setIndeedOtherFee(long indeedOtherFee) {
    this.indeedOtherFee = indeedOtherFee;
  }


  public long getIndeedAmount() {
    return indeedAmount;
  }

  public void setIndeedAmount(long indeedAmount) {
    this.indeedAmount = indeedAmount;
  }


  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }


  public long getReduceCapital() {
    return reduceCapital;
  }

  public void setReduceCapital(long reduceCapital) {
    this.reduceCapital = reduceCapital;
  }


  public long getReduceInterest() {
    return reduceInterest;
  }

  public void setReduceInterest(long reduceInterest) {
    this.reduceInterest = reduceInterest;
  }


  public long getReduceAmerce() {
    return reduceAmerce;
  }

  public void setReduceAmerce(long reduceAmerce) {
    this.reduceAmerce = reduceAmerce;
  }


  public long getReduceForfeit() {
    return reduceForfeit;
  }

  public void setReduceForfeit(long reduceForfeit) {
    this.reduceForfeit = reduceForfeit;
  }


  public long getReducePenalty() {
    return reducePenalty;
  }

  public void setReducePenalty(long reducePenalty) {
    this.reducePenalty = reducePenalty;
  }


  public long getReduceInstFee() {
    return reduceInstFee;
  }

  public void setReduceInstFee(long reduceInstFee) {
    this.reduceInstFee = reduceInstFee;
  }


  public long getReducePreFee() {
    return reducePreFee;
  }

  public void setReducePreFee(long reducePreFee) {
    this.reducePreFee = reducePreFee;
  }


  public long getReduceOtherFee() {
    return reduceOtherFee;
  }

  public void setReduceOtherFee(long reduceOtherFee) {
    this.reduceOtherFee = reduceOtherFee;
  }


  public String getDataCreateType() {
    return dataCreateType;
  }

  public void setDataCreateType(String dataCreateType) {
    this.dataCreateType = dataCreateType;
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
    return "NplmRepaymentDetail{" +
            "id=" + id +
            ", repaymentPlanId=" + repaymentPlanId +
            ", repaymentRecordId=" + repaymentRecordId +
            ", businessRequestId=" + businessRequestId +
            ", loanContractNum=" + loanContractNum +
            ", repaymentDate=" + repaymentDate +
            ", instalment=" + instalment +
            ", shouldCapital=" + shouldCapital +
            ", shouldInterest=" + shouldInterest +
            ", shouldInstFee=" + shouldInstFee +
            ", shouldAmerce=" + shouldAmerce +
            ", shouldForfeit=" + shouldForfeit +
            ", shouldPenalty=" + shouldPenalty +
            ", shouldChangeFee=" + shouldChangeFee +
            ", shouldOtherFee=" + shouldOtherFee +
            ", shouldAmount=" + shouldAmount +
            ", indeedCapital=" + indeedCapital +
            ", indeedInterest=" + indeedInterest +
            ", indeedInstFee=" + indeedInstFee +
            ", indeedAmerce=" + indeedAmerce +
            ", indeedForfeit=" + indeedForfeit +
            ", indeedPenalty=" + indeedPenalty +
            ", indeedChangeFee=" + indeedChangeFee +
            ", indeedOtherFee=" + indeedOtherFee +
            ", indeedAmount=" + indeedAmount +
            ", status='" + status + '\'' +
            ", reduceCapital=" + reduceCapital +
            ", reduceInterest=" + reduceInterest +
            ", reduceAmerce=" + reduceAmerce +
            ", reduceForfeit=" + reduceForfeit +
            ", reducePenalty=" + reducePenalty +
            ", reduceInstFee=" + reduceInstFee +
            ", reducePreFee=" + reducePreFee +
            ", reduceOtherFee=" + reduceOtherFee +
            ", dataCreateType='" + dataCreateType + '\'' +
            ", remark='" + remark + '\'' +
            ", specialCode='" + specialCode + '\'' +
            ", sort=" + sort +
            ", creator='" + creator + '\'' +
            ", createTime=" + createTime +
            ", updater='" + updater + '\'' +
            ", updateTime=" + updateTime +
            ", updateType='" + updateType + '\'' +
            '}';
  }
}
