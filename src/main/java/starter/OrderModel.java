package starter;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderModel {

    String id;
    String petId;
    String quantity;
    String shipDate;
    String status;
    String complete;
}
