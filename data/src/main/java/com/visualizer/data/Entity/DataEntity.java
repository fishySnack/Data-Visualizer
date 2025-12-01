package com.visualizer.data.Entity;

import java.util.List;
import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;


@Entity
@Data
public class DataEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID data_id;

    private String x_name;
    private List<Double> x_values;

    private String y_name;
    private List<Double> y_values;
}
