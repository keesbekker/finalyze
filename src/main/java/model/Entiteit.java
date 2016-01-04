package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 * Created by x085177 on 12/29/2015.
 */

@Entity
@Table(name= "Entiteiten")
public class Entiteit {

    @ManyToOne
    @JoinColumn(name = "AnnualAccount_ID", insertable = false, updatable = false)
    private AnnualAccount annualAccount;


    public long getEntiteitId() {
        return entiteitId;
    }

    public void setEntiteitId(long entiteitId) {
        this.entiteitId = entiteitId;
    }

    @Id
    @SequenceGenerator(name = "seqGenerator", sequenceName = "Annual_Account_SEQ")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seqGenerator")
    @Column(name = "Entiteit_ID", nullable = false)
    private long entiteitId;


    @Column(name="Entiteit")
    private String entiteit;


    @Column(name="Relevance_Score")
    private int relevancescore;

    public String getEntiteit() {
        return entiteit;
    }

    public void setEntiteit(String entiteit) {
        this.entiteit = entiteit;
    }

    public int getRelevancescore() {
        return relevancescore;
    }

    public void setRelevancescore(int relevancescore) {
        this.relevancescore = relevancescore;
    }

}
