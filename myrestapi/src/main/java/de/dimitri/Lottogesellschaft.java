package de.dimitri;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.stream.IntStream;

import org.openapi.quarkus.api_yaml.api.DefaultApi;
import org.openapi.quarkus.api_yaml.model.LottoFeld;
import org.openapi.quarkus.api_yaml.model.LottoSchein;

import jakarta.ws.rs.core.Response;

public class Lottogesellschaft implements DefaultApi{

  public static int LOWER_NUMBER=1000000;
  public static int UPPER_NUMBER=9999999;

  @Override
  public Response lottoscheinAbgebenPost(LottoSchein lottoSchein) {
    return Response.ok().build();
  }

  @Override
  public LottoSchein lottoscheinErstellenGet() {
    var schein = new LottoSchein();
    schein.setLottoscheinnummer(new Random().nextInt(LOWER_NUMBER,UPPER_NUMBER+1));
    schein.setSuperzahl(new Random().nextInt(1,10));
    return schein;
  }

  @Override
  public LottoSchein lottoscheinZufallsscheinGet() {
    var schein = new LottoSchein();
    var scheinZahlen= new ArrayList<Integer> (IntStream.rangeClosed(1, 49).boxed().toList());
    
    schein.setLottoscheinnummer(new Random().nextInt(LOWER_NUMBER,UPPER_NUMBER+1));
    schein.setSuperzahl(new Random().nextInt(1,10));
    ArrayList<LottoFeld> lottoFelder = new ArrayList<>();
    for(int k=0;k<6;k++){
      var feld= new LottoFeld();
      Collections.shuffle(scheinZahlen);
      feld.setKreuze(scheinZahlen.subList(0, 6));
      lottoFelder.add(feld);
    }
    schein.setFelder(lottoFelder);
    return schein;
  }
  
}
