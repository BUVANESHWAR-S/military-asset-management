package com.kristball.military_asset_tracker.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Asset extends JpaRepository<Asset, Long> {
}
