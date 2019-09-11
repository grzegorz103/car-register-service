package uph.tpsi.config;


import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.password.PasswordEncoder;
import uph.tpsi.models.User;
import uph.tpsi.repositories.UserRepository;

@Configuration
public class Initializer
{
        private final UserRepository userRepository;

        private final PasswordEncoder encoder;

        @Autowired
        public Initializer ( UserRepository userRepository, PasswordEncoder encoder )
        {
                this.userRepository = userRepository;
                this.encoder = encoder;
        }

        @Bean
        public InitializingBean initializingBean ()
        {
                return () -> {

                        if ( userRepository.findAll().isEmpty() )
                        {
                                userRepository.save(
                                        User.builder()
                                                .username( "user1" )
                                                .password( encoder.encode( "user1" ) )
                                                .build()
                                );
                        }

                };
        }
}
