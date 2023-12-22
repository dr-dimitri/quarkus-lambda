package org.openapi.quarkus.api_yaml.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapi.quarkus.api_yaml.model.LottoFeld;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.Type;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class LottoSchein  {

    private Integer superzahl;
    private Integer lottoscheinnummer;
    private List<LottoFeld> felder;

    /**
    * Superzahl zwischen 1 und 9
    * minimum: 1
    * maximum: 9
    * @return superzahl
    **/
    @JsonProperty("superzahl")
    public Integer getSuperzahl() {
        return superzahl;
    }

    /**
     * Set superzahl
     **/
    public void setSuperzahl(Integer superzahl) {
        this.superzahl = superzahl;
    }

    public LottoSchein superzahl(Integer superzahl) {
        this.superzahl = superzahl;
        return this;
    }

    /**
    * Eindeutige Lottoscheinnummer
    * minimum: 1000000
    * maximum: 9999999
    * @return lottoscheinnummer
    **/
    @JsonProperty("lottoscheinnummer")
    public Integer getLottoscheinnummer() {
        return lottoscheinnummer;
    }

    /**
     * Set lottoscheinnummer
     **/
    public void setLottoscheinnummer(Integer lottoscheinnummer) {
        this.lottoscheinnummer = lottoscheinnummer;
    }

    public LottoSchein lottoscheinnummer(Integer lottoscheinnummer) {
        this.lottoscheinnummer = lottoscheinnummer;
        return this;
    }

    /**
    * Get felder
    * @return felder
    **/
    @JsonProperty("felder")
    public List<LottoFeld> getFelder() {
        return felder;
    }

    /**
     * Set felder
     **/
    public void setFelder(List<LottoFeld> felder) {
        this.felder = felder;
    }

    public LottoSchein felder(List<LottoFeld> felder) {
        this.felder = felder;
        return this;
    }
    public LottoSchein addFelderItem(LottoFeld felderItem) {
        this.felder.add(felderItem);
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LottoSchein {\n");

        sb.append("    superzahl: ").append(toIndentedString(superzahl)).append("\n");
        sb.append("    lottoscheinnummer: ").append(toIndentedString(lottoscheinnummer)).append("\n");
        sb.append("    felder: ").append(toIndentedString(felder)).append("\n");
        
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private static String toIndentedString(Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class LottoScheinQueryParam  {

        @jakarta.ws.rs.QueryParam("superzahl")
        private Integer superzahl;
        @jakarta.ws.rs.QueryParam("lottoscheinnummer")
        private Integer lottoscheinnummer;
        @jakarta.ws.rs.QueryParam("felder")
        private List<LottoFeld> felder = null;

        /**
        * Superzahl zwischen 1 und 9
        * minimum: 1
        * maximum: 9
        * @return superzahl
        **/
        @JsonProperty("superzahl")
        public Integer getSuperzahl() {
            return superzahl;
        }

        /**
         * Set superzahl
         **/
        public void setSuperzahl(Integer superzahl) {
            this.superzahl = superzahl;
        }

        public LottoScheinQueryParam superzahl(Integer superzahl) {
            this.superzahl = superzahl;
            return this;
        }

        /**
        * Eindeutige Lottoscheinnummer
        * minimum: 1000000
        * maximum: 9999999
        * @return lottoscheinnummer
        **/
        @JsonProperty("lottoscheinnummer")
        public Integer getLottoscheinnummer() {
            return lottoscheinnummer;
        }

        /**
         * Set lottoscheinnummer
         **/
        public void setLottoscheinnummer(Integer lottoscheinnummer) {
            this.lottoscheinnummer = lottoscheinnummer;
        }

        public LottoScheinQueryParam lottoscheinnummer(Integer lottoscheinnummer) {
            this.lottoscheinnummer = lottoscheinnummer;
            return this;
        }

        /**
        * Get felder
        * @return felder
        **/
        @JsonProperty("felder")
        public List<LottoFeld> getFelder() {
            return felder;
        }

        /**
         * Set felder
         **/
        public void setFelder(List<LottoFeld> felder) {
            this.felder = felder;
        }

        public LottoScheinQueryParam felder(List<LottoFeld> felder) {
            this.felder = felder;
            return this;
        }
        public LottoScheinQueryParam addFelderItem(LottoFeld felderItem) {
            this.felder.add(felderItem);
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class LottoScheinQueryParam {\n");

            sb.append("    superzahl: ").append(toIndentedString(superzahl)).append("\n");
            sb.append("    lottoscheinnummer: ").append(toIndentedString(lottoscheinnummer)).append("\n");
            sb.append("    felder: ").append(toIndentedString(felder)).append("\n");
            sb.append("}");
            return sb.toString();
        }

        /**
         * Convert the given object to string with each line indented by 4 spaces
         * (except the first line).
         */
        private static String toIndentedString(Object o) {
            if (o == null) {
                return "null";
            }
            return o.toString().replace("\n", "\n    ");
        }
    }
}