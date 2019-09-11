package uph.tpsi.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import uph.tpsi.models.User;
import uph.tpsi.repositories.UserRepository;

import java.util.Collections;

@Service
public class UserServiceImpl implements UserService
{
        @Autowired
        private UserRepository userRepository;

        @Override
        public UserDetails loadUserByUsername ( String s ) throws UsernameNotFoundException
        {
                User user = userRepository.findByUsername(s);
                if(user == null)
                        throw new UsernameNotFoundException( "User not found" );

                return new org.springframework.security.core.userdetails.User(
                        user.getUsername(),
                        user.getPassword(),
                        Collections.singleton( new SimpleGrantedAuthority( "USER" ) ) );
        }
}
