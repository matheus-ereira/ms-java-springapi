
package com.mpjavaspringapi.domain;

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
public class User {
    private Long id;
    private String name;
    private String email;
    private String password;
    private List<Request> requests;
    private List<RequestStage> stages;
 
}