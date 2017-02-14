
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
    "html_url",
    "status",
    "post_count",
    "up_time",
    "citykey",
    "post_id",
    "city"
})
public class Meta {

    @JsonProperty("html_url")
    private String htmlUrl;
    @JsonProperty("status")
    private Integer status;
    @JsonProperty("post_count")
    private Integer postCount;
    @JsonProperty("up_time")
    private String upTime;
    @JsonProperty("citykey")
    private String citykey;
    @JsonProperty("post_id")
    private String postId;
    @JsonProperty("city")
    private String city;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The htmlUrl
     */
    @JsonProperty("html_url")
    public String getHtmlUrl() {
        return htmlUrl;
    }

    /**
     * 
     * @param htmlUrl
     *     The html_url
     */
    @JsonProperty("html_url")
    public void setHtmlUrl(String htmlUrl) {
        this.htmlUrl = htmlUrl;
    }

    /**
     * 
     * @return
     *     The status
     */
    @JsonProperty("status")
    public Integer getStatus() {
        return status;
    }

    /**
     * 
     * @param status
     *     The status
     */
    @JsonProperty("status")
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * 
     * @return
     *     The postCount
     */
    @JsonProperty("post_count")
    public Integer getPostCount() {
        return postCount;
    }

    /**
     * 
     * @param postCount
     *     The post_count
     */
    @JsonProperty("post_count")
    public void setPostCount(Integer postCount) {
        this.postCount = postCount;
    }

    /**
     * 
     * @return
     *     The upTime
     */
    @JsonProperty("up_time")
    public String getUpTime() {
        return upTime;
    }

    /**
     * 
     * @param upTime
     *     The up_time
     */
    @JsonProperty("up_time")
    public void setUpTime(String upTime) {
        this.upTime = upTime;
    }

    /**
     * 
     * @return
     *     The citykey
     */
    @JsonProperty("citykey")
    public String getCitykey() {
        return citykey;
    }

    /**
     * 
     * @param citykey
     *     The citykey
     */
    @JsonProperty("citykey")
    public void setCitykey(String citykey) {
        this.citykey = citykey;
    }

    /**
     * 
     * @return
     *     The postId
     */
    @JsonProperty("post_id")
    public String getPostId() {
        return postId;
    }

    /**
     * 
     * @param postId
     *     The post_id
     */
    @JsonProperty("post_id")
    public void setPostId(String postId) {
        this.postId = postId;
    }

    /**
     * 
     * @return
     *     The city
     */
    @JsonProperty("city")
    public String getCity() {
        return city;
    }

    /**
     * 
     * @param city
     *     The city
     */
    @JsonProperty("city")
    public void setCity(String city) {
        this.city = city;
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
