package juntas.dto.request;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ComfortRequestDto {

    private Boolean acceptChild;
    private Boolean petFriendly;
    private Boolean acceptSmokers;
    private Boolean luggage;
}
