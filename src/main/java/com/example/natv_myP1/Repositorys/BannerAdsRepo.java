package com.example.natv_myP1.Repositorys;

import com.example.natv_myP1.Entitiys.BannerAds;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BannerAdsRepo extends JpaRepository<BannerAds,Long> {
}
