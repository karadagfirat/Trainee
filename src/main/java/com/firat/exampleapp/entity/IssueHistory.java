package com.firat.exampleapp.entity;

import lombok.*;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@Table(name = "issue_history")
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
public class IssueHistory extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date date;

    @Column(name = "description")
    private String description;

    @Column(name = "issue_status")
    @Enumerated(EnumType.STRING)
    private IssueStatus issueStatus;

    @Column(name = "details")
    private String details;

    @JoinColumn(name = "assignee_user_id")
    @ManyToOne(optional = true, fetch = FetchType.LAZY)
    private User assignee;

}
