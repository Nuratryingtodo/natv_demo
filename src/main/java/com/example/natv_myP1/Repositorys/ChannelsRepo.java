package com.example.natv_myP1.Repositorys;

import com.example.natv_myP1.Entitiys.Channels;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChannelsRepo extends JpaRepository<Channels, Long> {
}
