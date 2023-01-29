package com.example.WinterToy.gps.repository.entity;

import com.example.WinterToy.gps.repository.dto.Markdto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.validation.annotation.Validated;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Validated
@Builder
@Getter
@Table
public class Mark extends BaseTimeEntity {
    @Id
    private String userId;
    @Column
    private double latitude;
    @Column(nullable = false)
    private double longitude;
    @Column
    private String text;


    public Markdto markdto(){
        return Markdto.builder()
                .latitude(latitude)
                .longitude(longitude)
                .text(text)
                .build();
    }
}
