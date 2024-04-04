package com.rmschots.blazedemo.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

@Entity
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Organization {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private UUID id;

    @ElementCollection(fetch = FetchType.EAGER)
    @CollectionTable(name = "organization_bank_account", joinColumns = @JoinColumn(name = "organization_id"))
    @Builder.Default
    @Setter(AccessLevel.PRIVATE)
    private Set<OrganizationBankAccount> bankAccounts = new HashSet<>();
}
