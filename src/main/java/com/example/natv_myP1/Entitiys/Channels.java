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

@Table(name = "channels")
public class Channels {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @Column(name = "channel_name")
    String channelName;
    @Column(name = "status")
    Enum status;
    @Column(name = "start_date")
    Date startDate;
    @Column(name = "end_date")
    Date endDate;

    @Column(name = "logo_path")
    String logoPath;

    @OneToMany(mappedBy = "channels")
    List<Discounts> discounts;
    @OneToMany(mappedBy = "channels")
    List<Prices> prices;

    @ManyToOne
    @JoinColumn(name = "text_orders_id")
    TextOrders textOrders;
    @ManyToOne
    @JoinColumn(name = "banner_orders_id")
    BannerOrders bannerOrders;


}
