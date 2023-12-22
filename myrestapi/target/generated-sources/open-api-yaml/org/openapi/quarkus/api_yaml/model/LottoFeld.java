package org.openapi.quarkus.api_yaml.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.Type;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class LottoFeld  {

    private List<Integer> kreuze;

    /**
    * Get kreuze
    * @return kreuze
    **/
    @JsonProperty("kreuze")
    public List<Integer> getKreuze() {
        return kreuze;
    }

    /**
     * Set kreuze
     **/
    public void setKreuze(List<Integer> kreuze) {
        this.kreuze = kreuze;
    }

    public LottoFeld kreuze(List<Integer> kreuze) {
        this.kreuze = kreuze;
        return this;
    }
    public LottoFeld addKreuzeItem(Integer kreuzeItem) {
        this.kreuze.add(kreuzeItem);
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LottoFeld {\n");

        sb.append("    kreuze: ").append(toIndentedString(kreuze)).append("\n");
        
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
    public static class LottoFeldQueryParam  {

        @jakarta.ws.rs.QueryParam("kreuze")
        private List<Integer> kreuze = null;

        /**
        * Get kreuze
        * @return kreuze
        **/
        @JsonProperty("kreuze")
        public List<Integer> getKreuze() {
            return kreuze;
        }

        /**
         * Set kreuze
         **/
        public void setKreuze(List<Integer> kreuze) {
            this.kreuze = kreuze;
        }

        public LottoFeldQueryParam kreuze(List<Integer> kreuze) {
            this.kreuze = kreuze;
            return this;
        }
        public LottoFeldQueryParam addKreuzeItem(Integer kreuzeItem) {
            this.kreuze.add(kreuzeItem);
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class LottoFeldQueryParam {\n");

            sb.append("    kreuze: ").append(toIndentedString(kreuze)).append("\n");
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