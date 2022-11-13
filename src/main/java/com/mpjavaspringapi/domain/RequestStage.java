
package com.mpjavaspringapi.domain;

import com.mpjavaspringapi.domain.enums.RequestState;
import java.util.Date;
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
public class RequestStage {
    private Long id;
    private String description;
    private Date realizationDate;
    private RequestState state;
    private Request request;
    private User user;
    
}
