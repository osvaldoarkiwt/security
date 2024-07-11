package com.projeto.security.model;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import lombok.AllArgsConstructor;
import lombok.Data;

@Entity
@Data
@AllArgsConstructor
public class Role {

    @Id
    @Column(name="role_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    @ManyToMany(mappedBy = "roles")
    private List<User> users;

    public enum Values{

        ADMIN(1L),BASIC(2L);

        Long roleId;

        Values(Long roleId){
            this.roleId = roleId;
        }

        public Long getRoleId(){
            return roleId;
        }
    }
}