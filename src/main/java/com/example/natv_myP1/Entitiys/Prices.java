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
@Table(name="prices")
public class Prices {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    @Column(name="price_per_symbol")
    Double pricePerSymbol;
    @Column(name="banner_price")
    Double bannerPrice;
    @Column(name="start_date")
    Date startDate;
    @Column(name="end_date")
    Date endDate;
    @Column(name="status")
    Enum status;

    @ManyToOne
    @JoinColumn(name = "channels_id")
    Channels channels;






}
