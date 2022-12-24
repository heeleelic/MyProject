package com.example.seedStarter.entity;


import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Feature {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="FEATURE_ID")
    private Long id;
    @Enumerated(EnumType.STRING)
    private FeatureType name;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="SEED_STARTER_ID")
    @JsonBackReference //씨드스타터에 의해 관리되고 있어요.
    private SeedStarter seedStarter = new SeedStarter();

    public void setSeedStarter(SeedStarter seedStarter) {
        this.seedStarter = seedStarter;
        seedStarter.getFeatures().add(this);
    }
}
