package juntas.dto.response;

import juntas.model.User;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@RequiredArgsConstructor
public class VehicleResponseDto{

    private String vehicleColor;
    private Integer emptySeats;
    private String primaryBrand;
    private String modelName;
    private String patentNumber;
    private User driver;
    private Boolean isVerified;
}
