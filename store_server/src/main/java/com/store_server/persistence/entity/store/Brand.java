package com.store_server.persistence.entity.store;

import com.neovisionaries.i18n.CountryCode;
import com.store_server.persistence.entity.BaseEntity;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "brands")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Brand extends BaseEntity {
    private String name;
    private String description;

    @Enumerated(EnumType.STRING)
    private CountryCode country;
}
