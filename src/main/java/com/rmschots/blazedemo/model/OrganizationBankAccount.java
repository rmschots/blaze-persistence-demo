package com.rmschots.blazedemo.model;

import jakarta.persistence.AttributeOverride;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.Embedded;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

@Embeddable
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class OrganizationBankAccount {
    @Embedded
    @AttributeOverride(name = "value", column = @Column(name = "swift_code"))
    private SwiftCode swiftCode;
}
