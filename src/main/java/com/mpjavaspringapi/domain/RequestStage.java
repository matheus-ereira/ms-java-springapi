
package com.mpjavaspringapi.domain;

import com.mpjavaspringapi.domain.enums.RequestState;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
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
@Entity(name = "request_stage")
public class RequestStage implements Serializable{
    
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(columnDefinition = "text")
    private String description;
    
    @Column(name = "realization_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date realizationDate;
    
    @Column(length = 12, nullable = false)
    @Enumerated(EnumType.STRING)
    private RequestState state;
    
    @ManyToOne
    @JoinColumn(name = "request_id", nullable = false)
    private Request request;
    
    @ManyToOne
    @JoinColumn(name = "owner_id", nullable = false)
    private User owner;
    
}
