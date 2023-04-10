package juntas.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "comforts")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Comfort implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long comfortId;
    private Boolean acceptChild;
    private Boolean petFriendly;
    private Boolean acceptSmokers;
    private Boolean luggage;
}
