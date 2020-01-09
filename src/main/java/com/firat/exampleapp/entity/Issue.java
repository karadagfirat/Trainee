package com.firat.exampleapp.entity;


import lombok.*;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@Table(name = "issue")
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
public class Issue extends BaseEntity {

    // @NoArgsConstructor anotasyonu bulunduğu classın boş bir constructor'unu oluşturuyor.
    // public Issue() {
    //
    // }

    // @AllArgsConstructor anotasyonu bu kodu çağrıyor.
    // public Issue(String description, Date date, IssueStatus issueStatus, List<Issue> issues) {
    //     this.description = description;
    //     this.date = date;
    //     this.issueStatus = issueStatus;
    //     this.issues = issues;
    // }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "description")
    private String description;

    @Column(name = "date")
    @Temporal(value = TemporalType.TIMESTAMP)
    private Date date;

    @Column(name = "details")
    private String details;

    @Column(name = "issue_status")
    @Enumerated(EnumType.STRING)
    private IssueStatus issueStatus;

    @JoinColumn(name = "project_id")
    @ManyToOne(optional = true, fetch = FetchType.LAZY)
    private Project project;

    @JoinColumn(name = "assignee_user_id")
    @ManyToOne(optional = true, fetch = FetchType.LAZY) // Bir çok issue class'ı bir usera bağlanabilir. Many->issue One->User
                //optional->bir issue nesnesi yaratılırken onun assignee'sini vermesen de olur demek. null olabilir
                //fetch-> user tablosundaki ilişkili issue kaydını getirip getirmemesini belirtir.
    private User assignee;

}
