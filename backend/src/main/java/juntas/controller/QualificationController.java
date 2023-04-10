package juntas.controller;

import juntas.dto.qualification.QualificationRequestDto;
import juntas.dto.qualification.QualificationResponseDto;
import juntas.service.IQualificationService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/qualifications")
public record QualificationController(IQualificationService service) {
    @PostMapping()
    public ResponseEntity<QualificationResponseDto> createQualification(@RequestBody QualificationRequestDto qualification) {
        return new ResponseEntity<>(service.createQualification(qualification), HttpStatus.CREATED);
    }
    @PutMapping("/{id}")
    public ResponseEntity<QualificationResponseDto> updateQualification(@PathVariable Long id, @RequestBody QualificationRequestDto qualification) {
        return new ResponseEntity<>(service.updateQualification(id, qualification), HttpStatus.ACCEPTED);
    }
    @GetMapping("/{id}")
    public ResponseEntity<QualificationResponseDto> getById(@PathVariable Long id){
        return new ResponseEntity<>(service.getById(id), HttpStatus.OK);
    }
    @DeleteMapping("/{id}")
    public void deleteQualification(@PathVariable Long id){
        service.deleteQualification(id);
    }
}
