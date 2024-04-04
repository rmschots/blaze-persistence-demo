package com.rmschots.blazedemo.model;

import jakarta.persistence.Embeddable;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@Embeddable
@ToString
@EqualsAndHashCode
public class SwiftCode {
    private String value;

    public static SwiftCode of(String swiftCode) {
        return new SwiftCode(swiftCode);
    }

    protected SwiftCode() {
    }

    private SwiftCode(String swiftCode) {
        this.value = swiftCode;
    }
}
