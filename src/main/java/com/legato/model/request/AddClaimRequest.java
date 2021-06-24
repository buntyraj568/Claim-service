package com.legato.model.request;

import com.legato.model.entity.ClaimEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import org.springframework.validation.annotation.Validated;

@Validated
@AllArgsConstructor
@NoArgsConstructor
@Data
public class AddClaimRequest {
    @NonNull
    ClaimEntity claim;
}
