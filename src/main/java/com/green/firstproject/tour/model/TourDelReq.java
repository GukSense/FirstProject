package com.green.firstproject.tour.model;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;
import org.springframework.web.bind.annotation.BindParam;

import java.beans.ConstructorProperties;

@Getter
@Setter
public class TourDelReq {
    @Schema(name = "tour_id", description = "여행 일정 PK", defaultValue = "1")
    private long tourId;
    @Schema(name = "signed_user_id", description = "로그인 유저 PK", defaultValue = "1")
    private long signedUserId;
    @ConstructorProperties({"tour_id", "signed_user_id"})
    public TourDelReq(long tourId, long signedUserId) {
        this.tourId = tourId;
        this.signedUserId = signedUserId;
    }
}
