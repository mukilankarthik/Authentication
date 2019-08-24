/**
 * 
 */
package com.thoughtworks.Authentication.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.thoughtworks.Authentication.entity.User;
/**
 * @author mukilan
 *
 */
@Repository("userRepository")
public interface UserRepository extends JpaRepository<User, Long> {
	User save(User user);

	User findByEmail(String email);
}
