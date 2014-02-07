package com.stag.aseam.domain;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.jpa.activerecord.RooJpaActiveRecord;
import org.springframework.roo.addon.tostring.RooToString;
import javax.persistence.Column;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import com.stag.aseam.reference.CompanyStatus;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;

@RooJavaBean
@RooToString
@RooJpaActiveRecord(sequenceName = "COMPANY_SEQ")
public class Company {

    /**
     */
    @NotNull
    @Column(unique = true)
    @Size(min = 3, max = 30)
    private String companyId;

    /**
     */
    @NotNull
    @Size(max = 50)
    private String companyName;

    /**
     */
    @NotNull
    @Enumerated
    private CompanyStatus companyStatus;

    /**
     */
    @ManyToOne(fetch = FetchType.LAZY)
    private Company parentCompany;

    /**
     */
    @ManyToOne(fetch = FetchType.LAZY)
    private Account pic;
}
