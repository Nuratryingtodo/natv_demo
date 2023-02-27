package com.example.natv_myP1.Entitiys;

import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
@Table(name="banner_ads")
public class BannerAds {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    @Column(name="file_path")
    String file_path;
    @OneToMany(mappedBy = "bannerAds")
    List<BannerOrders> bannerOrders;

}
