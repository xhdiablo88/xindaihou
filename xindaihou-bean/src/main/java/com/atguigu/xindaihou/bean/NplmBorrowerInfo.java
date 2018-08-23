package com.atguigu.xindaihou.bean;


import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

public class NplmBorrowerInfo implements Serializable {

  @Id
  @Column
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;
  @Column
  private long applyClientId;
  @Column
  private long ecifId;
  @Column
  private String clientName;//客户姓名
  @Column
  private String mobile;
  @Column
  private String oldName;
  @Column
  private String sex;
  @Column
  private String nation;
  @Column
  private String birthday;
  @Column
  private String marital;
  @Column
  private long haveChildren;
  @Column
  private long childrenCount;
  @Column
  private String nationality;
  @Column
  private String hProvince;
  @Column
  private String hCity;
  @Column
  private String hDress;
  @Column
  private String identityType;//证件类型
  @Column
  private String identityNum;//证件号码
  @Column
  private String identityValidDate;
  @Column
  private String haveCar;
  @Column
  private String houseExplain;
  @Column
  private String resideExplain;
  @Column
  private String resideYear;
  @Column
  private String degree;
  @Column
  private String diploma;
  @Column
  private long yearIncome;
  @Column
  private String industry;
  @Column
  private String job;
  @Column
  private String company;
  @Column
  private String companyType;
  @Column
  private String department;
  @Column
  private String position;
  @Column
  private long workTime;
  @Column
  private String workTimeUnit;
  @Column
  private String clientArea;
  @Column
  private String clientType;
  @Column
  private String fNation;
  @Column
  private String fProvince;
  @Column
  private String fCity;
  @Column
  private String fArea;
  @Column
  private String fStreet;
  @Column
  private String fZipcode;
  @Column
  private String cNation;
  @Column
  private String cProvince;
  @Column
  private String cCity;
  @Column
  private String cArea;
  @Column
  private String cStreet;
  @Column
  private String cZipcode;
  @Column
  private String mobile1;
  @Column
  private String mobile2;
  @Column
  private String mobile3;
  @Column
  private String fTel1;
  @Column
  private String fTel2;
  @Column
  private String fTel3;
  @Column
  private String cTel1;
  @Column
  private String cTel2;
  @Column
  private String cTel3;
  @Column
  private String email1;
  @Column
  private String email2;
  @Column
  private String email3;
  @Column
  private long creditAmount;
  @Column
  private String sociaLlSecurity;
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


  public long getApplyClientId() {
    return applyClientId;
  }

  public void setApplyClientId(long applyClientId) {
    this.applyClientId = applyClientId;
  }


  public long getEcifId() {
    return ecifId;
  }

  public void setEcifId(long ecifId) {
    this.ecifId = ecifId;
  }


  public String getClientName() {
    return clientName;
  }

  public void setClientName(String clientName) {
    this.clientName = clientName;
  }


  public String getMobile() {
    return mobile;
  }

  public void setMobile(String mobile) {
    this.mobile = mobile;
  }


  public String getOldName() {
    return oldName;
  }

  public void setOldName(String oldName) {
    this.oldName = oldName;
  }


  public String getSex() {
    return sex;
  }

  public void setSex(String sex) {
    this.sex = sex;
  }


  public String getNation() {
    return nation;
  }

  public void setNation(String nation) {
    this.nation = nation;
  }


  public String getBirthday() {
    return birthday;
  }

  public void setBirthday(String birthday) {
    this.birthday = birthday;
  }


  public String getMarital() {
    return marital;
  }

  public void setMarital(String marital) {
    this.marital = marital;
  }


  public long getHaveChildren() {
    return haveChildren;
  }

  public void setHaveChildren(long haveChildren) {
    this.haveChildren = haveChildren;
  }


  public long getChildrenCount() {
    return childrenCount;
  }

  public void setChildrenCount(long childrenCount) {
    this.childrenCount = childrenCount;
  }


  public String getNationality() {
    return nationality;
  }

  public void setNationality(String nationality) {
    this.nationality = nationality;
  }


  public String getHProvince() {
    return hProvince;
  }

  public void setHProvince(String hProvince) {
    this.hProvince = hProvince;
  }


  public String getHCity() {
    return hCity;
  }

  public void setHCity(String hCity) {
    this.hCity = hCity;
  }


  public String getHDress() {
    return hDress;
  }

  public void setHDress(String hDress) {
    this.hDress = hDress;
  }


  public String getIdentityType() {
    return identityType;
  }

  public void setIdentityType(String identityType) {
    this.identityType = identityType;
  }


  public String getIdentityNum() {
    return identityNum;
  }

  public void setIdentityNum(String identityNum) {
    this.identityNum = identityNum;
  }


  public String getIdentityValidDate() {
    return identityValidDate;
  }

  public void setIdentityValidDate(String identityValidDate) {
    this.identityValidDate = identityValidDate;
  }


  public String getHaveCar() {
    return haveCar;
  }

  public void setHaveCar(String haveCar) {
    this.haveCar = haveCar;
  }


  public String getHouseExplain() {
    return houseExplain;
  }

  public void setHouseExplain(String houseExplain) {
    this.houseExplain = houseExplain;
  }


  public String getResideExplain() {
    return resideExplain;
  }

  public void setResideExplain(String resideExplain) {
    this.resideExplain = resideExplain;
  }


  public String getResideYear() {
    return resideYear;
  }

  public void setResideYear(String resideYear) {
    this.resideYear = resideYear;
  }


  public String getDegree() {
    return degree;
  }

  public void setDegree(String degree) {
    this.degree = degree;
  }


  public String getDiploma() {
    return diploma;
  }

  public void setDiploma(String diploma) {
    this.diploma = diploma;
  }


  public long getYearIncome() {
    return yearIncome;
  }

  public void setYearIncome(long yearIncome) {
    this.yearIncome = yearIncome;
  }


  public String getIndustry() {
    return industry;
  }

  public void setIndustry(String industry) {
    this.industry = industry;
  }


  public String getJob() {
    return job;
  }

  public void setJob(String job) {
    this.job = job;
  }


  public String getCompany() {
    return company;
  }

  public void setCompany(String company) {
    this.company = company;
  }


  public String getCompanyType() {
    return companyType;
  }

  public void setCompanyType(String companyType) {
    this.companyType = companyType;
  }


  public String getDepartment() {
    return department;
  }

  public void setDepartment(String department) {
    this.department = department;
  }


  public String getPosition() {
    return position;
  }

  public void setPosition(String position) {
    this.position = position;
  }


  public long getWorkTime() {
    return workTime;
  }

  public void setWorkTime(long workTime) {
    this.workTime = workTime;
  }


  public String getWorkTimeUnit() {
    return workTimeUnit;
  }

  public void setWorkTimeUnit(String workTimeUnit) {
    this.workTimeUnit = workTimeUnit;
  }


  public String getClientArea() {
    return clientArea;
  }

  public void setClientArea(String clientArea) {
    this.clientArea = clientArea;
  }


  public String getClientType() {
    return clientType;
  }

  public void setClientType(String clientType) {
    this.clientType = clientType;
  }


  public String getFNation() {
    return fNation;
  }

  public void setFNation(String fNation) {
    this.fNation = fNation;
  }


  public String getFProvince() {
    return fProvince;
  }

  public void setFProvince(String fProvince) {
    this.fProvince = fProvince;
  }


  public String getFCity() {
    return fCity;
  }

  public void setFCity(String fCity) {
    this.fCity = fCity;
  }


  public String getFArea() {
    return fArea;
  }

  public void setFArea(String fArea) {
    this.fArea = fArea;
  }


  public String getFStreet() {
    return fStreet;
  }

  public void setFStreet(String fStreet) {
    this.fStreet = fStreet;
  }


  public String getFZipcode() {
    return fZipcode;
  }

  public void setFZipcode(String fZipcode) {
    this.fZipcode = fZipcode;
  }


  public String getCNation() {
    return cNation;
  }

  public void setCNation(String cNation) {
    this.cNation = cNation;
  }


  public String getCProvince() {
    return cProvince;
  }

  public void setCProvince(String cProvince) {
    this.cProvince = cProvince;
  }


  public String getCCity() {
    return cCity;
  }

  public void setCCity(String cCity) {
    this.cCity = cCity;
  }


  public String getCArea() {
    return cArea;
  }

  public void setCArea(String cArea) {
    this.cArea = cArea;
  }


  public String getCStreet() {
    return cStreet;
  }

  public void setCStreet(String cStreet) {
    this.cStreet = cStreet;
  }


  public String getCZipcode() {
    return cZipcode;
  }

  public void setCZipcode(String cZipcode) {
    this.cZipcode = cZipcode;
  }


  public String getMobile1() {
    return mobile1;
  }

  public void setMobile1(String mobile1) {
    this.mobile1 = mobile1;
  }


  public String getMobile2() {
    return mobile2;
  }

  public void setMobile2(String mobile2) {
    this.mobile2 = mobile2;
  }


  public String getMobile3() {
    return mobile3;
  }

  public void setMobile3(String mobile3) {
    this.mobile3 = mobile3;
  }


  public String getFTel1() {
    return fTel1;
  }

  public void setFTel1(String fTel1) {
    this.fTel1 = fTel1;
  }


  public String getFTel2() {
    return fTel2;
  }

  public void setFTel2(String fTel2) {
    this.fTel2 = fTel2;
  }


  public String getFTel3() {
    return fTel3;
  }

  public void setFTel3(String fTel3) {
    this.fTel3 = fTel3;
  }


  public String getCTel1() {
    return cTel1;
  }

  public void setCTel1(String cTel1) {
    this.cTel1 = cTel1;
  }


  public String getCTel2() {
    return cTel2;
  }

  public void setCTel2(String cTel2) {
    this.cTel2 = cTel2;
  }


  public String getCTel3() {
    return cTel3;
  }

  public void setCTel3(String cTel3) {
    this.cTel3 = cTel3;
  }


  public String getEmail1() {
    return email1;
  }

  public void setEmail1(String email1) {
    this.email1 = email1;
  }


  public String getEmail2() {
    return email2;
  }

  public void setEmail2(String email2) {
    this.email2 = email2;
  }


  public String getEmail3() {
    return email3;
  }

  public void setEmail3(String email3) {
    this.email3 = email3;
  }


  public long getCreditAmount() {
    return creditAmount;
  }

  public void setCreditAmount(long creditAmount) {
    this.creditAmount = creditAmount;
  }


  public String getSociaLlSecurity() {
    return sociaLlSecurity;
  }

  public void setSociaLlSecurity(String sociaLlSecurity) {
    this.sociaLlSecurity = sociaLlSecurity;
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
    return "NplmBorrowerInfo{" +
            "id=" + id +
            ", applyClientId=" + applyClientId +
            ", ecifId=" + ecifId +
            ", clientName='" + clientName + '\'' +
            ", mobile='" + mobile + '\'' +
            ", oldName='" + oldName + '\'' +
            ", sex='" + sex + '\'' +
            ", nation='" + nation + '\'' +
            ", birthday='" + birthday + '\'' +
            ", marital='" + marital + '\'' +
            ", haveChildren=" + haveChildren +
            ", childrenCount=" + childrenCount +
            ", nationality='" + nationality + '\'' +
            ", hProvince='" + hProvince + '\'' +
            ", hCity='" + hCity + '\'' +
            ", hDress='" + hDress + '\'' +
            ", identityType='" + identityType + '\'' +
            ", identityNum='" + identityNum + '\'' +
            ", identityValidDate='" + identityValidDate + '\'' +
            ", haveCar='" + haveCar + '\'' +
            ", houseExplain='" + houseExplain + '\'' +
            ", resideExplain='" + resideExplain + '\'' +
            ", resideYear='" + resideYear + '\'' +
            ", degree='" + degree + '\'' +
            ", diploma='" + diploma + '\'' +
            ", yearIncome=" + yearIncome +
            ", industry='" + industry + '\'' +
            ", job='" + job + '\'' +
            ", company='" + company + '\'' +
            ", companyType='" + companyType + '\'' +
            ", department='" + department + '\'' +
            ", position='" + position + '\'' +
            ", workTime=" + workTime +
            ", workTimeUnit='" + workTimeUnit + '\'' +
            ", clientArea='" + clientArea + '\'' +
            ", clientType='" + clientType + '\'' +
            ", fNation='" + fNation + '\'' +
            ", fProvince='" + fProvince + '\'' +
            ", fCity='" + fCity + '\'' +
            ", fArea='" + fArea + '\'' +
            ", fStreet='" + fStreet + '\'' +
            ", fZipcode='" + fZipcode + '\'' +
            ", cNation='" + cNation + '\'' +
            ", cProvince='" + cProvince + '\'' +
            ", cCity='" + cCity + '\'' +
            ", cArea='" + cArea + '\'' +
            ", cStreet='" + cStreet + '\'' +
            ", cZipcode='" + cZipcode + '\'' +
            ", mobile1='" + mobile1 + '\'' +
            ", mobile2='" + mobile2 + '\'' +
            ", mobile3='" + mobile3 + '\'' +
            ", fTel1='" + fTel1 + '\'' +
            ", fTel2='" + fTel2 + '\'' +
            ", fTel3='" + fTel3 + '\'' +
            ", cTel1='" + cTel1 + '\'' +
            ", cTel2='" + cTel2 + '\'' +
            ", cTel3='" + cTel3 + '\'' +
            ", email1='" + email1 + '\'' +
            ", email2='" + email2 + '\'' +
            ", email3='" + email3 + '\'' +
            ", creditAmount=" + creditAmount +
            ", sociaLlSecurity='" + sociaLlSecurity + '\'' +
            ", creator='" + creator + '\'' +
            ", createTime=" + createTime +
            ", updater='" + updater + '\'' +
            ", updateTime=" + updateTime +
            ", updateType='" + updateType + '\'' +
            '}';
  }
}
