package com.rg.flag_management_service.model.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.OffsetDateTime;
import java.util.UUID;

@Entity
@Table(name = "feature_flag")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class FeatureFlagEntity {

    @Id
    @Column(nullable = false)
    private UUID id;

    @Column(name = "key", nullable = false, unique = true)
    private String key;

    @Column
    private String description;

    @Column(nullable = false)
    private boolean enabled;

    @Column(name = "rollout_percent", nullable = false)
    private int rolloutPercent;

    @Column(name = "created_at", nullable = false)
    private OffsetDateTime createdAt;

    @Column(name = "updated_at", nullable = false)
    private OffsetDateTime updatedAt;
}

