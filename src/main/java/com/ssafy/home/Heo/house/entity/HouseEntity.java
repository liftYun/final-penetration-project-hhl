package com.ssafy.home.Heo.house.entity;

import com.ssafy.home.Heo.house.dto.out.HouseDetailResponseDto;
import lombok.*;

@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class HouseEntity {
    private String aptSeq; // 아파트코드
    private String sggCd; // 시군구코드
    private String umdCd; // 읍면동코드
    private String umdNm; // 읍면동이름
    private String jibun; // 지번
    private String roadNmSggCd; // 도로명시군구코드
    private String roadNm; // 도로명
    private String roadNmBonbun; // 도로명기초번호
    private String roadNmBubun;  // 도로명추가번호
    private String aptNm; // 아파트이름
    private int buildYear; // 준공년도
    private float latitude; // 위도
    private float longitude; // 경도
    private String imgUrl; // 이미지 경로


}
