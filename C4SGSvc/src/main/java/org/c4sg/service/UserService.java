package org.c4sg.service;

import org.c4sg.dto.UserDTO;
import org.c4sg.entity.User;
import java.util.List;

public interface UserService {
	
    List<UserDTO> findAll();
    List<UserDTO> findActiveUsers();
    UserDTO findById(int id);
    User findByName(String name);

    List<User> findDevelopers();

    UserDTO saveUser(UserDTO userDTO);

    void deleteUser(Integer id);
}
