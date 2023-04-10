package juntas.controller;

import juntas.dto.place.PlaceRequestDto;
import juntas.dto.place.PlaceResponseDto;
import juntas.service.IPlaceService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/places")
public record PlaceController(IPlaceService placeService) {
    @PostMapping
    public ResponseEntity<PlaceResponseDto> createPlace(@Valid @RequestBody PlaceRequestDto toCreate) {
        return new ResponseEntity<>(placeService.createPlace(toCreate), HttpStatus.CREATED);
    }
    @PutMapping("/{id}")
    public ResponseEntity<PlaceResponseDto> updatePlace(@PathVariable Long id, @RequestBody PlaceRequestDto toUpdate) {
        return new ResponseEntity<>(placeService.updatePlace(id, toUpdate), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<PlaceResponseDto> findById(@PathVariable Long id){
        return new ResponseEntity<>(placeService.findById(id), HttpStatus.FOUND);
    }

    @GetMapping("/city")
    public ResponseEntity<List<PlaceResponseDto>> findByCity(@RequestParam String city){
        return new ResponseEntity<>(placeService.findByCity(city), HttpStatus.FOUND);
    }
    @GetMapping("/province")
    public ResponseEntity<List<PlaceResponseDto>> findByProvince(@RequestParam String province){
        return new ResponseEntity<>(placeService.findByProvince(province), HttpStatus.FOUND);
    }
    @DeleteMapping("/{id}")
    public void deletePlace(@PathVariable Long id) {
        placeService.deletePlace(id);
    }
}
