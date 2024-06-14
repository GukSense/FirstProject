package com.green.firstproject.tour.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;

@Getter
@Setter
public class TourPutReq {
//    @Schema(defaultValue = "1")
    @JsonIgnore
    private long tourId;
    @Schema(defaultValue = "제목")
    private String title;
    @Schema(defaultValue = "목적지")
    private String tourLocation;
    @Schema(defaultValue = "2000-01-01")
    private String tourStartDay;
    @Schema(defaultValue = "2000-01-01")
    private String tourFinishDay;
    @Schema(defaultValue = "10000")
    private long tourBudget;
    @Schema(defaultValue = "#FFFFFF")
    private String tourColor;
}
