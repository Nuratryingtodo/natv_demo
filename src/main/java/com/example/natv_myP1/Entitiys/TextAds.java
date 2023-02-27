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

@Table(name="text_ads")
public class TextAds {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    @Column(name="text")
    String text;
    @Column(name="symbol_count")
    Integer symbolCount;
    @Column(name="days_count")
    Integer daysCount;
    @OneToMany(mappedBy = "textAds")
    List<TextOrders> textOrders;

}
