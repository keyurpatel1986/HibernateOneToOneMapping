package com.journal.hibernate.model;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
 
import org.hibernate.annotations.Cascade;
 
@Entity
@Table(name="TRANSACTION")
public class Txn1 {
 
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="txn_id")
    private long id;
     
    @Column(name="txn_date")
    private Date date;
     
    @Column(name="txn_total")
    private double total;
     
    @OneToOne(mappedBy="txn")
    @Cascade(value=org.hibernate.annotations.CascadeType.SAVE_UPDATE)
    private Customer1 customer;
     
    @Override
    public String toString(){
        return id+", "+total+", "+customer.getName()+", "+customer.getEmail()+", "+customer.getAddress();
    }
 
        //Getter-Setter methods, omitted for clarity 
}
