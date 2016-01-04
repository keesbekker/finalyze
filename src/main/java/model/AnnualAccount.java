package model;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import java.util.List;

/**
 * Created by x085177 on 12/29/2015.
 */

@Entity
@Table(name="AnnualAccounts")
public class AnnualAccount {


    public Long getAnnualAccountId() {
        return AnnualAccountId;
    }

    public void setAnnualAccountId(Long annualAccountId) {
        AnnualAccountId = annualAccountId;
    }

    @Id
    @SequenceGenerator(name = "seqGenerator", sequenceName = "Annual_Account_SEQ")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seqGenerator")
    @Column(name = "AnnualAccount_ID", nullable = false)
    private Long AnnualAccountId;


    @ManyToOne
    @JoinColumn(name = "CompanyId", insertable = false, updatable = false)
    private Company company;

    @Column(name="Year")
    private int year;

    @Column(name="RiskSentiment")
    private int risksentiment;

    @Column(name="MdaSentiment")
    private int mdasentiment;

    @Column(name="TotalSentiment")
    private int totalsentiment;

    @OneToMany
    @JoinColumn(name="AnnualAccountId",nullable=false)
    private List<Entiteit> entiteitriskList;

    @OneToMany
    @JoinColumn(name="AnnualAccountId",nullable=false)
    private List<Entiteit> entiteitmdaList;

    public List<Entiteit> getEntiteitriskList() {
        return entiteitriskList;
    }

    public void setEntiteitriskList(List<Entiteit> entiteitriskList) {
        this.entiteitriskList = entiteitriskList;
    }

    public List<Entiteit> getEntiteitmdaList() {
        return entiteitmdaList;
    }

    public void setEntiteitmdaList(List<Entiteit> entiteitmdaList) {
        this.entiteitmdaList = entiteitmdaList;
    }

    public int getOverallsentiment() {
        return totalsentiment;
    }

    public void setOverallsentiment(int overallsentiment) {
        this.totalsentiment = overallsentiment;
    }

    public int getMdasentiment() {
        return mdasentiment;
    }

    public void setMdasentiment(int mdasentiment) {
        this.mdasentiment = mdasentiment;
    }

    public int getRisksentiment() {
        return risksentiment;
    }

    public void setRisksentiment(int risksentiment) {
        this.risksentiment = risksentiment;
    }

    public int getYear() {return year;}

    public void setYear(int year) {this.year = year;}


}
