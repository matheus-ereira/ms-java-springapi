
package com.mpjavaspringapi.domain;

import com.mpjavaspringapi.domain.enums.Role;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


/**
 *
 * @author matheus
 */
@AllArgsConstructor
@NoArgsConstructor
@Data @Builder
@Entity(name = "user")
public class User implements Serializable{
    
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(length = 75, nullable = false)
    private String name;
    
    @Column(length = 75, nullable = false, unique = true)
    private String email;
    
    @Column(length = 100, nullable = false)
    private String password;
    
    @Column(length = 20, nullable = false)
    @Enumerated(EnumType.STRING)
    private Role role;
    
    @OneToMany(mappedBy = "owner")
    private List<Request> requests;
    
    @OneToMany(mappedBy = "owner")
    private List<RequestStage> stages;
 
}
