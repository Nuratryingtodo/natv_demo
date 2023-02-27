package com.example.natv_myP1.Entitiys;

import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)

@Table(name="discounts")
public class Discounts {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    @Column(name="discount")
    Double discount;
    @Column(name="start_date")
    Date stratDate;
    @Column(name="end_date")
    Date endDate;
    @Column(name="status")
    Enum status;

    @ManyToOne
    @JoinColumn(name = "channels_id")
    Channels channels;



}
