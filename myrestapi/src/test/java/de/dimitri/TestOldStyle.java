package de.dimitri;

import org.junit.jupiter.api.Test;

public class TestOldStyle {
@Test
public void testLottoschein(){
  Lottogesellschaft l = new Lottogesellschaft();
  var schein=l.lottoscheinErstellenGet();
  schein.toString();
}

}
