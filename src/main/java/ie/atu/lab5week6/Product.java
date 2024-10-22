package ie.atu.lab5week6;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {
    @Min(value = 1,message = "id is at least 1")
    private int id;
    @NotBlank(message = "name is not blank")
    private String name;
    @Positive(message = "price is not  negative")
    private double price;

}
