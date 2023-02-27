package com.example.natv_myP1.Entitiys;

import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
@Table(name = "banner_orders")
public class BannerOrders {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    @Column(name = "created_date")
    Date createdDate;
    @Column(name = "client_fio")
    String clientFIO;
    @Column(name = "client_phone")
    String clientPhone;
    @Column(name = "client_email")
    String clientEmail;
    @Column(name = "status")
    Enum Status;
    @Column(name = "order_sum")
    Double orderSum;
    @Column(name = "selected_days")
    Date selectedDays;

    @ManyToOne
    @JoinColumn(name = "banner_ads_id")
    BannerAds bannerAds;

    @OneToMany(mappedBy = "bannerOrders")
    List<Channels> channels;

}
