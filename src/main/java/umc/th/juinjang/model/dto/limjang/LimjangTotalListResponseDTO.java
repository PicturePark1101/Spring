package umc.th.juinjang.model.dto.limjang;

import java.time.LocalDateTime;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import umc.th.juinjang.model.dto.limjang.LimjangMainViewListResponsetDTO.ListDto;

public class LimjangTotalListResponseDTO {

  @Builder
  @Getter
  @NoArgsConstructor
  @AllArgsConstructor
  public static class TotalListDto {

    private List<LimjangListDto> limjangList;
//    private List<ListDto> notScrapedList;

  }

  @Builder
  @Getter
  @NoArgsConstructor
  @AllArgsConstructor
  public static class LimjangListDto {
    private Long limjangId;
    private List<String> images;
    private Integer purposeCode;
    private Boolean isScraped;
    private String nickname;
    private Integer priceType;
    private List<String> priceList;
    private String totalAverage;
    private String address;
//    private LocalDateTime createdAt;
//    private LocalDateTime updatedAt;
  }

}
