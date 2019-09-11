package uph.tpsi.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table (name="car_types")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CarType
{
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        private Long id;

        @Column(name="name")
        private String name;

        @OneToMany(mappedBy = "carType")
        @JsonIgnore
        private Set<Car> cars;
}