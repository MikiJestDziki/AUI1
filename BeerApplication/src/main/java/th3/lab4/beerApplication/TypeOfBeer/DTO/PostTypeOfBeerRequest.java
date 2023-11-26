package th3.lab4.beerApplication.TypeOfBeer.DTO;

import lombok.*;

import java.util.UUID;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class PostTypeOfBeerRequest {
    private UUID id;
}
