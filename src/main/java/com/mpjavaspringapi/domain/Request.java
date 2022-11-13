
package com.mpjavaspringapi.domain;

import com.mpjavaspringapi.domain.enums.RequestState;
import java.util.Date;
import java.util.List;
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
public class Request {
    private Long id;
    private String subject;
    private String description;
    private Date creationDate;
    private RequestState state;
    private User user;
    private List<RequestState> stages;
    
}
