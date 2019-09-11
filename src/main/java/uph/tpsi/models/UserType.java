package uph.tpsi.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table (name = "user_types")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserType
{
        @Id
        @GeneratedValue (strategy = GenerationType.IDENTITY)
        private Long id;

        @Enumerated (EnumType.STRING)
        private UserRole userRole;

        public enum UserRole
        {
                ROLE_ADMIN,
                ROLE_USER
        }
}