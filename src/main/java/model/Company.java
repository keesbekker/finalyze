package model;


import org.springframework.data.annotation.Id;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * Created by x085177 on 12/29/2015.
 */
@Entity
@Table(name= "Companies")
public class Company {

    public long getCompanyId() {
        return companyId;
    }

    public void setCompanyId(long companyId) {
        this.companyId = companyId;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long companyId;

    @NotNull
    private String name;

    @NotNull
    private String index;

    @NotNull
    private String sector;

    @OneToMany
    @JoinColumn(name="CompanyId",nullable=false)
    private List<AnnualAccount> annualAccountList;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIndex() {
        return index;
    }

    public void setIndex(String index) {
        this.index = index;
    }

    public String getSector() {
        return sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }

    public List<AnnualAccount> getAnnualAccountList() {
        return annualAccountList;
    }

    public void setAnnualAccountList(List<AnnualAccount> annualAccountList) {
        this.annualAccountList = annualAccountList;
    }



}
