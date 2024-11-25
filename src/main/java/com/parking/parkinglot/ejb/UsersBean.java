package com.parking.parkinglot.ejb;

import com.parking.parkinglot.common.UserDto;
import com.parking.parkinglot.entities.User;
import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

@Stateless
public class UsersBean {
    private static final Logger LOG = Logger.getLogger(UsersBean.class.getName());
    @PersistenceContext
    EntityManager entityManager;

    public List<UserDto> findAllUsers(){
        LOG.info("findAllUsers");
        try{
            TypedQuery<User> typedQuery = entityManager.createQuery("SELECT u FROM User u", User.class);
            List<User> users = typedQuery.getResultList();
            return copyUsersToDto(users);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public List<UserDto> copyUsersToDto(List<User> users){
        LOG.info("copyUsersToDto");
        List<UserDto> userDtos = new ArrayList<UserDto>();
        for(User user : users){
            UserDto userDto = new UserDto(
                    user.getId(),
                    user.getUsername(),
                    user.getCars()
            );
            userDtos.add(userDto);
        }
        return userDtos;
    }
}
