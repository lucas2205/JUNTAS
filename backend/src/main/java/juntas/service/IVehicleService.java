package juntas.service;

import juntas.dto.request.VehicleRequestDto;
import juntas.dto.response.VehicleResponseDto;

public interface IVehicleService{
    VehicleResponseDto create(VehicleRequestDto requestDto);

    VehicleResponseDto update(Long id, VehicleRequestDto requestDto);

    VehicleResponseDto getById(Long id);

    void delete(Long id);
}
