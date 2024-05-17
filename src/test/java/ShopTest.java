import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class ShopTest {

    private Shop shop;
    private Perfume perfume;
    private Tshirt tshirt;
    private Coat coat;
    private ISell coat2;

    @BeforeEach
    public void setUp(){
        shop = new Shop("BN Clothing");
        perfume = new Perfume("Sunflowers", "grapefruit", 2, 45);
        tshirt = new Tshirt(15, 7, "cotton", "kids", 9, "crew");
        coat = new Coat(70, 150, "women", "cotton", 14, true, "zip");
        coat2 = new Coat(90, 200, "men", "polyester", 42, false, "button");
    }

    @Test
    public void canAddItemToStock(){
        shop.addItemToStock(perfume);
        shop.addItemToStock(coat2);
        assertThat(shop.stockCount()).isEqualTo(2);
    }

    @Test
    public void canCalculateProjectedProfit(){
        shop.addItemToStock(perfume);
        shop.addItemToStock(coat);
        shop.addItemToStock(tshirt);
        assertThat(shop.calculateProjectedProfit()).isEqualTo(131);
    }


}