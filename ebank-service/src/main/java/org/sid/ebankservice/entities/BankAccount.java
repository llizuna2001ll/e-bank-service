package org.sid.ebankservice.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.sid.ebankservice.enums.AccountType;

import javax.persistence.*;
import java.util.Date;
@Entity
@Data @NoArgsConstructor @AllArgsConstructor @Builder
public class BankAccount {
    @Id
    private String id;
    private Date createAt;
    private Double balance;
    @Enumerated(EnumType.STRING)
    @Column(length =15)
    private AccountType type;
    private  String currency;
}
