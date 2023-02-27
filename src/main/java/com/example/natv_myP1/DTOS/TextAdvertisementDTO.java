package com.example.natv_myP1.DTOS;

import com.example.natv_myP1.Entitiys.BannerAds;
import com.example.natv_myP1.Entitiys.BannerOrders;
import com.example.natv_myP1.Entitiys.TextAds;
import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;

import java.util.List;

@FieldDefaults(level = AccessLevel.PRIVATE)
public class TextAdvertisementDTO {
    TextAds textAd;
    BannerAds bannerAd;
    List<BannerOrders> fullOrder;



}
