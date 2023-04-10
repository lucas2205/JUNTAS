package juntas.service;

import juntas.dto.request.ComfortRequestDto;
import juntas.dto.response.ComfortResponseDto;

public interface IComfortService {

    ComfortResponseDto create(ComfortRequestDto requestDto);

    ComfortResponseDto update(Long id, ComfortRequestDto requestDto);

    ComfortResponseDto getById(Long id);

    void delete(Long id);
}
