package de.dimitri;

import static org.assertj.core.api.Assertions.assertThat;
import static org.hamcrest.Matchers.equalTo;

import org.junit.jupiter.api.Test;
import org.openapi.quarkus.api_yaml.model.LottoFeld;
import org.openapi.quarkus.api_yaml.model.LottoSchein;

import io.quarkus.test.junit.QuarkusTest;
import io.restassured.RestAssured;

@QuarkusTest
public class LottoTest {

    public void testJaxrs() {
        RestAssured.when().get("/hello").then()
                .contentType("text/plain")
                .body(equalTo("hello jaxrs"));
    }

    @Test
    public void testScheinerstellen() {
        var schein = RestAssured.when().get("/lottoschein/erstellen")
                .getBody().as(LottoSchein.class);

        assertThat(schein.getLottoscheinnummer()).isBetween(1000000, 9999999);
        assertThat(schein.getSuperzahl()).isBetween(0, 9);
    }

    @Test
    public void testZufallsscheinErstellen() {
        var schein = RestAssured.when().get("/lottoschein/zufallsschein")
                .getBody().as(LottoSchein.class);

        assertThat(schein.getLottoscheinnummer()).isBetween(1000000, 9999999);
        assertThat(schein.getSuperzahl()).isBetween(0, 9);
        assertThat(schein.getFelder().size()).isEqualTo(6);

        var felder=schein.getFelder();
        for(LottoFeld feld : felder){
            assertThat(feld.getKreuze().size()).isEqualTo(6);
        }
    }
}
