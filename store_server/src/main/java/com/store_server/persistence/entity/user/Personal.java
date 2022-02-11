package com.store_server.persistence.entity.user;

import com.store_server.persistence.listener.FullNameGenerationListener;
import com.store_server.type.RoleType;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Getter
@Setter
@ToString
@DiscriminatorValue("PERSONAL")
@EntityListeners({
        FullNameGenerationListener.class,
})
public class Personal extends User {

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Transient
    private String fullName;

    public Personal() {
        super();
        setRoleType(RoleType.ROLE_PERSONAL);
    }
}
