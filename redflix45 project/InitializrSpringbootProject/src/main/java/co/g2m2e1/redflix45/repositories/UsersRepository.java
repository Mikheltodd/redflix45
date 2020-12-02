/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.g2m2e1.redflix45.repositories;

import co.g2m2e1.redflix45.models.Users;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author ESLUNAP Colaborador: Mikheltodd
 */
public interface UsersRepository extends JpaRepository<Users, String> {
    List<Users> findByUserName(String userName);
    List<Users> findByUserNameAndUserLastname(String userName,String userLastname);
    List<Users> findByUserNameContaining(String userName);
    List<Users> findByUserLastnameContaining(String userLastname);
}
