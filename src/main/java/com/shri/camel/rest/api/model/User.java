/*
 * Created By zeeroiq on 4/17/23, 12:10 AM.
 * Copyright (c) ZeeroIQ
 */

package com.shri.camel.rest.api.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;
import org.hibernate.annotations.UpdateTimestamp;

import java.io.Serializable;
import java.sql.Timestamp;

@JsonIgnoreProperties(value = {"serialVersionUID", "password"})
@Data
@Entity
@Table(name = "user_entity", schema = "schema_test")
public class User implements Serializable {

    @Transient
    @Getter(AccessLevel.NONE)
    @Setter(AccessLevel.NONE)
    private final long serialVersionUID = 3303186845908654414L;

    @Id
    @GeneratedValue(generator = "sequence-generator")
    @GenericGenerator(
            name = "sequence-generator",
            strategy = "org.hibernate.id.enhanced.SequenceStyleGenerator",
            parameters = {
                    @Parameter(name = "sequence_name", value = "user_sequence"),
                    @Parameter(name = "initial_value", value = "4"),
                    @Parameter(name = "increment_size", value = "1")
            }
    )
    @Column(name = "user_id")
    private Long userId;
    @Column(name = "firstname")
    private String firstname;
    @Column(name = "lastname")
    private String lastname;
    @Column(name = "email_id")
    private String emailId;
    @Column(name = "password")
    private String password;
    @Column(name = "updated_by")
    private String updatedBy;
    @Version
    private Integer version;
    @CreationTimestamp
    private Timestamp createdOn;
    @UpdateTimestamp
    private Timestamp updatedOn;
}
