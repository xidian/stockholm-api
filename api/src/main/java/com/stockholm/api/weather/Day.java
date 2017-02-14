
package com.stockholm.api.weather;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Generated;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "wthr",
    "bgPic",
    "wp",
    "type",
    "notice",
    "wd"
})
public class Day {

    @JsonProperty("wthr")
    private String wthr;
    @JsonProperty("bgPic")
    private String bgPic;
    @JsonProperty("wp")
    private String wp;
    @JsonProperty("type")
    private Integer type;
    @JsonProperty("notice")
    private String notice;
    @JsonProperty("wd")
    private String wd;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The wthr
     */
    @JsonProperty("wthr")
    public String getWthr() {
        return wthr;
    }

    /**
     * 
     * @param wthr
     *     The wthr
     */
    @JsonProperty("wthr")
    public void setWthr(String wthr) {
        this.wthr = wthr;
    }

    /**
     * 
     * @return
     *     The bgPic
     */
    @JsonProperty("bgPic")
    public String getBgPic() {
        return bgPic;
    }

    /**
     * 
     * @param bgPic
     *     The bgPic
     */
    @JsonProperty("bgPic")
    public void setBgPic(String bgPic) {
        this.bgPic = bgPic;
    }

    /**
     * 
     * @return
     *     The wp
     */
    @JsonProperty("wp")
    public String getWp() {
        return wp;
    }

    /**
     * 
     * @param wp
     *     The wp
     */
    @JsonProperty("wp")
    public void setWp(String wp) {
        this.wp = wp;
    }

    /**
     * 
     * @return
     *     The type
     */
    @JsonProperty("type")
    public Integer getType() {
        return type;
    }

    /**
     * 
     * @param type
     *     The type
     */
    @JsonProperty("type")
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * 
     * @return
     *     The notice
     */
    @JsonProperty("notice")
    public String getNotice() {
        return notice;
    }

    /**
     * 
     * @param notice
     *     The notice
     */
    @JsonProperty("notice")
    public void setNotice(String notice) {
        this.notice = notice;
    }

    /**
     * 
     * @return
     *     The wd
     */
    @JsonProperty("wd")
    public String getWd() {
        return wd;
    }

    /**
     * 
     * @param wd
     *     The wd
     */
    @JsonProperty("wd")
    public void setWd(String wd) {
        this.wd = wd;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
