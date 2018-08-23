package com.atguigu.xindaihou.bean;


import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

public class NplmRepaymentPlan implements Serializable {

  @Id
  @Column
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;
  @Column
  private long loanContractNum;
  @Column
  private long instalment;
  @Column
  private java.sql.Date preRepaymentDate;
  @Column
  private java.sql.Date repaymentDate;
  @Column
  private long capital;
  @Column
  private long interest;
  @Column
  private long installmentFee;
  @Column
  private long amerce;
  @Column
  private long forfeit;
  @Column
  private long penalty;
  @Column
  private long changeFee;
  @Column
  private long otherFee;
  @Column
  private long repaymentAmount;
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
  private long reduceCapital;
  @Column
  private long reduceInterest;
  @Column
  private long reduceAmerce;
  @Column
  private long reduceForfeit;
  @Column
  private long reduceInstFee;
  @Column
  private long reducePenalty;
  @Column
  private long reducePreFee;
  @Column
  private long reduceOtherFee;
  @Column
  private long remainCapital;
  @Column
  private long npvRemainCapital;
  @Column
  private long allRepaymentAmount;
  @Column
  private String repaymentState;
  @Column
  private String remark;
  @Column
  private String creator;
  @Column
  private java.sql.Timestamp createTime;
  @Column
  private String updater;
  @Column
  private java.sql.Timestamp updateTime;
  @Column
  private String isOperating;
  @Column
  private String updateType;



  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public long getLoanContractNum() {
    return loanContractNum;
  }

  public void setLoanContractNum(long loanContractNum) {
    this.loanContractNum = loanContractNum;
  }


  public long getInstalment() {
    return instalment;
  }

  public void setInstalment(long instalment) {
    this.instalment = instalment;
  }


  public java.sql.Date getPreRepaymentDate() {
    return preRepaymentDate;
  }

  public void setPreRepaymentDate(java.sql.Date preRepaymentDate) {
    this.preRepaymentDate = preRepaymentDate;
  }


  public java.sql.Date getRepaymentDate() {
    return repaymentDate;
  }

  public void setRepaymentDate(java.sql.Date repaymentDate) {
    this.repaymentDate = repaymentDate;
  }


  public long getCapital() {
    return capital;
  }

  public void setCapital(long capital) {
    this.capital = capital;
  }


  public long getInterest() {
    return interest;
  }

  public void setInterest(long interest) {
    this.interest = interest;
  }


  public long getInstallmentFee() {
    return installmentFee;
  }

  public void setInstallmentFee(long installmentFee) {
    this.installmentFee = installmentFee;
  }


  public long getAmerce() {
    return amerce;
  }

  public void setAmerce(long amerce) {
    this.amerce = amerce;
  }


  public long getForfeit() {
    return forfeit;
  }

  public void setForfeit(long forfeit) {
    this.forfeit = forfeit;
  }


  public long getPenalty() {
    return penalty;
  }

  public void setPenalty(long penalty) {
    this.penalty = penalty;
  }


  public long getChangeFee() {
    return changeFee;
  }

  public void setChangeFee(long changeFee) {
    this.changeFee = changeFee;
  }


  public long getOtherFee() {
    return otherFee;
  }

  public void setOtherFee(long otherFee) {
    this.otherFee = otherFee;
  }


  public long getRepaymentAmount() {
    return repaymentAmount;
  }

  public void setRepaymentAmount(long repaymentAmount) {
    this.repaymentAmount = repaymentAmount;
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


  public long getReduceInstFee() {
    return reduceInstFee;
  }

  public void setReduceInstFee(long reduceInstFee) {
    this.reduceInstFee = reduceInstFee;
  }


  public long getReducePenalty() {
    return reducePenalty;
  }

  public void setReducePenalty(long reducePenalty) {
    this.reducePenalty = reducePenalty;
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


  public long getRemainCapital() {
    return remainCapital;
  }

  public void setRemainCapital(long remainCapital) {
    this.remainCapital = remainCapital;
  }


  public long getNpvRemainCapital() {
    return npvRemainCapital;
  }

  public void setNpvRemainCapital(long npvRemainCapital) {
    this.npvRemainCapital = npvRemainCapital;
  }


  public long getAllRepaymentAmount() {
    return allRepaymentAmount;
  }

  public void setAllRepaymentAmount(long allRepaymentAmount) {
    this.allRepaymentAmount = allRepaymentAmount;
  }


  public String getRepaymentState() {
    return repaymentState;
  }

  public void setRepaymentState(String repaymentState) {
    this.repaymentState = repaymentState;
  }


  public String getRemark() {
    return remark;
  }

  public void setRemark(String remark) {
    this.remark = remark;
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


  public String getIsOperating() {
    return isOperating;
  }

  public void setIsOperating(String isOperating) {
    this.isOperating = isOperating;
  }


  public String getUpdateType() {
    return updateType;
  }

  public void setUpdateType(String updateType) {
    this.updateType = updateType;
  }

  @Override
  public String toString() {
    return "NplmRepaymentPlan{" +
            "id=" + id +
            ", loanContractNum=" + loanContractNum +
            ", instalment=" + instalment +
            ", preRepaymentDate=" + preRepaymentDate +
            ", repaymentDate=" + repaymentDate +
            ", capital=" + capital +
            ", interest=" + interest +
            ", installmentFee=" + installmentFee +
            ", amerce=" + amerce +
            ", forfeit=" + forfeit +
            ", penalty=" + penalty +
            ", changeFee=" + changeFee +
            ", otherFee=" + otherFee +
            ", repaymentAmount=" + repaymentAmount +
            ", indeedCapital=" + indeedCapital +
            ", indeedInterest=" + indeedInterest +
            ", indeedInstFee=" + indeedInstFee +
            ", indeedAmerce=" + indeedAmerce +
            ", indeedForfeit=" + indeedForfeit +
            ", indeedPenalty=" + indeedPenalty +
            ", indeedChangeFee=" + indeedChangeFee +
            ", indeedOtherFee=" + indeedOtherFee +
            ", indeedAmount=" + indeedAmount +
            ", reduceCapital=" + reduceCapital +
            ", reduceInterest=" + reduceInterest +
            ", reduceAmerce=" + reduceAmerce +
            ", reduceForfeit=" + reduceForfeit +
            ", reduceInstFee=" + reduceInstFee +
            ", reducePenalty=" + reducePenalty +
            ", reducePreFee=" + reducePreFee +
            ", reduceOtherFee=" + reduceOtherFee +
            ", remainCapital=" + remainCapital +
            ", npvRemainCapital=" + npvRemainCapital +
            ", allRepaymentAmount=" + allRepaymentAmount +
            ", repaymentState='" + repaymentState + '\'' +
            ", remark='" + remark + '\'' +
            ", creator='" + creator + '\'' +
            ", createTime=" + createTime +
            ", updater='" + updater + '\'' +
            ", updateTime=" + updateTime +
            ", isOperating='" + isOperating + '\'' +
            ", updateType='" + updateType + '\'' +
            '}';
  }
}
