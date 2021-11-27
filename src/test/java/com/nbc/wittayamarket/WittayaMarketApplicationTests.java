package com.nbc.wittayamarket;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class WittayaMarketApplicationTests {

    @Test
    void contextLoads() {
        View view = new View();
        Model model = new Model();
        Controller controller = new Controller(view,model);
    }

}
