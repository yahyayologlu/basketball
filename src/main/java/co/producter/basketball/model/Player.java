package co.producter.basketball.model;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Player {

    @Id
    @GeneratedValue
    private long id;


    @NotBlank
    private String name;
    @NotBlank
    private String lastname;
    @NotBlank
    @Enumerated(EnumType.STRING)
    private Position position;

}
