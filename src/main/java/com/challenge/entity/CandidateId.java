package com.challenge.entity;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.Embeddable;
import javax.persistence.EntityListeners;
import javax.persistence.ManyToOne;
import java.io.Serializable;

@Embeddable
@EntityListeners(AuditingEntityListener.class)
public class CandidateId implements Serializable {
    @ManyToOne
    User user;
    @ManyToOne
    Acceleration acceleration;
    @ManyToOne
    Company company;
}
