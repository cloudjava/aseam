package com.stag.aseam.domain;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.jpa.activerecord.RooJpaActiveRecord;
import org.springframework.roo.addon.tostring.RooToString;
import javax.persistence.Column;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.validation.constraints.Pattern;

@RooJavaBean
@RooToString
@RooJpaActiveRecord(sequenceName = "USER_SEQ")
public class Account {

    /**
     */
    @NotNull
    @Column(unique = true)
    @Size(min = 5, max = 30)
    private String userName;

    /**
     */
    @NotNull
    @Size(min = 3, max = 30)
    private String password;

    /**
     */
    @NotNull
    private Boolean enabled;

    /**
     */
    private String cellPhone;

    /**
     */
    @Pattern(regexp = "[a-zA-Z0-9]+@[a-zA-Z0-9]+\\.[a-zA-Z0-9]+")
    private String email;

    /**
     */
    private String memo;
}
